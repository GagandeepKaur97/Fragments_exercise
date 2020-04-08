package com.gagan.fragments_exercise.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Contact\n" +
                "Lambton in Toronto at Cestar College\n" +
                "\n" +
                "416-485-2098\n" +
                "\n" +
                "400-265 Yorkland Blvd\n" +
                "Toronto, ON M2J 1S5\n" +
                "lambton@\u200Bcestarcollege.com");
    }

    public LiveData<String> getText() {
        return mText;
    }
}