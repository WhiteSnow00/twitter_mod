import java.util.ArrayList;
import java.util.Iterator;
import android.util.Base64;
import org.json.JSONObject;
import org.json.JSONArray;
import java.util.List;
import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e1k
{
    public static final a Companion;
    public final UserIdentifier a;
    public final String b;
    public final Long c;
    public final List<szo> d;
    public final List<szo> e;
    public final rzo f;
    
    static {
        Companion = new a();
    }
    
    public e1k(final UserIdentifier a, final String b, final Long c, final List<? extends szo> d, final List<? extends szo> e, final rzo f) {
        zzd.f((Object)a, "userIdentifier");
        zzd.f((Object)b, "eventName");
        zzd.f((Object)d, "scribeItems");
        zzd.f((Object)e, "scribeTargets");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<szo>)d;
        this.e = (List<szo>)e;
        this.f = f;
    }
    
    public final JSONArray a(final List<? extends szo> list) {
        final JSONArray jsonArray = new JSONArray();
        for (final szo szo : list) {
            if (szo != null) {
                final i63 i63 = new i63();
                if (szo instanceof lev) {
                    ((s4j)lev.w1).c((flp)i63, (Object)szo);
                }
                else if (szo instanceof tyo) {
                    ((s4j)tyo.b).c((flp)i63, (Object)szo);
                }
                else if (szo instanceof zzo) {
                    ((s4j)zzo.b).c((flp)i63, (Object)szo);
                }
                final byte[] j = i63.J();
                final JSONObject jsonObject = new JSONObject();
                jsonObject.put("name", (Object)g9m.a((Class)szo.getClass()).o());
                jsonObject.put("base64", (Object)Base64.encodeToString(j, 0));
                jsonArray.put((Object)jsonObject);
            }
        }
        return jsonArray;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e1k)) {
            return false;
        }
        final e1k e1k = (e1k)o;
        return zzd.a((Object)this.a, (Object)e1k.a) && zzd.a((Object)this.b, (Object)e1k.b) && zzd.a((Object)this.c, (Object)e1k.c) && zzd.a((Object)this.d, (Object)e1k.d) && zzd.a((Object)this.e, (Object)e1k.e) && zzd.a((Object)this.f, (Object)e1k.f);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final Long c = this.c;
        final int n = 0;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        final int m = hy8.m((List)this.e, hy8.m((List)this.d, (a + hashCode) * 31, 31), 31);
        final rzo f = this.f;
        int hashCode2;
        if (f == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = f.hashCode();
        }
        return m + hashCode2;
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final List<szo> d = this.d;
        final List<szo> e = this.e;
        final rzo f = this.f;
        final StringBuilder sb = new StringBuilder();
        sb.append("PendingComposerScribeEvent(userIdentifier=");
        sb.append(a);
        sb.append(", eventName=");
        sb.append(b);
        sb.append(", eventValue=");
        sb.append(c);
        sb.append(", scribeItems=");
        sb.append(d);
        sb.append(", scribeTargets=");
        sb.append(e);
        sb.append(", conversationDetails=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final List<szo> a(final JSONArray jsonArray) {
            final ArrayList list = new ArrayList();
            for (int length = jsonArray.length(), i = 0; i < length; ++i) {
                final JSONObject jsonObject = jsonArray.getJSONObject(i);
                final g63 g63 = new g63(Base64.decode(jsonObject.getString("base64"), 0));
                final String string = jsonObject.getString("name");
                szo szo = null;
                Label_0215: {
                    if (string != null) {
                        final int hashCode = string.hashCode();
                        if (hashCode != -510849929) {
                            if (hashCode != 473807856) {
                                if (hashCode == 2046591832) {
                                    if (string.equals("ScribeAltTextMedia")) {
                                        final Object a = ((s4j)tyo.b).a((elp)g63);
                                        zzd.d(a, "null cannot be cast to non-null type com.twitter.analytics.model.ScribeItem");
                                        szo = (szo)a;
                                        break Label_0215;
                                    }
                                }
                            }
                            else if (string.equals("TwitterScribeItem")) {
                                final Object a2 = ((s4j)lev.w1).a((elp)g63);
                                zzd.d(a2, "null cannot be cast to non-null type com.twitter.analytics.model.ScribeItem");
                                szo = (szo)a2;
                                break Label_0215;
                            }
                        }
                        else if (string.equals("ScribeItemSendStickerPhotoTweet")) {
                            final Object a3 = ((s4j)zzo.b).a((elp)g63);
                            zzd.d(a3, "null cannot be cast to non-null type com.twitter.analytics.model.ScribeItem");
                            szo = (szo)a3;
                            break Label_0215;
                        }
                    }
                    szo = null;
                }
                if (szo != null) {
                    list.add(szo);
                }
            }
            return or4.m2((Iterable)list);
        }
    }
}
