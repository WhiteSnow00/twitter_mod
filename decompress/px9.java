// 
// Decompiled by Procyon v0.6.0
// 

public final class px9 extends bvh<r7a> implements v7a
{
    public qku J0;
    
    public px9() {
        this.J0 = qku.h;
    }
    
    public px9(final rfu rfu) {
        super((fym)rfu);
        this.J0 = rfu.K0;
    }
    
    public final CharSequence e() {
        return (CharSequence)super.I0;
    }
    
    public final int i(final r7a r7a) {
        final yuh yuh = super.G0.get(r7a);
        int b;
        if (yuh != null) {
            b = yuh.b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final qku j() {
        return this.J0;
    }
}
