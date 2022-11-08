import android.view.View;
import androidx.appcompat.app.AppCompatDelegateImpl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bk0 implements ogj
{
    public final /* synthetic */ AppCompatDelegateImpl C0;
    
    public bk0(final AppCompatDelegateImpl c0) {
        this.C0 = c0;
    }
    
    public final vox a(final View view, final vox vox) {
        final int i = vox.i();
        final int w = this.C0.W(vox);
        vox l = vox;
        if (i != w) {
            l = vox.l(vox.g(), w, vox.h(), vox.f());
        }
        return p5x.t(view, l);
    }
}
