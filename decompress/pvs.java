// 
// Decompiled by Procyon v0.6.0
// 

public abstract class pvs extends z92
{
    public final int h;
    
    public pvs(final a<? extends pvs, ? extends a<?, ?>> a) {
        super((z92$a)a);
        this.h = a.h;
    }
    
    public abstract static class a<V extends pvs, B extends a<V, B>> extends z92$a<V, B>
    {
        public int h;
        
        public a() {
            this.h = 0;
        }
        
        public boolean k() {
            return this.h != 0;
        }
    }
}
