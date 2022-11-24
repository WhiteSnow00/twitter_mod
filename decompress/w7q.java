import android.content.Context;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.view.LayoutInflater;
import android.content.res.Resources;
import com.twitter.onboarding.ocf.OcfDateViewDelegate;
import android.webkit.WebView;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import com.google.android.material.textfield.TextInputLayout;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.view.ViewTreeObserver$OnPreDrawListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w7q implements q7f, ViewTreeObserver$OnPreDrawListener, a, ywk$a
{
    public final Activity F0;
    public final View G0;
    public final TextView H0;
    public final TextInputLayout I0;
    public final TextInputLayout J0;
    public final HorizonComposeButton K0;
    public final View L0;
    public final HorizonComposeButton M0;
    public final View N0;
    public final WebView O0;
    public final cd1 P0;
    public final OcfDateViewDelegate Q0;
    public final uv1<Boolean> R0;
    
    public w7q(final Activity f0, final Resources resources, final LayoutInflater layoutInflater, final dra<TextInputLayout, DatePicker, noj<sa8>, OcfDateViewDelegate> dra) {
        this.F0 = f0;
        final View inflate = layoutInflater.inflate(2131625088, (ViewGroup)null);
        this.G0 = inflate;
        this.H0 = (TextView)inflate.findViewById(2131430698);
        final TextInputLayout i0 = (TextInputLayout)inflate.findViewById(2131430193);
        ((View)(this.I0 = i0)).requestFocus();
        i0.setCounterMaxLength(ita.b().f("user_display_name_max_limit", resources.getInteger(2131492951)));
        i0.setCounterEnabled(true);
        this.J0 = (TextInputLayout)inflate.findViewById(2131430558);
        this.K0 = (HorizonComposeButton)inflate.findViewById(2131428548);
        final TextInputLayout textInputLayout = (TextInputLayout)inflate.findViewById(2131427812);
        final DatePicker datePicker = (DatePicker)inflate.findViewById(2131428590);
        final noj b = noj.b;
        final int a = o5j.a;
        this.Q0 = (OcfDateViewDelegate)dra.a((Object)textInputLayout, (Object)datePicker, (Object)b);
        this.R0 = (uv1<Boolean>)new uv1();
        this.N0 = inflate.findViewById(2131427753);
        this.M0 = (HorizonComposeButton)inflate.findViewById(2131431295);
        this.O0 = (WebView)inflate.findViewById(2131432033);
        this.P0 = new cd1(f0, this);
        final View viewById = inflate.findViewById(2131429257);
        this.L0 = viewById;
        if (resources.getConfiguration().orientation == 1) {
            viewById.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        }
    }
    
    public final void a(final View$OnClickListener onClickListener) {
        this.K0.setOnClickListener(onClickListener);
    }
    
    public final void b(final Boolean b) {
        this.R0.onNext((Object)b);
    }
    
    public final void g(final String text) {
        if (flr.e((CharSequence)this.J0.getEditText().getText())) {
            ((TextView)this.J0.getEditText()).setText((CharSequence)text);
            ((View)this.J0.getEditText()).requestFocus();
        }
    }
    
    public final View getView() {
        return this.G0;
    }
    
    public final void h(final CharSequence text) {
        this.K0.setText(text);
    }
    
    public final void i(final String text) {
        if (flr.e((CharSequence)this.I0.getEditText().getText())) {
            ((TextView)this.I0.getEditText()).setText((CharSequence)text);
        }
    }
    
    public final void j(final boolean enabled) {
        this.K0.setEnabled(enabled);
    }
    
    public final void k() {
        hdx.z((Context)this.F0, (View)this.J0, true);
        ((View)this.J0).requestFocus();
    }
    
    public final String l() {
        return this.J0.getEditText().getText().toString();
    }
    
    public final boolean m() {
        return ((View)this.J0).isFocused() || ((View)this.J0.getEditText()).isFocused();
    }
    
    public final void o(final String hint) {
        this.J0.setHint((CharSequence)hint);
    }
    
    public final boolean onPreDraw() {
        final int height = this.L0.getHeight();
        final int width = this.L0.getWidth();
        boolean b = true;
        if (height * 4 < width) {
            b = (((View)this.Q0.c).getVisibility() == 8 && b);
        }
        return b;
    }
    
    public final void v(final CharSequence text) {
        this.M0.setText(text);
    }
    
    public final void w(final boolean b) {
        final HorizonComposeButton m0 = this.M0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)m0).setVisibility(visibility);
    }
}
