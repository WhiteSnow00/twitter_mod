// 
// Decompiled by Procyon v0.6.0
// 

public final class ou8
{
    public int a;
    public boolean b;
    
    public ou8() {
        this.a = 0;
        this.b = false;
    }
    
    public static int a(final int n) {
        if (fbx.L(n)) {
            return 2;
        }
        if (fbx.R(n)) {
            return 3;
        }
        if ((0x800000 & n) != 0x0) {
            return 4;
        }
        if (fbx.W(n)) {
            return 1;
        }
        return 0;
    }
}
