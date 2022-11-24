import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tj8 implements z3g
{
    public final p a;
    public vhl b;
    
    public tj8(final p a) {
        this.a = a;
        final vhl b = (vhl)a.H("tag_progress_dialog");
        if (b != null) {
            this.b = b;
        }
    }
    
    public final void a() {
        if (this.b == null) {
            ((Fragment)(this.b = vhl.n2(2131955537))).S1();
            this.b.p2(this.a, "tag_progress_dialog");
        }
    }
    
    public final void b() {
        final vhl b = this.b;
        if (b != null) {
            b.m2();
            this.b = null;
        }
    }
}
