import androidx.recyclerview.widget.m$b;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oid extends s71<yp7>
{
    public final m$b g(final i4e<yp7> i4e, final i4e<yp7> i4e2) {
        return new a(i4e, i4e2);
    }
    
    public final long getItemId(final int n) {
        final Object item = ((ri8)this).getItem(n);
        zzd.e(item, "getItem(position)");
        return ajy.C((yp7)item);
    }
    
    public final boolean hasStableIds() {
        return true;
    }
    
    public static final class a extends m$b
    {
        public final i4e<yp7> a;
        public final i4e<yp7> b;
        
        public a(i4e<yp7> j, final i4e<yp7> i4e) {
            i4e<yp7> i = j;
            if (j == null) {
                i = i4e.j();
            }
            this.a = i;
            if ((j = i4e) == null) {
                j = i4e.j();
            }
            this.b = j;
        }
        
        public final boolean a(final int n, final int n2) {
            return zzd.a((Object)this.a.m(n), (Object)this.b.m(n2));
        }
        
        public final boolean b(final int n, final int n2) {
            final yp7 yp7 = this.a.m(n);
            final yp7 yp8 = this.b.m(n2);
            Object value = null;
            Long value2;
            if (yp7 != null) {
                value2 = ajy.C(yp7);
            }
            else {
                value2 = null;
            }
            if (yp8 != null) {
                value = ajy.C(yp8);
            }
            return zzd.a((Object)value2, value);
        }
        
        public final int d() {
            return this.b.getSize();
        }
        
        public final int e() {
            return this.a.getSize();
        }
    }
}
