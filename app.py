from flask import Flask, render_template, requestimport jsonifyimport requestsimport pickleimport numpy as npimport sklearnimport kerasfrom sklearn.preprocessing import StandardScalerimport matplotlib.image as mpimgfrom keras.preprocessing import imageimport osapp = Flask(__name__)# For our first modelwith open('./NLP_MODEL.pkl', 'rb') as f:    nlp_model = pickle.load(f)with open('./vectorizer_nlp.pkl', 'rb') as f:    vectorizer = pickle.load(f)# For our second model    ann_model = keras.models.load_model('ANN_MODEL.h5')# For our third modelcnn_model = keras.models.load_model('CNN.h5')@app.route('/',methods=['GET'])def Home():    return render_template('Mini_project.html')standard_to = StandardScaler()@app.route("/predict", methods=['POST'])def predict():        if request.method == 'POST':        Male_Female = request.form['Went_icu']                if(Male_Female=='Male'):                Male_Female = 1.        else:            Male_Female=0.        Age = float(request.form['Patient_Age'])        icu = request.form['Went_icu']        if(icu == 'Went_icu_yes'):                icu = 1.        else:            icu = 0.        Temprature = float(request.form['Patient_temprature'])        Patient_feeling = str(request.form['Patient_feeling'])        f  =  str(request.form['Image_'])                dir_path = os.path.dirname(os.path.realpath(__file__))          for root, dirs, files in os.walk(dir_path):            for file in files:                           # change the extension from '.mp3' to                 # the one of your choice.                if file.endswith(f):                    p = root+'/'+str(file)                            #p = "./DATA/processTest/" + f                    test_image = image.load_img(p, target_size = (64, 64))                    test_image = image.img_to_array(test_image)                    test_image = np.expand_dims(test_image, axis = 0)                    result = cnn_model.predict(test_image) # cnn == the saved model                            if result[0][0] == 1:                        prediction_three = 'NEG-COVID'                    else:                        prediction_three = 'POS-COVID'                else:                    pass                                            new_test = vectorizer.transform([Patient_feeling])                prediction = nlp_model.predict(new_test) # will return        second_prediction = ann_model.predict(([[Male_Female, Age, icu, Temprature]]))        if second_prediction == 0:            second_prediction = "NEG-COVID"        else:            second_prediction = "POS-COVID"        return render_template('Mini_project.html',prediction_text="Result for COVID-19->  NLP: %s, ANN: %s, CNN: %s" %(prediction[0], second_prediction, prediction_three))            else:        return render_template('Mini_project.html')    if __name__=="__main__":    app.run(debug=True)