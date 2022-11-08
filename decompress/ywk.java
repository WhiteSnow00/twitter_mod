// 
// Decompiled by Procyon v0.6.0
// 

public final class ywk extends gue implements otb<oyv>
{
    public final /* synthetic */ luh<Integer> C0;
    public final /* synthetic */ Object[] D0;
    
    public ywk(final luh<Integer> c0, final Object[] d0) {
        this.C0 = c0;
        this.D0 = d0;
        super(0);
    }
    
    public final Object invoke() {
        final luh<Integer> c0 = this.C0;
        c0.setValue((c0.getValue().intValue() + 1) % this.D0.length);
        return oyv.a;
    }
}
