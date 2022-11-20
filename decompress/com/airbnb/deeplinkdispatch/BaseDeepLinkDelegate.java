// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.deeplinkdispatch;

import java.util.Collection;
import java.util.Iterator;
import android.util.Log;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Objects;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.content.Context;
import com.airbnb.deeplinkdispatch.base.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseDeepLinkDelegate
{
    public static final String TAG = "DeepLinkDelegate";
    public final Map<byte[], byte[]> configurablePathSegmentReplacements;
    public final ErrorHandler errorHandler;
    public final List<? extends BaseRegistry> registries;
    
    public BaseDeepLinkDelegate(final List<? extends BaseRegistry> registries) {
        this.registries = registries;
        this.errorHandler = null;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements((List)registries, (Map)(this.configurablePathSegmentReplacements = new HashMap<byte[], byte[]>()));
    }
    
    public BaseDeepLinkDelegate(final List<? extends BaseRegistry> registries, final ErrorHandler errorHandler) {
        this.registries = registries;
        this.errorHandler = errorHandler;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements((List)registries, (Map)(this.configurablePathSegmentReplacements = new HashMap<byte[], byte[]>()));
    }
    
    public BaseDeepLinkDelegate(final List<? extends BaseRegistry> registries, final Map<String, String> map) {
        this.registries = registries;
        this.errorHandler = null;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements((List)registries, (Map)(this.configurablePathSegmentReplacements = Utils.toByteArrayMap((Map)map)));
    }
    
    public BaseDeepLinkDelegate(final List<? extends BaseRegistry> registries, final Map<String, String> map, final ErrorHandler errorHandler) {
        this.registries = registries;
        this.errorHandler = errorHandler;
        ValidationUtilsKt.validateConfigurablePathSegmentReplacements((List)registries, (Map)(this.configurablePathSegmentReplacements = Utils.toByteArrayMap((Map)map)));
    }
    
    private static void notifyListener(final Context context, final boolean b, final Uri uri, String s, final String s2) {
        final Intent intent = new Intent();
        intent.setAction("com.airbnb.deeplinkdispatch.DEEPLINK_ACTION");
        String string;
        if (uri != null) {
            string = uri.toString();
        }
        else {
            string = "";
        }
        intent.putExtra("com.airbnb.deeplinkdispatch.EXTRA_URI", string);
        if (s == null) {
            s = "";
        }
        intent.putExtra("com.airbnb.deeplinkdispatch.EXTRA_URI_TEMPLATE", s);
        intent.putExtra("com.airbnb.deeplinkdispatch.EXTRA_SUCCESSFUL", b ^ true);
        if (b) {
            intent.putExtra("com.airbnb.deeplinkdispatch.EXTRA_ERROR_MESSAGE", s2);
        }
        f3g.a(context).c(intent);
    }
    
    private void validateInput(final Activity activity) {
        Objects.requireNonNull(activity, "activity == null");
    }
    
    private void validateInput(final Activity activity, final Intent intent) {
        this.validateInput(activity);
        this.validateInput(intent);
    }
    
    private void validateInput(final Intent intent) {
        Objects.requireNonNull(intent, "sourceIntent == null");
    }
    
    public DeepLinkResult createResult(final Activity p0, final Intent p1, final DeepLinkMatchResult p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: aload_2        
        //     3: invokespecial   com/airbnb/deeplinkdispatch/BaseDeepLinkDelegate.validateInput:(Landroid/app/Activity;Landroid/content/Intent;)V
        //     6: aload_2        
        //     7: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //    10: astore          9
        //    12: aconst_null    
        //    13: astore          4
        //    15: aload           9
        //    17: ifnonnull       42
        //    20: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //    23: dup            
        //    24: iconst_0       
        //    25: aconst_null    
        //    26: ldc             "No Uri in given activity's intent."
        //    28: aload_3        
        //    29: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //    32: dup            
        //    33: aconst_null    
        //    34: aconst_null    
        //    35: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //    38: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //    41: areturn        
        //    42: aload           9
        //    44: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //    47: astore          8
        //    49: aload_3        
        //    50: ifnonnull       75
        //    53: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //    56: dup            
        //    57: iconst_0       
        //    58: aconst_null    
        //    59: ldc             "DeepLinkEntry cannot be null"
        //    61: aconst_null    
        //    62: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //    65: dup            
        //    66: aconst_null    
        //    67: aconst_null    
        //    68: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //    71: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //    74: areturn        
        //    75: aload           8
        //    77: invokestatic    com/airbnb/deeplinkdispatch/DeepLinkUri.parse:(Ljava/lang/String;)Lcom/airbnb/deeplinkdispatch/DeepLinkUri;
        //    80: astore          13
        //    82: new             Ljava/util/HashMap;
        //    85: dup            
        //    86: aload_3        
        //    87: aload           13
        //    89: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getParameters:(Lcom/airbnb/deeplinkdispatch/DeepLinkUri;)Ljava/util/Map;
        //    92: invokespecial   java/util/HashMap.<init>:(Ljava/util/Map;)V
        //    95: astore          5
        //    97: aload           13
        //    99: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkUri.queryParameterNames:()Ljava/util/Set;
        //   102: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   107: astore          10
        //   109: aload           10
        //   111: invokeinterface java/util/Iterator.hasNext:()Z
        //   116: ifeq            226
        //   119: aload           10
        //   121: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   126: checkcast       Ljava/lang/String;
        //   129: astore          7
        //   131: aload           13
        //   133: aload           7
        //   135: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkUri.queryParameterValues:(Ljava/lang/String;)Ljava/util/List;
        //   138: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   143: astore          6
        //   145: aload           6
        //   147: invokeinterface java/util/Iterator.hasNext:()Z
        //   152: ifeq            109
        //   155: aload           6
        //   157: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   162: checkcast       Ljava/lang/String;
        //   165: astore          12
        //   167: aload           5
        //   169: aload           7
        //   171: invokevirtual   java/util/HashMap.containsKey:(Ljava/lang/Object;)Z
        //   174: ifeq            213
        //   177: new             Ljava/lang/StringBuilder;
        //   180: dup            
        //   181: invokespecial   java/lang/StringBuilder.<init>:()V
        //   184: astore          11
        //   186: aload           11
        //   188: ldc             "Duplicate parameter name in path and query param: "
        //   190: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   193: pop            
        //   194: aload           11
        //   196: aload           7
        //   198: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   201: pop            
        //   202: ldc             "DeepLinkDelegate"
        //   204: aload           11
        //   206: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   209: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   212: pop            
        //   213: aload           5
        //   215: aload           7
        //   217: aload           12
        //   219: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   222: pop            
        //   223: goto            145
        //   226: aload           5
        //   228: ldc             "deep_link_uri"
        //   230: aload           9
        //   232: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
        //   235: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   238: pop            
        //   239: aload_2        
        //   240: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   243: ifnull          262
        //   246: new             Landroid/os/Bundle;
        //   249: dup            
        //   250: aload_2        
        //   251: invokevirtual   android/content/Intent.getExtras:()Landroid/os/Bundle;
        //   254: invokespecial   android/os/Bundle.<init>:(Landroid/os/Bundle;)V
        //   257: astore          6
        //   259: goto            271
        //   262: new             Landroid/os/Bundle;
        //   265: dup            
        //   266: invokespecial   android/os/Bundle.<init>:()V
        //   269: astore          6
        //   271: aload           5
        //   273: invokevirtual   java/util/HashMap.entrySet:()Ljava/util/Set;
        //   276: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   281: astore          7
        //   283: aload           7
        //   285: invokeinterface java/util/Iterator.hasNext:()Z
        //   290: ifeq            333
        //   293: aload           7
        //   295: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   300: checkcast       Ljava/util/Map$Entry;
        //   303: astore          5
        //   305: aload           6
        //   307: aload           5
        //   309: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   314: checkcast       Ljava/lang/String;
        //   317: aload           5
        //   319: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   324: checkcast       Ljava/lang/String;
        //   327: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   330: goto            283
        //   333: aload_3        
        //   334: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //   337: astore          12
        //   339: aload           12
        //   341: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getActivityClass:()Ljava/lang/Class;
        //   344: astore          11
        //   346: aload           12
        //   348: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   351: ifnonnull       370
        //   354: new             Landroid/content/Intent;
        //   357: astore          5
        //   359: aload           5
        //   361: aload_1        
        //   362: aload           11
        //   364: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //   367: goto            935
        //   370: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //   373: astore          10
        //   375: new             Ljava/lang/StringBuilder;
        //   378: astore          4
        //   380: aload           4
        //   382: invokespecial   java/lang/StringBuilder.<init>:()V
        //   385: aload           4
        //   387: ldc             "Could not deep link to method: "
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   392: pop            
        //   393: aload           4
        //   395: aload           12
        //   397: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   400: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   403: pop            
        //   404: aload           4
        //   406: ldc_w           " intents length == 0"
        //   409: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   412: pop            
        //   413: aload           4
        //   415: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   418: astore          5
        //   420: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   423: astore          4
        //   425: aload           4
        //   427: aconst_null    
        //   428: aconst_null    
        //   429: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //   432: aload           10
        //   434: iconst_0       
        //   435: aload           8
        //   437: aload           5
        //   439: aload_3        
        //   440: aload           4
        //   442: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //   445: aload           12
        //   447: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   450: astore          4
        //   452: aload           11
        //   454: aload           4
        //   456: iconst_1       
        //   457: anewarray       Ljava/lang/Class;
        //   460: dup            
        //   461: iconst_0       
        //   462: ldc_w           Landroid/content/Context;.class
        //   465: aastore        
        //   466: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   469: astore          4
        //   471: aload           4
        //   473: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   476: ldc_w           Lrcs;.class
        //   479: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   482: ifeq            561
        //   485: aload           4
        //   487: aload           11
        //   489: iconst_1       
        //   490: anewarray       Ljava/lang/Object;
        //   493: dup            
        //   494: iconst_0       
        //   495: aload_1        
        //   496: aastore        
        //   497: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   500: checkcast       Lrcs;
        //   503: astore          4
        //   505: aload           4
        //   507: astore          5
        //   509: aload           4
        //   511: invokevirtual   rcs.l:()I
        //   514: ifne            520
        //   517: aload           10
        //   519: areturn        
        //   520: aload           4
        //   522: astore          5
        //   524: aload           4
        //   526: aload           4
        //   528: invokevirtual   rcs.l:()I
        //   531: iconst_1       
        //   532: isub           
        //   533: invokevirtual   rcs.j:(I)Landroid/content/Intent;
        //   536: astore          7
        //   538: aload           4
        //   540: astore          5
        //   542: aload           7
        //   544: astore          4
        //   546: aload           4
        //   548: astore          7
        //   550: aload           5
        //   552: astore          4
        //   554: aload           7
        //   556: astore          5
        //   558: goto            935
        //   561: aload           4
        //   563: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   566: ldc             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;.class
        //   568: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   571: ifeq            677
        //   574: aload           4
        //   576: aload           11
        //   578: iconst_1       
        //   579: anewarray       Ljava/lang/Object;
        //   582: dup            
        //   583: iconst_0       
        //   584: aload_1        
        //   585: aastore        
        //   586: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   589: checkcast       Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   592: astore          4
        //   594: aload           4
        //   596: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Lrcs;
        //   599: ifnull          649
        //   602: aload           4
        //   604: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Lrcs;
        //   607: astore          7
        //   609: aload           7
        //   611: astore          5
        //   613: aload           7
        //   615: invokevirtual   rcs.l:()I
        //   618: ifne            624
        //   621: aload           10
        //   623: areturn        
        //   624: aload           7
        //   626: astore          5
        //   628: aload           7
        //   630: aload           7
        //   632: invokevirtual   rcs.l:()I
        //   635: iconst_1       
        //   636: isub           
        //   637: invokevirtual   rcs.j:(I)Landroid/content/Intent;
        //   640: astore          4
        //   642: aload           7
        //   644: astore          5
        //   646: goto            546
        //   649: aload           4
        //   651: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   654: ifnull          667
        //   657: aload           4
        //   659: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   662: astore          4
        //   664: goto            670
        //   667: aconst_null    
        //   668: astore          4
        //   670: aload           4
        //   672: astore          5
        //   674: goto            697
        //   677: aload           4
        //   679: aload           11
        //   681: iconst_1       
        //   682: anewarray       Ljava/lang/Object;
        //   685: dup            
        //   686: iconst_0       
        //   687: aload_1        
        //   688: aastore        
        //   689: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   692: checkcast       Landroid/content/Intent;
        //   695: astore          5
        //   697: aconst_null    
        //   698: astore          4
        //   700: goto            935
        //   703: astore          4
        //   705: aconst_null    
        //   706: astore          5
        //   708: aload           11
        //   710: aload           12
        //   712: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //   715: iconst_2       
        //   716: anewarray       Ljava/lang/Class;
        //   719: dup            
        //   720: iconst_0       
        //   721: ldc_w           Landroid/content/Context;.class
        //   724: aastore        
        //   725: dup            
        //   726: iconst_1       
        //   727: ldc             Landroid/os/Bundle;.class
        //   729: aastore        
        //   730: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   733: astore          4
        //   735: aload           4
        //   737: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   740: ldc_w           Lrcs;.class
        //   743: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   746: ifeq            802
        //   749: aload           4
        //   751: aload           11
        //   753: iconst_2       
        //   754: anewarray       Ljava/lang/Object;
        //   757: dup            
        //   758: iconst_0       
        //   759: aload_1        
        //   760: aastore        
        //   761: dup            
        //   762: iconst_1       
        //   763: aload           6
        //   765: aastore        
        //   766: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   769: checkcast       Lrcs;
        //   772: astore          4
        //   774: aload           4
        //   776: invokevirtual   rcs.l:()I
        //   779: ifne            785
        //   782: aload           10
        //   784: areturn        
        //   785: aload           4
        //   787: aload           4
        //   789: invokevirtual   rcs.l:()I
        //   792: iconst_1       
        //   793: isub           
        //   794: invokevirtual   rcs.j:(I)Landroid/content/Intent;
        //   797: astore          5
        //   799: goto            935
        //   802: aload           4
        //   804: invokevirtual   java/lang/reflect/Method.getReturnType:()Ljava/lang/Class;
        //   807: ldc             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;.class
        //   809: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //   812: ifeq            907
        //   815: aload           4
        //   817: aload           11
        //   819: iconst_2       
        //   820: anewarray       Ljava/lang/Object;
        //   823: dup            
        //   824: iconst_0       
        //   825: aload_1        
        //   826: aastore        
        //   827: dup            
        //   828: iconst_1       
        //   829: aload           6
        //   831: aastore        
        //   832: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   835: checkcast       Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   838: astore          4
        //   840: aload           4
        //   842: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Lrcs;
        //   845: ifnull          883
        //   848: aload           4
        //   850: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getTaskStackBuilder:()Lrcs;
        //   853: astore          4
        //   855: aload           4
        //   857: invokevirtual   rcs.l:()I
        //   860: ifne            866
        //   863: aload           10
        //   865: areturn        
        //   866: aload           4
        //   868: aload           4
        //   870: invokevirtual   rcs.l:()I
        //   873: iconst_1       
        //   874: isub           
        //   875: invokevirtual   rcs.j:(I)Landroid/content/Intent;
        //   878: astore          5
        //   880: goto            935
        //   883: aload           4
        //   885: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   888: ifnull          901
        //   891: aload           4
        //   893: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.getIntent:()Landroid/content/Intent;
        //   896: astore          4
        //   898: goto            546
        //   901: aconst_null    
        //   902: astore          4
        //   904: goto            546
        //   907: aload           4
        //   909: aload           11
        //   911: iconst_2       
        //   912: anewarray       Ljava/lang/Object;
        //   915: dup            
        //   916: iconst_0       
        //   917: aload_1        
        //   918: aastore        
        //   919: dup            
        //   920: iconst_1       
        //   921: aload           6
        //   923: aastore        
        //   924: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   927: checkcast       Landroid/content/Intent;
        //   930: astore          4
        //   932: goto            546
        //   935: aload           5
        //   937: ifnonnull       968
        //   940: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //   943: astore_1       
        //   944: aload_1        
        //   945: aload           5
        //   947: aload           4
        //   949: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //   952: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //   955: dup            
        //   956: iconst_0       
        //   957: aload           8
        //   959: ldc_w           "Destination Intent is null!"
        //   962: aload_3        
        //   963: aload_1        
        //   964: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //   967: areturn        
        //   968: aload           5
        //   970: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   973: ifnonnull       986
        //   976: aload           5
        //   978: aload_2        
        //   979: invokevirtual   android/content/Intent.getAction:()Ljava/lang/String;
        //   982: invokevirtual   android/content/Intent.setAction:(Ljava/lang/String;)Landroid/content/Intent;
        //   985: pop            
        //   986: aload           5
        //   988: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //   991: ifnonnull       1004
        //   994: aload           5
        //   996: aload_2        
        //   997: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1000: invokevirtual   android/content/Intent.setData:(Landroid/net/Uri;)Landroid/content/Intent;
        //  1003: pop            
        //  1004: aload           5
        //  1006: aload           6
        //  1008: invokevirtual   android/content/Intent.putExtras:(Landroid/os/Bundle;)Landroid/content/Intent;
        //  1011: pop            
        //  1012: aload           5
        //  1014: ldc_w           "is_deep_link_flag"
        //  1017: iconst_1       
        //  1018: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Z)Landroid/content/Intent;
        //  1021: pop            
        //  1022: aload           5
        //  1024: ldc_w           "android.intent.extra.REFERRER"
        //  1027: aload           9
        //  1029: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  1032: pop            
        //  1033: aload_1        
        //  1034: invokevirtual   android/app/Activity.getCallingActivity:()Landroid/content/ComponentName;
        //  1037: ifnull          1049
        //  1040: aload           5
        //  1042: ldc_w           33554432
        //  1045: invokevirtual   android/content/Intent.setFlags:(I)Landroid/content/Intent;
        //  1048: pop            
        //  1049: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1052: astore_1       
        //  1053: aload_1        
        //  1054: aload           5
        //  1056: aload           4
        //  1058: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //  1061: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1064: dup            
        //  1065: iconst_1       
        //  1066: aload           8
        //  1068: ldc             ""
        //  1070: aload_3        
        //  1071: aload_1        
        //  1072: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1075: astore_1       
        //  1076: aload_1        
        //  1077: areturn        
        //  1078: astore_1       
        //  1079: ldc             "Could not deep link to method: "
        //  1081: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1084: astore_1       
        //  1085: aload_1        
        //  1086: aload_3        
        //  1087: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1090: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1093: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1096: pop            
        //  1097: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1100: dup            
        //  1101: iconst_0       
        //  1102: aload           8
        //  1104: aload_1        
        //  1105: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1108: aload_3        
        //  1109: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1112: dup            
        //  1113: aconst_null    
        //  1114: aconst_null    
        //  1115: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //  1118: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1121: areturn        
        //  1122: astore_1       
        //  1123: ldc             "Could not deep link to method: "
        //  1125: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1128: astore_1       
        //  1129: aload_1        
        //  1130: aload_3        
        //  1131: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1134: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1137: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1140: pop            
        //  1141: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1144: dup            
        //  1145: iconst_0       
        //  1146: aload           8
        //  1148: aload_1        
        //  1149: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1152: aload_3        
        //  1153: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1156: dup            
        //  1157: aconst_null    
        //  1158: aconst_null    
        //  1159: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //  1162: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1165: areturn        
        //  1166: astore_1       
        //  1167: ldc_w           "Deep link to non-existent method: "
        //  1170: invokestatic    fu8.j:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1173: astore_1       
        //  1174: aload_1        
        //  1175: aload_3        
        //  1176: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkMatchResult.getDeeplinkEntry:()Lcom/airbnb/deeplinkdispatch/DeepLinkEntry;
        //  1179: invokevirtual   com/airbnb/deeplinkdispatch/DeepLinkEntry.getMethod:()Ljava/lang/String;
        //  1182: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1185: pop            
        //  1186: new             Lcom/airbnb/deeplinkdispatch/DeepLinkResult;
        //  1189: dup            
        //  1190: iconst_0       
        //  1191: aload           8
        //  1193: aload_1        
        //  1194: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1197: aload_3        
        //  1198: new             Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;
        //  1201: dup            
        //  1202: aconst_null    
        //  1203: aconst_null    
        //  1204: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkMethodResult.<init>:(Landroid/content/Intent;Lrcs;)V
        //  1207: invokespecial   com/airbnb/deeplinkdispatch/DeepLinkResult.<init>:(ZLjava/lang/String;Ljava/lang/String;Lcom/airbnb/deeplinkdispatch/DeepLinkMatchResult;Lcom/airbnb/deeplinkdispatch/DeepLinkMethodResult;)V
        //  1210: areturn        
        //  1211: astore          4
        //  1213: goto            705
        //  1216: astore          4
        //  1218: goto            708
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                         
        //  -----  -----  -----  -----  ---------------------------------------------
        //  333    367    1166   1211   Ljava/lang/NoSuchMethodException;
        //  333    367    1122   1166   Ljava/lang/IllegalAccessException;
        //  333    367    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  370    445    1166   1211   Ljava/lang/NoSuchMethodException;
        //  370    445    1122   1166   Ljava/lang/IllegalAccessException;
        //  370    445    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  445    452    703    705    Ljava/lang/NoSuchMethodException;
        //  445    452    1122   1166   Ljava/lang/IllegalAccessException;
        //  445    452    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  452    505    1211   1216   Ljava/lang/NoSuchMethodException;
        //  452    505    1122   1166   Ljava/lang/IllegalAccessException;
        //  452    505    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  509    517    1216   1221   Ljava/lang/NoSuchMethodException;
        //  509    517    1122   1166   Ljava/lang/IllegalAccessException;
        //  509    517    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  524    538    1216   1221   Ljava/lang/NoSuchMethodException;
        //  524    538    1122   1166   Ljava/lang/IllegalAccessException;
        //  524    538    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  561    609    1211   1216   Ljava/lang/NoSuchMethodException;
        //  561    609    1122   1166   Ljava/lang/IllegalAccessException;
        //  561    609    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  613    621    1216   1221   Ljava/lang/NoSuchMethodException;
        //  613    621    1122   1166   Ljava/lang/IllegalAccessException;
        //  613    621    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  628    642    1216   1221   Ljava/lang/NoSuchMethodException;
        //  628    642    1122   1166   Ljava/lang/IllegalAccessException;
        //  628    642    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  649    664    1211   1216   Ljava/lang/NoSuchMethodException;
        //  649    664    1122   1166   Ljava/lang/IllegalAccessException;
        //  649    664    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  677    697    1211   1216   Ljava/lang/NoSuchMethodException;
        //  677    697    1122   1166   Ljava/lang/IllegalAccessException;
        //  677    697    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  708    782    1166   1211   Ljava/lang/NoSuchMethodException;
        //  708    782    1122   1166   Ljava/lang/IllegalAccessException;
        //  708    782    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  785    799    1166   1211   Ljava/lang/NoSuchMethodException;
        //  785    799    1122   1166   Ljava/lang/IllegalAccessException;
        //  785    799    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  802    863    1166   1211   Ljava/lang/NoSuchMethodException;
        //  802    863    1122   1166   Ljava/lang/IllegalAccessException;
        //  802    863    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  866    880    1166   1211   Ljava/lang/NoSuchMethodException;
        //  866    880    1122   1166   Ljava/lang/IllegalAccessException;
        //  866    880    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  883    898    1166   1211   Ljava/lang/NoSuchMethodException;
        //  883    898    1122   1166   Ljava/lang/IllegalAccessException;
        //  883    898    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  907    932    1166   1211   Ljava/lang/NoSuchMethodException;
        //  907    932    1122   1166   Ljava/lang/IllegalAccessException;
        //  907    932    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  940    968    1166   1211   Ljava/lang/NoSuchMethodException;
        //  940    968    1122   1166   Ljava/lang/IllegalAccessException;
        //  940    968    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  968    986    1166   1211   Ljava/lang/NoSuchMethodException;
        //  968    986    1122   1166   Ljava/lang/IllegalAccessException;
        //  968    986    1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  986    1004   1166   1211   Ljava/lang/NoSuchMethodException;
        //  986    1004   1122   1166   Ljava/lang/IllegalAccessException;
        //  986    1004   1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  1004   1049   1166   1211   Ljava/lang/NoSuchMethodException;
        //  1004   1049   1122   1166   Ljava/lang/IllegalAccessException;
        //  1004   1049   1078   1122   Ljava/lang/reflect/InvocationTargetException;
        //  1049   1076   1166   1211   Ljava/lang/NoSuchMethodException;
        //  1049   1076   1122   1166   Ljava/lang/IllegalAccessException;
        //  1049   1076   1078   1122   Ljava/lang/reflect/InvocationTargetException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 579, Size: 579
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
    
    public DeepLinkResult dispatchFrom(final Activity activity) {
        this.validateInput(activity);
        return this.dispatchFrom(activity, activity.getIntent());
    }
    
    public DeepLinkResult dispatchFrom(final Activity activity, final Intent intent) {
        this.validateInput(activity, intent);
        final Uri data = intent.getData();
        String uriTemplate = null;
        DeepLinkResult deepLinkResult;
        if (data == null) {
            deepLinkResult = this.createResult(activity, intent, null);
        }
        else {
            deepLinkResult = this.createResult(activity, intent, this.findEntry(data.toString()));
        }
        if (deepLinkResult.getMethodResult().getTaskStackBuilder() != null) {
            deepLinkResult.getMethodResult().getTaskStackBuilder().n();
        }
        else if (deepLinkResult.getMethodResult().getIntent() != null) {
            activity.startActivity(deepLinkResult.getMethodResult().getIntent());
        }
        final boolean successful = deepLinkResult.isSuccessful();
        if (deepLinkResult.getDeepLinkEntry() != null) {
            uriTemplate = deepLinkResult.getDeepLinkEntry().getDeeplinkEntry().getUriTemplate();
        }
        notifyListener((Context)activity, successful ^ true, data, uriTemplate, deepLinkResult.getError());
        return deepLinkResult;
    }
    
    public DeepLinkMatchResult findEntry(final String s) {
        final ArrayList list = new ArrayList();
        final DeepLinkUri parse = DeepLinkUri.parse(s);
        final Iterator<? extends BaseRegistry> iterator = this.registries.iterator();
        while (iterator.hasNext()) {
            final DeepLinkMatchResult idxMatch = ((BaseRegistry)iterator.next()).idxMatch(parse, this.configurablePathSegmentReplacements);
            if (idxMatch != null) {
                list.add(idxMatch);
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (DeepLinkMatchResult)list.get(0);
        }
        Collections.sort((List<Comparable>)list);
        if (((DeepLinkMatchResult)list.get(0)).compareTo((DeepLinkMatchResult)list.get(1)) == 0) {
            final ErrorHandler errorHandler = this.errorHandler;
            if (errorHandler != null) {
                errorHandler.duplicateMatch(s, (List)list.subList(0, 2));
            }
            final StringBuilder j = fu8.j("More than one match with the same concreteness!! (");
            j.append(list.get(0).toString());
            j.append(") vs. (");
            j.append(list.get(1).toString());
            j.append(")");
            Log.w("DeepLinkDelegate", j.toString());
        }
        return (DeepLinkMatchResult)list.get(0);
    }
    
    public List<DeepLinkEntry> getAllDeepLinkEntries() {
        final ArrayList list = new ArrayList();
        final Iterator<? extends BaseRegistry> iterator = this.registries.iterator();
        while (iterator.hasNext()) {
            list.addAll(((BaseRegistry)iterator.next()).getAllEntries());
        }
        return list;
    }
    
    public List<? extends BaseRegistry> getRegistries() {
        return this.registries;
    }
    
    public boolean supportsUri(final String s) {
        new ArrayList();
        final DeepLinkUri parse = DeepLinkUri.parse(s);
        final Iterator<? extends BaseRegistry> iterator = this.registries.iterator();
        while (iterator.hasNext()) {
            if (((BaseRegistry)iterator.next()).supports(parse, this.configurablePathSegmentReplacements)) {
                return true;
            }
        }
        return false;
    }
}
