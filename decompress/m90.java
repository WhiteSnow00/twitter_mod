import com.google.android.gms.common.api.ApiException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m90 implements qb0, zo6, wqy, vzz, i6, zqg
{
    public final Object C0;
    
    public final void a() {
        final m000 m000 = (m000)this.C0;
        String attributeValue2;
        String attributeValue = attributeValue2 = null;
        for (int i = 0; i < m000.a.getAttributeCount(); ++i) {
            if ("module".equals(m000.a.getAttributeName(i))) {
                attributeValue = m000.a.getAttributeValue(i);
            }
            if ("errorCode".equals(m000.a.getAttributeName(i))) {
                attributeValue2 = m000.a.getAttributeValue(i);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), m000.a, (Throwable)null);
        }
        final v8y b = m000.b;
        final int a = u8y.a(attributeValue2);
        final Map<String, Integer> b2 = b.b;
        if (b2 != null) {
            b2.put(attributeValue, a);
            while (m000.a.next() != 3) {}
            return;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
    
    public final int b() {
        return ((o90)this.C0).b();
    }
    
    public final int c() {
        return ((o90)this.C0).c.c();
    }
    
    public final Object d(final zas zas) {
        final exz exz = (exz)this.C0;
        zas zas2 = zas;
        if (!zas.s()) {
            if (zas.q()) {
                zas2 = zas;
            }
            else {
                final Exception n = zas.n();
                zas2 = zas;
                if (n instanceof ApiException) {
                    final int d0 = ((ApiException)n).C0.D0;
                    if (d0 != 43001 && d0 != 43002 && d0 != 43003 && d0 != 17) {
                        if (d0 == 43000) {
                            zas2 = zbs.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                        }
                        else if (d0 != 15) {
                            zas2 = zas;
                        }
                        else {
                            zas2 = zbs.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                    }
                    else {
                        zas2 = exz.b.d();
                    }
                }
            }
        }
        return zas2;
    }
    
    public final long e() {
        return ((kvg)this.C0).a.length();
    }
    
    public final int f() {
        return -1;
    }
    
    public final String h() {
        return kzg.a((vo6)this.C0);
    }
    
    public final int j(final int n) {
        return ((o90)this.C0).e[n];
    }
    
    public final f3 o() {
        if (kzg.c((vo6)this.C0) != -1L) {
            return (f3)new tcv(kzg.c((vo6)this.C0));
        }
        return (f3)f3.b;
    }
}
