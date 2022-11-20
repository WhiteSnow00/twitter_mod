import java.util.Iterator;
import android.text.TextUtils;
import java.util.regex.Pattern;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import android.net.TrafficStats;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e0b implements f0b
{
    public static final Object m;
    public static final e0b$a n;
    public final yza a;
    public final b0b b;
    public final t7k c;
    public final knw d;
    public final e5d e;
    public final rwl f;
    public final Object g;
    public final ExecutorService h;
    public final ThreadPoolExecutor i;
    public String j;
    public Set<ewa> k;
    public final List<x8r> l;
    
    static {
        m = new Object();
        n = new e0b$a();
    }
    
    public e0b(final yza a, final eml<fic> eml) {
        final TimeUnit seconds = TimeUnit.SECONDS;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        final e0b$a n = e0b.n;
        final ThreadPoolExecutor h = new ThreadPoolExecutor(0, 1, 30L, seconds, linkedBlockingQueue, (ThreadFactory)n);
        a.a();
        final b0b b = new b0b(a.a, (eml)eml);
        final t7k c = new t7k(a);
        final knw c2 = knw.c();
        final e5d e = new e5d(a);
        final rwl f = new rwl();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = c2;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = new ThreadPoolExecutor(0, 1, 30L, seconds, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)n);
    }
    
    public static e0b e() {
        return (e0b)yza.c().b((Class)f0b.class);
    }
    
    public final void a(final boolean b) {
        synchronized (e0b.m) {
            final yza a = this.a;
            a.a();
            final qmi b2 = qmi.b(a.a);
            try {
                u7k u7k2;
                final u7k u7k = u7k2 = this.c.c();
                if (u7k.i()) {
                    final String h = this.h(u7k);
                    final t7k c = this.c;
                    final ob1$a ob1$a = new ob1$a((u7k)u7k);
                    ob1$a.a = h;
                    ob1$a.b = 3;
                    u7k2 = ob1$a.a();
                    c.b(u7k2);
                }
                if (b2 != null) {
                    b2.h();
                }
                monitorexit(e0b.m);
                u7k a2 = u7k2;
                if (b) {
                    final ob1$a ob1$a2 = new ob1$a((u7k)u7k2);
                    ob1$a2.c = null;
                    a2 = ob1$a2.a();
                }
                this.l(a2);
                this.i.execute((Runnable)new c0b((Object)this, b, 0));
            }
            finally {
                if (b2 != null) {
                    b2.h();
                }
            }
        }
    }
    
    public final u7k b(final u7k u7k) throws FirebaseInstallationsException {
        final b0b b = this.b;
        final String c = this.c();
        final ob1 ob1 = (ob1)u7k;
        final String b2 = ob1.b;
        final String f = this.f();
        final String e = ob1.e;
        if (!b.c.a()) {
            goto Label_0529;
        }
        final URL a = b.a(String.format("projects/%s/installations/%s/authTokens:generate", f, b2));
        if (0 > 1) {
            goto Label_0518;
        }
        TrafficStats.setThreadStatsTag(32771);
        final HttpURLConnection c2 = b.c(a, c);
        try {
            c2.setRequestMethod("POST");
            final StringBuilder sb = new StringBuilder();
            sb.append("FIS_v2 ");
            sb.append(e);
            c2.addRequestProperty("Authorization", sb.toString());
            c2.setDoOutput(true);
            b.h(c2);
            final int responseCode = c2.getResponseCode();
            b.c.b(responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                b.f(c2);
                goto Label_0324;
            }
            goto Label_0208;
        }
        catch (final AssertionError | IOException ex) {
            goto Label_0504;
        }
        finally {
            goto Label_0494;
        }
        try {
            this.j = null;
            monitorexit(this);
            final ob1$a ob1$a = new ob1$a((u7k)ob1);
            ob1$a.b = 2;
            return ob1$a.a();
        }
        finally {}
    }
    
    public final String c() {
        final yza a = this.a;
        a.a();
        return a.c.a;
    }
    
    public final String d() {
        final yza a = this.a;
        a.a();
        return a.c.b;
    }
    
    public final String f() {
        final yza a = this.a;
        a.a();
        return a.c.g;
    }
    
    public final void g() {
        eli.o(this.d(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eli.o(this.f(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eli.o(this.c(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        final String d = this.d();
        final Pattern c = knw.c;
        eli.i(d.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eli.i(knw.c.matcher(this.c()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }
    
    @Override
    public final ubs<String> getId() {
        this.g();
        synchronized (this) {
            final String j = this.j;
            monitorexit(this);
            if (j != null) {
                return ucs.e(j);
            }
            final zbs zbs = new zbs();
            final o1c o1c = new o1c(zbs);
            Object o = this.g;
            synchronized (o) {
                this.l.add(o1c);
                monitorexit(o);
                o = zbs.a;
                this.h.execute((Runnable)new r20((Object)this, 3));
                return (ubs<String>)o;
            }
        }
    }
    
    public final String h(final u7k u7k) {
        final yza a = this.a;
        a.a();
        if (a.b.equals("CHIME_ANDROID_SDK") || this.a.h()) {
            final int c = ((ob1)u7k).c;
            boolean b = true;
            if (c != 1) {
                b = false;
            }
            if (b) {
                final e5d e = this.e;
                Object o = e.a;
                synchronized (o) {
                    synchronized (e.a) {
                        String s = e.a.getString("|S|id", (String)null);
                        monitorexit(e.a);
                        if (s != null) {
                            monitorexit(o);
                        }
                        else {
                            s = e.a();
                            monitorexit(o);
                        }
                        o = s;
                        if (TextUtils.isEmpty((CharSequence)s)) {
                            o = this.f.a();
                        }
                        return (String)o;
                    }
                }
            }
        }
        return this.f.a();
    }
    
    public final u7k i(final u7k p0) throws FirebaseInstallationsException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: checkcast       Lob1;
        //     4: astore          12
        //     6: aload           12
        //     8: getfield        ob1.b:Ljava/lang/String;
        //    11: astore          13
        //    13: aconst_null    
        //    14: astore          11
        //    16: aconst_null    
        //    17: astore          10
        //    19: aload           11
        //    21: astore_1       
        //    22: aload           13
        //    24: ifnull          220
        //    27: aload           11
        //    29: astore_1       
        //    30: aload           13
        //    32: invokevirtual   java/lang/String.length:()I
        //    35: bipush          11
        //    37: if_icmpne       220
        //    40: aload_0        
        //    41: getfield        e0b.e:Le5d;
        //    44: astore          15
        //    46: aload           15
        //    48: getfield        e5d.a:Landroid/content/SharedPreferences;
        //    51: astore          13
        //    53: aload           13
        //    55: monitorenter   
        //    56: getstatic       e5d.c:[Ljava/lang/String;
        //    59: astore          14
        //    61: iconst_0       
        //    62: istore_2       
        //    63: iload_2        
        //    64: iconst_4       
        //    65: if_icmpge       206
        //    68: aload           14
        //    70: iload_2        
        //    71: aaload         
        //    72: astore          17
        //    74: aload           15
        //    76: getfield        e5d.b:Ljava/lang/String;
        //    79: astore_1       
        //    80: new             Ljava/lang/StringBuilder;
        //    83: astore          16
        //    85: aload           16
        //    87: invokespecial   java/lang/StringBuilder.<init>:()V
        //    90: aload           16
        //    92: ldc_w           "|T|"
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: pop            
        //    99: aload           16
        //   101: aload_1        
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: pop            
        //   106: aload           16
        //   108: ldc_w           "|"
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: pop            
        //   115: aload           16
        //   117: aload           17
        //   119: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   122: pop            
        //   123: aload           16
        //   125: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   128: astore_1       
        //   129: aload           15
        //   131: getfield        e5d.a:Landroid/content/SharedPreferences;
        //   134: aload_1        
        //   135: aconst_null    
        //   136: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   141: astore_1       
        //   142: aload_1        
        //   143: ifnull          200
        //   146: aload_1        
        //   147: invokevirtual   java/lang/String.isEmpty:()Z
        //   150: ifne            200
        //   153: aload_1        
        //   154: ldc_w           "{"
        //   157: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   160: istore          5
        //   162: iload           5
        //   164: ifeq            194
        //   167: new             Lorg/json/JSONObject;
        //   170: astore          11
        //   172: aload           11
        //   174: aload_1        
        //   175: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   178: aload           11
        //   180: ldc_w           "token"
        //   183: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   186: astore_1       
        //   187: goto            194
        //   190: astore_1       
        //   191: goto            215
        //   194: aload           13
        //   196: monitorexit    
        //   197: goto            220
        //   200: iinc            2, 1
        //   203: goto            63
        //   206: aload           13
        //   208: monitorexit    
        //   209: aload           11
        //   211: astore_1       
        //   212: goto            220
        //   215: aload           13
        //   217: monitorexit    
        //   218: aload_1        
        //   219: athrow         
        //   220: aload_0        
        //   221: getfield        e0b.b:Lb0b;
        //   224: astore          16
        //   226: aload_0        
        //   227: invokevirtual   e0b.c:()Ljava/lang/String;
        //   230: astore          15
        //   232: aload           12
        //   234: getfield        ob1.b:Ljava/lang/String;
        //   237: astore          13
        //   239: aload_0        
        //   240: invokevirtual   e0b.f:()Ljava/lang/String;
        //   243: astore          17
        //   245: aload_0        
        //   246: invokevirtual   e0b.d:()Ljava/lang/String;
        //   249: astore          18
        //   251: aload           16
        //   253: getfield        b0b.c:Lipm;
        //   256: invokevirtual   ipm.a:()Z
        //   259: ifeq            706
        //   262: aload           16
        //   264: ldc_w           "projects/%s/installations"
        //   267: iconst_1       
        //   268: anewarray       Ljava/lang/Object;
        //   271: dup            
        //   272: iconst_0       
        //   273: aload           17
        //   275: aastore        
        //   276: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   279: invokevirtual   b0b.a:(Ljava/lang/String;)Ljava/net/URL;
        //   282: astore          14
        //   284: iconst_0       
        //   285: istore_2       
        //   286: iload_2        
        //   287: iconst_1       
        //   288: if_icmpgt       695
        //   291: ldc_w           32769
        //   294: invokestatic    android/net/TrafficStats.setThreadStatsTag:(I)V
        //   297: aload           16
        //   299: aload           14
        //   301: aload           15
        //   303: invokevirtual   b0b.c:(Ljava/net/URL;Ljava/lang/String;)Ljava/net/HttpURLConnection;
        //   306: astore          11
        //   308: aload           11
        //   310: ldc             "POST"
        //   312: invokevirtual   java/net/HttpURLConnection.setRequestMethod:(Ljava/lang/String;)V
        //   315: aload           11
        //   317: iconst_1       
        //   318: invokevirtual   java/net/URLConnection.setDoOutput:(Z)V
        //   321: aload_1        
        //   322: ifnull          341
        //   325: aload           11
        //   327: ldc_w           "x-goog-fis-android-iid-migration-auth"
        //   330: aload_1        
        //   331: invokevirtual   java/net/URLConnection.addRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   334: goto            341
        //   337: astore_1       
        //   338: goto            671
        //   341: aload           16
        //   343: aload           11
        //   345: aload           13
        //   347: aload           18
        //   349: invokevirtual   b0b.g:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;)V
        //   352: aload           11
        //   354: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   357: istore          4
        //   359: aload           16
        //   361: getfield        b0b.c:Lipm;
        //   364: iload           4
        //   366: invokevirtual   ipm.b:(I)V
        //   369: iload           4
        //   371: sipush          200
        //   374: if_icmplt       390
        //   377: iload           4
        //   379: sipush          300
        //   382: if_icmpge       390
        //   385: iconst_1       
        //   386: istore_3       
        //   387: goto            392
        //   390: iconst_0       
        //   391: istore_3       
        //   392: iload_3        
        //   393: ifeq            419
        //   396: aload           16
        //   398: aload           11
        //   400: invokevirtual   b0b.e:(Ljava/net/HttpURLConnection;)Lksd;
        //   403: astore          10
        //   405: aload           11
        //   407: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   410: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   413: aload           10
        //   415: astore_1       
        //   416: goto            492
        //   419: aload           11
        //   421: aload           18
        //   423: aload           15
        //   425: aload           17
        //   427: invokestatic    b0b.b:(Ljava/net/HttpURLConnection;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   430: iload           4
        //   432: sipush          429
        //   435: if_icmpeq       655
        //   438: iload           4
        //   440: sipush          500
        //   443: if_icmplt       457
        //   446: iload           4
        //   448: sipush          600
        //   451: if_icmpge       457
        //   454: goto            681
        //   457: ldc_w           "Firebase-Installations"
        //   460: ldc_w           "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
        //   463: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   466: pop            
        //   467: new             Lbb1;
        //   470: dup            
        //   471: aconst_null    
        //   472: aconst_null    
        //   473: aconst_null    
        //   474: aconst_null    
        //   475: iconst_2       
        //   476: invokespecial   bb1.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljht;I)V
        //   479: astore          10
        //   481: aload           11
        //   483: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   486: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   489: aload           10
        //   491: astore_1       
        //   492: aload_1        
        //   493: checkcast       Lbb1;
        //   496: astore          13
        //   498: aload           13
        //   500: getfield        bb1.e:I
        //   503: invokestatic    ib0.E:(I)I
        //   506: istore_2       
        //   507: iload_2        
        //   508: ifeq            554
        //   511: iload_2        
        //   512: iconst_1       
        //   513: if_icmpne       543
        //   516: new             Lob1$a;
        //   519: dup            
        //   520: aload           12
        //   522: invokespecial   ob1$a.<init>:(Lu7k;)V
        //   525: astore_1       
        //   526: aload_1        
        //   527: ldc_w           "BAD CONFIG"
        //   530: putfield        ob1$a.g:Ljava/lang/String;
        //   533: aload_1        
        //   534: iconst_5       
        //   535: putfield        ob1$a.b:I
        //   538: aload_1        
        //   539: invokevirtual   ob1$a.a:()Lu7k;
        //   542: areturn        
        //   543: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   546: dup            
        //   547: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   550: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   553: athrow         
        //   554: aload           13
        //   556: getfield        bb1.b:Ljava/lang/String;
        //   559: astore_1       
        //   560: aload           13
        //   562: getfield        bb1.c:Ljava/lang/String;
        //   565: astore          11
        //   567: aload_0        
        //   568: getfield        e0b.d:Lknw;
        //   571: invokevirtual   knw.b:()J
        //   574: lstore          6
        //   576: aload           13
        //   578: getfield        bb1.d:Ljht;
        //   581: invokevirtual   jht.c:()Ljava/lang/String;
        //   584: astore          10
        //   586: aload           13
        //   588: getfield        bb1.d:Ljht;
        //   591: invokevirtual   jht.d:()J
        //   594: lstore          8
        //   596: new             Lob1$a;
        //   599: dup            
        //   600: aload           12
        //   602: invokespecial   ob1$a.<init>:(Lu7k;)V
        //   605: astore          12
        //   607: aload           12
        //   609: aload_1        
        //   610: putfield        ob1$a.a:Ljava/lang/String;
        //   613: aload           12
        //   615: iconst_4       
        //   616: putfield        ob1$a.b:I
        //   619: aload           12
        //   621: aload           10
        //   623: putfield        ob1$a.c:Ljava/lang/String;
        //   626: aload           12
        //   628: aload           11
        //   630: putfield        ob1$a.d:Ljava/lang/String;
        //   633: aload           12
        //   635: lload           8
        //   637: invokevirtual   ob1$a.b:(J)Lu7k$a;
        //   640: pop            
        //   641: aload           12
        //   643: lload           6
        //   645: invokevirtual   ob1$a.d:(J)Lu7k$a;
        //   648: pop            
        //   649: aload           12
        //   651: invokevirtual   ob1$a.a:()Lu7k;
        //   654: areturn        
        //   655: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   658: astore          10
        //   660: aload           10
        //   662: ldc_w           "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
        //   665: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   668: aload           10
        //   670: athrow         
        //   671: aload           11
        //   673: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   676: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   679: aload_1        
        //   680: athrow         
        //   681: aload           11
        //   683: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   686: invokestatic    android/net/TrafficStats.clearThreadStatsTag:()V
        //   689: iinc            2, 1
        //   692: goto            286
        //   695: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   698: dup            
        //   699: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   702: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   705: athrow         
        //   706: new             Lcom/google/firebase/installations/FirebaseInstallationsException;
        //   709: dup            
        //   710: ldc_w           "Firebase Installations Service is unavailable. Please try again later."
        //   713: invokespecial   com/google/firebase/installations/FirebaseInstallationsException.<init>:(Ljava/lang/String;)V
        //   716: athrow         
        //   717: astore_1       
        //   718: aload           10
        //   720: astore_1       
        //   721: goto            194
        //   724: astore          10
        //   726: goto            681
        //    Exceptions:
        //  throws com.google.firebase.installations.FirebaseInstallationsException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                      
        //  -----  -----  -----  -----  --------------------------
        //  56     61     190    220    Any
        //  74     142    190    220    Any
        //  146    162    190    220    Any
        //  167    187    717    724    Lorg/json/JSONException;
        //  167    187    190    220    Any
        //  194    197    190    220    Any
        //  206    209    190    220    Any
        //  215    218    190    220    Any
        //  308    321    724    729    Ljava/lang/AssertionError;
        //  308    321    724    729    Ljava/io/IOException;
        //  308    321    337    341    Any
        //  325    334    724    729    Ljava/lang/AssertionError;
        //  325    334    724    729    Ljava/io/IOException;
        //  325    334    337    341    Any
        //  341    369    724    729    Ljava/lang/AssertionError;
        //  341    369    724    729    Ljava/io/IOException;
        //  341    369    337    341    Any
        //  396    405    724    729    Ljava/lang/AssertionError;
        //  396    405    724    729    Ljava/io/IOException;
        //  396    405    337    341    Any
        //  419    430    724    729    Ljava/lang/AssertionError;
        //  419    430    724    729    Ljava/io/IOException;
        //  419    430    337    341    Any
        //  457    481    724    729    Ljava/lang/AssertionError;
        //  457    481    724    729    Ljava/io/IOException;
        //  457    481    337    341    Any
        //  655    671    724    729    Ljava/lang/AssertionError;
        //  655    671    724    729    Ljava/io/IOException;
        //  655    671    337    341    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0194:
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
    
    public final void j(final Exception ex) {
        synchronized (this.g) {
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (((x8r)iterator.next()).a(ex)) {
                    iterator.remove();
                }
            }
        }
    }
    
    @Override
    public final ubs<lsd> k(boolean b) {
        this.g();
        final zbs zbs = new zbs();
        final g1c g1c = new g1c(this.d, zbs);
        b = (boolean)this.g;
        synchronized (b) {
            this.l.add(g1c);
            monitorexit(b);
            b = (boolean)zbs.a;
            this.h.execute((Runnable)new d0b(this));
            return (ubs<lsd>)b;
        }
    }
    
    public final void l(final u7k u7k) {
        synchronized (this.g) {
            final Iterator iterator = this.l.iterator();
            while (iterator.hasNext()) {
                if (((x8r)iterator.next()).b(u7k)) {
                    iterator.remove();
                }
            }
        }
    }
}
