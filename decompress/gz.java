import java.text.NumberFormat;
import java.util.Map;
import java.util.List;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import android.widget.TextView;
import android.view.View;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gz implements kjy, tvo
{
    public final /* synthetic */ int C0;
    public final Object D0;
    public Object E0;
    
    public gz(final int c0) {
        this.C0 = c0;
        if (c0 != 9) {
            this.D0 = new ArrayList();
            return;
        }
        this.D0 = yvo.c();
        this.E0 = f60.b();
    }
    
    public gz(View viewById) {
        this.C0 = 8;
        final Context context = viewById.getContext();
        this.D0 = context;
        viewById = viewById.findViewById(2131431695);
        zzd.e((Object)viewById, "view.findViewById(R.id.stars)");
        this.E0 = viewById;
        final Object a = eo6.a;
        final Drawable b = eo6$c.b(context, 2131231767);
        final int b2 = eo6.b(context, 2131100667);
        if (Build$VERSION.SDK_INT >= 29) {
            if (b != null) {
                b.setColorFilter((ColorFilter)new PorterDuffColorFilter(b2, PorterDuff$Mode.MULTIPLY));
            }
        }
        else if (b != null) {
            b.setColorFilter(b2, PorterDuff$Mode.MULTIPLY);
        }
    }
    
    public gz(final ouh d0, final otb e0) {
        this.C0 = 2;
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public gz(final sve d0) {
        this.C0 = 1;
        zzd.f((Object)d0, "rootCoordinates");
        this.D0 = d0;
        this.E0 = new zmi();
    }
    
    public gz(final w8w d0, final hmp e0) {
        this.C0 = 7;
        zzd.f((Object)d0, "service");
        zzd.f((Object)e0, "sessionCache");
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final k6z a(final aey aey) {
        ((k6z)this.D0).e((String)this.E0, aey);
        return (k6z)this.D0;
    }
    
    public final void b(final long n, final List list) {
        zzd.f((Object)list, "pointerInputNodes");
        Object o = this.E0;
        final int size = list.size();
        int i = 0;
        int n2 = 1;
        while (i < size) {
            final gpk gpk = list.get(i);
            Label_0248: {
                int n3;
                if ((n3 = n2) != 0) {
                    final ouh a = ((zmi)o).a;
                    final int e0 = a.E0;
                    Object o2 = null;
                    Label_0140: {
                        if (e0 > 0) {
                            final Object[] c0 = a.C0;
                            zzd.d((Object)c0, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            int n4 = 0;
                            do {
                                o2 = c0[n4];
                                if (zzd.a((Object)((rmi)o2).b, (Object)gpk)) {
                                    break Label_0140;
                                }
                            } while (++n4 < e0);
                        }
                        o2 = null;
                    }
                    final rmi rmi = (rmi)o2;
                    if (rmi != null) {
                        rmi.h = true;
                        if (!rmi.c.i((Object)new yok(n))) {
                            rmi.c.b((Object)new yok(n));
                        }
                        o = rmi;
                        break Label_0248;
                    }
                    n3 = 0;
                }
                final rmi rmi2 = new rmi(gpk);
                rmi2.c.b((Object)new yok(n));
                ((zmi)o).a.b((Object)rmi2);
                o = rmi2;
                n2 = n3;
            }
            ++i;
        }
    }
    
    public final void c() {
        switch (this.C0) {
            default: {
                ((View)this.E0).setVisibility(8);
                return;
            }
            case 2: {
                ((ouh)this.D0).h();
                ((otb)this.E0).invoke();
            }
        }
    }
    
    public final boolean d(final nyd nyd, final boolean b) {
        final boolean a = ((zmi)this.E0).a((Map)nyd.b, (sve)this.D0, nyd, b);
        final boolean b2 = false;
        if (!a) {
            return false;
        }
        final boolean e = ((zmi)this.E0).e((Map)nyd.b, (sve)this.D0, nyd, b);
        if (!((zmi)this.E0).d(nyd)) {
            final boolean b3 = b2;
            if (!e) {
                return b3;
            }
        }
        return true;
    }
    
    public final void e(final long n) {
        if (n > 0L) {
            ((View)this.E0).setVisibility(0);
            ((TextView)this.E0).setText((CharSequence)NumberFormat.getInstance().format(n));
        }
        else {
            ((View)this.E0).setVisibility(8);
        }
    }
}
