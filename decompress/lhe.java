// 
// Decompiled by Procyon v0.6.0
// 

public final class lhe extends row<ozl>
{
    public lhe() {
        super((Object[])ozl.values(), (Object)ozl.J0);
    }
    
    public final Object getFromString(final String s) {
        ozl j0;
        if (s == null) {
            j0 = ozl.J0;
        }
        else {
            j0 = (ozl)super.getFromString(s.toLowerCase(m5s.d()));
        }
        return j0;
    }
}
