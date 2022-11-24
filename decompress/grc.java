// 
// Decompiled by Procyon v0.6.0
// 

public final class grc implements g39
{
    public final fvh a;
    public final iuh b;
    
    public grc(final fvh a, final iuh b) {
        this.a = a;
        this.b = b;
    }
    
    public final void dispose() {
        final fvh a = this.a;
        final iuh b = this.b;
        final drc drc = (drc)((l9r)a).getValue();
        if (drc != null) {
            b.c((fvd)new erc(drc));
            a.setValue((Object)null);
        }
    }
}
