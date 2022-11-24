import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xfo implements wfo
{
    public final SharedPreferences a;
    
    public xfo(final SharedPreferences a, final jrs jrs) {
        e0e.f((Object)a, "sharedPreferences");
        e0e.f((Object)jrs, "timeProvider");
        this.a = a;
        final tda a2 = yfo.a;
        final ArrayList list = new ArrayList();
        final Set entrySet = a.getAll().entrySet();
        int e;
        if ((e = vmw.E(nr4.d1((Iterable)entrySet, 10))) < 16) {
            e = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (final Map.Entry<String, V> entry : entrySet) {
            final String s = entry.getKey();
            final V value = entry.getValue();
            e0e.e((Object)s, "key");
            final jpn jpn = new jpn(s);
            final boolean b = value instanceof String;
            Object a3 = null;
            String s2;
            if (b) {
                s2 = (String)value;
            }
            else {
                s2 = null;
            }
            if (s2 != null) {
                a3 = yfo.a(s2);
            }
            linkedHashMap.put((Object)jpn, a3);
        }
        for (final Map.Entry<jpn, V> entry2 : ((LinkedHashMap)p0b.n((Map)linkedHashMap)).entrySet()) {
            final String a4 = entry2.getKey().a;
            if (((ufo)entry2.getValue()).b + yfo.b <= jrs.a()) {
                list.add(new jpn(a4));
            }
        }
        final SharedPreferences$Editor edit = a.edit();
        e0e.e((Object)edit, "editor");
        final Iterator iterator3 = list.iterator();
        while (iterator3.hasNext()) {
            edit.remove(((jpn)iterator3.next()).a);
        }
        edit.apply();
    }
    
    @Override
    public final void a(final String s) {
        final SharedPreferences$Editor edit = this.a.edit();
        e0e.e((Object)edit, "editor");
        edit.putString("key_quality_listen_room_id", s);
        edit.apply();
    }
    
    @Override
    public final ufo b(String string) {
        final SharedPreferences a = this.a;
        final tda a2 = yfo.a;
        string = a.getString(string, "");
        e0e.c((Object)string);
        return yfo.a(string);
    }
    
    @Override
    public final void c(final String s, final ufo ufo) {
        final SharedPreferences$Editor edit = this.a.edit();
        e0e.e((Object)edit, "editor");
        edit.putString(s, qi1.c(gmp.e((Object)ufo, (nmp)yfo.a)));
        edit.apply();
    }
    
    @Override
    public final String d() {
        String string = this.a.getString("key_quality_listen_room_id", "");
        final boolean g = flr.g((CharSequence)string);
        String s = null;
        if (!g) {
            string = null;
        }
        if (string != null) {
            s = string;
        }
        return s;
    }
    
    @Override
    public final void e(final String s) {
        final SharedPreferences$Editor edit = this.a.edit();
        e0e.e((Object)edit, "editor");
        final tda a = yfo.a;
        edit.remove(s);
        edit.apply();
    }
}
