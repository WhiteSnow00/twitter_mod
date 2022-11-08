import android.util.Base64;
import android.text.SpannableString;
import android.content.ClipData$Item;
import android.content.ClipData;
import android.os.Parcel;
import java.util.Objects;
import java.util.ArrayList;
import android.text.Annotation;
import java.util.List;
import android.text.Spanned;
import android.content.Context;
import android.content.ClipboardManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j20 implements ii4
{
    public final ClipboardManager a;
    
    public j20(final Context context) {
        final Object systemService = context.getSystemService("clipboard");
        zzd.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        final ClipboardManager a = (ClipboardManager)systemService;
        this.a = a;
    }
    
    public final bd0 e() {
        final ClipData primaryClip = this.a.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            final ClipData$Item item = primaryClip.getItemAt(0);
            CharSequence text;
            if (item != null) {
                text = item.getText();
            }
            else {
                text = null;
            }
            if (text != null) {
                if (!(text instanceof Spanned)) {
                    return new bd0(text.toString(), (List)null, 6);
                }
                final Spanned spanned = (Spanned)text;
                final Annotation[] array = (Annotation[])spanned.getSpans(0, text.length(), (Class)Annotation.class);
                final ArrayList<bd0$b> list = new ArrayList<bd0$b>();
                zzd.e((Object)array, "annotations");
                final int n = array.length - 1;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        final Annotation annotation = array[n2];
                        if (zzd.a((Object)annotation.getKey(), (Object)"androidx.compose.text.SpanStyle")) {
                            final int spanStart = spanned.getSpanStart((Object)annotation);
                            final int spanEnd = spanned.getSpanEnd((Object)annotation);
                            final String value = annotation.getValue();
                            zzd.e((Object)value, "span.value");
                            final ug3 ug3 = new ug3(value);
                            Objects.requireNonNull(pr4.Companion);
                            long n3 = pr4.g;
                            Objects.requireNonNull(cjs.Companion);
                            long n4 = cjs.c;
                            Object o2;
                            Object o = o2 = null;
                            Object string;
                            Object o3 = string = o2;
                            Object o5;
                            Object o4 = o5 = string;
                            Object o6;
                            final jhs jhs = (jhs)(o6 = o5);
                            long i = n3;
                            long k = n4;
                            kes kes = (kes)jhs;
                            while (true) {
                                final int dataAvail = ((Parcel)ug3.C0).dataAvail();
                                final int n5 = 1;
                                int n6 = 1;
                                if (dataAvail <= 1) {
                                    break;
                                }
                                final byte g = ug3.g();
                                if (g == 1) {
                                    if (ug3.f() < 8) {
                                        break;
                                    }
                                    n3 = ug3.i();
                                }
                                else if (g == 2) {
                                    if (ug3.f() < 5) {
                                        break;
                                    }
                                    n4 = ug3.k();
                                }
                                else {
                                    kes kes2 = null;
                                    Object o7 = null;
                                    Object o8 = null;
                                    Object o9 = null;
                                    Object o10 = null;
                                    long n9 = 0L;
                                    Object o11 = null;
                                    Object o12 = null;
                                    long n10 = 0L;
                                    Object o13 = null;
                                    Label_1226: {
                                        if (g == 3) {
                                            if (ug3.f() < 4) {
                                                break;
                                            }
                                            o = new rlb(((Parcel)ug3.C0).readInt());
                                        }
                                        else if (g == 4) {
                                            if (ug3.f() < 1) {
                                                break;
                                            }
                                            final byte g2 = ug3.g();
                                            Label_0474: {
                                                if (g2 == 0) {
                                                    Objects.requireNonNull(nlb.Companion);
                                                }
                                                else {
                                                    if (g2 == 1) {
                                                        Objects.requireNonNull(nlb.Companion);
                                                        break Label_0474;
                                                    }
                                                    Objects.requireNonNull(nlb.Companion);
                                                }
                                                n6 = 0;
                                            }
                                            o2 = new nlb(n6);
                                        }
                                        else if (g == 5) {
                                            if (ug3.f() < 1) {
                                                break;
                                            }
                                            final byte g3 = ug3.g();
                                            int n7 = 0;
                                            Label_0593: {
                                                if (g3 == 0) {
                                                    Objects.requireNonNull(olb.Companion);
                                                }
                                                else {
                                                    if (g3 == 1) {
                                                        Objects.requireNonNull(olb.Companion);
                                                        n7 = n5;
                                                        break Label_0593;
                                                    }
                                                    if (g3 == 3) {
                                                        Objects.requireNonNull(olb.Companion);
                                                        n7 = 3;
                                                        break Label_0593;
                                                    }
                                                    if (g3 == 2) {
                                                        Objects.requireNonNull(olb.Companion);
                                                        n7 = 2;
                                                        break Label_0593;
                                                    }
                                                    Objects.requireNonNull(olb.Companion);
                                                }
                                                n7 = 0;
                                            }
                                            o3 = new olb(n7);
                                        }
                                        else if (g == 6) {
                                            string = ((Parcel)ug3.C0).readString();
                                        }
                                        else if (g == 7) {
                                            if (ug3.f() < 5) {
                                                break;
                                            }
                                            k = ug3.k();
                                        }
                                        else if (g == 8) {
                                            if (ug3.f() < 4) {
                                                break;
                                            }
                                            o4 = new rr1(ug3.j());
                                        }
                                        else if (g == 9) {
                                            if (ug3.f() < 8) {
                                                break;
                                            }
                                            o5 = new jhs(ug3.j(), ug3.j());
                                        }
                                        else if (g == 10) {
                                            if (ug3.f() < 8) {
                                                break;
                                            }
                                            i = ug3.i();
                                        }
                                        else if (g == 11) {
                                            if (ug3.f() < 4) {
                                                break;
                                            }
                                            final int int1 = ((Parcel)ug3.C0).readInt();
                                            Objects.requireNonNull(kes.Companion);
                                            kes2 = kes.d;
                                            final boolean b = (int1 & 0x2) != 0x0;
                                            final kes c = kes.c;
                                            final boolean b2 = (int1 & 0x1) != 0x0;
                                            if (b && b2) {
                                                final List v0 = tdy.v0((Object[])new kes[] { kes2, c });
                                                Integer n8 = 0;
                                                for (int size = v0.size(), j = 0; j < size; ++j) {
                                                    n8 = (n8.intValue() | ((kes)v0.get(j)).a);
                                                }
                                                kes2 = new kes(n8.intValue());
                                                o7 = o;
                                                o8 = o2;
                                                o9 = o3;
                                                o10 = string;
                                                n9 = k;
                                                o11 = o4;
                                                o12 = o5;
                                                n10 = i;
                                                o13 = o6;
                                                break Label_1226;
                                            }
                                            if (b) {
                                                o7 = o;
                                                o8 = o2;
                                                o9 = o3;
                                                o10 = string;
                                                n9 = k;
                                                o11 = o4;
                                                o12 = o5;
                                                n10 = i;
                                                o13 = o6;
                                                break Label_1226;
                                            }
                                            if (b2) {
                                                kes2 = c;
                                                o7 = o;
                                                o8 = o2;
                                                o9 = o3;
                                                o10 = string;
                                                n9 = k;
                                                o11 = o4;
                                                o12 = o5;
                                                n10 = i;
                                                o13 = o6;
                                                break Label_1226;
                                            }
                                            kes2 = kes.b;
                                            o7 = o;
                                            o8 = o2;
                                            o9 = o3;
                                            o10 = string;
                                            n9 = k;
                                            o11 = o4;
                                            o12 = o5;
                                            n10 = i;
                                            o13 = o6;
                                            break Label_1226;
                                        }
                                        else {
                                            o7 = o;
                                            o8 = o2;
                                            o9 = o3;
                                            o10 = string;
                                            n9 = k;
                                            o11 = o4;
                                            o12 = o5;
                                            n10 = i;
                                            kes2 = kes;
                                            o13 = o6;
                                            if (g != 12) {
                                                break Label_1226;
                                            }
                                            if (ug3.f() >= 20) {
                                                o13 = new jqp(ug3.i(), ukg.m(ug3.j(), ug3.j()), ug3.j());
                                                kes2 = kes;
                                                n10 = i;
                                                o12 = o5;
                                                o11 = o4;
                                                n9 = k;
                                                o10 = string;
                                                o9 = o3;
                                                o8 = o2;
                                                o7 = o;
                                                break Label_1226;
                                            }
                                            break;
                                        }
                                        o7 = o;
                                        o8 = o2;
                                        o9 = o3;
                                        o10 = string;
                                        n9 = k;
                                        o11 = o4;
                                        o12 = o5;
                                        n10 = i;
                                        kes2 = kes;
                                        o13 = o6;
                                    }
                                    o = o7;
                                    o2 = o8;
                                    o3 = o9;
                                    string = o10;
                                    k = n9;
                                    o4 = o11;
                                    o5 = o12;
                                    i = n10;
                                    kes = kes2;
                                    o6 = o13;
                                }
                            }
                            list.add(new bd0$b((Object)new ozq(n3, n4, (rlb)o, (nlb)o2, (olb)o3, (rkb)null, (String)string, k, (rr1)o4, (jhs)o5, (k5g)null, i, kes, (jqp)o6), spanStart, spanEnd));
                        }
                        if (n2 == n) {
                            break;
                        }
                        ++n2;
                    }
                }
                return new bd0(text.toString(), (List)list, 4);
            }
        }
        return null;
    }
    
    public final void f(final bd0 bd0) {
        final ClipboardManager a = this.a;
        Object c0;
        if (bd0.D0.isEmpty()) {
            c0 = bd0.C0;
        }
        else {
            final SpannableString spannableString = new SpannableString((CharSequence)bd0.C0);
            final v3a v3a = new v3a(0);
            final List d0 = bd0.D0;
            for (int size = d0.size(), i = 0; i < size; ++i) {
                final bd0$b bd0$b = d0.get(i);
                final ozq ozq = (ozq)bd0$b.a;
                final int b = bd0$b.b;
                final int c2 = bd0$b.c;
                ((Parcel)v3a.C0).recycle();
                final Parcel obtain = Parcel.obtain();
                zzd.e((Object)obtain, "obtain()");
                v3a.C0 = obtain;
                zzd.f((Object)ozq, "spanStyle");
                final long c3 = ozq.c();
                Objects.requireNonNull(pr4.Companion);
                final long g = pr4.g;
                if (!pr4.c(c3, g)) {
                    v3a.a((byte)1);
                    v3a.h(ozq.c());
                }
                final long b2 = ozq.b;
                Objects.requireNonNull(cjs.Companion);
                final long c4 = cjs.c;
                if (!cjs.a(b2, c4)) {
                    v3a.a((byte)2);
                    v3a.e(ozq.b);
                }
                final rlb c5 = ozq.c;
                if (c5 != null) {
                    v3a.a((byte)3);
                    ((Parcel)v3a.C0).writeInt(c5.C0);
                }
                final nlb d2 = ozq.d;
                if (d2 != null) {
                    final int a2 = d2.a;
                    v3a.a((byte)4);
                    Objects.requireNonNull(nlb.Companion);
                    byte b3 = 0;
                    Label_0371: {
                        if (a2 != 0) {
                            if (a2 == 1) {
                                b3 = 1;
                                break Label_0371;
                            }
                        }
                        b3 = 0;
                    }
                    v3a.a(b3);
                }
                final olb e = ozq.e;
                if (e != null) {
                    final int a3 = e.a;
                    v3a.a((byte)5);
                    Objects.requireNonNull(olb.Companion);
                    byte b5 = 0;
                    Label_0529: {
                        if (a3 != 0) {
                            final byte b4 = 1;
                            if (a3 == 1) {
                                b5 = b4;
                                break Label_0529;
                            }
                            final byte b6 = 2;
                            if (a3 == 2) {
                                b5 = b6;
                                break Label_0529;
                            }
                            if (a3 == 3) {
                                b5 = 3;
                                break Label_0529;
                            }
                        }
                        b5 = 0;
                    }
                    v3a.a(b5);
                }
                final String g2 = ozq.g;
                if (g2 != null) {
                    v3a.a((byte)6);
                    ((Parcel)v3a.C0).writeString(g2);
                }
                if (!cjs.a(ozq.h, c4)) {
                    v3a.a((byte)7);
                    v3a.e(ozq.h);
                }
                final rr1 j = ozq.i;
                if (j != null) {
                    final float a4 = j.a;
                    v3a.a((byte)8);
                    v3a.d(a4);
                }
                final jhs k = ozq.j;
                if (k != null) {
                    v3a.a((byte)9);
                    v3a.d(k.a);
                    v3a.d(k.b);
                }
                if (!pr4.c(ozq.l, g)) {
                    v3a.a((byte)10);
                    v3a.h(ozq.l);
                }
                final kes m = ozq.m;
                if (m != null) {
                    v3a.a((byte)11);
                    ((Parcel)v3a.C0).writeInt(m.a);
                }
                final jqp n = ozq.n;
                if (n != null) {
                    v3a.a((byte)12);
                    v3a.h(n.a);
                    v3a.d(qfj.d(n.b));
                    v3a.d(qfj.e(n.b));
                    v3a.d(n.c);
                }
                final String encodeToString = Base64.encodeToString(((Parcel)v3a.C0).marshall(), 0);
                zzd.e((Object)encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan((Object)new Annotation("androidx.compose.text.SpanStyle", encodeToString), b, c2, 33);
            }
            c0 = spannableString;
        }
        a.setPrimaryClip(ClipData.newPlainText((CharSequence)"plain text", (CharSequence)c0));
    }
}
