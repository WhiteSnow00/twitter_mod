import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l80 implements w80
{
    public final List a;
    
    public l80(final List list, final int n) {
        if (n != 1) {
            this.a = list;
            return;
        }
        this.a = list;
    }
    
    public final boolean f() {
        final int size = this.a.size();
        boolean b = false;
        if (size == 1) {
            b = b;
            if (this.a.get(0).c()) {
                b = true;
            }
        }
        return b;
    }
    
    public final wm1 g() {
        if (this.a.get(0).c()) {
            return (wm1)new pok(this.a);
        }
        return (wm1)new ozj(this.a);
    }
    
    public final List h() {
        return this.a;
    }
}
