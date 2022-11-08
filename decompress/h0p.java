import android.widget.BaseAdapter;
import android.text.Spannable;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import java.util.Collection;
import java.util.Locale;
import java.text.SimpleDateFormat;
import android.content.Context;
import java.util.List;
import android.widget.ArrayAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h0p extends ArrayAdapter<cb8>
{
    public static final List<cb8> G0;
    public final ft0<cb8> C0;
    public final Context D0;
    public final SimpleDateFormat E0;
    public String F0;
    
    static {
        h0p.G0 = (rth$a)rth.a(300);
    }
    
    public h0p(final Context d0) {
        super(d0, 0, (List)h0p.G0);
        this.C0 = (ft0<cb8>)new ft0(0);
        this.F0 = "";
        this.D0 = d0;
        this.E0 = new SimpleDateFormat("HH:mm:ss.SSS", Locale.ENGLISH);
    }
    
    public final void a(final List<cb8> list, final String f0) {
        this.F0 = f0;
        this.C0.clear();
        final rth$a g0 = h0p.G0;
        ((List)g0).clear();
        ((List)g0).addAll(hr4.j((List)list));
        ((BaseAdapter)this).notifyDataSetChanged();
    }
    
    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = LayoutInflater.from(this.getContext()).inflate(2131625617, viewGroup, false);
        }
        final TextView textView = (TextView)inflate.findViewById(2131430197);
        final TextView textView2 = (TextView)inflate.findViewById(2131432060);
        final TextView textView3 = (TextView)inflate.findViewById(2131428659);
        final cb8 cb8 = ((List<cb8>)h0p.G0).get(n);
        n9q.v((Object)cb8).w((qtb)new ue8((Object)this, 1)).I(yvo.a()).y(h6q.L()).c((nbq)new g0p(this, textView2, textView, textView3, cb8));
        inflate.setOnClickListener((View$OnClickListener)new e0p((Object)this, (Object)textView3, (Object)cb8, 0));
        inflate.setLongClickable(true);
        tbx.v(inflate, (View$OnLongClickListener)new f0p(this, n));
        return inflate;
    }
    
    public static final class a
    {
        public final boolean a;
        public final String b;
        public final Spannable c;
        public final Spannable d;
        
        public a(final String b, final Spannable c, final Spannable d, final boolean a) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.a = a;
        }
    }
}
