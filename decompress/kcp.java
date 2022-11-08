// 
// Decompiled by Procyon v0.6.0
// 

public final class kcp extends lsr
{
    public final dsr j;
    
    public kcp(final kcp.kcp$a kcp$a) {
        super((lsr.lsr$a)kcp$a);
        this.j = kcp$a.k;
    }
    
    @Override
    public final asr b(final String s) {
        return (asr)new icp(s, this);
    }
}
