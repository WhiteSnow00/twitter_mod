import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AutoCompleteTextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class rj0 extends AutoCompleteTextView implements lat
{
    public static final int[] G0;
    public final sj0 D0;
    public final qk0 E0;
    public final qmi F0;
    
    static {
        G0 = new int[] { 16843126 };
    }
    
    public rj0(final Context context, final AttributeSet set) {
        this(context, set, 2130968697);
    }
    
    public rj0(final Context context, final AttributeSet set, int inputType) {
        gat.a(context);
        super(context, set, 2130968697);
        hms.a((View)this, ((View)this).getContext());
        final kat q = kat.q(((View)this).getContext(), set, rj0.G0, 2130968697);
        if (q.o(0)) {
            this.setDropDownBackgroundDrawable(q.g(0));
        }
        q.r();
        (this.D0 = new sj0((View)this)).d(set, 2130968697);
        final qk0 e0 = new qk0((TextView)this);
        (this.E0 = e0).h(set, 2130968697);
        e0.b();
        final qmi f0 = new qmi((EditText)this);
        (this.F0 = f0).f(set, 2130968697);
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        if (keyListener instanceof NumberKeyListener ^ true) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            inputType = super.getInputType();
            final KeyListener d = f0.d(keyListener);
            if (d != keyListener) {
                super.setKeyListener(d);
                super.setRawInputType(inputType);
                super.setFocusable(focusable);
                super.setClickable(clickable);
                super.setLongClickable(longClickable);
            }
        }
    }
    
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.a();
        }
        final qk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return cks.g(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final sj0 d0 = this.D0;
        ColorStateList b;
        if (d0 != null) {
            b = d0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final sj0 d0 = this.D0;
        PorterDuff$Mode c;
        if (d0 != null) {
            c = d0.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.E0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.E0.f();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        z6q.k(onCreateInputConnection, editorInfo, (View)this);
        return this.F0.g(onCreateInputConnection, editorInfo);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.f(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final qk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final qk0 e0 = this.E0;
        if (e0 != null) {
            e0.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(cks.h((TextView)this, actionMode$Callback));
    }
    
    public void setDropDownBackgroundResource(final int n) {
        this.setDropDownBackgroundDrawable(v68.x(((View)this).getContext(), n));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.F0.k(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.F0.d(keyListener));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final sj0 d0 = this.D0;
        if (d0 != null) {
            d0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.E0.n(list);
        this.E0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.E0.o(porterDuff$Mode);
        this.E0.b();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final qk0 e0 = this.E0;
        if (e0 != null) {
            e0.i(context, n);
        }
    }
}
