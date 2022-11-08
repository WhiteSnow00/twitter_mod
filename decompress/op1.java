import android.os.BaseBundle;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class op1 implements ytm
{
    public final p a;
    public final Activity b;
    
    public op1(final p a, final Activity b) {
        zzd.f((Object)b, "activityContext");
        this.a = a;
        this.b = b;
    }
    
    public final void a(final vo6 vo6) {
        zzd.f((Object)vo6, "tweet");
        final fw8 fw8 = new fw8(this.a, this.e());
        final b07 b = this.b();
        final ybc$a ybc$a = new ybc$a();
        ybc$a.n = b;
        ybc$a.o = 2;
        ybc$a.h = this.g();
        ybc$a.j = this.c(vo6);
        ybc$a.i = ((Context)this.b).getString(2131954239);
        ybc$a.p = this.f();
        ybc$a.l = true;
        final int d = this.d();
        final ybc$b r = ybc.r;
        final Bundle w = zi.w("twitter:id", d);
        yvj.k(w, "serializer_fragment_arg", ((h4j)ybc$a).e(), (alp)r);
        final int a = w4j.a;
        if (((BaseBundle)w).containsKey("twitter:id")) {
            final ubc ubc = new ubc();
            ((Fragment)ubc).N1(w);
            fw8.a((cl1)ubc);
            return;
        }
        throw new Fragment.InstantiationException("Missing fragment id", null);
    }
    
    public abstract b07 b();
    
    public abstract xwm<xes> c(final vo6 p0);
    
    public abstract int d();
    
    public abstract String e();
    
    public abstract snv f();
    
    public abstract xwm<xes> g();
}
