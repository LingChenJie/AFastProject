package com.h3c.afastproject.base.baseInterface;

/**
 * Created by H3c on 16/5/22.
 */

public interface IProcessDialog {
    void showLoadingDialog();
    void showLoadingInfoDialog(String info);
    void showUncancelDialog();
    void hideProcessDialog();
}
