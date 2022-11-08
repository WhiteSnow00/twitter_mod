// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.Log;
import android.app.Activity;
import android.content.ContextWrapper;
import android.view.DragEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.textclassifier.TextClassifier;
import android.os.Build$VERSION;
import android.text.Editable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.ActionMode$Callback;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import java.util.Objects;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.EditText;

public class AppCompatEditText extends EditText implements ijj, v9t
{
    public final wj0 C0;
    public final vk0 D0;
    public final uk0 E0;
    public final mjs F0;
    public final jk0 G0;
    
    public AppCompatEditText(final Context context, final AttributeSet set) {
        this(context, set, 2130969416);
    }
    
    public AppCompatEditText(final Context context, final AttributeSet set, int inputType) {
        q9t.a(context);
        super(context, set, inputType);
        mls.a((View)this, ((View)this).getContext());
        (this.C0 = new wj0((View)this)).d(set, inputType);
        final vk0 d0 = new vk0((TextView)this);
        (this.D0 = d0).h(set, inputType);
        d0.b();
        this.E0 = new uk0((TextView)this);
        this.F0 = new mjs();
        final jk0 g0 = new jk0(this);
        (this.G0 = g0).e(set, inputType);
        final KeyListener keyListener = ((TextView)this).getKeyListener();
        Objects.requireNonNull(g0);
        if (keyListener instanceof NumberKeyListener ^ true) {
            final boolean focusable = super.isFocusable();
            final boolean clickable = super.isClickable();
            final boolean longClickable = super.isLongClickable();
            inputType = super.getInputType();
            final KeyListener c = g0.c(keyListener);
            if (c != keyListener) {
                super.setKeyListener(c);
                super.setRawInputType(inputType);
                super.setFocusable(focusable);
                super.setClickable(clickable);
                super.setLongClickable(longClickable);
            }
        }
    }
    
    public final dm6 b(final dm6 dm6) {
        return this.F0.a((View)this, dm6);
    }
    
    public void drawableStateChanged() {
        super.drawableStateChanged();
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.a();
        }
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public ActionMode$Callback getCustomSelectionActionModeCallback() {
        return hjs.g(super.getCustomSelectionActionModeCallback());
    }
    
