import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gj8 implements r3g
{
    public final p a;
    public xgl b;
    
    public gj8(final p a) {
        this.a = a;
        final xgl b = (xgl)a.H("tag_progress_dialog");
        if (b != null) {
            this.b = b;
        }
    }
    
    public final void a() {
        if (this.b == null) {
            ((Fragment)(this.b = xgl.n2(2131955537))).S1();
            this.b.p2(this.a, "tag_progress_dialog");
        }
    }
    
    public final void b() {
        final xgl b = this.b;
        if (b != null) {
            b.m2();
            this.b = null;
        }
    }
}
