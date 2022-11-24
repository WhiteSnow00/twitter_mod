// 
// Decompiled by Procyon v0.6.0
// 

public final class hie extends gpw<yzl>
{
    public hie() {
        super(yzl.values(), yzl.L0);
    }
    
    @Override
    public final Object getFromString(final String s) {
        yzl l0;
        if (s == null) {
            l0 = yzl.L0;
        }
        else {
            l0 = super.getFromString(s.toLowerCase(g6s.d()));
        }
        return l0;
    }
}
