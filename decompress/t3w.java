import java.util.List;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import java.util.Collection;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t3w extends i1v<pmi>
{
    public final i4w i1;
    public final d9j<tsc<pmi, pav>> j1;
    
    public t3w(final UserIdentifier userIdentifier, final i4w i1, final d9j<tsc<pmi, pav>> j1) {
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
    }
    
    public static void o0(final JSONObject jsonObject, final String s, final String s2) {
        try {
            final JSONObject jsonObject2 = new JSONObject();
            jsonObject2.put("text", (Object)s2);
            jsonObject.put(s, (Object)jsonObject2);
        }
        catch (final JSONException ex) {}
    }
    
    public final void C(final tsc<pmi, pav> tsc) {
        if (tsc.b) {
            ((eil)this.j1).set((Object)tsc);
        }
        else {
            Exception d = tsc.d;
            final d9j<tsc<pmi, pav>> j1 = this.j1;
            if (d == null) {
                d = new Exception("cannot upload media metadata data");
            }
            ((eil)j1).setException((Throwable)d);
        }
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/1.1/media/metadata/create.json", "/");
        final JSONObject jsonObject = new JSONObject();
        String string;
        try {
            jsonObject.put("media_id", this.i1.c);
            final j99 a2 = this.i1.a;
            final snb g0 = a2.H0.G0;
            if (g0 != null) {
                JSONObject jsonObject2 = new JSONObject();
                try {
                    jsonObject2.put("id", (Object)g0.C0);
                    jsonObject2.put("provider", (Object)g0.D0);
                }
                catch (final JSONException ex) {
                    jsonObject2 = null;
                }
                jsonObject.put("found_media_origin", (Object)jsonObject2);
            }
            if (!a2.H0.equals(uzg.H0)) {
                o0(jsonObject, "upload_source", a2.H0.D0);
            }
            final ww9 b = a2.b(3);
            final qnb i0 = a2.I0;
            int n2;
            final int n = n2 = 0;
            if (i0 != null) {
                n2 = n;
                if (pjr.g((CharSequence)i0.h)) {
                    n2 = n;
                    if (dta.b().b("alt_text_for_gifs_server_provided_enabled", false)) {
                        n2 = 1;
                    }
                }
            }
            if (b instanceof oy) {
                final String b2 = ((oy)b).b();
                if (!TextUtils.isEmpty((CharSequence)b2)) {
                    o0(jsonObject, "alt_text", b2);
                }
                else if (n2 != 0) {
                    o0(jsonObject, "alt_text", i0.h);
                }
            }
            if (b instanceof of3 && q0b.r()) {
                final Set e = ((of3)b).e();
                if (!hr4.t((Collection)e)) {
                    final JSONArray jsonArray = new JSONArray();
                    final Iterator iterator = e.iterator();
                    while (iterator.hasNext()) {
                        final int ordinal = ((Enum)iterator.next()).ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                jsonArray.put((Object)"other");
                            }
                            else {
                                jsonArray.put((Object)"graphic_violence");
                            }
                        }
                        else {
                            jsonArray.put((Object)"adult_content");
                        }
                    }
                    jsonObject.put("sensitive_media_warning", (Object)jsonArray);
                }
            }
            if (b instanceof rw9) {
                final rw9 rw9 = (rw9)b;
                final List n3 = rw9.N0;
                if (!hr4.t((Collection)n3)) {
                    final float h = ((kvg)((ww9)rw9).C0).b.h();
                    final abm l0 = rw9.L0;
                    final int k0 = rw9.K0;
                    final JSONArray jsonArray2 = new JSONArray();
                    final Iterator iterator2 = n3.iterator();
                    while (iterator2.hasNext()) {
                        jsonArray2.put((Object)((xgr)iterator2.next()).a(h, l0, k0));
                    }
                    final JSONObject jsonObject3 = new JSONObject();
                    jsonObject3.put("stickers", (Object)jsonArray2);
                    jsonObject.put("sticker_info", (Object)jsonObject3);
                }
            }
            string = jsonObject.toString();
        }
        catch (final JSONException ex2) {
            e9a.d((Throwable)ex2);
            string = "";
        }
        ((qrc.a)rbv).d = (src)new ajr(string, wj6.a);
        final int a3 = w4j.a;
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)new vsc();
    }
}
