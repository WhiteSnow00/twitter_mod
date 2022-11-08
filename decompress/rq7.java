import android.view.View;
import android.view.View$OnClickListener;
import com.twitter.ui.widget.FullBadgeView;
import android.view.ViewGroup;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rq7 extends v3e<zp7, b>
{
    public static final rq7.rq7$a Companion;
    public static final tba e;
    public boolean d;
    
    static {
        Companion = new rq7.rq7$a();
        e = (tba)sba.Companion.b("messages", "inbox", "inbox_timeline", "requests_pivot");
    }
    
    public rq7() {
        super((Class)zp7.class);
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final b b = (b)c7x;
        final zp7 zp7 = (zp7)o;
        zzd.f((Object)b, "viewHolder");
        zzd.f((Object)zp7, "item");
        b.D0.setBadgeNumber(zp7.a);
        if (!this.d) {
            saw.b((okm)new zf4(nca.Companion.c((sba)rq7.e, "impression")));
            this.d = true;
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        return (c7x)new b(viewGroup);
    }
    
    public static final class b extends el8
    {
        public static final b.rq7$b$a Companion;
        public final FullBadgeView D0;
        
        static {
            Companion = new b.rq7$b$a();
        }
        
        public b(final ViewGroup viewGroup) {
            final View v = lf.v(viewGroup, "parent", 2131624317, viewGroup, false);
            super(v);
            final View viewById = v.findViewById(2131428494);
            zzd.e((Object)viewById, "heldView.findViewById(R.id.count)");
            (this.D0 = (FullBadgeView)viewById).setMaxBadgeCount(100);
            v.setTag((Object)this);
            v.setOnClickListener((View$OnClickListener)new ry((Object)this, 14));
        }
    }
}
