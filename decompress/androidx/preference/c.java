// 
// Decompiled by Procyon v0.6.0
// 

package androidx.preference;

import android.os.BaseBundle;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.widget.TextView;
import android.text.TextUtils;
import androidx.appcompat.app.e;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.appcompat.app.e$a;
import android.app.Dialog;
import android.os.Parcelable;
import android.os.Bundle;
import android.graphics.drawable.BitmapDrawable;
import android.content.DialogInterface$OnClickListener;

public abstract class c extends cw8 implements DialogInterface$OnClickListener
{
    public DialogPreference P1;
    public CharSequence Q1;
    public CharSequence R1;
    public CharSequence S1;
    public CharSequence T1;
    public int U1;
    public BitmapDrawable V1;
    public int W1;
    
    @Override
    public void A1(final Bundle bundle) {
        super.A1(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.Q1);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.R1);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.S1);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.T1);
        ((BaseBundle)bundle).putInt("PreferenceDialogFragment.layout", this.U1);
        final BitmapDrawable v1 = this.V1;
        if (v1 != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", (Parcelable)v1.getBitmap());
        }
    }
    
    @Override
    public final Dialog a2(final Bundle bundle) {
        final gob l0 = this.L0();
        this.W1 = -2;
        final e$a g = new e$a((Context)l0).setTitle(this.Q1).d((Drawable)this.V1).i(this.R1, (DialogInterface$OnClickListener)this).g(this.S1, (DialogInterface$OnClickListener)this);
        final int u1 = this.U1;
        View inflate = null;
        if (u1 != 0) {
            inflate = LayoutInflater.from((Context)l0).inflate(u1, (ViewGroup)null);
        }
        if (inflate != null) {
            this.g2(inflate);
            g.setView(inflate);
        }
        else {
            g.e(this.T1);
        }
        this.i2(g);
        final e create = g.create();
        if (this instanceof zt9) {
            ((Dialog)create).getWindow().setSoftInputMode(5);
        }
        return (Dialog)create;
    }
    
    public final DialogPreference f2() {
        if (this.P1 == null) {
            this.P1 = (DialogPreference)((DialogPreference$a)this.Y0(true)).d0((CharSequence)((BaseBundle)super.I0).getString("key"));
        }
        return this.P1;
    }
    
    public void g2(final View view) {
        final View viewById = view.findViewById(16908299);
        if (viewById != null) {
            final CharSequence t1 = this.T1;
            int visibility = 8;
            if (!TextUtils.isEmpty(t1)) {
                if (viewById instanceof TextView) {
                    ((TextView)viewById).setText(t1);
                }
                visibility = 0;
            }
            if (viewById.getVisibility() != visibility) {
                viewById.setVisibility(visibility);
            }
        }
    }
    
    public abstract void h2(final boolean p0);
    
    public void i2(final e$a e$a) {
    }
    
    @Override
    public void k1(final Bundle bundle) {
        super.k1(bundle);
        final Fragment y0 = this.Y0(true);
        if (y0 instanceof DialogPreference$a) {
            final DialogPreference$a dialogPreference$a = (DialogPreference$a)y0;
            final String string = ((BaseBundle)super.I0).getString("key");
            if (bundle == null) {
                final DialogPreference p = (DialogPreference)dialogPreference$a.d0((CharSequence)string);
                this.P1 = p;
                this.Q1 = p.n1;
                this.R1 = p.q1;
                this.S1 = p.r1;
                this.T1 = p.o1;
                this.U1 = p.s1;
                final Drawable p2 = p.p1;
                if (p2 != null && !(p2 instanceof BitmapDrawable)) {
                    final Bitmap bitmap = Bitmap.createBitmap(p2.getIntrinsicWidth(), p2.getIntrinsicHeight(), Bitmap$Config.ARGB_8888);
                    final Canvas canvas = new Canvas(bitmap);
                    p2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    p2.draw(canvas);
                    this.V1 = new BitmapDrawable(this.U0(), bitmap);
                }
                else {
                    this.V1 = (BitmapDrawable)p2;
                }
            }
            else {
                this.Q1 = bundle.getCharSequence("PreferenceDialogFragment.title");
                this.R1 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
                this.S1 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
                this.T1 = bundle.getCharSequence("PreferenceDialogFragment.message");
                this.U1 = ((BaseBundle)bundle).getInt("PreferenceDialogFragment.layout", 0);
                final Bitmap bitmap2 = (Bitmap)bundle.getParcelable("PreferenceDialogFragment.icon");
                if (bitmap2 != null) {
                    this.V1 = new BitmapDrawable(this.U0(), bitmap2);
                }
            }
            return;
        }
        throw new IllegalStateException("Target fragment must implement TargetFragment interface");
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int w1) {
        this.W1 = w1;
    }
    
    @Override
    public final void onDismiss(final DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.h2(this.W1 == -1);
    }
}
