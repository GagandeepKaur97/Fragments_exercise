package com.gagan.fragments_exercise.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Android is a widely-adopted open-source project. Google actively develops the Android platform but gives a portion of it for free to hardware manufacturers and phone carriers who want to use Android on their devices. Google only charges manufacturers if they also install the Google apps portion of the OS.\n" +
                "\n" +
                "\n" +
                "Many (but not all) major devices that use Android also opt for the Google apps portion of the service. One notable exception is Amazon. Although Kindle Fire tablets use Android, they do not use the Google portions, and Amazon maintains a separate Android app store. \n" +
                "\n" +
                "Beyond the Phone\n" +
                "Android powers phones and tablets, but Samsung has experimented with Android interfaces on non-phone electronics like cameras and even refrigerators. The Android TV is a gaming/streaming platform that uses Android. Parrot makes a digital photo frame and a car stereo system with Android. Some devices customize the open-source Android without the Google apps, so you may or may not recognize Android when you see it. The list of customizations and applications goes on and on.\n" +
                "\n" +
                "The 10 Best Android Phones of 2020 \n" +
                "\n" +
                "Open Handset Alliance\n" +
                "Google formed a group of hardware, software, and telecommunication companies called the Open Handset Alliance with the goal of contributing to Android development. Most members also have the goal of making money from Android, either by selling phones, phone service or mobile applications.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}