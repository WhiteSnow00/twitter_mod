import java.text.SimpleDateFormat;
import java.util.Locale;
import j$.time.format.DateTimeFormatter;
import j$.time.ZoneOffset;
import j$.util.DateRetargetClass;
import java.util.Date;
import android.os.Build$VERSION;
import java.util.ArrayList;
import java.util.List;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import android.content.Context;
import android.content.SharedPreferences;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jjc
{
    public final SharedPreferences a;
    
    public jjc(final Context context, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append("FirebaseHeartBeat");
        sb.append(s);
        this.a = context.getSharedPreferences(sb.toString(), 0);
    }
    
    public final void a() {
        synchronized (this) {
            final long long1 = this.a.getLong("fire-count", 0L);
            String s = null;
            String s2 = "";
            for (final Map.Entry<K, Set> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    String s3 = s2;
                    String s4 = s;
                    while (true) {
                        s = s4;
                        s2 = s3;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s5 = (String)iterator2.next();
                        if (s4 != null && s4.compareTo(s5) <= 0) {
                            continue;
                        }
                        s3 = (String)entry.getKey();
                        s4 = s5;
                    }
                }
            }
            final HashSet set = new HashSet(this.a.getStringSet(s2, (Set)new HashSet()));
            set.remove(s);
            this.a.edit().putStringSet(s2, (Set)set).putLong("fire-count", long1 - 1L).commit();
        }
    }
    
    public final void b() {
        synchronized (this) {
            final SharedPreferences$Editor edit = this.a.edit();
            for (final Map.Entry<String, V> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    edit.remove((String)entry.getKey());
                }
            }
            edit.remove("fire-count");
            edit.commit();
        }
    }
    
    public final List<kjc> c() {
        synchronized (this) {
            final ArrayList<eb1> list = (ArrayList<eb1>)new ArrayList<kjc>();
            for (final Map.Entry<String, V> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    list.add(new eb1(entry.getKey(), new ArrayList<String>((Collection<?>)entry.getValue())));
                }
            }
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.edit().putLong("fire-global", currentTimeMillis).commit();
                return (List<kjc>)list;
            }
        }
    }
    
    public final String d(final long n) {
        synchronized (this) {
            if (Build$VERSION.SDK_INT >= 26) {
                return DateRetargetClass.toInstant(new Date(n)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
            }
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(n));
        }
    }
    
    public final String e(String s) {
        synchronized (this) {
            for (final Map.Entry<K, Set> entry : this.a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    final Iterator iterator2 = entry.getValue().iterator();
                    while (iterator2.hasNext()) {
                        if (s.equals(iterator2.next())) {
                            s = (String)entry.getKey();
                            return s;
                        }
                    }
                }
            }
            return null;
        }
    }
    
    public final void f(final String s) {
        synchronized (this) {
            final String e = this.e(s);
            if (e == null) {
                return;
            }
            final HashSet set = new HashSet(this.a.getStringSet(e, (Set)new HashSet()));
            set.remove(s);
            if (set.isEmpty()) {
                this.a.edit().remove(e).commit();
            }
            else {
                this.a.edit().putStringSet(e, (Set)set).commit();
            }
        }
    }
    
    public final boolean g(final long n) {
        synchronized (this) {
            if (this.a.contains("fire-global")) {
                final long long1 = this.a.getLong("fire-global", -1L);
                synchronized (this) {
                    final boolean equals = this.d(long1).equals(this.d(n));
                    monitorexit(this);
                    if (!equals) {
                        this.a.edit().putLong("fire-global", n).commit();
                        return true;
                    }
                    return false;
                }
            }
            this.a.edit().putLong("fire-global", n).commit();
            return true;
        }
    }
    
    public final void h(long n, final String s) {
        synchronized (this) {
            final String d = this.d(n);
            if (this.a.getString("last-used-date", "").equals(d)) {
                return;
            }
            if ((n = this.a.getLong("fire-count", 0L)) + 1L == 30L) {
                this.a();
                n = this.a.getLong("fire-count", 0L);
            }
            final HashSet<String> set = new HashSet<String>(this.a.getStringSet(s, (Set)new HashSet()));
            set.add(d);
            this.a.edit().putStringSet(s, (Set)set).putLong("fire-count", n + 1L).putString("last-used-date", d).commit();
        }
    }
}
