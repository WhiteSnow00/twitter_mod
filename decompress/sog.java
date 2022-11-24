import android.os.Bundle;
import java.util.Currency;
import java.text.NumberFormat;
import java.util.Objects;
import com.twitter.commerce.model.Price;
import java.util.Iterator;
import java.util.Set;
import android.view.View;
import java.util.ArrayList;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sog implements m5y, bbx, dsy, a00, ai6, imb
{
    public Object F0;
    
    public sog(final int n) {
        if (n == 3) {
            this.F0 = new pcs();
            return;
        }
        if (n == 5) {
            this.F0 = new SparseArray();
            return;
        }
        if (n != 17) {
            this.F0 = new ArrayList();
            return;
        }
        this("");
    }
    
    public sog(final int n, final int n2) {
        final xpw[] f0 = new xpw[n];
        for (int i = 0; i < n; ++i) {
            f0[i] = new xpw(n2, 0);
        }
        this.F0 = f0;
    }
    
    public sog(final View view) {
        this.F0 = view.getOverlay();
    }
    
    public sog(final dgd f0) {
        e0e.f((Object)f0, "data");
        this.F0 = f0;
    }
    
    public sog(final Object f0) {
        this.F0 = f0;
    }
    
    public sog(final Set f0) {
        this.F0 = f0;
        final Iterator iterator = f0.iterator();
        while (iterator.hasNext()) {
            ((x1t)iterator.next()).a();
        }
    }
    
    public sog(final nu4 f0) {
        e0e.f((Object)f0, "priceConversionUtil");
        this.F0 = f0;
    }
    
    public final /* bridge */ Object a() {
        return new uyz(((zhz)this.F0).b());
    }
    
    @Override
    public final boolean b() {
        return ((x2y)this.F0).g();
    }
    
    public final void c() {
    }
    
    public final void d() {
    }
    
    public final void e() {
    }
    
    public final int f(final String s) {
        if (((kes)this.F0).i()) {
            return 0;
        }
        return 1;
    }
    
    public final void g() {
    }
    
    public final String h(final Price price) {
        e0e.f((Object)price, "productPrice");
        final String s = null;
        String format;
        try {
            final nu4 nu4 = (nu4)this.F0;
            final String microValue = price.getMicroValue();
            Objects.requireNonNull(nu4);
            e0e.f((Object)microValue, "productPriceInMicroValue");
            Double value;
            try {
                value = Double.parseDouble(microValue) / 1000000;
            }
            catch (final Exception ex) {
                r9a.d((Throwable)ex);
                value = null;
            }
            final NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode().toString()));
            format = currencyInstance.format(value);
        }
        catch (final Exception ex2) {
            r9a.d((Throwable)ex2);
            format = s;
        }
        return format;
    }
    
    public final n97 i(final Price price, final Price price2) {
        e0e.f((Object)price, "originalPrice");
        final String h = this.h(price);
        final String s = "";
        String s2 = h;
        if (h == null) {
            s2 = "";
        }
        String h2 = s;
        if (price2 != null) {
            h2 = this.h(price2);
            if (h2 == null) {
                h2 = s;
            }
        }
        n97 n97;
        if (slr.k1((CharSequence)h2) ^ true) {
            n97 = new n97(h2, s2);
        }
        else {
            n97 = new n97(s2);
        }
        return n97;
    }
    
    public final float j(final int n, final int n2) {
        return ((xpw[])this.F0)[n].h(n2);
    }
    
    public final xpw k(final int n) {
        return ((xpw[])this.F0)[n];
    }
    
    public final void l(final int n, final int n2, final float n3) {
        ((Float[])((xpw[])this.F0)[n].c)[n2] = n3;
    }
    
    public final void m() {
        if (((pcs)this.F0).g()) {
            return;
        }
        throw new IllegalStateException("Cannot cancel a completed task.");
    }
    
    public final void n(final Bundle bundle) {
        ((pz)this.F0).b("clx", "_ae", bundle);
    }
    
    public final void o(final Exception e) {
        final pcs pcs = (pcs)this.F0;
        synchronized (pcs.a) {
            final boolean b = pcs.b;
            boolean b2 = false;
            if (b) {
                monitorexit(pcs.a);
            }
            else {
                pcs.b = true;
                pcs.e = e;
                pcs.a.notifyAll();
                pcs.f();
                monitorexit(pcs.a);
                b2 = true;
            }
            if (b2) {
                return;
            }
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
    
    public final void p(final Object o) {
        if (((pcs)this.F0).h(o)) {
            return;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }
}
