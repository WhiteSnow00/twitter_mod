// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable
{
    public static final int[] I0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    
    static {
        I0 = new int[] { 16842912 };
    }
    
    public CheckableImageButton(final Context context, final AttributeSet set) {
        super(context, set, 2130969810);
        this.G0 = true;
        this.H0 = true;
        p5x.z((View)this, (wf)new u74(this));
    }
    
    public final boolean isChecked() {
        return this.F0;
    }
    
    public final int[] onCreateDrawableState(final int n) {
        if (this.F0) {
            return View.mergeDrawableStates(super.onCreateDrawableState(n + 1), CheckableImageButton.I0);
        }
        return super.onCreateDrawableState(n);
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.setChecked(savedState.checked);
    }
    
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.F0;
        return (Parcelable)savedState;
    }
    
    public void setCheckable(final boolean g0) {
        if (this.G0 != g0) {
            this.G0 = g0;
            ((View)this).sendAccessibilityEvent(0);
        }
    }
    
    public void setChecked(final boolean f0) {
        if (this.G0 && this.F0 != f0) {
            this.F0 = f0;
            ((View)this).refreshDrawableState();
            ((View)this).sendAccessibilityEvent(2048);
        }
    }
    
    public void setPressable(final boolean h0) {
        this.H0 = h0;
    }
    
    public void setPressed(final boolean pressed) {
        if (this.H0) {
            super.setPressed(pressed);
        }
    }
    
    public final void toggle() {
        this.setChecked(this.F0 ^ true);
    }
    
    public static class SavedState extends fa
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public boolean checked;
        
        static {
            CREATOR = (Parcelable$Creator)new CheckableImageButton$SavedState$a();
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.readFromParcel(parcel);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        private void readFromParcel(final Parcel parcel) {
            final int int1 = parcel.readInt();
            boolean checked = true;
            if (int1 != 1) {
                checked = false;
            }
            this.checked = checked;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt((int)(this.checked ? 1 : 0));
        }
    }
}
