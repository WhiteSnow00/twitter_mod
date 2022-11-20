import java.util.Iterator;
import com.twitter.ui.widget.TwitterEditText;
import android.widget.EditText;
import android.widget.TextView$OnEditorActionListener;
import android.text.Editable;
import android.text.TextWatcher;
import java.util.HashSet;
import android.widget.TextView;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klb
{
    public final List<e> a;
    public final Set<TextView> b;
    public final klb$a c;
    public b d;
    public g e;
    
    public klb() {
        this.a = (vth$a)vth.a(0);
        this.b = new HashSet();
        this.c = new TextWatcher(this) {
            public final klb D0;
            
            public final void afterTextChanged(final Editable editable) {
                this.D0.c();
            }
            
            public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
    }
    
    public final klb a(final c c, final hlb hlb, final int n) {
        ((List<klb.klb$d>)this.a).add(new klb.klb$d(c, hlb, n));
        final EditText b = c.b();
        if (!this.b.contains(b)) {
            ((TextView)b).addTextChangedListener((TextWatcher)this.c);
            ((TextView)b).setOnEditorActionListener((TextView$OnEditorActionListener)new jlb(this));
            this.b.add(b);
        }
        return this;
    }
    
    public final klb b(final TwitterEditText twitterEditText, final hlb hlb, final int n) {
        this.a((c)new ebv(twitterEditText), hlb, n);
        return this;
    }
    
    public final boolean c() {
        final Iterator<Object> iterator = ((List<Object>)this.a).iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        final Iterator<Object> iterator2 = ((List<Object>)this.a).iterator();
        boolean b = true;
        int n = 0;
        while (iterator2.hasNext()) {
            final e e = iterator2.next();
            final int b2 = e.b();
            boolean b4;
            if (b2 != 0) {
                boolean b3;
                if (b2 != 1) {
                    if (b2 != 2) {
                        throw new IllegalStateException(ze.G("Unsupported validation result [", b2, "]"));
                    }
                    b3 = (n == 0);
                }
                else {
                    b3 = (n != 1);
                    b = false;
                }
                final int n2 = b2;
                b4 = b3;
                n = n2;
            }
            else {
                b4 = false;
            }
            if (b4) {
                e.d(b2);
            }
        }
        final g e2 = this.e;
        if (e2 != null) {
            e2.M2(b);
        }
        return b;
    }
    
    public interface b
    {
    }
    
    public interface c
    {
        void a();
        
        EditText b();
        
        void c(final int p0, final int p1);
    }
    
    public interface e
    {
        void a();
        
        int b();
        
        void c(final klb p0);
        
        void d(final int p0);
    }
    
    public interface g
    {
        void M2(final boolean p0);
    }
}
