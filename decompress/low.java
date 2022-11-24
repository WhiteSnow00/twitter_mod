import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

// 
// Decompiled by Procyon v0.6.0
// 

public class low implements iow
{
    public final TextInputLayout a;
    public final mow$b b;
    public final boolean c;
    
    public low(final TextInputLayout textInputLayout) {
        e0e.f((Object)textInputLayout, "textInputLayout");
        this(textInputLayout, (mow$b)new a(zrm.Companion.b((View)textInputLayout)));
    }
    
    public low(final TextInputLayout a, final mow$b b) {
        e0e.f((Object)a, "textInputLayout");
        this.a = a;
        this.b = b;
        this.c = false;
    }
    
    public low(final TextInputLayout a, final boolean b) {
        e0e.f((Object)a, "textInputLayout");
        final a b2 = new a(zrm.Companion.b((View)a));
        this.a = a;
        this.b = (mow$b)b2;
        this.c = true;
    }
    
    public final t5j<CharSequence> a() {
        final EditText editText = this.a.getEditText();
        t5j t5j;
        if (editText != null) {
            t5j = ak1.L((TextView)editText);
        }
        else {
            t5j = t5j.just((Object)"");
            e0e.e((Object)t5j, "just(\"\")");
        }
        return (t5j<CharSequence>)t5j;
    }
    
    public final void b() {
        this.i();
        final Drawable a = this.b.a((View)this.a);
        e0e.e((Object)a, "drawableProvider.getVali\u2026Drawable(textInputLayout)");
        this.a.setEndIconDrawable(a);
    }
    
    public final boolean c() {
        return this.c;
    }
    
    public final void d() {
        this.i();
        this.a.setEndIconDrawable(this.b.b());
    }
    
    public final CharSequence e() {
        final EditText editText = this.a.getEditText();
        Object text;
        if (editText != null) {
            text = editText.getText();
        }
        else {
            text = null;
        }
        CharSequence charSequence = (CharSequence)text;
        if (text == null) {
            charSequence = "";
        }
        return charSequence;
    }
    
    public final void f() {
        this.i();
        this.a.setEndIconDrawable(this.b.d());
    }
    
    public final void g(final String error, final boolean b) {
        this.i();
        if (b) {
            this.a.setEndIconDrawable(this.b.c());
            this.a.setEndIconOnClickListener((View$OnClickListener)new d1x((Object)this, 25));
        }
        else {
            this.a.setEndIconDrawable(this.b.e());
        }
        this.a.setError((CharSequence)error);
    }
    
    public void h() {
        this.a.setEndIconOnClickListener((View$OnClickListener)null);
    }
    
    public final void i() {
        this.a.setError((CharSequence)null);
        this.a.setEndIconDrawable((Drawable)null);
        this.h();
    }
    
    public static final class a implements mow$b
    {
        public final zrm a;
        public final h5s b;
        public final h5s c;
        public final h5s d;
        
        public a(final zrm a) {
            this.a = a;
            this.b = (h5s)jty.N((ptb)new low$a$c(this));
            this.c = (h5s)jty.N((ptb)new low$a$b(this));
            this.d = (h5s)jty.N((ptb)new low$a$a(this));
        }
        
        public final Drawable a(final View view) {
            e0e.f((Object)view, "view");
            final bog bog = new bog(view.getContext(), view);
            final bog$c g0 = bog.G0;
            g0.w = 0;
            g0.u = 255;
            bog.a(new int[] { this.a.g(2131100865) });
            bog.c(2);
            return (Drawable)bog;
        }
        
        public final Drawable b() {
            final Drawable drawable = (Drawable)this.b.getValue();
            e0e.c((Object)drawable);
            return drawable;
        }
        
        public final Drawable c() {
            return (Drawable)this.d.getValue();
        }
        
        public final Drawable d() {
            return null;
        }
        
        public final Drawable e() {
            return (Drawable)this.c.getValue();
        }
    }
}
