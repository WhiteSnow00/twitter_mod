// 
// Decompiled by Procyon v0.6.0
// 

public final class orn
{
    public final znl<kni> a;
    public final znl<a> b;
    public final znl<kni> c;
    
    public orn() {
        this.a = (znl<kni>)new znl();
        this.b = (znl<a>)new znl();
        this.c = (znl<kni>)new znl();
    }
    
    public static final class a
    {
        public final String a;
        
        public a(final String a) {
            e0e.f((Object)a, "roomId");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return c0e.h("ScheduledSpaceItemClicked(roomId=", this.a, ")");
        }
    }
}
