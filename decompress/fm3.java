import androidx.recyclerview.widget.m$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fm3 extends s71<dm3>
{
    public final m$b g(i4e<dm3> j, final i4e<dm3> i4e) {
        i4e<dm3> i = j;
        if (j == null) {
            i = i4e.j();
        }
        if ((j = i4e) == null) {
            j = i4e.j();
        }
        return new a(i, j);
    }
    
    public final long getItemId(final int n) {
        final Object item = ((ri8)this).getItem(n);
        zzd.e(item, "getItem(position)");
        return w4j.f((Object)((dm3)item).a);
    }
    
    public static final class a extends m$b
    {
        public final i4e<dm3> a;
        public final i4e<dm3> b;
        
        public a(final i4e<dm3> a, final i4e<dm3> b) {
            this.a = a;
            this.b = b;
        }
        
        public final boolean a(final int n, final int n2) {
            return w4j.a((Object)this.b.m(n), (Object)this.b.m(n2));
        }
        
        public final boolean b(final int n, final int n2) {
            final dm3 dm3 = this.b.m(n);
            final dm3 dm4 = this.b.m(n2);
            Object a = null;
            String a2;
            if (dm3 != null) {
                a2 = dm3.a;
            }
            else {
                a2 = null;
            }
            if (dm4 != null) {
                a = dm4.a;
            }
            return zzd.a((Object)a2, a);
        }
        
        public final int d() {
            return this.b.getSize();
        }
        
        public final int e() {
            return this.a.getSize();
        }
    }
}
