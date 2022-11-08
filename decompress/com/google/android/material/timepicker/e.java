// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import android.view.View;
import android.view.KeyEvent;
import android.widget.TextView;
import android.view.View$OnKeyListener;
import android.widget.TextView$OnEditorActionListener;

public final class e implements TextView$OnEditorActionListener, View$OnKeyListener
{
    public final ChipTextInputComboView C0;
    public final ChipTextInputComboView D0;
    public final tps E0;
    public boolean F0;
    
    public e(final ChipTextInputComboView c0, final ChipTextInputComboView d0, final tps e0) {
        this.F0 = false;
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void a(final int h0) {
        final ChipTextInputComboView d0 = this.D0;
        final boolean b = true;
        d0.setChecked(h0 == 12);
        this.C0.setChecked(h0 == 10 && b);
        this.E0.H0 = h0;
    }
    
    public final boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final boolean b = n == 5;
        if (b) {
            this.a(12);
        }
        return b;
    }
    
    public final boolean onKey(final View view, int n, final KeyEvent keyEvent) {
        if (this.F0) {
            return false;
        }
        boolean b = true;
        this.F0 = true;
        final EditText editText = (EditText)view;
        Label_0153: {
            if (this.E0.H0 == 12) {
                if (n == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty((CharSequence)editText.getText())) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    this.a(10);
                    break Label_0153;
                }
            }
            else {
                final Editable text = editText.getText();
                if (text != null) {
                    if (n >= 7 && n <= 16 && keyEvent.getAction() == 1 && ((TextView)editText).getSelectionStart() == 2 && ((CharSequence)text).length() == 2) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        this.a(12);
                        break Label_0153;
                    }
                }
            }
            b = false;
        }
        this.F0 = false;
        return b;
    }
}
