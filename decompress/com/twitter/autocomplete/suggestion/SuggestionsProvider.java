// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.autocomplete.suggestion;

import android.content.ContentValues;
import android.database.MatrixCursor$RowBuilder;
import android.database.DatabaseUtils;
import java.util.HashSet;
import android.database.Cursor;
import com.twitter.util.user.UserIdentifier;
import java.util.Iterator;
import java.util.Set;
import android.database.MatrixCursor;
import java.util.HashMap;
import android.content.UriMatcher;
import java.util.List;
import java.util.Map;
import android.net.Uri;
import android.content.ContentProvider;

public class SuggestionsProvider extends ContentProvider
{
    public static final Uri C0;
    public static final Uri D0;
    public static final Uri E0;
    public static final Map<String, List<efv>> F0;
    public static final Map<String, List<efv>> G0;
    public static final UriMatcher H0;
    
    static {
        final String i = hi.I(new StringBuilder(), l61.a, ".provider.SuggestionsProvider");
        final StringBuilder sb = new StringBuilder();
        sb.append("content://");
        sb.append(i);
        sb.append('/');
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("compose_users");
        C0 = Uri.parse(sb2.toString());
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("hashtags");
        D0 = Uri.parse(sb3.toString());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append(string);
        sb4.append("dmableusers");
        Uri.parse(sb4.toString());
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(string);
        sb5.append("users");
        E0 = Uri.parse(sb5.toString());
        SuggestionsProvider.F0 = new HashMap();
        SuggestionsProvider.G0 = new HashMap();
        final UriMatcher h0 = new UriMatcher(-1);
        (H0 = h0).addURI(i, "search_suggest_shortcut", 1);
        h0.addURI(i, "search_suggest_shortcut/*", 1);
        h0.addURI(i, "compose_users", 2);
        h0.addURI(i, "compose_users/*", 2);
        h0.addURI(i, "hashtags", 3);
        h0.addURI(i, "hashtags/*", 3);
        h0.addURI(i, "dmableusers", 5);
        h0.addURI(i, "dmableusers/*", 5);
        h0.addURI(i, "users", 4);
    }
    
    public static void b(String l, final List<efv> list) {
        final HashMap f0 = SuggestionsProvider.F0;
        synchronized (f0) {
            if (!l.startsWith("@")) {
                l = pjr.l(l);
            }
            f0.put(l, list);
        }
    }
    
    public static List<efv> e(String string) {
        final HashMap g0 = SuggestionsProvider.G0;
        synchronized (g0) {
            if (!string.startsWith("#")) {
                final StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(string);
                string = sb.toString();
            }
            return (List<efv>)g0.get(string);
        }
    }
    
    public static List<efv> f(String l) {
        final HashMap f0 = SuggestionsProvider.F0;
        synchronized (f0) {
            if (!l.startsWith("@")) {
                l = pjr.l(l);
            }
            return (List<efv>)f0.get(l);
        }
    }
    
    public final void a(final MatrixCursor matrixCursor, final String s, final int n, final Set<Long> set, final otk<efv> otk) {
        if (pjr.g((CharSequence)s) && matrixCursor.getCount() < n) {
            Object o = f(s);
            if (o != null) {
                if (otk != null) {
                    o = c6e.e((Iterable)o, (otk)otk);
                }
                for (final efv efv : o) {
                    if (matrixCursor.getCount() >= n) {
                        break;
                    }
                    final hfv d = efv.d;
                    if (d == null) {
                        continue;
                    }
                    if (set.contains(d.C0)) {
                        continue;
                    }
                    final hfv d2 = efv.d;
                    final boolean m0 = d2.M0;
                    int n2 = 0;
                    int n3;
                    if (m0) {
                        n3 = 2;
                    }
                    else {
                        n3 = 0;
                    }
                    if (Boolean.TRUE.equals(d2.h())) {
                        n2 = 2097152;
                    }
                    final hfv d3 = efv.d;
                    final boolean l0 = d3.L0;
                    final long c0 = d3.C0;
                    final String j0 = d3.J0;
                    final String c2 = d3.c();
                    final hfv d4 = efv.d;
                    this.c(matrixCursor, c0, j0, c2, d4.D0, n3 | n2 | (l0 ? 1 : 0), d4.H1, "remote");
                }
            }
        }
    }
    
