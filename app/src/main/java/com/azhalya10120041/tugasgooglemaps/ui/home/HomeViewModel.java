/**
 *
 * Nama : Azhalya Cantika
 * Nim : 10120041
 * Kelas : IF 1
 * Email : azhalya@gmail.com
 *
 */
package com.azhalya10120041.tugasgooglemaps.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}