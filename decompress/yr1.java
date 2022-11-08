import com.twitter.network.apache.ParseException;
import java.util.ArrayList;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yr1 implements cic, Cloneable, Serializable
{
    public final String C0;
    public final String D0;
    
    public yr1(final String d0) {
        this.C0 = "Content-Type";
        this.D0 = d0;
    }
    
    @Override
    public final fic[] a() throws ParseException {
        final String d0 = this.D0;
        if (d0 != null) {
            final as1 a = as1.a;
            final mt3 mt3 = new mt3(d0.length());
            mt3.b(d0);
            final rwj rwj = new rwj(d0.length());
            final as1 a2 = as1.a;
            final ArrayList list = new ArrayList();
            while (!rwj.a()) {
                final l6i a3 = a2.a(mt3, rwj);
                l6i[] array = null;
                Label_0214: {
                    if (!rwj.a()) {
                        int b = rwj.b;
                        if (mt3.C0[b - 1] != ',') {
                            final int a4 = rwj.a;
                            int n = b;
                            while (b < a4 && oyz.O(mt3.C0[b])) {
                                ++n;
                                ++b;
                            }
                            rwj.b(n);
                            final ArrayList<l6i> list2 = new ArrayList<l6i>();
                            while (!rwj.a()) {
                                list2.add(a2.a(mt3, rwj));
                                if (mt3.C0[rwj.b - 1] == ',') {
                                    break;
                                }
                            }
                            array = list2.toArray(new l6i[list2.size()]);
                            break Label_0214;
                        }
                    }
                    array = null;
                }
                final ks1 ks1 = (ks1)a3;
                final zr1 zr1 = new zr1(ks1.C0, ks1.D0, array);
                if (zr1.C0.length() != 0 || zr1.D0 != null) {
                    list.add(zr1);
                }
            }
            return list.toArray(new fic[list.size()]);
        }
        return new fic[0];
    }
    
    public final String c() {
        return this.C0;
    }
    
    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public final String getValue() {
        return this.D0;
    }
    
    @Override
    public final String toString() {
        mt3 n;
        if (this instanceof pmb) {
            n = ((pmb)this).n();
        }
        else {
            final mt3 mt3 = new mt3(64);
            final String c = this.c();
            final String value = this.getValue();
            int n2 = c.length() + 2;
            if (value != null) {
                n2 += value.length();
            }
            mt3.d(n2);
            mt3.b(c);
            mt3.b(": ");
            n = mt3;
            if (value != null) {
                mt3.b(value);
                n = mt3;
            }
        }
        return n.toString();
    }
}
