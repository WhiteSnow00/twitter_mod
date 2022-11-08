// 
// Decompiled by Procyon v0.6.0
// 

public final class yzu implements apu, n5d
{
    public final rh0 C0;
    public final elu D0;
    public final hmu E0;
    public final uzi F0;
    public final mcf G0;
    
    public yzu(final a a) {
        this.C0 = a.C0;
        this.D0 = a.D0;
        this.E0 = a.E0;
        this.F0 = a.F0;
        this.G0 = a.G0;
    }
    
    public final long getId() {
        return this.C0.getId();
    }
    
    public static final class a extends h4j<yzu> implements apu$a
    {
        public rh0 C0;
        public elu D0;
        public hmu E0;
        public uzi F0;
        public mcf G0;
        
        public final Object i() {
            return new yzu(this);
        }
        
        public final boolean l() {
            return this.C0 != null;
        }
    }
}