    public final void c(final MatrixCursor matrixCursor, final long n, final String s, final String s2, final String s3, final int n2, final int n3, final String s4) {
        matrixCursor.newRow().add((Object)(matrixCursor.getCount() - 1)).add((Object)n).add((Object)s).add((Object)s2).add((Object)s3).add((Object)n2).add((Object)n3).add((Object)s4);
    }
    
    public final Cursor d(String s, int n, final boolean b, final boolean b2, final boolean b3, final List<Long> list, final otk<efv> otk, final UserIdentifier userIdentifier) {
        final MatrixCursor matrixCursor = new MatrixCursor(f.a);
        final int a = hhv.a();
        final Integer value = 0;
        int n2 = 6;
        hfv hfv = null;
        final String s2 = "android_user_blob_read";
        String s3 = "tokens_user_view";
        HashSet set = null;
        Integer n7 = null;
        String s9 = null;
        Label_0601: {
            if (list != null && !list.isEmpty()) {
                set = new HashSet();
                if (matrixCursor.getCount() < a) {
                    final StringBuilder g = w48.g("0 IN (");
                    g.append(pjr.h((CharSequence)",", (Iterable)list));
                    g.append(") AND ");
                    g.append(5);
                    g.append(" <> 0");
                    final String string = g.toString();
                    final tyr p8 = ((tk1)aav.d2(userIdentifier)).p();
                    final xyr xyr = new xyr("tokens_user_view");
                    xyr.c = SuggestionsProvider.a.a;
                    xyr.d = string;
                    xyr.e = null;
                    final Cursor x = p8.X(xyr.d());
                    if (x != null) {
                        final HashMap hashMap = new HashMap<Long, Integer>(x.getCount());
                        final boolean b4 = dta.b().b("android_user_blob_read", false);
                        while (x.moveToNext()) {
                            hashMap.put(x.getLong(0), x.getPosition());
                        }
                        final Iterator iterator = list.iterator();
                        final String s4 = s2;
                        final Cursor cursor = x;
                        while (iterator.hasNext()) {
                            final Long n3 = (Long)iterator.next();
                            final Integer n4 = hashMap.get(n3);
                            if (n4 != null) {
                                cursor.moveToPosition((int)n4);
                                if (b4) {
                                    hfv = (hfv)tkp.a(cursor.getBlob(n2), (alp)hfv.M1);
                                }
                                final long longValue = n3;
                                String s5;
                                if (hfv != null) {
                                    s5 = hfv.J0;
                                }
                                else {
                                    s5 = cursor.getString(1);
                                }
                                String s6;
                                if (hfv != null) {
                                    s6 = hfv.c();
                                }
                                else {
                                    s6 = cursor.getString(2);
                                }
                                String s7;
                                if (hfv != null) {
                                    s7 = hfv.D0;
                                }
                                else {
                                    s7 = cursor.getString(3);
                                }
                                int n5;
                                if (hfv != null) {
                                    n5 = hfv.h1;
                                }
                                else {
                                    n5 = cursor.getInt(4);
                                }
                                int n6;
                                if (hfv != null) {
                                    n6 = hfv.H1;
                                }
                                else {
                                    n6 = cursor.getInt(5);
                                }
                                this.c(matrixCursor, longValue, s5, s6, s7, n5, n6, "undefined");
                                set.add(n3);
                                if (matrixCursor.getCount() >= a) {
                                    break;
                                }
                                hfv = null;
                                n2 = 6;
                            }
                        }
                        final String s8 = s4;
                        n7 = value;
                        cursor.close();
                        s9 = s8;
                        break Label_0601;
                    }
                }
                s3 = "tokens_user_view";
                n7 = value;
                s9 = "android_user_blob_read";
            }
            else {
                s3 = "tokens_user_view";
                n7 = value;
                s9 = "android_user_blob_read";
                set = new HashSet();
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (pjr.g((CharSequence)s)) {
            final boolean b5 = s.charAt(0) != '@';
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(pjr.s(s));
            sb2.append('%');
            final String string2 = sb2.toString();
            final String sqlEscapeString = DatabaseUtils.sqlEscapeString(string2);
            sb.append("(users_username LIKE ");
            sb.append(sqlEscapeString);
            if (b5) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("% ");
                sb3.append(string2);
                final String sqlEscapeString2 = DatabaseUtils.sqlEscapeString(sb3.toString());
                sb.append(" OR users_name LIKE ");
                sb.append(sqlEscapeString);
                mag.m(sb, " OR ", "users_name", " LIKE ", sqlEscapeString2);
            }
            sb.append(')');
        }
        final long id = userIdentifier.getId();
        if (n != 0) {
            if (sb.length() != 0) {
                sb.append(" AND ");
            }
            sb.append("(users_friendship&");
            sb.append(n);
            sb.append('=');
            sb.append(n);
            if (b2) {
                sb.append(" OR users_user_id = ");
                sb.append(id);
            }
            sb.append(')');
        }
        String string3;
        if (sb.length() > 0) {
            string3 = sb.toString();
        }
        else {
            string3 = null;
        }
        final tyr p9 = ((tk1)aav.d2(userIdentifier)).p();
        final xyr xyr2 = new xyr(s3);
        xyr2.a = true;
        xyr2.c = d.a;
        xyr2.d = string3;
        xyr2.e = null;
        xyr2.h = "tokens_weight DESC, LOWER(users_username) ASC";
        final Cursor x2 = p9.X(xyr2.d());
        if (x2 != null) {
            final boolean b6 = dta.b().b(s9, false);
            while (x2.moveToNext()) {
                hfv hfv2;
                if (b6) {
                    hfv2 = (hfv)tkp.a(x2.getBlob(6), (alp)hfv.M1);
                }
                else {
                    hfv2 = null;
                }
                long n8;
                if (hfv2 != null) {
                    n8 = hfv2.C0;
                }
                else {
                    n8 = x2.getLong(4);
                }
                if (!set.contains(n8)) {
                    String s10;
                    if (hfv2 != null) {
                        s10 = hfv2.J0;
                    }
                    else {
                        s10 = x2.getString(1);
                    }
                    String s11;
                    if (hfv2 != null) {
                        s11 = hfv2.c();
                    }
                    else {
                        s11 = x2.getString(0);
                    }
                    String s12;
                    if (hfv2 != null) {
                        s12 = hfv2.D0;
                    }
                    else {
                        s12 = x2.getString(5);
                    }
                    if (hfv2 != null) {
                        n = hfv2.h1;
                    }
                    else {
                        n = x2.getInt(6);
                    }
                    int n9;
                    if (hfv2 != null) {
                        n9 = hfv2.H1;
                    }
                    else {
                        n9 = x2.getInt(7);
                    }
                    this.c(matrixCursor, n8, s10, s11, s12, n, n9, "prefetch");
                    set.add(n8);
                    if (matrixCursor.getCount() >= a) {
                        break;
                    }
                    continue;
                }
            }
            x2.close();
        }
        if (b) {
            this.a(matrixCursor, pjr.s(s), a, set, otk);
        }
        if (b3 && pjr.g((CharSequence)s) && rdv.b.matcher(s).matches()) {
            n = matrixCursor.getCount();
            final MatrixCursor$RowBuilder row = matrixCursor.newRow();
            row.add((Object)n);
            row.add((Object)n7);
            s = pjr.s(s);
            row.add((Object)s);
            row.add((Object)pjr.l(s));
            row.add((Object)null);
            row.add((Object)n7);
            row.add((Object)n7);
        }
        return (Cursor)matrixCursor;
    }
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException(kwe.j("Delete not supported ", uri));
    }
    
