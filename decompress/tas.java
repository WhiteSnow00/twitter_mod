import java.util.Locale;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import android.database.Cursor;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tas
{
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    public final Set<d> d;
    
    public tas(final String a, final Map<String, a> map, final Set<b> set, final Set<d> set2) {
        this.a = a;
        this.b = Collections.unmodifiableMap((Map<? extends String, ? extends a>)map);
        this.c = Collections.unmodifiableSet((Set<? extends b>)set);
        Set<d> unmodifiableSet;
        if (set2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set<? extends d>)set2);
        }
        this.d = unmodifiableSet;
    }
    
    public static tas a(h0s u, final String s) {
        final String h = c0e.h("PRAGMA table_info(`", s, "`)");
        final oqb oqb = (oqb)u;
        u = (h0s)oqb.u(h);
        final HashMap hashMap = new HashMap();
        try {
            if (((Cursor)u).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)u).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)u).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)u).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)u).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)u).getColumnIndex("dflt_value");
                while (((Cursor)u).moveToNext()) {
                    final String string = ((Cursor)u).getString(columnIndex);
                    hashMap.put(string, new a(string, ((Cursor)u).getString(columnIndex2), ((Cursor)u).getInt(columnIndex3) != 0, ((Cursor)u).getInt(columnIndex4), ((Cursor)u).getString(columnIndex5), 2));
                }
            }
            ((Cursor)u).close();
            final HashSet<b> set = new HashSet<b>();
            u = (h0s)new StringBuilder();
            ((StringBuilder)u).append("PRAGMA foreign_key_list(`");
            ((StringBuilder)u).append(s);
            ((StringBuilder)u).append("`)");
            Cursor u2 = ((h0s)oqb).u(((StringBuilder)u).toString());
            try {
                final int columnIndex6 = u2.getColumnIndex("id");
                final int columnIndex7 = u2.getColumnIndex("seq");
                final int columnIndex8 = u2.getColumnIndex("table");
                final int columnIndex9 = u2.getColumnIndex("on_delete");
                final int columnIndex10 = u2.getColumnIndex("on_update");
                final List<c> b = b(u2);
                for (int count = u2.getCount(), i = 0; i < count; ++i) {
                    u2.moveToPosition(i);
                    if (u2.getInt(columnIndex7) == 0) {
                        final int int1 = u2.getInt(columnIndex6);
                        final ArrayList<String> list = new ArrayList<String>();
                        final ArrayList<String> list2 = new ArrayList<String>();
                        for (final c c : (ArrayList)b) {
                            if (c.F0 == int1) {
                                list.add(c.H0);
                                list2.add(c.I0);
                            }
                        }
                        set.add(new b(u2.getString(columnIndex8), u2.getString(columnIndex9), u2.getString(columnIndex10), list, list2));
                    }
                }
                u2.close();
                final StringBuilder sb = new StringBuilder();
                sb.append("PRAGMA index_list(`");
                sb.append(s);
                sb.append("`)");
                final Cursor u3 = ((h0s)oqb).u(sb.toString());
                try {
                    final int columnIndex11 = u3.getColumnIndex("name");
                    final int columnIndex12 = u3.getColumnIndex("origin");
                    final int columnIndex13 = u3.getColumnIndex("unique");
                    u2 = null;
                    Label_0711: {
                        if (columnIndex11 != -1 && columnIndex12 != -1) {
                            if (columnIndex13 != -1) {
                                final Object o = new HashSet<d>();
                                while (u3.moveToNext()) {
                                    if (!"c".equals(u3.getString(columnIndex12))) {
                                        continue;
                                    }
                                    final d c2 = c((h0s)oqb, u3.getString(columnIndex11), u3.getInt(columnIndex13) == 1);
                                    if (c2 == null) {
                                        break Label_0711;
                                    }
                                    ((HashSet<d>)o).add(c2);
                                }
                                u3.close();
                                return new tas(s, hashMap, set, (Set<d>)o);
                            }
                        }
                    }
                    u3.close();
                    final Object o = u2;
                    return new tas(s, hashMap, set, (Set<d>)o);
                }
                finally {
                    u3.close();
                }
            }
            finally {
                u2.close();
            }
        }
        finally {
            ((Cursor)u).close();
        }
    }
    
    public static List<c> b(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("id");
        final int columnIndex2 = cursor.getColumnIndex("seq");
        final int columnIndex3 = cursor.getColumnIndex("from");
        final int columnIndex4 = cursor.getColumnIndex("to");
        final int count = cursor.getCount();
        final ArrayList list = new ArrayList();
        for (int i = 0; i < count; ++i) {
            cursor.moveToPosition(i);
            list.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort((List<Comparable>)list);
        return list;
    }
    
    public static d c(final h0s h0s, final String s, final boolean b) {
        final Cursor u = ((oqb)h0s).u(c0e.h("PRAGMA index_xinfo(`", s, "`)"));
        try {
            final int columnIndex = u.getColumnIndex("seqno");
            final int columnIndex2 = u.getColumnIndex("cid");
            final int columnIndex3 = u.getColumnIndex("name");
            final int columnIndex4 = u.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                final TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
                final TreeMap treeMap2 = new TreeMap();
                while (u.moveToNext()) {
                    if (u.getInt(columnIndex2) < 0) {
                        continue;
                    }
                    final int int1 = u.getInt(columnIndex);
                    final String string = u.getString(columnIndex3);
                    String s2;
                    if (u.getInt(columnIndex4) > 0) {
                        s2 = "DESC";
                    }
                    else {
                        s2 = "ASC";
                    }
                    treeMap.put(int1, string);
                    treeMap2.put(int1, s2);
                }
                final ArrayList list = new ArrayList(treeMap.size());
                list.addAll((Collection)treeMap.values());
                final ArrayList list2 = new ArrayList<String>(treeMap2.size());
                list2.addAll(treeMap2.values());
                return new d(s, b, (List<String>)list, (List<String>)list2);
            }
            return null;
        }
        finally {
            u.close();
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tas)) {
            return false;
        }
        final tas tas = (tas)o;
        final String a = this.a;
        Label_0053: {
            if (a != null) {
                if (a.equals(tas.a)) {
                    break Label_0053;
                }
            }
            else if (tas.a == null) {
                break Label_0053;
            }
            return false;
        }
        final Map<String, a> b = this.b;
        Label_0087: {
            if (b != null) {
                if (b.equals(tas.b)) {
                    break Label_0087;
                }
            }
            else if (tas.b == null) {
                break Label_0087;
            }
            return false;
        }
        final Set<b> c = this.c;
        Label_0121: {
            if (c != null) {
                if (c.equals(tas.c)) {
                    break Label_0121;
                }
            }
            else if (tas.c == null) {
                break Label_0121;
            }
            return false;
        }
        final Set<d> d = this.d;
        if (d != null) {
            final Set<d> d2 = tas.d;
            if (d2 != null) {
                return d.equals(d2);
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Map<String, a> b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set<b> c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("TableInfo{name='");
        go9.r(f, this.a, '\'', ", columns=");
        f.append(this.b);
        f.append(", foreignKeys=");
        f.append(this.c);
        f.append(", indices=");
        f.append(this.d);
        f.append('}');
        return f.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        public final int g;
        
        public a(String upperCase, final String b, final boolean d, int n, final String f, final int g) {
            this.a = upperCase;
            this.b = b;
            this.d = d;
            this.e = n;
            n = 5;
            if (b != null) {
                upperCase = b.toUpperCase(Locale.US);
                if (upperCase.contains("INT")) {
                    n = 3;
                }
                else if (!upperCase.contains("CHAR") && !upperCase.contains("CLOB") && !upperCase.contains("TEXT")) {
                    if (!upperCase.contains("BLOB")) {
                        if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                            n = 1;
                        }
                        else {
                            n = 4;
                        }
                    }
                }
                else {
                    n = 2;
                }
            }
            this.c = n;
            this.f = f;
            this.g = g;
        }
        
        public static boolean a(final String s, final String s2) {
            if (s2 == null) {
                return false;
            }
            if (s.equals(s2)) {
                return true;
            }
            Label_0131: {
                if (s.length() != 0) {
                    int i = 0;
                    int n = 0;
                    while (i < s.length()) {
                        final char char1 = s.charAt(i);
                        if (i == 0 && char1 != '(') {
                            break Label_0131;
                        }
                        int n2;
                        if (char1 == '(') {
                            n2 = n + 1;
                        }
                        else {
                            n2 = n;
                            if (char1 == ')') {
                                n2 = --n;
                                if (n == 0) {
                                    n2 = n;
                                    if (i != s.length() - 1) {
                                        break Label_0131;
                                    }
                                }
                            }
                        }
                        ++i;
                        n = n2;
                    }
                    if (n == 0) {
                        final boolean b = true;
                        return b && s.substring(1, s.length() - 1).trim().equals(s2);
                    }
                }
            }
            final boolean b = false;
            return b && s.substring(1, s.length() - 1).trim().equals(s2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (this.e != a.e) {
                return false;
            }
            if (!this.a.equals(a.a)) {
                return false;
            }
            if (this.d != a.d) {
                return false;
            }
            if (this.g == 1 && a.g == 2) {
                final String f = this.f;
                if (f != null && !a(f, a.f)) {
                    return false;
                }
            }
            if (this.g == 2 && a.g == 1) {
                final String f2 = a.f;
                if (f2 != null && !a(f2, this.f)) {
                    return false;
                }
            }
            final int g = this.g;
            Label_0199: {
                if (g != 0 && g == a.g) {
                    final String f3 = this.f;
                    if (f3 != null) {
                        if (a(f3, a.f)) {
                            break Label_0199;
                        }
                    }
                    else if (a.f == null) {
                        break Label_0199;
                    }
                    return false;
                }
            }
            if (this.c != a.c) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int c = this.c;
            int n;
            if (this.d) {
                n = 1231;
            }
            else {
                n = 1237;
            }
            return ((hashCode * 31 + c) * 31 + n) * 31 + this.e;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Column{name='");
            go9.r(f, this.a, '\'', ", type='");
            go9.r(f, this.b, '\'', ", affinity='");
            f.append(this.c);
            f.append('\'');
            f.append(", notNull=");
            f.append(this.d);
            f.append(", primaryKeyPosition=");
            f.append(this.e);
            f.append(", defaultValue='");
            f.append(this.f);
            f.append('\'');
            f.append('}');
            return f.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        public final String c;
        public final List<String> d;
        public final List<String> e;
        
        public b(final String a, final String b, final String c, final List<String> list, final List<String> list2) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = Collections.unmodifiableList((List<? extends String>)list);
            this.e = Collections.unmodifiableList((List<? extends String>)list2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c) && this.d.equals(b.d) && this.e.equals(b.e);
        }
        
        @Override
        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() + brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31)) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("ForeignKey{referenceTable='");
            go9.r(f, this.a, '\'', ", onDelete='");
            go9.r(f, this.b, '\'', ", onUpdate='");
            go9.r(f, this.c, '\'', ", columnNames=");
            f.append(this.d);
            f.append(", referenceColumnNames=");
            f.append(this.e);
            f.append('}');
            return f.toString();
        }
    }
    
    public static final class c implements Comparable<c>
    {
        public final int F0;
        public final int G0;
        public final String H0;
        public final String I0;
        
        public c(final int f0, final int g0, final String h0, final String i0) {
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
            this.I0 = i0;
        }
        
        @Override
        public final int compareTo(final Object o) {
            final c c = (c)o;
            int n;
            if ((n = this.F0 - c.F0) == 0) {
                n = this.G0 - c.G0;
            }
            return n;
        }
    }
    
    public static final class d
    {
        public final String a;
        public final boolean b;
        public final List<String> c;
        public final List<String> d;
        
        public d(final String a, final boolean b, final List<String> c, final List<String> list) {
            this.a = a;
            this.b = b;
            this.c = c;
            List<String> nCopies = null;
            Label_0049: {
                if (list != null) {
                    nCopies = list;
                    if (list.size() != 0) {
                        break Label_0049;
                    }
                }
                nCopies = Collections.nCopies(c.size(), "ASC");
            }
            this.d = nCopies;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            if (this.b != d.b) {
                return false;
            }
            if (!this.c.equals(d.c)) {
                return false;
            }
            if (!this.d.equals(d.d)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return d.a.startsWith("index_");
            }
            return this.a.equals(d.a);
        }
        
        @Override
        public final int hashCode() {
            int hashCode;
            if (this.a.startsWith("index_")) {
                hashCode = -1184239155;
            }
            else {
                hashCode = this.a.hashCode();
            }
            return this.d.hashCode() + (this.c.hashCode() + (hashCode * 31 + (this.b ? 1 : 0)) * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder f = ehk.f("Index{name='");
            go9.r(f, this.a, '\'', ", unique=");
            f.append(this.b);
            f.append(", columns=");
            f.append(this.c);
            f.append(", orders=");
            f.append(this.d);
            f.append('}');
            return f.toString();
        }
    }
}
