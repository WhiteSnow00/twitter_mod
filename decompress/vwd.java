import android.view.View;
import android.widget.TextView;
import java.util.List;
import android.widget.TextView$OnEditorActionListener;
import android.text.TextWatcher;
import com.twitter.ui.widget.PopupEditText$c;
import android.widget.ListAdapter;
import com.twitter.ui.widget.PopupEditText;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwd implements swd
{
    public final cwd a;
    public final rv1<ra7> b;
    
    public vwd(final cwd a) {
        this.b = (rv1<ra7>)new rv1();
        this.a = a;
        a.K0 = (cwd.a)new cwd.a() {
            public final /* synthetic */ boolean a = a.N0;
            
            @Override
            public final void a(final ln3 ln3) {
                if (this.a) {
                    vwd.this.b.onNext((Object)new ra7(ln3.C0, (String)null, ln3.F0));
                }
                else {
                    vwd.this.b.onNext((Object)new ra7(ln3.C0, ln3.F0, (String)null));
                }
            }
            
            @Override
            public final void b(final String s) {
                vwd.this.b.onNext((Object)new ra7(s, (String)null, (String)null));
            }
        };
    }
    
    public final void a(final PopupEditText l0) {
        final cwd a = this.a;
        a.L0 = l0;
        if (a.J0 == null) {
            a.J0 = (seg<String, List<ln3>>)new seg(30);
        }
        if (a.I0 == null) {
            a.I0 = new cwd.c(a.C0);
        }
        a.L0.setAdapter((ListAdapter)a.I0);
        ((TextView)a.L0).setText((CharSequence)null);
        a.L0.setPopupEditTextListener((PopupEditText$c)a);
        ((TextView)a.L0).addTextChangedListener((TextWatcher)a);
        ((TextView)a.L0).setOnEditorActionListener((TextView$OnEditorActionListener)a);
        ((View)a.L0).requestFocus();
    }
    
    public final b5j<ra7> b() {
        return (b5j<ra7>)this.b;
    }
}
