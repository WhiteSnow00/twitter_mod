import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.appcompat.view.menu.i$a;
import android.view.Menu;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public interface tc8
{
    void C(final int p0);
    
    void E(final View p0);
    
    boolean a();
    
    boolean b();
    
    boolean c();
    
    void collapseActionView();
    
    void d(final Menu p0, final i$a p1);
    
    boolean e();
    
    void f();
    
    boolean g();
    
    Context getContext();
    
    CharSequence getTitle();
    
    boolean h();
    
    int i();
    
    bax j(final int p0, final long p1);
    
    void k();
    
    void l(final boolean p0);
    
    void m();
    
    void n();
    
    void o();
    
    void p(final int p0);
    
    int q();
    
    void r();
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setVisibility(final int p0);
    
    void setWindowCallback(final Window$Callback p0);
    
    void setWindowTitle(final CharSequence p0);
}