    public ColorStateList getSupportBackgroundTintList() {
        final wj0 c0 = this.C0;
        ColorStateList b;
        if (c0 != null) {
            b = c0.b();
        }
        else {
            b = null;
        }
        return b;
    }
    
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final wj0 c0 = this.C0;
        PorterDuff$Mode c2;
        if (c0 != null) {
            c2 = c0.c();
        }
        else {
            c2 = null;
        }
        return c2;
    }
    
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.D0.e();
    }
    
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.D0.f();
    }
    
    public Editable getText() {
        if (Build$VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
    
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final uk0 e0 = this.E0;
            if (e0 != null) {
                TextClassifier textClassifier;
                if ((textClassifier = e0.b) == null) {
                    textClassifier = uk0$a.a(e0.a);
                }
                return textClassifier;
            }
        }
        return super.getTextClassifier();
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.D0);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30 && onCreateInputConnection != null) {
            jx9.d(editorInfo, this.getText());
        }
        lr0.J(onCreateInputConnection, editorInfo, (View)this);
        InputConnection a;
        if ((a = onCreateInputConnection) != null) {
            a = onCreateInputConnection;
            if (sdk_INT <= 30) {
                final String[] n = p5x.n((View)this);
                a = onCreateInputConnection;
                if (n != null) {
                    jx9.c(editorInfo, n);
                    a = nrd.a(onCreateInputConnection, editorInfo, (nrd$c)new fj4((Object)this, 0));
                }
            }
        }
        return this.G0.f(a, editorInfo);
    }
    
    public final boolean onDragEvent(final DragEvent dragEvent) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int a;
        final int n = a = 0;
        if (sdk_INT < 31) {
            a = n;
            if (sdk_INT >= 24) {
                a = n;
                if (dragEvent.getLocalState() == null) {
                    if (p5x.n((View)this) != null) {
                        Context context = ((View)this).getContext();
                        while (true) {
                            while (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    final Activity activity = (Activity)context;
                                    if (activity == null) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Can't handle drop: no activity: view=");
                                        sb.append(this);
                                        Log.i("ReceiveContent", sb.toString());
                                        a = n;
                                        return a != 0 || super.onDragEvent(dragEvent);
                                    }
                                    if (dragEvent.getAction() == 1) {
                                        a = n;
                                        return a != 0 || super.onDragEvent(dragEvent);
                                    }
                                    a = n;
                                    if (dragEvent.getAction() == 3) {
                                        a = (sk0.a(dragEvent, (TextView)this, activity) ? 1 : 0);
                                        return a != 0 || super.onDragEvent(dragEvent);
                                    }
                                    return a != 0 || super.onDragEvent(dragEvent);
                                }
                                else {
                                    context = ((ContextWrapper)context).getBaseContext();
                                }
                            }
                            final Activity activity = null;
                            continue;
                        }
                    }
                    a = n;
                }
            }
        }
        return a != 0 || super.onDragEvent(dragEvent);
    }
    
    public boolean onTextContextMenuItem(final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final int n2 = 0;
        final int n3 = 0;
        int n4 = n2;
        if (sdk_INT < 31) {
            n4 = n2;
            if (p5x.n((View)this) != null) {
                if (n != 16908322 && n != 16908337) {
                    n4 = n2;
                }
                else {
                    final ClipboardManager clipboardManager = (ClipboardManager)((View)this).getContext().getSystemService("clipboard");
                    ClipData primaryClip;
                    if (clipboardManager == null) {
                        primaryClip = null;
                    }
                    else {
                        primaryClip = clipboardManager.getPrimaryClip();
                    }
                    if (primaryClip != null && primaryClip.getItemCount() > 0) {
                        Object o;
                        if (sdk_INT >= 31) {
                            o = new dm6.a(primaryClip, 1);
                        }
                        else {
                            o = new dm6.c(primaryClip, 1);
                        }
                        int n5;
                        if (n == 16908322) {
                            n5 = n3;
                        }
                        else {
                            n5 = 1;
                        }
                        ((dm6$b)o).g(n5);
                        p5x.u((View)this, ((dm6$b)o).b());
                    }
                    n4 = 1;
                }
            }
        }
        return n4 != 0 || super.onTextContextMenuItem(n);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.e();
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.f(backgroundResource);
        }
    }
    
    public final void setCompoundDrawables(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public final void setCompoundDrawablesRelative(final Drawable drawable, final Drawable drawable2, final Drawable drawable3, final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.b();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(hjs.h((TextView)this, actionMode$Callback));
    }
    
    public void setEmojiCompatEnabled(final boolean b) {
        this.G0.j(b);
    }
    
    public void setKeyListener(final KeyListener keyListener) {
        super.setKeyListener(this.G0.c(keyListener));
    }
    
    public void setSupportBackgroundTintList(final ColorStateList list) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.h(list);
        }
    }
    
    public void setSupportBackgroundTintMode(final PorterDuff$Mode porterDuff$Mode) {
        final wj0 c0 = this.C0;
        if (c0 != null) {
            c0.i(porterDuff$Mode);
        }
    }
    
    public void setSupportCompoundDrawablesTintList(final ColorStateList list) {
        this.D0.n(list);
        this.D0.b();
    }
    
    public void setSupportCompoundDrawablesTintMode(final PorterDuff$Mode porterDuff$Mode) {
        this.D0.o(porterDuff$Mode);
        this.D0.b();
    }
    
    public final void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final vk0 d0 = this.D0;
        if (d0 != null) {
            d0.i(context, n);
        }
    }
    
    public void setTextClassifier(final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final uk0 e0 = this.E0;
            if (e0 != null) {
                e0.b = textClassifier;
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
}
