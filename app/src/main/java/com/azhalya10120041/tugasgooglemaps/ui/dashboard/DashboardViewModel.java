/**
 *
 * Nama : Azhalya Cantika
 * Nim : 10120041
 * Kelas : IF 1
 * Email : azhalya@gmail.com
 *
 */
package com.azhalya10120041.tugasgooglemaps.ui.dashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DashboardViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}