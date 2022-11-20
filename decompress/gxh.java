import androidx.fragment.app.Fragment;
import android.view.View;
import android.content.Context;
import android.net.Uri;
import android.widget.TextView;
import android.os.Bundle;
import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public class gxh extends qas
{
    public static final int o2 = 0;
    
    public final /* bridge */ xk1 h2() {
        return (xk1)this.z2();
    }
    
    public final /* bridge */ o8q m2() {
        return (o8q)this.z2();
    }
    
    public final void n2(final Dialog dialog, final Bundle bundle) {
        super.n2(dialog, bundle);
        final View g2 = ((wk1)this).g2(2131428667);
        if (g2 != null) {
            g2.getBackground().setAlpha(255);
        }
        final TextView textView = (TextView)dialog.findViewById(2131428670);
        final Context n0 = ((Fragment)this).N0();
        if (textView != null) {
            final ce4 o = jee.o((Context)((Fragment)this).L0(), d4j.i(n0, 2130969074), d4j.i(n0, 2130968591), an.a().a((Context)((Fragment)this).L0(), new vmx(Uri.parse(((Fragment)this).W0(2131954547)))));
            f0r.c(textView);
            textView.setText((CharSequence)uoz.D(new Object[] { o }, textView.getText().toString(), "{{}}"));
        }
    }
    
    public final /* bridge */ ras t2() {
        return (ras)this.z2();
    }
    
    public final void x2() {
        ((nv8)this).x0(super.n2 = false);
    }
    
    public final hxh z2() {
        return new hxh(((Fragment)this).J0);
    }
}