    public final String getType(final Uri uri) {
        final int match = SuggestionsProvider.H0.match(uri);
        if (match == 1) {
            return "vnd.android.cursor.item/vnd.android.search.suggest";
        }
        if (match == 2) {
            return "vnd.android.cursor.item/vnd.twitter.android.suggest_compose_users";
        }
        if (match == 3) {
            return "vnd.android.cursor.item/vnd.twitter.android.suggest_hashtags";
        }
        if (match == 4) {
            return "vnd.android.cursor.item/vnd.twitter.android.suggest_users";
        }
        if (match == 5) {
            return "vnd.android.cursor.item/vnd.twitter.android.suggest_dmable_users";
        }
        throw new IllegalArgumentException(kwe.j("Unknown URL ", uri));
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException(kwe.j("Insert not supported ", uri));
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final Cursor query(final Uri p0, final String[] p1, final String p2, final String[] p3, final String p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/ContentProvider.getContext:()Landroid/content/Context;
        //     4: invokestatic    com/twitter/util/user/UserIdentifier.getCurrent:()Lcom/twitter/util/user/UserIdentifier;
        //     7: aload_1        
        //     8: aload_0        
        //     9: invokevirtual   android/content/ContentProvider.getCallingPackage:()Ljava/lang/String;
        //    12: invokestatic    aev.b:(Landroid/content/Context;Lcom/twitter/util/user/UserIdentifier;Landroid/net/Uri;Ljava/lang/String;)V
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: invokespecial   java/lang/StringBuilder.<init>:()V
        //    22: astore          4
        //    24: aload           4
        //    26: ldc_w           "QUERY uri: "
        //    29: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    32: pop            
        //    33: aload           4
        //    35: aload_1        
        //    36: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    39: pop            
        //    40: aload           4
        //    42: ldc_w           " -> "
        //    45: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    48: pop            
        //    49: getstatic       com/twitter/autocomplete/suggestion/SuggestionsProvider.H0:Landroid/content/UriMatcher;
        //    52: astore_2       
        //    53: aload           4
        //    55: aload_2        
        //    56: aload_1        
        //    57: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //    60: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    63: pop            
        //    64: ldc_w           "SuggestionsProvider"
        //    67: aload           4
        //    69: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    72: invokestatic    cag.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    75: aload_2        
        //    76: aload_1        
        //    77: invokevirtual   android/content/UriMatcher.match:(Landroid/net/Uri;)I
        //    80: istore          6
        //    82: invokestatic    com/twitter/util/user/UserIdentifier.getCurrent:()Lcom/twitter/util/user/UserIdentifier;
        //    85: invokevirtual   com/twitter/util/user/UserIdentifier.getId:()J
        //    88: lstore          7
        //    90: getstatic       p5w.b:Ljava/util/Set;
        //    93: astore_2       
        //    94: aload_1        
        //    95: ldc_w           "ownerId"
        //    98: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   101: astore_2       
        //   102: aload_2        
        //   103: ifnonnull       109
        //   106: goto            123
        //   109: aload_2        
        //   110: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   113: lstore          9
        //   115: lload           9
        //   117: lstore          7
        //   119: goto            123
        //   122: astore_2       
        //   123: lload           7
        //   125: invokestatic    com/twitter/util/user/UserIdentifier.fromId:(J)Lcom/twitter/util/user/UserIdentifier;
        //   128: astore          5
        //   130: iload           6
        //   132: iconst_1       
        //   133: if_icmpeq       1129
        //   136: iconst_0       
        //   137: istore          11
        //   139: iload           6
        //   141: iconst_2       
        //   142: if_icmpeq       628
        //   145: iload           6
        //   147: iconst_3       
        //   148: if_icmpeq       350
        //   151: iload           6
        //   153: iconst_4       
        //   154: if_icmpeq       212
        //   157: iload           6
        //   159: iconst_5       
        //   160: if_icmpne       197
        //   163: aload_0        
        //   164: aload_3        
        //   165: iconst_2       
        //   166: aload_1        
        //   167: ldc_w           "add_real_time_suggestions"
        //   170: iconst_0       
        //   171: invokestatic    p5w.j:(Landroid/net/Uri;Ljava/lang/String;Z)Z
        //   174: iconst_0       
        //   175: aload_1        
        //   176: ldc_w           "add_query"
        //   179: iconst_1       
        //   180: invokestatic    p5w.j:(Landroid/net/Uri;Ljava/lang/String;Z)Z
        //   183: aconst_null    
        //   184: new             Lsu7;
        //   187: dup            
        //   188: invokespecial   su7.<init>:()V
        //   191: aload           5
        //   193: invokevirtual   com/twitter/autocomplete/suggestion/SuggestionsProvider.d:(Ljava/lang/String;IZZZLjava/util/List;Lotk;Lcom/twitter/util/user/UserIdentifier;)Landroid/database/Cursor;
        //   196: areturn        
        //   197: new             Ljava/lang/IllegalArgumentException;
        //   200: dup            
        //   201: ldc_w           "Unknown URL "
        //   204: aload_1        
        //   205: invokestatic    kwe.j:(Ljava/lang/String;Landroid/net/Uri;)Ljava/lang/String;
        //   208: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   211: athrow         
        //   212: aload_1        
        //   213: ldc_w           "friendship"
        //   216: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   219: astore_2       
        //   220: aload_2        
        //   221: ifnonnull       227
        //   224: goto            236
        //   227: aload_2        
        //   228: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   231: istore          6
        //   233: goto            239
        //   236: iconst_0       
        //   237: istore          6
        //   239: aload_1        
        //   240: ldc_w           "add_real_time_suggestions"
        //   243: iconst_0       
        //   244: invokestatic    p5w.j:(Landroid/net/Uri;Ljava/lang/String;Z)Z
        //   247: istore          12
        //   249: aload_1        
        //   250: ldc_w           "additional_user_ids"
        //   253: invokevirtual   android/net/Uri.getQueryParameter:(Ljava/lang/String;)Ljava/lang/String;
        //   256: astore_1       
        //   257: aload_1        
        //   258: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   261: ifeq            267
        //   264: goto            332
        //   267: aload_1        
        //   268: ldc_w           ","
        //   271: invokevirtual   java/lang/String.split:(Ljava/lang/String;)[Ljava/lang/String;
        //   274: astore_2       
        //   275: aload_2        
        //   276: arraylength    
        //   277: istore          13
        //   279: new             Lijf$a;
        //   282: astore_1       
        //   283: aload_1        
        //   284: iload           13
        //   286: invokespecial   ijf$a.<init>:(I)V
        //   289: aload_2        
        //   290: arraylength    
        //   291: istore          13
        //   293: iload           11
        //   295: iload           13
        //   297: if_icmpge       321
        //   300: aload_1        
        //   301: aload_2        
        //   302: iload           11
        //   304: aaload         
        //   305: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   308: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   311: invokevirtual   ijf.p:(Ljava/lang/Object;)Lijf;
        //   314: pop            
        //   315: iinc            11, 1
        //   318: goto            293
        //   321: aload_1        
        //   322: invokevirtual   h4j.e:()Ljava/lang/Object;
        //   325: checkcast       Ljava/util/List;
        //   328: astore_1       
        //   329: goto            334
        //   332: aconst_null    
        //   333: astore_1       
        //   334: aload_0        
        //   335: aload_3        
        //   336: iload           6
        //   338: iload           12
        //   340: iconst_1       
        //   341: iconst_0       
        //   342: aload_1        
        //   343: aconst_null    
        //   344: aload           5
        //   346: invokevirtual   com/twitter/autocomplete/suggestion/SuggestionsProvider.d:(Ljava/lang/String;IZZZLjava/util/List;Lotk;Lcom/twitter/util/user/UserIdentifier;)Landroid/database/Cursor;
        //   349: areturn        
        //   350: aload_3        
        //   351: invokestatic    pjr.e:(Ljava/lang/CharSequence;)Z
        //   354: ifne            375
        //   357: aload_3        
        //   358: iconst_0       
        //   359: invokevirtual   java/lang/String.charAt:(I)C
        //   362: bipush          35
        //   364: if_icmpeq       370
        //   367: goto            375
        //   370: aload_3        
        //   371: astore_2       
        //   372: goto            389
        //   375: ldc             "#"
        //   377: astore_2       
        //   378: aload_3        
        //   379: ifnull          389
        //   382: ldc             "#"
        //   384: aload_3        
        //   385: invokestatic    l7k.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   388: astore_2       
        //   389: aload_1        
        //   390: ldc_w           "add_query_to_empty_result"
        //   393: iconst_0       
        //   394: invokestatic    p5w.j:(Landroid/net/Uri;Ljava/lang/String;Z)Z
        //   397: istore          12
        //   399: new             Landroid/database/MatrixCursor;
        //   402: dup            
        //   403: getstatic       com/twitter/autocomplete/suggestion/SuggestionsProvider$c.a:[Ljava/lang/String;
        //   406: invokespecial   android/database/MatrixCursor.<init>:([Ljava/lang/String;)V
        //   409: astore_1       
        //   410: new             Ljava/util/HashSet;
        //   413: dup            
        //   414: invokespecial   java/util/HashSet.<init>:()V
        //   417: astore_3       
        //   418: aload_2        
        //   419: invokestatic    com/twitter/autocomplete/suggestion/SuggestionsProvider.e:(Ljava/lang/String;)Ljava/util/List;
        //   422: astore          4
        //   424: aload           4
        //   426: ifnull          558
        //   429: aload           4
        //   431: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   436: astore          5
        //   438: iconst_0       
        //   439: istore          6
        //   441: iload           6
        //   443: istore          11
        //   445: aload           5
        //   447: invokeinterface java/util/Iterator.hasNext:()Z
        //   452: ifeq            561
        //   455: aload           5
        //   457: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   462: checkcast       Lefv;
        //   465: astore          14
        //   467: aload           14
        //   469: getfield        efv.e:Lmev;
        //   472: ifnull          441
        //   475: aload_1        
        //   476: invokevirtual   android/database/MatrixCursor.newRow:()Landroid/database/MatrixCursor$RowBuilder;
        //   479: astore          4
        //   481: aload           4
        //   483: iload           6
        //   485: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   488: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   491: pop            
        //   492: aload           4
        //   494: aload           14
        //   496: getfield        efv.e:Lmev;
        //   499: getfield        mev.b:Ljava/lang/String;
        //   502: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   505: pop            
        //   506: aload           4
        //   508: aload           14
        //   510: getfield        efv.f:Lukv;
        //   513: getstatic       ukv.c:Lukv$b;
        //   516: invokestatic    tkp.e:(Ljava/lang/Object;Lalp;)[B
        //   519: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   522: pop            
        //   523: aload           4
        //   525: ldc             "remote"
        //   527: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   530: pop            
        //   531: aload_3        
        //   532: new             Lpsl;
        //   535: dup            
        //   536: aload           14
        //   538: getfield        efv.e:Lmev;
        //   541: getfield        mev.b:Ljava/lang/String;
        //   544: iconst_0       
        //   545: invokespecial   psl.<init>:(Ljava/lang/String;I)V
        //   548: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   551: pop            
        //   552: iinc            6, 1
        //   555: goto            441
        //   558: iconst_0       
        //   559: istore          11
        //   561: iload           11
        //   563: invokestatic    hhv.a:()I
        //   566: if_icmpge       626
        //   569: aload_2        
        //   570: invokevirtual   java/lang/String.length:()I
        //   573: iconst_1       
        //   574: if_icmple       626
        //   577: aload_1        
        //   578: invokevirtual   android/database/MatrixCursor.getCount:()I
        //   581: ifgt            589
        //   584: iload           12
        //   586: ifeq            626
        //   589: aload_3        
        //   590: new             Lpsl;
        //   593: dup            
        //   594: aload_2        
        //   595: iconst_0       
        //   596: invokespecial   psl.<init>:(Ljava/lang/String;I)V
        //   599: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   602: ifne            626
        //   605: aload_1        
        //   606: invokevirtual   android/database/MatrixCursor.newRow:()Landroid/database/MatrixCursor$RowBuilder;
        //   609: astore_3       
        //   610: aload_3        
        //   611: iload           11
        //   613: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   616: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   619: pop            
        //   620: aload_3        
        //   621: aload_2        
        //   622: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   625: pop            
        //   626: aload_1        
        //   627: areturn        
        //   628: new             Landroid/database/MatrixCursor;
        //   631: dup            
        //   632: getstatic       com/twitter/autocomplete/suggestion/SuggestionsProvider$f.a:[Ljava/lang/String;
        //   635: invokespecial   android/database/MatrixCursor.<init>:([Ljava/lang/String;)V
        //   638: astore          4
        //   640: aload_3        
        //   641: invokestatic    pjr.g:(Ljava/lang/CharSequence;)Z
        //   644: ifne            654
        //   647: aconst_null    
        //   648: astore_1       
        //   649: aload_1        
        //   650: astore_2       
        //   651: goto            693
        //   654: getstatic       xzj.a:Ljava/util/regex/Pattern;
        //   657: aload_3        
        //   658: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   661: invokevirtual   java/util/regex/Matcher.find:()Z
        //   664: ifeq            674
        //   667: ldc_w           "users_name LIKE ?"
        //   670: astore_1       
        //   671: goto            678
        //   674: ldc_w           "tokens_text LIKE ? AND users_username NOT NULL"
        //   677: astore_1       
        //   678: iconst_1       
        //   679: anewarray       Ljava/lang/String;
        //   682: astore_2       
        //   683: aload_2        
        //   684: iconst_0       
        //   685: aload_3        
        //   686: ldc_w           "%"
        //   689: invokestatic    l7k.c:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   692: aastore        
        //   693: new             Ljava/util/HashSet;
        //   696: dup            
        //   697: invokespecial   java/util/HashSet.<init>:()V
        //   700: astore          14
        //   702: invokestatic    hhv.a:()I
        //   705: istore          13
        //   707: aload           5
        //   709: invokestatic    aav.d2:(Lcom/twitter/util/user/UserIdentifier;)Laav;
        //   712: invokevirtual   tk1.p:()Ltyr;
        //   715: astore          5
        //   717: new             Lxyr;
        //   720: dup            
        //   721: ldc_w           "tokens_user_view"
        //   724: invokespecial   xyr.<init>:(Ljava/lang/String;)V
        //   727: astore          15
        //   729: aload           15
        //   731: iconst_1       
        //   732: putfield        xyr.a:Z
        //   735: aload           15
        //   737: getstatic       com/twitter/autocomplete/suggestion/SuggestionsProvider$a.a:[Ljava/lang/String;
        //   740: putfield        xyr.c:[Ljava/lang/String;
        //   743: aload           15
        //   745: aload_1        
        //   746: putfield        xyr.d:Ljava/lang/String;
        //   749: aload           15
        //   751: aload_2        
        //   752: putfield        xyr.e:[Ljava/lang/Object;
        //   755: aload           15
        //   757: ldc_w           "tokens_weight DESC, LOWER(users_username) ASC"
        //   760: putfield        xyr.h:Ljava/lang/String;
        //   763: aload           15
        //   765: iload           13
        //   767: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   770: invokevirtual   xyr.f:(Ljava/lang/String;)Lxyr;
        //   773: pop            
        //   774: aload           5
        //   776: aload           15
        //   778: invokevirtual   xyr.d:()Lwyr;
        //   781: invokeinterface tyr.X:(Lwyr;)Landroid/database/Cursor;
        //   786: astore          5
        //   788: aload           5
        //   790: ifnull          1114
        //   793: invokestatic    dta.b:()Lhlv;
        //   796: ldc_w           "android_user_blob_read"
        //   799: iconst_0       
        //   800: invokevirtual   hlv.b:(Ljava/lang/String;Z)Z
        //   803: istore          12
        //   805: iconst_0       
        //   806: istore          6
        //   808: aload           5
        //   810: invokeinterface android/database/Cursor.moveToNext:()Z
        //   815: ifeq            1107
        //   818: iload           12
        //   820: ifeq            845
        //   823: aload           5
        //   825: bipush          6
        //   827: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   832: getstatic       hfv.M1:Lhfv$d;
        //   835: invokestatic    tkp.a:([BLalp;)Ljava/lang/Object;
        //   838: checkcast       Lhfv;
        //   841: astore_1       
        //   842: goto            847
        //   845: aconst_null    
        //   846: astore_1       
        //   847: aload_1        
        //   848: ifnull          859
        //   851: aload_1        
        //   852: getfield        hfv.J0:Ljava/lang/String;
        //   855: astore_2       
        //   856: goto            868
        //   859: aload           5
        //   861: iconst_1       
        //   862: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   867: astore_2       
        //   868: aload_2        
        //   869: ifnull          1104
        //   872: aload           4
        //   874: invokevirtual   android/database/MatrixCursor.newRow:()Landroid/database/MatrixCursor$RowBuilder;
        //   877: astore          15
        //   879: aload           15
        //   881: iload           6
        //   883: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   886: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   889: pop            
        //   890: aload_1        
        //   891: ifnull          903
        //   894: aload_1        
        //   895: getfield        hfv.C0:J
        //   898: lstore          7
        //   900: goto            913
        //   903: aload           5
        //   905: iconst_0       
        //   906: invokeinterface android/database/Cursor.getLong:(I)J
        //   911: lstore          7
        //   913: aload           15
        //   915: lload           7
        //   917: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   920: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   923: pop            
        //   924: aload           15
        //   926: aload_2        
        //   927: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   930: pop            
        //   931: aload_1        
        //   932: ifnull          943
        //   935: aload_1        
        //   936: invokevirtual   hfv.c:()Ljava/lang/String;
        //   939: astore_2       
        //   940: goto            952
        //   943: aload           5
        //   945: iconst_2       
        //   946: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   951: astore_2       
        //   952: aload           15
        //   954: aload_2        
        //   955: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   958: pop            
        //   959: aload_1        
        //   960: ifnull          971
        //   963: aload_1        
        //   964: getfield        hfv.D0:Ljava/lang/String;
        //   967: astore_2       
        //   968: goto            980
        //   971: aload           5
        //   973: iconst_3       
        //   974: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   979: astore_2       
        //   980: aload           15
        //   982: aload_2        
        //   983: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //   986: pop            
        //   987: aload_1        
        //   988: ifnull          1000
        //   991: aload_1        
        //   992: getfield        hfv.h1:I
        //   995: istore          11
        //   997: goto            1010
        //  1000: aload           5
        //  1002: iconst_4       
        //  1003: invokeinterface android/database/Cursor.getInt:(I)I
        //  1008: istore          11
        //  1010: aload           15
        //  1012: iload           11
        //  1014: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1017: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //  1020: pop            
        //  1021: aload_1        
        //  1022: ifnull          1034
        //  1025: aload_1        
        //  1026: getfield        hfv.H1:I
        //  1029: istore          11
        //  1031: goto            1044
        //  1034: aload           5
        //  1036: iconst_5       
        //  1037: invokeinterface android/database/Cursor.getInt:(I)I
        //  1042: istore          11
        //  1044: aload           15
        //  1046: iload           11
        //  1048: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1051: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //  1054: pop            
        //  1055: aload           15
        //  1057: ldc_w           "prefetch"
        //  1060: invokevirtual   android/database/MatrixCursor$RowBuilder.add:(Ljava/lang/Object;)Landroid/database/MatrixCursor$RowBuilder;
        //  1063: pop            
        //  1064: aload_1        
        //  1065: ifnull          1077
        //  1068: aload_1        
        //  1069: getfield        hfv.C0:J
        //  1072: lstore          7
        //  1074: goto            1087
        //  1077: aload           5
        //  1079: iconst_0       
        //  1080: invokeinterface android/database/Cursor.getLong:(I)J
        //  1085: lstore          7
        //  1087: aload           14
        //  1089: lload           7
        //  1091: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1094: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  1097: pop            
        //  1098: iinc            6, 1
        //  1101: goto            1104
        //  1104: goto            808
        //  1107: aload           5
        //  1109: invokeinterface android/database/Cursor.close:()V
        //  1114: aload_0        
        //  1115: aload           4
        //  1117: aload_3        
        //  1118: iload           13
        //  1120: aload           14
        //  1122: aconst_null    
        //  1123: invokevirtual   com/twitter/autocomplete/suggestion/SuggestionsProvider.a:(Landroid/database/MatrixCursor;Ljava/lang/String;ILjava/util/Set;Lotk;)V
        //  1126: aload           4
        //  1128: areturn        
        //  1129: aconst_null    
        //  1130: areturn        
        //  1131: astore_2       
        //  1132: goto            236
        //  1135: astore_1       
        //  1136: goto            332
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  109    115    122    123    Ljava/lang/NumberFormatException;
        //  227    233    1131   1135   Ljava/lang/NumberFormatException;
        //  267    293    1135   1139   Ljava/lang/NumberFormatException;
        //  300    315    1135   1139   Ljava/lang/NumberFormatException;
        //  321    329    1135   1139   Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0267:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException(kwe.j("Update not supported ", uri));
    }
    
    public interface a
    {
        public static final String[] a = { "users_user_id", "users_username", "users_name", "users_image_url", "users_user_flags", "users_friendship", "users_blob_data" };
    }
    
    public interface c
    {
        public static final String[] a = { "_id", "hashtag", "context", "source" };
    }
    
    public interface d
    {
        public static final String[] a = { "users_name", "users_username", "tokens_type", "tokens_result_context", "users_user_id", "users_image_url", "users_user_flags", "users_friendship", "users_blob_data" };
    }
    
    public interface f
    {
        public static final String[] a = { "_id", "user_id", "username", "name", "image_url", "user_flags", "friendship", "blob_data", "SuggestionSource" };
    }
}
