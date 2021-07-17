package it.univaq.disim.housebuilder.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import it.univaq.disim.housebuilder.xtext.services.HouseBuilderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHouseBuilderParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'THERMOSTAT'", "'APPLIANCE'", "'SOCKET'", "'ROLLER_SHUTTERS'", "'GATE'", "'IDRAULIC'", "'PNEUMATIC'", "'ELECTRICAL'", "'THERMAL'", "'MECHANICAL'", "'TEMPERATURE'", "'PRESSURE'", "'PROXIMITY'", "'ACCELEROMETER'", "'GAS'", "'SMOKE'", "'VIDEO_SURVAILLANCE_CAMERA'", "'SIMPLE'", "'BATHROOM'", "'LIVING_ROOM'", "'BEDROOM'", "'HALLWAY'", "'STUDY'", "'ENTRANCE'", "'STORAGE_ROOM'", "'GARAGE'", "'LAUNDRY_ROOM'", "'HOBBY_ROOM'", "'CELLAR'", "'LUNCHROOM'", "'RUMPUS_ROOM'", "'STAIRS'", "'KITCHEN'", "'BALCONY'", "'GARDEN'", "'TERRACE'", "'ASPALTH'", "'TERRAIN'", "'PAVING'", "'DOOR_WINDOW'", "'PANIC_DOOR'", "'ENTRANCE_DOOR'", "'SLIDING_DOOR'", "'EMPTY'", "'House'", "'{'", "'floors'", "'}'", "'entrances'", "'state'", "'province'", "'city'", "'postalCode'", "'address'", "'buildingDate'", "','", "'passages'", "'controllers'", "'Floor'", "'level'", "'spaces'", "'Passage'", "'spaceA'", "'spaceB'", "'doorType'", "'doorsNumber'", "'WxH:'", "'x'", "'devices'", "'Controller'", "'actuators'", "'sensors'", "'model'", "'os'", "'osVersion'", "'Entrance'", "'space'", "'-'", "'.'", "'Device'", "'type'", "'Sensor'", "'value'", "'Room'", "'LxHxW:'", "'roomType'", "'windows'", "'ExternalSpace'", "'length'", "'width'", "'ground'", "'Actuator'", "'device'", "'Window'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalHouseBuilderParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalHouseBuilderParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalHouseBuilderParser.tokenNames; }
    public String getGrammarFileName() { return "InternalHouseBuilder.g"; }


    	private HouseBuilderGrammarAccess grammarAccess;

    	public void setGrammarAccess(HouseBuilderGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleHouse"
    // InternalHouseBuilder.g:53:1: entryRuleHouse : ruleHouse EOF ;
    public final void entryRuleHouse() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:54:1: ( ruleHouse EOF )
            // InternalHouseBuilder.g:55:1: ruleHouse EOF
            {
             before(grammarAccess.getHouseRule()); 
            pushFollow(FOLLOW_1);
            ruleHouse();

            state._fsp--;

             after(grammarAccess.getHouseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHouse"


    // $ANTLR start "ruleHouse"
    // InternalHouseBuilder.g:62:1: ruleHouse : ( ( rule__House__Group__0 ) ) ;
    public final void ruleHouse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:66:2: ( ( ( rule__House__Group__0 ) ) )
            // InternalHouseBuilder.g:67:2: ( ( rule__House__Group__0 ) )
            {
            // InternalHouseBuilder.g:67:2: ( ( rule__House__Group__0 ) )
            // InternalHouseBuilder.g:68:3: ( rule__House__Group__0 )
            {
             before(grammarAccess.getHouseAccess().getGroup()); 
            // InternalHouseBuilder.g:69:3: ( rule__House__Group__0 )
            // InternalHouseBuilder.g:69:4: rule__House__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__House__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHouse"


    // $ANTLR start "entryRuleSpace"
    // InternalHouseBuilder.g:78:1: entryRuleSpace : ruleSpace EOF ;
    public final void entryRuleSpace() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:79:1: ( ruleSpace EOF )
            // InternalHouseBuilder.g:80:1: ruleSpace EOF
            {
             before(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalHouseBuilder.g:87:1: ruleSpace : ( ( rule__Space__Alternatives ) ) ;
    public final void ruleSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:91:2: ( ( ( rule__Space__Alternatives ) ) )
            // InternalHouseBuilder.g:92:2: ( ( rule__Space__Alternatives ) )
            {
            // InternalHouseBuilder.g:92:2: ( ( rule__Space__Alternatives ) )
            // InternalHouseBuilder.g:93:3: ( rule__Space__Alternatives )
            {
             before(grammarAccess.getSpaceAccess().getAlternatives()); 
            // InternalHouseBuilder.g:94:3: ( rule__Space__Alternatives )
            // InternalHouseBuilder.g:94:4: rule__Space__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Space__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpaceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEString"
    // InternalHouseBuilder.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:104:1: ( ruleEString EOF )
            // InternalHouseBuilder.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalHouseBuilder.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalHouseBuilder.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalHouseBuilder.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalHouseBuilder.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalHouseBuilder.g:119:3: ( rule__EString__Alternatives )
            // InternalHouseBuilder.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalHouseBuilder.g:128:1: entryRuleEDate : ruleEDate EOF ;
    public final void entryRuleEDate() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:129:1: ( ruleEDate EOF )
            // InternalHouseBuilder.g:130:1: ruleEDate EOF
            {
             before(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getEDateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalHouseBuilder.g:137:1: ruleEDate : ( RULE_STRING ) ;
    public final void ruleEDate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:141:2: ( ( RULE_STRING ) )
            // InternalHouseBuilder.g:142:2: ( RULE_STRING )
            {
            // InternalHouseBuilder.g:142:2: ( RULE_STRING )
            // InternalHouseBuilder.g:143:3: RULE_STRING
            {
             before(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleFloor"
    // InternalHouseBuilder.g:153:1: entryRuleFloor : ruleFloor EOF ;
    public final void entryRuleFloor() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:154:1: ( ruleFloor EOF )
            // InternalHouseBuilder.g:155:1: ruleFloor EOF
            {
             before(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getFloorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHouseBuilder.g:162:1: ruleFloor : ( ( rule__Floor__Group__0 ) ) ;
    public final void ruleFloor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:166:2: ( ( ( rule__Floor__Group__0 ) ) )
            // InternalHouseBuilder.g:167:2: ( ( rule__Floor__Group__0 ) )
            {
            // InternalHouseBuilder.g:167:2: ( ( rule__Floor__Group__0 ) )
            // InternalHouseBuilder.g:168:3: ( rule__Floor__Group__0 )
            {
             before(grammarAccess.getFloorAccess().getGroup()); 
            // InternalHouseBuilder.g:169:3: ( rule__Floor__Group__0 )
            // InternalHouseBuilder.g:169:4: rule__Floor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRulePassage"
    // InternalHouseBuilder.g:178:1: entryRulePassage : rulePassage EOF ;
    public final void entryRulePassage() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:179:1: ( rulePassage EOF )
            // InternalHouseBuilder.g:180:1: rulePassage EOF
            {
             before(grammarAccess.getPassageRule()); 
            pushFollow(FOLLOW_1);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getPassageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePassage"


    // $ANTLR start "rulePassage"
    // InternalHouseBuilder.g:187:1: rulePassage : ( ( rule__Passage__Group__0 ) ) ;
    public final void rulePassage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:191:2: ( ( ( rule__Passage__Group__0 ) ) )
            // InternalHouseBuilder.g:192:2: ( ( rule__Passage__Group__0 ) )
            {
            // InternalHouseBuilder.g:192:2: ( ( rule__Passage__Group__0 ) )
            // InternalHouseBuilder.g:193:3: ( rule__Passage__Group__0 )
            {
             before(grammarAccess.getPassageAccess().getGroup()); 
            // InternalHouseBuilder.g:194:3: ( rule__Passage__Group__0 )
            // InternalHouseBuilder.g:194:4: rule__Passage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePassage"


    // $ANTLR start "entryRuleController"
    // InternalHouseBuilder.g:203:1: entryRuleController : ruleController EOF ;
    public final void entryRuleController() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:204:1: ( ruleController EOF )
            // InternalHouseBuilder.g:205:1: ruleController EOF
            {
             before(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            ruleController();

            state._fsp--;

             after(grammarAccess.getControllerRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalHouseBuilder.g:212:1: ruleController : ( ( rule__Controller__Group__0 ) ) ;
    public final void ruleController() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:216:2: ( ( ( rule__Controller__Group__0 ) ) )
            // InternalHouseBuilder.g:217:2: ( ( rule__Controller__Group__0 ) )
            {
            // InternalHouseBuilder.g:217:2: ( ( rule__Controller__Group__0 ) )
            // InternalHouseBuilder.g:218:3: ( rule__Controller__Group__0 )
            {
             before(grammarAccess.getControllerAccess().getGroup()); 
            // InternalHouseBuilder.g:219:3: ( rule__Controller__Group__0 )
            // InternalHouseBuilder.g:219:4: rule__Controller__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEntrance"
    // InternalHouseBuilder.g:228:1: entryRuleEntrance : ruleEntrance EOF ;
    public final void entryRuleEntrance() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:229:1: ( ruleEntrance EOF )
            // InternalHouseBuilder.g:230:1: ruleEntrance EOF
            {
             before(grammarAccess.getEntranceRule()); 
            pushFollow(FOLLOW_1);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getEntranceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntrance"


    // $ANTLR start "ruleEntrance"
    // InternalHouseBuilder.g:237:1: ruleEntrance : ( ( rule__Entrance__Group__0 ) ) ;
    public final void ruleEntrance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:241:2: ( ( ( rule__Entrance__Group__0 ) ) )
            // InternalHouseBuilder.g:242:2: ( ( rule__Entrance__Group__0 ) )
            {
            // InternalHouseBuilder.g:242:2: ( ( rule__Entrance__Group__0 ) )
            // InternalHouseBuilder.g:243:3: ( rule__Entrance__Group__0 )
            {
             before(grammarAccess.getEntranceAccess().getGroup()); 
            // InternalHouseBuilder.g:244:3: ( rule__Entrance__Group__0 )
            // InternalHouseBuilder.g:244:4: rule__Entrance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntrance"


    // $ANTLR start "entryRuleEInt"
    // InternalHouseBuilder.g:253:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:254:1: ( ruleEInt EOF )
            // InternalHouseBuilder.g:255:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalHouseBuilder.g:262:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:266:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalHouseBuilder.g:267:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalHouseBuilder.g:267:2: ( ( rule__EInt__Group__0 ) )
            // InternalHouseBuilder.g:268:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalHouseBuilder.g:269:3: ( rule__EInt__Group__0 )
            // InternalHouseBuilder.g:269:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalHouseBuilder.g:278:1: entryRuleEFloat : ruleEFloat EOF ;
    public final void entryRuleEFloat() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:279:1: ( ruleEFloat EOF )
            // InternalHouseBuilder.g:280:1: ruleEFloat EOF
            {
             before(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEFloatRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalHouseBuilder.g:287:1: ruleEFloat : ( ( rule__EFloat__Group__0 ) ) ;
    public final void ruleEFloat() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:291:2: ( ( ( rule__EFloat__Group__0 ) ) )
            // InternalHouseBuilder.g:292:2: ( ( rule__EFloat__Group__0 ) )
            {
            // InternalHouseBuilder.g:292:2: ( ( rule__EFloat__Group__0 ) )
            // InternalHouseBuilder.g:293:3: ( rule__EFloat__Group__0 )
            {
             before(grammarAccess.getEFloatAccess().getGroup()); 
            // InternalHouseBuilder.g:294:3: ( rule__EFloat__Group__0 )
            // InternalHouseBuilder.g:294:4: rule__EFloat__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleDevice"
    // InternalHouseBuilder.g:303:1: entryRuleDevice : ruleDevice EOF ;
    public final void entryRuleDevice() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:304:1: ( ruleDevice EOF )
            // InternalHouseBuilder.g:305:1: ruleDevice EOF
            {
             before(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getDeviceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHouseBuilder.g:312:1: ruleDevice : ( ( rule__Device__Group__0 ) ) ;
    public final void ruleDevice() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:316:2: ( ( ( rule__Device__Group__0 ) ) )
            // InternalHouseBuilder.g:317:2: ( ( rule__Device__Group__0 ) )
            {
            // InternalHouseBuilder.g:317:2: ( ( rule__Device__Group__0 ) )
            // InternalHouseBuilder.g:318:3: ( rule__Device__Group__0 )
            {
             before(grammarAccess.getDeviceAccess().getGroup()); 
            // InternalHouseBuilder.g:319:3: ( rule__Device__Group__0 )
            // InternalHouseBuilder.g:319:4: rule__Device__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleSensor"
    // InternalHouseBuilder.g:328:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:329:1: ( ruleSensor EOF )
            // InternalHouseBuilder.g:330:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHouseBuilder.g:337:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:341:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalHouseBuilder.g:342:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalHouseBuilder.g:342:2: ( ( rule__Sensor__Group__0 ) )
            // InternalHouseBuilder.g:343:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalHouseBuilder.g:344:3: ( rule__Sensor__Group__0 )
            // InternalHouseBuilder.g:344:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRoom"
    // InternalHouseBuilder.g:353:1: entryRuleRoom : ruleRoom EOF ;
    public final void entryRuleRoom() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:354:1: ( ruleRoom EOF )
            // InternalHouseBuilder.g:355:1: ruleRoom EOF
            {
             before(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            ruleRoom();

            state._fsp--;

             after(grammarAccess.getRoomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHouseBuilder.g:362:1: ruleRoom : ( ( rule__Room__Group__0 ) ) ;
    public final void ruleRoom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:366:2: ( ( ( rule__Room__Group__0 ) ) )
            // InternalHouseBuilder.g:367:2: ( ( rule__Room__Group__0 ) )
            {
            // InternalHouseBuilder.g:367:2: ( ( rule__Room__Group__0 ) )
            // InternalHouseBuilder.g:368:3: ( rule__Room__Group__0 )
            {
             before(grammarAccess.getRoomAccess().getGroup()); 
            // InternalHouseBuilder.g:369:3: ( rule__Room__Group__0 )
            // InternalHouseBuilder.g:369:4: rule__Room__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleExternalSpace"
    // InternalHouseBuilder.g:378:1: entryRuleExternalSpace : ruleExternalSpace EOF ;
    public final void entryRuleExternalSpace() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:379:1: ( ruleExternalSpace EOF )
            // InternalHouseBuilder.g:380:1: ruleExternalSpace EOF
            {
             before(grammarAccess.getExternalSpaceRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalSpace();

            state._fsp--;

             after(grammarAccess.getExternalSpaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalSpace"


    // $ANTLR start "ruleExternalSpace"
    // InternalHouseBuilder.g:387:1: ruleExternalSpace : ( ( rule__ExternalSpace__Group__0 ) ) ;
    public final void ruleExternalSpace() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:391:2: ( ( ( rule__ExternalSpace__Group__0 ) ) )
            // InternalHouseBuilder.g:392:2: ( ( rule__ExternalSpace__Group__0 ) )
            {
            // InternalHouseBuilder.g:392:2: ( ( rule__ExternalSpace__Group__0 ) )
            // InternalHouseBuilder.g:393:3: ( rule__ExternalSpace__Group__0 )
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup()); 
            // InternalHouseBuilder.g:394:3: ( rule__ExternalSpace__Group__0 )
            // InternalHouseBuilder.g:394:4: rule__ExternalSpace__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalSpace"


    // $ANTLR start "entryRuleActuator"
    // InternalHouseBuilder.g:403:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:404:1: ( ruleActuator EOF )
            // InternalHouseBuilder.g:405:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHouseBuilder.g:412:1: ruleActuator : ( ( rule__Actuator__Group__0 ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:416:2: ( ( ( rule__Actuator__Group__0 ) ) )
            // InternalHouseBuilder.g:417:2: ( ( rule__Actuator__Group__0 ) )
            {
            // InternalHouseBuilder.g:417:2: ( ( rule__Actuator__Group__0 ) )
            // InternalHouseBuilder.g:418:3: ( rule__Actuator__Group__0 )
            {
             before(grammarAccess.getActuatorAccess().getGroup()); 
            // InternalHouseBuilder.g:419:3: ( rule__Actuator__Group__0 )
            // InternalHouseBuilder.g:419:4: rule__Actuator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleWindow"
    // InternalHouseBuilder.g:428:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // InternalHouseBuilder.g:429:1: ( ruleWindow EOF )
            // InternalHouseBuilder.g:430:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalHouseBuilder.g:437:1: ruleWindow : ( ( rule__Window__Group__0 ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:441:2: ( ( ( rule__Window__Group__0 ) ) )
            // InternalHouseBuilder.g:442:2: ( ( rule__Window__Group__0 ) )
            {
            // InternalHouseBuilder.g:442:2: ( ( rule__Window__Group__0 ) )
            // InternalHouseBuilder.g:443:3: ( rule__Window__Group__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup()); 
            // InternalHouseBuilder.g:444:3: ( rule__Window__Group__0 )
            // InternalHouseBuilder.g:444:4: rule__Window__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "ruleDeviceType"
    // InternalHouseBuilder.g:453:1: ruleDeviceType : ( ( rule__DeviceType__Alternatives ) ) ;
    public final void ruleDeviceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:457:1: ( ( ( rule__DeviceType__Alternatives ) ) )
            // InternalHouseBuilder.g:458:2: ( ( rule__DeviceType__Alternatives ) )
            {
            // InternalHouseBuilder.g:458:2: ( ( rule__DeviceType__Alternatives ) )
            // InternalHouseBuilder.g:459:3: ( rule__DeviceType__Alternatives )
            {
             before(grammarAccess.getDeviceTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:460:3: ( rule__DeviceType__Alternatives )
            // InternalHouseBuilder.g:460:4: rule__DeviceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DeviceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeviceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "ruleActuatorType"
    // InternalHouseBuilder.g:469:1: ruleActuatorType : ( ( rule__ActuatorType__Alternatives ) ) ;
    public final void ruleActuatorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:473:1: ( ( ( rule__ActuatorType__Alternatives ) ) )
            // InternalHouseBuilder.g:474:2: ( ( rule__ActuatorType__Alternatives ) )
            {
            // InternalHouseBuilder.g:474:2: ( ( rule__ActuatorType__Alternatives ) )
            // InternalHouseBuilder.g:475:3: ( rule__ActuatorType__Alternatives )
            {
             before(grammarAccess.getActuatorTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:476:3: ( rule__ActuatorType__Alternatives )
            // InternalHouseBuilder.g:476:4: rule__ActuatorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActuatorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActuatorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuatorType"


    // $ANTLR start "ruleSensorType"
    // InternalHouseBuilder.g:485:1: ruleSensorType : ( ( rule__SensorType__Alternatives ) ) ;
    public final void ruleSensorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:489:1: ( ( ( rule__SensorType__Alternatives ) ) )
            // InternalHouseBuilder.g:490:2: ( ( rule__SensorType__Alternatives ) )
            {
            // InternalHouseBuilder.g:490:2: ( ( rule__SensorType__Alternatives ) )
            // InternalHouseBuilder.g:491:3: ( rule__SensorType__Alternatives )
            {
             before(grammarAccess.getSensorTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:492:3: ( rule__SensorType__Alternatives )
            // InternalHouseBuilder.g:492:4: rule__SensorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SensorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleRoomType"
    // InternalHouseBuilder.g:501:1: ruleRoomType : ( ( rule__RoomType__Alternatives ) ) ;
    public final void ruleRoomType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:505:1: ( ( ( rule__RoomType__Alternatives ) ) )
            // InternalHouseBuilder.g:506:2: ( ( rule__RoomType__Alternatives ) )
            {
            // InternalHouseBuilder.g:506:2: ( ( rule__RoomType__Alternatives ) )
            // InternalHouseBuilder.g:507:3: ( rule__RoomType__Alternatives )
            {
             before(grammarAccess.getRoomTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:508:3: ( rule__RoomType__Alternatives )
            // InternalHouseBuilder.g:508:4: rule__RoomType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoomType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoomTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoomType"


    // $ANTLR start "ruleExternalSpaceType"
    // InternalHouseBuilder.g:517:1: ruleExternalSpaceType : ( ( rule__ExternalSpaceType__Alternatives ) ) ;
    public final void ruleExternalSpaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:521:1: ( ( ( rule__ExternalSpaceType__Alternatives ) ) )
            // InternalHouseBuilder.g:522:2: ( ( rule__ExternalSpaceType__Alternatives ) )
            {
            // InternalHouseBuilder.g:522:2: ( ( rule__ExternalSpaceType__Alternatives ) )
            // InternalHouseBuilder.g:523:3: ( rule__ExternalSpaceType__Alternatives )
            {
             before(grammarAccess.getExternalSpaceTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:524:3: ( rule__ExternalSpaceType__Alternatives )
            // InternalHouseBuilder.g:524:4: rule__ExternalSpaceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalSpaceType"


    // $ANTLR start "ruleGroundType"
    // InternalHouseBuilder.g:533:1: ruleGroundType : ( ( rule__GroundType__Alternatives ) ) ;
    public final void ruleGroundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:537:1: ( ( ( rule__GroundType__Alternatives ) ) )
            // InternalHouseBuilder.g:538:2: ( ( rule__GroundType__Alternatives ) )
            {
            // InternalHouseBuilder.g:538:2: ( ( rule__GroundType__Alternatives ) )
            // InternalHouseBuilder.g:539:3: ( rule__GroundType__Alternatives )
            {
             before(grammarAccess.getGroundTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:540:3: ( rule__GroundType__Alternatives )
            // InternalHouseBuilder.g:540:4: rule__GroundType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroundType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroundTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGroundType"


    // $ANTLR start "ruleDoorType"
    // InternalHouseBuilder.g:549:1: ruleDoorType : ( ( rule__DoorType__Alternatives ) ) ;
    public final void ruleDoorType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:553:1: ( ( ( rule__DoorType__Alternatives ) ) )
            // InternalHouseBuilder.g:554:2: ( ( rule__DoorType__Alternatives ) )
            {
            // InternalHouseBuilder.g:554:2: ( ( rule__DoorType__Alternatives ) )
            // InternalHouseBuilder.g:555:3: ( rule__DoorType__Alternatives )
            {
             before(grammarAccess.getDoorTypeAccess().getAlternatives()); 
            // InternalHouseBuilder.g:556:3: ( rule__DoorType__Alternatives )
            // InternalHouseBuilder.g:556:4: rule__DoorType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DoorType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDoorTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoorType"


    // $ANTLR start "rule__Space__Alternatives"
    // InternalHouseBuilder.g:564:1: rule__Space__Alternatives : ( ( ruleRoom ) | ( ruleExternalSpace ) );
    public final void rule__Space__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:568:1: ( ( ruleRoom ) | ( ruleExternalSpace ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==96) ) {
                alt1=1;
            }
            else if ( (LA1_0==100) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalHouseBuilder.g:569:2: ( ruleRoom )
                    {
                    // InternalHouseBuilder.g:569:2: ( ruleRoom )
                    // InternalHouseBuilder.g:570:3: ruleRoom
                    {
                     before(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRoom();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:575:2: ( ruleExternalSpace )
                    {
                    // InternalHouseBuilder.g:575:2: ( ruleExternalSpace )
                    // InternalHouseBuilder.g:576:3: ruleExternalSpace
                    {
                     before(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalSpace();

                    state._fsp--;

                     after(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Space__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalHouseBuilder.g:585:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:589:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalHouseBuilder.g:590:2: ( RULE_STRING )
                    {
                    // InternalHouseBuilder.g:590:2: ( RULE_STRING )
                    // InternalHouseBuilder.g:591:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:596:2: ( RULE_ID )
                    {
                    // InternalHouseBuilder.g:596:2: ( RULE_ID )
                    // InternalHouseBuilder.g:597:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EFloat__Alternatives_4_0"
    // InternalHouseBuilder.g:606:1: rule__EFloat__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EFloat__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:610:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalHouseBuilder.g:611:2: ( 'E' )
                    {
                    // InternalHouseBuilder.g:611:2: ( 'E' )
                    // InternalHouseBuilder.g:612:3: 'E'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:617:2: ( 'e' )
                    {
                    // InternalHouseBuilder.g:617:2: ( 'e' )
                    // InternalHouseBuilder.g:618:3: 'e'
                    {
                     before(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Alternatives_4_0"


    // $ANTLR start "rule__DeviceType__Alternatives"
    // InternalHouseBuilder.g:627:1: rule__DeviceType__Alternatives : ( ( ( 'THERMOSTAT' ) ) | ( ( 'APPLIANCE' ) ) | ( ( 'SOCKET' ) ) | ( ( 'ROLLER_SHUTTERS' ) ) | ( ( 'GATE' ) ) );
    public final void rule__DeviceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:631:1: ( ( ( 'THERMOSTAT' ) ) | ( ( 'APPLIANCE' ) ) | ( ( 'SOCKET' ) ) | ( ( 'ROLLER_SHUTTERS' ) ) | ( ( 'GATE' ) ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            case 17:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalHouseBuilder.g:632:2: ( ( 'THERMOSTAT' ) )
                    {
                    // InternalHouseBuilder.g:632:2: ( ( 'THERMOSTAT' ) )
                    // InternalHouseBuilder.g:633:3: ( 'THERMOSTAT' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:634:3: ( 'THERMOSTAT' )
                    // InternalHouseBuilder.g:634:4: 'THERMOSTAT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:638:2: ( ( 'APPLIANCE' ) )
                    {
                    // InternalHouseBuilder.g:638:2: ( ( 'APPLIANCE' ) )
                    // InternalHouseBuilder.g:639:3: ( 'APPLIANCE' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:640:3: ( 'APPLIANCE' )
                    // InternalHouseBuilder.g:640:4: 'APPLIANCE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:644:2: ( ( 'SOCKET' ) )
                    {
                    // InternalHouseBuilder.g:644:2: ( ( 'SOCKET' ) )
                    // InternalHouseBuilder.g:645:3: ( 'SOCKET' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:646:3: ( 'SOCKET' )
                    // InternalHouseBuilder.g:646:4: 'SOCKET'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:650:2: ( ( 'ROLLER_SHUTTERS' ) )
                    {
                    // InternalHouseBuilder.g:650:2: ( ( 'ROLLER_SHUTTERS' ) )
                    // InternalHouseBuilder.g:651:3: ( 'ROLLER_SHUTTERS' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilder.g:652:3: ( 'ROLLER_SHUTTERS' )
                    // InternalHouseBuilder.g:652:4: 'ROLLER_SHUTTERS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:656:2: ( ( 'GATE' ) )
                    {
                    // InternalHouseBuilder.g:656:2: ( ( 'GATE' ) )
                    // InternalHouseBuilder.g:657:3: ( 'GATE' )
                    {
                     before(grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilder.g:658:3: ( 'GATE' )
                    // InternalHouseBuilder.g:658:4: 'GATE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeviceType__Alternatives"


    // $ANTLR start "rule__ActuatorType__Alternatives"
    // InternalHouseBuilder.g:666:1: rule__ActuatorType__Alternatives : ( ( ( 'IDRAULIC' ) ) | ( ( 'PNEUMATIC' ) ) | ( ( 'ELECTRICAL' ) ) | ( ( 'THERMAL' ) ) | ( ( 'MECHANICAL' ) ) );
    public final void rule__ActuatorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:670:1: ( ( ( 'IDRAULIC' ) ) | ( ( 'PNEUMATIC' ) ) | ( ( 'ELECTRICAL' ) ) | ( ( 'THERMAL' ) ) | ( ( 'MECHANICAL' ) ) )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt5=1;
                }
                break;
            case 19:
                {
                alt5=2;
                }
                break;
            case 20:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalHouseBuilder.g:671:2: ( ( 'IDRAULIC' ) )
                    {
                    // InternalHouseBuilder.g:671:2: ( ( 'IDRAULIC' ) )
                    // InternalHouseBuilder.g:672:3: ( 'IDRAULIC' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:673:3: ( 'IDRAULIC' )
                    // InternalHouseBuilder.g:673:4: 'IDRAULIC'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:677:2: ( ( 'PNEUMATIC' ) )
                    {
                    // InternalHouseBuilder.g:677:2: ( ( 'PNEUMATIC' ) )
                    // InternalHouseBuilder.g:678:3: ( 'PNEUMATIC' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:679:3: ( 'PNEUMATIC' )
                    // InternalHouseBuilder.g:679:4: 'PNEUMATIC'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:683:2: ( ( 'ELECTRICAL' ) )
                    {
                    // InternalHouseBuilder.g:683:2: ( ( 'ELECTRICAL' ) )
                    // InternalHouseBuilder.g:684:3: ( 'ELECTRICAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:685:3: ( 'ELECTRICAL' )
                    // InternalHouseBuilder.g:685:4: 'ELECTRICAL'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:689:2: ( ( 'THERMAL' ) )
                    {
                    // InternalHouseBuilder.g:689:2: ( ( 'THERMAL' ) )
                    // InternalHouseBuilder.g:690:3: ( 'THERMAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilder.g:691:3: ( 'THERMAL' )
                    // InternalHouseBuilder.g:691:4: 'THERMAL'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:695:2: ( ( 'MECHANICAL' ) )
                    {
                    // InternalHouseBuilder.g:695:2: ( ( 'MECHANICAL' ) )
                    // InternalHouseBuilder.g:696:3: ( 'MECHANICAL' )
                    {
                     before(grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilder.g:697:3: ( 'MECHANICAL' )
                    // InternalHouseBuilder.g:697:4: 'MECHANICAL'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActuatorType__Alternatives"


    // $ANTLR start "rule__SensorType__Alternatives"
    // InternalHouseBuilder.g:705:1: rule__SensorType__Alternatives : ( ( ( 'TEMPERATURE' ) ) | ( ( 'PRESSURE' ) ) | ( ( 'PROXIMITY' ) ) | ( ( 'ACCELEROMETER' ) ) | ( ( 'GAS' ) ) | ( ( 'SMOKE' ) ) | ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) ) );
    public final void rule__SensorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:709:1: ( ( ( 'TEMPERATURE' ) ) | ( ( 'PRESSURE' ) ) | ( ( 'PROXIMITY' ) ) | ( ( 'ACCELEROMETER' ) ) | ( ( 'GAS' ) ) | ( ( 'SMOKE' ) ) | ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt6=1;
                }
                break;
            case 24:
                {
                alt6=2;
                }
                break;
            case 25:
                {
                alt6=3;
                }
                break;
            case 26:
                {
                alt6=4;
                }
                break;
            case 27:
                {
                alt6=5;
                }
                break;
            case 28:
                {
                alt6=6;
                }
                break;
            case 29:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalHouseBuilder.g:710:2: ( ( 'TEMPERATURE' ) )
                    {
                    // InternalHouseBuilder.g:710:2: ( ( 'TEMPERATURE' ) )
                    // InternalHouseBuilder.g:711:3: ( 'TEMPERATURE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:712:3: ( 'TEMPERATURE' )
                    // InternalHouseBuilder.g:712:4: 'TEMPERATURE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:716:2: ( ( 'PRESSURE' ) )
                    {
                    // InternalHouseBuilder.g:716:2: ( ( 'PRESSURE' ) )
                    // InternalHouseBuilder.g:717:3: ( 'PRESSURE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:718:3: ( 'PRESSURE' )
                    // InternalHouseBuilder.g:718:4: 'PRESSURE'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:722:2: ( ( 'PROXIMITY' ) )
                    {
                    // InternalHouseBuilder.g:722:2: ( ( 'PROXIMITY' ) )
                    // InternalHouseBuilder.g:723:3: ( 'PROXIMITY' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:724:3: ( 'PROXIMITY' )
                    // InternalHouseBuilder.g:724:4: 'PROXIMITY'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:728:2: ( ( 'ACCELEROMETER' ) )
                    {
                    // InternalHouseBuilder.g:728:2: ( ( 'ACCELEROMETER' ) )
                    // InternalHouseBuilder.g:729:3: ( 'ACCELEROMETER' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3()); 
                    // InternalHouseBuilder.g:730:3: ( 'ACCELEROMETER' )
                    // InternalHouseBuilder.g:730:4: 'ACCELEROMETER'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:734:2: ( ( 'GAS' ) )
                    {
                    // InternalHouseBuilder.g:734:2: ( ( 'GAS' ) )
                    // InternalHouseBuilder.g:735:3: ( 'GAS' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilder.g:736:3: ( 'GAS' )
                    // InternalHouseBuilder.g:736:4: 'GAS'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:740:2: ( ( 'SMOKE' ) )
                    {
                    // InternalHouseBuilder.g:740:2: ( ( 'SMOKE' ) )
                    // InternalHouseBuilder.g:741:3: ( 'SMOKE' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilder.g:742:3: ( 'SMOKE' )
                    // InternalHouseBuilder.g:742:4: 'SMOKE'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:746:2: ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) )
                    {
                    // InternalHouseBuilder.g:746:2: ( ( 'VIDEO_SURVAILLANCE_CAMERA' ) )
                    // InternalHouseBuilder.g:747:3: ( 'VIDEO_SURVAILLANCE_CAMERA' )
                    {
                     before(grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilder.g:748:3: ( 'VIDEO_SURVAILLANCE_CAMERA' )
                    // InternalHouseBuilder.g:748:4: 'VIDEO_SURVAILLANCE_CAMERA'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorType__Alternatives"


    // $ANTLR start "rule__RoomType__Alternatives"
    // InternalHouseBuilder.g:756:1: rule__RoomType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'BATHROOM' ) ) | ( ( 'LIVING_ROOM' ) ) | ( ( 'BEDROOM' ) ) | ( ( 'HALLWAY' ) ) | ( ( 'STUDY' ) ) | ( ( 'ENTRANCE' ) ) | ( ( 'STORAGE_ROOM' ) ) | ( ( 'GARAGE' ) ) | ( ( 'LAUNDRY_ROOM' ) ) | ( ( 'HOBBY_ROOM' ) ) | ( ( 'CELLAR' ) ) | ( ( 'LUNCHROOM' ) ) | ( ( 'RUMPUS_ROOM' ) ) | ( ( 'STAIRS' ) ) | ( ( 'KITCHEN' ) ) );
    public final void rule__RoomType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:760:1: ( ( ( 'SIMPLE' ) ) | ( ( 'BATHROOM' ) ) | ( ( 'LIVING_ROOM' ) ) | ( ( 'BEDROOM' ) ) | ( ( 'HALLWAY' ) ) | ( ( 'STUDY' ) ) | ( ( 'ENTRANCE' ) ) | ( ( 'STORAGE_ROOM' ) ) | ( ( 'GARAGE' ) ) | ( ( 'LAUNDRY_ROOM' ) ) | ( ( 'HOBBY_ROOM' ) ) | ( ( 'CELLAR' ) ) | ( ( 'LUNCHROOM' ) ) | ( ( 'RUMPUS_ROOM' ) ) | ( ( 'STAIRS' ) ) | ( ( 'KITCHEN' ) ) )
            int alt7=16;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt7=1;
                }
                break;
            case 31:
                {
                alt7=2;
                }
                break;
            case 32:
                {
                alt7=3;
                }
                break;
            case 33:
                {
                alt7=4;
                }
                break;
            case 34:
                {
                alt7=5;
                }
                break;
            case 35:
                {
                alt7=6;
                }
                break;
            case 36:
                {
                alt7=7;
                }
                break;
            case 37:
                {
                alt7=8;
                }
                break;
            case 38:
                {
                alt7=9;
                }
                break;
            case 39:
                {
                alt7=10;
                }
                break;
            case 40:
                {
                alt7=11;
                }
                break;
            case 41:
                {
                alt7=12;
                }
                break;
            case 42:
                {
                alt7=13;
                }
                break;
            case 43:
                {
                alt7=14;
                }
                break;
            case 44:
                {
                alt7=15;
                }
                break;
            case 45:
                {
                alt7=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalHouseBuilder.g:761:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalHouseBuilder.g:761:2: ( ( 'SIMPLE' ) )
                    // InternalHouseBuilder.g:762:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:763:3: ( 'SIMPLE' )
                    // InternalHouseBuilder.g:763:4: 'SIMPLE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:767:2: ( ( 'BATHROOM' ) )
                    {
                    // InternalHouseBuilder.g:767:2: ( ( 'BATHROOM' ) )
                    // InternalHouseBuilder.g:768:3: ( 'BATHROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:769:3: ( 'BATHROOM' )
                    // InternalHouseBuilder.g:769:4: 'BATHROOM'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:773:2: ( ( 'LIVING_ROOM' ) )
                    {
                    // InternalHouseBuilder.g:773:2: ( ( 'LIVING_ROOM' ) )
                    // InternalHouseBuilder.g:774:3: ( 'LIVING_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:775:3: ( 'LIVING_ROOM' )
                    // InternalHouseBuilder.g:775:4: 'LIVING_ROOM'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:779:2: ( ( 'BEDROOM' ) )
                    {
                    // InternalHouseBuilder.g:779:2: ( ( 'BEDROOM' ) )
                    // InternalHouseBuilder.g:780:3: ( 'BEDROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3()); 
                    // InternalHouseBuilder.g:781:3: ( 'BEDROOM' )
                    // InternalHouseBuilder.g:781:4: 'BEDROOM'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:785:2: ( ( 'HALLWAY' ) )
                    {
                    // InternalHouseBuilder.g:785:2: ( ( 'HALLWAY' ) )
                    // InternalHouseBuilder.g:786:3: ( 'HALLWAY' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4()); 
                    // InternalHouseBuilder.g:787:3: ( 'HALLWAY' )
                    // InternalHouseBuilder.g:787:4: 'HALLWAY'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:791:2: ( ( 'STUDY' ) )
                    {
                    // InternalHouseBuilder.g:791:2: ( ( 'STUDY' ) )
                    // InternalHouseBuilder.g:792:3: ( 'STUDY' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilder.g:793:3: ( 'STUDY' )
                    // InternalHouseBuilder.g:793:4: 'STUDY'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:797:2: ( ( 'ENTRANCE' ) )
                    {
                    // InternalHouseBuilder.g:797:2: ( ( 'ENTRANCE' ) )
                    // InternalHouseBuilder.g:798:3: ( 'ENTRANCE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilder.g:799:3: ( 'ENTRANCE' )
                    // InternalHouseBuilder.g:799:4: 'ENTRANCE'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalHouseBuilder.g:803:2: ( ( 'STORAGE_ROOM' ) )
                    {
                    // InternalHouseBuilder.g:803:2: ( ( 'STORAGE_ROOM' ) )
                    // InternalHouseBuilder.g:804:3: ( 'STORAGE_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7()); 
                    // InternalHouseBuilder.g:805:3: ( 'STORAGE_ROOM' )
                    // InternalHouseBuilder.g:805:4: 'STORAGE_ROOM'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalHouseBuilder.g:809:2: ( ( 'GARAGE' ) )
                    {
                    // InternalHouseBuilder.g:809:2: ( ( 'GARAGE' ) )
                    // InternalHouseBuilder.g:810:3: ( 'GARAGE' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8()); 
                    // InternalHouseBuilder.g:811:3: ( 'GARAGE' )
                    // InternalHouseBuilder.g:811:4: 'GARAGE'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalHouseBuilder.g:815:2: ( ( 'LAUNDRY_ROOM' ) )
                    {
                    // InternalHouseBuilder.g:815:2: ( ( 'LAUNDRY_ROOM' ) )
                    // InternalHouseBuilder.g:816:3: ( 'LAUNDRY_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9()); 
                    // InternalHouseBuilder.g:817:3: ( 'LAUNDRY_ROOM' )
                    // InternalHouseBuilder.g:817:4: 'LAUNDRY_ROOM'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalHouseBuilder.g:821:2: ( ( 'HOBBY_ROOM' ) )
                    {
                    // InternalHouseBuilder.g:821:2: ( ( 'HOBBY_ROOM' ) )
                    // InternalHouseBuilder.g:822:3: ( 'HOBBY_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10()); 
                    // InternalHouseBuilder.g:823:3: ( 'HOBBY_ROOM' )
                    // InternalHouseBuilder.g:823:4: 'HOBBY_ROOM'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalHouseBuilder.g:827:2: ( ( 'CELLAR' ) )
                    {
                    // InternalHouseBuilder.g:827:2: ( ( 'CELLAR' ) )
                    // InternalHouseBuilder.g:828:3: ( 'CELLAR' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11()); 
                    // InternalHouseBuilder.g:829:3: ( 'CELLAR' )
                    // InternalHouseBuilder.g:829:4: 'CELLAR'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalHouseBuilder.g:833:2: ( ( 'LUNCHROOM' ) )
                    {
                    // InternalHouseBuilder.g:833:2: ( ( 'LUNCHROOM' ) )
                    // InternalHouseBuilder.g:834:3: ( 'LUNCHROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12()); 
                    // InternalHouseBuilder.g:835:3: ( 'LUNCHROOM' )
                    // InternalHouseBuilder.g:835:4: 'LUNCHROOM'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalHouseBuilder.g:839:2: ( ( 'RUMPUS_ROOM' ) )
                    {
                    // InternalHouseBuilder.g:839:2: ( ( 'RUMPUS_ROOM' ) )
                    // InternalHouseBuilder.g:840:3: ( 'RUMPUS_ROOM' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13()); 
                    // InternalHouseBuilder.g:841:3: ( 'RUMPUS_ROOM' )
                    // InternalHouseBuilder.g:841:4: 'RUMPUS_ROOM'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalHouseBuilder.g:845:2: ( ( 'STAIRS' ) )
                    {
                    // InternalHouseBuilder.g:845:2: ( ( 'STAIRS' ) )
                    // InternalHouseBuilder.g:846:3: ( 'STAIRS' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14()); 
                    // InternalHouseBuilder.g:847:3: ( 'STAIRS' )
                    // InternalHouseBuilder.g:847:4: 'STAIRS'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // InternalHouseBuilder.g:851:2: ( ( 'KITCHEN' ) )
                    {
                    // InternalHouseBuilder.g:851:2: ( ( 'KITCHEN' ) )
                    // InternalHouseBuilder.g:852:3: ( 'KITCHEN' )
                    {
                     before(grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15()); 
                    // InternalHouseBuilder.g:853:3: ( 'KITCHEN' )
                    // InternalHouseBuilder.g:853:4: 'KITCHEN'
                    {
                    match(input,45,FOLLOW_2); 

                    }

                     after(grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RoomType__Alternatives"


    // $ANTLR start "rule__ExternalSpaceType__Alternatives"
    // InternalHouseBuilder.g:861:1: rule__ExternalSpaceType__Alternatives : ( ( ( 'BALCONY' ) ) | ( ( 'GARDEN' ) ) | ( ( 'TERRACE' ) ) );
    public final void rule__ExternalSpaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:865:1: ( ( ( 'BALCONY' ) ) | ( ( 'GARDEN' ) ) | ( ( 'TERRACE' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt8=1;
                }
                break;
            case 47:
                {
                alt8=2;
                }
                break;
            case 48:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalHouseBuilder.g:866:2: ( ( 'BALCONY' ) )
                    {
                    // InternalHouseBuilder.g:866:2: ( ( 'BALCONY' ) )
                    // InternalHouseBuilder.g:867:3: ( 'BALCONY' )
                    {
                     before(grammarAccess.getExternalSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:868:3: ( 'BALCONY' )
                    // InternalHouseBuilder.g:868:4: 'BALCONY'
                    {
                    match(input,46,FOLLOW_2); 

                    }

                     after(grammarAccess.getExternalSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:872:2: ( ( 'GARDEN' ) )
                    {
                    // InternalHouseBuilder.g:872:2: ( ( 'GARDEN' ) )
                    // InternalHouseBuilder.g:873:3: ( 'GARDEN' )
                    {
                     before(grammarAccess.getExternalSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:874:3: ( 'GARDEN' )
                    // InternalHouseBuilder.g:874:4: 'GARDEN'
                    {
                    match(input,47,FOLLOW_2); 

                    }

                     after(grammarAccess.getExternalSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:878:2: ( ( 'TERRACE' ) )
                    {
                    // InternalHouseBuilder.g:878:2: ( ( 'TERRACE' ) )
                    // InternalHouseBuilder.g:879:3: ( 'TERRACE' )
                    {
                     before(grammarAccess.getExternalSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:880:3: ( 'TERRACE' )
                    // InternalHouseBuilder.g:880:4: 'TERRACE'
                    {
                    match(input,48,FOLLOW_2); 

                    }

                     after(grammarAccess.getExternalSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpaceType__Alternatives"


    // $ANTLR start "rule__GroundType__Alternatives"
    // InternalHouseBuilder.g:888:1: rule__GroundType__Alternatives : ( ( ( 'ASPALTH' ) ) | ( ( 'TERRAIN' ) ) | ( ( 'PAVING' ) ) );
    public final void rule__GroundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:892:1: ( ( ( 'ASPALTH' ) ) | ( ( 'TERRAIN' ) ) | ( ( 'PAVING' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt9=1;
                }
                break;
            case 50:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalHouseBuilder.g:893:2: ( ( 'ASPALTH' ) )
                    {
                    // InternalHouseBuilder.g:893:2: ( ( 'ASPALTH' ) )
                    // InternalHouseBuilder.g:894:3: ( 'ASPALTH' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:895:3: ( 'ASPALTH' )
                    // InternalHouseBuilder.g:895:4: 'ASPALTH'
                    {
                    match(input,49,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:899:2: ( ( 'TERRAIN' ) )
                    {
                    // InternalHouseBuilder.g:899:2: ( ( 'TERRAIN' ) )
                    // InternalHouseBuilder.g:900:3: ( 'TERRAIN' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:901:3: ( 'TERRAIN' )
                    // InternalHouseBuilder.g:901:4: 'TERRAIN'
                    {
                    match(input,50,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:905:2: ( ( 'PAVING' ) )
                    {
                    // InternalHouseBuilder.g:905:2: ( ( 'PAVING' ) )
                    // InternalHouseBuilder.g:906:3: ( 'PAVING' )
                    {
                     before(grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:907:3: ( 'PAVING' )
                    // InternalHouseBuilder.g:907:4: 'PAVING'
                    {
                    match(input,51,FOLLOW_2); 

                    }

                     after(grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GroundType__Alternatives"


    // $ANTLR start "rule__DoorType__Alternatives"
    // InternalHouseBuilder.g:915:1: rule__DoorType__Alternatives : ( ( ( 'SIMPLE' ) ) | ( ( 'DOOR_WINDOW' ) ) | ( ( 'PANIC_DOOR' ) ) | ( ( 'ENTRANCE_DOOR' ) ) | ( ( 'SLIDING_DOOR' ) ) | ( ( 'GATE' ) ) | ( ( 'EMPTY' ) ) );
    public final void rule__DoorType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:919:1: ( ( ( 'SIMPLE' ) ) | ( ( 'DOOR_WINDOW' ) ) | ( ( 'PANIC_DOOR' ) ) | ( ( 'ENTRANCE_DOOR' ) ) | ( ( 'SLIDING_DOOR' ) ) | ( ( 'GATE' ) ) | ( ( 'EMPTY' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 52:
                {
                alt10=2;
                }
                break;
            case 53:
                {
                alt10=3;
                }
                break;
            case 54:
                {
                alt10=4;
                }
                break;
            case 55:
                {
                alt10=5;
                }
                break;
            case 17:
                {
                alt10=6;
                }
                break;
            case 56:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalHouseBuilder.g:920:2: ( ( 'SIMPLE' ) )
                    {
                    // InternalHouseBuilder.g:920:2: ( ( 'SIMPLE' ) )
                    // InternalHouseBuilder.g:921:3: ( 'SIMPLE' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 
                    // InternalHouseBuilder.g:922:3: ( 'SIMPLE' )
                    // InternalHouseBuilder.g:922:4: 'SIMPLE'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:926:2: ( ( 'DOOR_WINDOW' ) )
                    {
                    // InternalHouseBuilder.g:926:2: ( ( 'DOOR_WINDOW' ) )
                    // InternalHouseBuilder.g:927:3: ( 'DOOR_WINDOW' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1()); 
                    // InternalHouseBuilder.g:928:3: ( 'DOOR_WINDOW' )
                    // InternalHouseBuilder.g:928:4: 'DOOR_WINDOW'
                    {
                    match(input,52,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:932:2: ( ( 'PANIC_DOOR' ) )
                    {
                    // InternalHouseBuilder.g:932:2: ( ( 'PANIC_DOOR' ) )
                    // InternalHouseBuilder.g:933:3: ( 'PANIC_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2()); 
                    // InternalHouseBuilder.g:934:3: ( 'PANIC_DOOR' )
                    // InternalHouseBuilder.g:934:4: 'PANIC_DOOR'
                    {
                    match(input,53,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:938:2: ( ( 'ENTRANCE_DOOR' ) )
                    {
                    // InternalHouseBuilder.g:938:2: ( ( 'ENTRANCE_DOOR' ) )
                    // InternalHouseBuilder.g:939:3: ( 'ENTRANCE_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3()); 
                    // InternalHouseBuilder.g:940:3: ( 'ENTRANCE_DOOR' )
                    // InternalHouseBuilder.g:940:4: 'ENTRANCE_DOOR'
                    {
                    match(input,54,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:944:2: ( ( 'SLIDING_DOOR' ) )
                    {
                    // InternalHouseBuilder.g:944:2: ( ( 'SLIDING_DOOR' ) )
                    // InternalHouseBuilder.g:945:3: ( 'SLIDING_DOOR' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4()); 
                    // InternalHouseBuilder.g:946:3: ( 'SLIDING_DOOR' )
                    // InternalHouseBuilder.g:946:4: 'SLIDING_DOOR'
                    {
                    match(input,55,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:950:2: ( ( 'GATE' ) )
                    {
                    // InternalHouseBuilder.g:950:2: ( ( 'GATE' ) )
                    // InternalHouseBuilder.g:951:3: ( 'GATE' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5()); 
                    // InternalHouseBuilder.g:952:3: ( 'GATE' )
                    // InternalHouseBuilder.g:952:4: 'GATE'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:956:2: ( ( 'EMPTY' ) )
                    {
                    // InternalHouseBuilder.g:956:2: ( ( 'EMPTY' ) )
                    // InternalHouseBuilder.g:957:3: ( 'EMPTY' )
                    {
                     before(grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6()); 
                    // InternalHouseBuilder.g:958:3: ( 'EMPTY' )
                    // InternalHouseBuilder.g:958:4: 'EMPTY'
                    {
                    match(input,56,FOLLOW_2); 

                    }

                     after(grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoorType__Alternatives"


    // $ANTLR start "rule__House__Group__0"
    // InternalHouseBuilder.g:966:1: rule__House__Group__0 : rule__House__Group__0__Impl rule__House__Group__1 ;
    public final void rule__House__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:970:1: ( rule__House__Group__0__Impl rule__House__Group__1 )
            // InternalHouseBuilder.g:971:2: rule__House__Group__0__Impl rule__House__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__0"


    // $ANTLR start "rule__House__Group__0__Impl"
    // InternalHouseBuilder.g:978:1: rule__House__Group__0__Impl : ( 'House' ) ;
    public final void rule__House__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:982:1: ( ( 'House' ) )
            // InternalHouseBuilder.g:983:1: ( 'House' )
            {
            // InternalHouseBuilder.g:983:1: ( 'House' )
            // InternalHouseBuilder.g:984:2: 'House'
            {
             before(grammarAccess.getHouseAccess().getHouseKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getHouseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__0__Impl"


    // $ANTLR start "rule__House__Group__1"
    // InternalHouseBuilder.g:993:1: rule__House__Group__1 : rule__House__Group__1__Impl rule__House__Group__2 ;
    public final void rule__House__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:997:1: ( rule__House__Group__1__Impl rule__House__Group__2 )
            // InternalHouseBuilder.g:998:2: rule__House__Group__1__Impl rule__House__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__1"


    // $ANTLR start "rule__House__Group__1__Impl"
    // InternalHouseBuilder.g:1005:1: rule__House__Group__1__Impl : ( ( rule__House__NameAssignment_1 ) ) ;
    public final void rule__House__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1009:1: ( ( ( rule__House__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:1010:1: ( ( rule__House__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:1010:1: ( ( rule__House__NameAssignment_1 ) )
            // InternalHouseBuilder.g:1011:2: ( rule__House__NameAssignment_1 )
            {
             before(grammarAccess.getHouseAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:1012:2: ( rule__House__NameAssignment_1 )
            // InternalHouseBuilder.g:1012:3: rule__House__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__House__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__1__Impl"


    // $ANTLR start "rule__House__Group__2"
    // InternalHouseBuilder.g:1020:1: rule__House__Group__2 : rule__House__Group__2__Impl rule__House__Group__3 ;
    public final void rule__House__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1024:1: ( rule__House__Group__2__Impl rule__House__Group__3 )
            // InternalHouseBuilder.g:1025:2: rule__House__Group__2__Impl rule__House__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__2"


    // $ANTLR start "rule__House__Group__2__Impl"
    // InternalHouseBuilder.g:1032:1: rule__House__Group__2__Impl : ( '{' ) ;
    public final void rule__House__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1036:1: ( ( '{' ) )
            // InternalHouseBuilder.g:1037:1: ( '{' )
            {
            // InternalHouseBuilder.g:1037:1: ( '{' )
            // InternalHouseBuilder.g:1038:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__2__Impl"


    // $ANTLR start "rule__House__Group__3"
    // InternalHouseBuilder.g:1047:1: rule__House__Group__3 : rule__House__Group__3__Impl rule__House__Group__4 ;
    public final void rule__House__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1051:1: ( rule__House__Group__3__Impl rule__House__Group__4 )
            // InternalHouseBuilder.g:1052:2: rule__House__Group__3__Impl rule__House__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__3"


    // $ANTLR start "rule__House__Group__3__Impl"
    // InternalHouseBuilder.g:1059:1: rule__House__Group__3__Impl : ( ( rule__House__Group_3__0 )? ) ;
    public final void rule__House__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1063:1: ( ( ( rule__House__Group_3__0 )? ) )
            // InternalHouseBuilder.g:1064:1: ( ( rule__House__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:1064:1: ( ( rule__House__Group_3__0 )? )
            // InternalHouseBuilder.g:1065:2: ( rule__House__Group_3__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_3()); 
            // InternalHouseBuilder.g:1066:2: ( rule__House__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalHouseBuilder.g:1066:3: rule__House__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__3__Impl"


    // $ANTLR start "rule__House__Group__4"
    // InternalHouseBuilder.g:1074:1: rule__House__Group__4 : rule__House__Group__4__Impl rule__House__Group__5 ;
    public final void rule__House__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1078:1: ( rule__House__Group__4__Impl rule__House__Group__5 )
            // InternalHouseBuilder.g:1079:2: rule__House__Group__4__Impl rule__House__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__4"


    // $ANTLR start "rule__House__Group__4__Impl"
    // InternalHouseBuilder.g:1086:1: rule__House__Group__4__Impl : ( ( rule__House__Group_4__0 )? ) ;
    public final void rule__House__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1090:1: ( ( ( rule__House__Group_4__0 )? ) )
            // InternalHouseBuilder.g:1091:1: ( ( rule__House__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:1091:1: ( ( rule__House__Group_4__0 )? )
            // InternalHouseBuilder.g:1092:2: ( rule__House__Group_4__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_4()); 
            // InternalHouseBuilder.g:1093:2: ( rule__House__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==63) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHouseBuilder.g:1093:3: rule__House__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__4__Impl"


    // $ANTLR start "rule__House__Group__5"
    // InternalHouseBuilder.g:1101:1: rule__House__Group__5 : rule__House__Group__5__Impl rule__House__Group__6 ;
    public final void rule__House__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1105:1: ( rule__House__Group__5__Impl rule__House__Group__6 )
            // InternalHouseBuilder.g:1106:2: rule__House__Group__5__Impl rule__House__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__5"


    // $ANTLR start "rule__House__Group__5__Impl"
    // InternalHouseBuilder.g:1113:1: rule__House__Group__5__Impl : ( ( rule__House__Group_5__0 )? ) ;
    public final void rule__House__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1117:1: ( ( ( rule__House__Group_5__0 )? ) )
            // InternalHouseBuilder.g:1118:1: ( ( rule__House__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:1118:1: ( ( rule__House__Group_5__0 )? )
            // InternalHouseBuilder.g:1119:2: ( rule__House__Group_5__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_5()); 
            // InternalHouseBuilder.g:1120:2: ( rule__House__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==64) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalHouseBuilder.g:1120:3: rule__House__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__5__Impl"


    // $ANTLR start "rule__House__Group__6"
    // InternalHouseBuilder.g:1128:1: rule__House__Group__6 : rule__House__Group__6__Impl rule__House__Group__7 ;
    public final void rule__House__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1132:1: ( rule__House__Group__6__Impl rule__House__Group__7 )
            // InternalHouseBuilder.g:1133:2: rule__House__Group__6__Impl rule__House__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__6"


    // $ANTLR start "rule__House__Group__6__Impl"
    // InternalHouseBuilder.g:1140:1: rule__House__Group__6__Impl : ( ( rule__House__Group_6__0 )? ) ;
    public final void rule__House__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1144:1: ( ( ( rule__House__Group_6__0 )? ) )
            // InternalHouseBuilder.g:1145:1: ( ( rule__House__Group_6__0 )? )
            {
            // InternalHouseBuilder.g:1145:1: ( ( rule__House__Group_6__0 )? )
            // InternalHouseBuilder.g:1146:2: ( rule__House__Group_6__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_6()); 
            // InternalHouseBuilder.g:1147:2: ( rule__House__Group_6__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==65) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalHouseBuilder.g:1147:3: rule__House__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__6__Impl"


    // $ANTLR start "rule__House__Group__7"
    // InternalHouseBuilder.g:1155:1: rule__House__Group__7 : rule__House__Group__7__Impl rule__House__Group__8 ;
    public final void rule__House__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1159:1: ( rule__House__Group__7__Impl rule__House__Group__8 )
            // InternalHouseBuilder.g:1160:2: rule__House__Group__7__Impl rule__House__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__7"


    // $ANTLR start "rule__House__Group__7__Impl"
    // InternalHouseBuilder.g:1167:1: rule__House__Group__7__Impl : ( ( rule__House__Group_7__0 )? ) ;
    public final void rule__House__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1171:1: ( ( ( rule__House__Group_7__0 )? ) )
            // InternalHouseBuilder.g:1172:1: ( ( rule__House__Group_7__0 )? )
            {
            // InternalHouseBuilder.g:1172:1: ( ( rule__House__Group_7__0 )? )
            // InternalHouseBuilder.g:1173:2: ( rule__House__Group_7__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_7()); 
            // InternalHouseBuilder.g:1174:2: ( rule__House__Group_7__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==66) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalHouseBuilder.g:1174:3: rule__House__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__7__Impl"


    // $ANTLR start "rule__House__Group__8"
    // InternalHouseBuilder.g:1182:1: rule__House__Group__8 : rule__House__Group__8__Impl rule__House__Group__9 ;
    public final void rule__House__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1186:1: ( rule__House__Group__8__Impl rule__House__Group__9 )
            // InternalHouseBuilder.g:1187:2: rule__House__Group__8__Impl rule__House__Group__9
            {
            pushFollow(FOLLOW_5);
            rule__House__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__8"


    // $ANTLR start "rule__House__Group__8__Impl"
    // InternalHouseBuilder.g:1194:1: rule__House__Group__8__Impl : ( ( rule__House__Group_8__0 )? ) ;
    public final void rule__House__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1198:1: ( ( ( rule__House__Group_8__0 )? ) )
            // InternalHouseBuilder.g:1199:1: ( ( rule__House__Group_8__0 )? )
            {
            // InternalHouseBuilder.g:1199:1: ( ( rule__House__Group_8__0 )? )
            // InternalHouseBuilder.g:1200:2: ( rule__House__Group_8__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_8()); 
            // InternalHouseBuilder.g:1201:2: ( rule__House__Group_8__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==67) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHouseBuilder.g:1201:3: rule__House__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__8__Impl"


    // $ANTLR start "rule__House__Group__9"
    // InternalHouseBuilder.g:1209:1: rule__House__Group__9 : rule__House__Group__9__Impl rule__House__Group__10 ;
    public final void rule__House__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1213:1: ( rule__House__Group__9__Impl rule__House__Group__10 )
            // InternalHouseBuilder.g:1214:2: rule__House__Group__9__Impl rule__House__Group__10
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__9"


    // $ANTLR start "rule__House__Group__9__Impl"
    // InternalHouseBuilder.g:1221:1: rule__House__Group__9__Impl : ( 'floors' ) ;
    public final void rule__House__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1225:1: ( ( 'floors' ) )
            // InternalHouseBuilder.g:1226:1: ( 'floors' )
            {
            // InternalHouseBuilder.g:1226:1: ( 'floors' )
            // InternalHouseBuilder.g:1227:2: 'floors'
            {
             before(grammarAccess.getHouseAccess().getFloorsKeyword_9()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getFloorsKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__9__Impl"


    // $ANTLR start "rule__House__Group__10"
    // InternalHouseBuilder.g:1236:1: rule__House__Group__10 : rule__House__Group__10__Impl rule__House__Group__11 ;
    public final void rule__House__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1240:1: ( rule__House__Group__10__Impl rule__House__Group__11 )
            // InternalHouseBuilder.g:1241:2: rule__House__Group__10__Impl rule__House__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__House__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__10"


    // $ANTLR start "rule__House__Group__10__Impl"
    // InternalHouseBuilder.g:1248:1: rule__House__Group__10__Impl : ( '{' ) ;
    public final void rule__House__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1252:1: ( ( '{' ) )
            // InternalHouseBuilder.g:1253:1: ( '{' )
            {
            // InternalHouseBuilder.g:1253:1: ( '{' )
            // InternalHouseBuilder.g:1254:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__10__Impl"


    // $ANTLR start "rule__House__Group__11"
    // InternalHouseBuilder.g:1263:1: rule__House__Group__11 : rule__House__Group__11__Impl rule__House__Group__12 ;
    public final void rule__House__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1267:1: ( rule__House__Group__11__Impl rule__House__Group__12 )
            // InternalHouseBuilder.g:1268:2: rule__House__Group__11__Impl rule__House__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__11"


    // $ANTLR start "rule__House__Group__11__Impl"
    // InternalHouseBuilder.g:1275:1: rule__House__Group__11__Impl : ( ( rule__House__FloorsAssignment_11 ) ) ;
    public final void rule__House__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1279:1: ( ( ( rule__House__FloorsAssignment_11 ) ) )
            // InternalHouseBuilder.g:1280:1: ( ( rule__House__FloorsAssignment_11 ) )
            {
            // InternalHouseBuilder.g:1280:1: ( ( rule__House__FloorsAssignment_11 ) )
            // InternalHouseBuilder.g:1281:2: ( rule__House__FloorsAssignment_11 )
            {
             before(grammarAccess.getHouseAccess().getFloorsAssignment_11()); 
            // InternalHouseBuilder.g:1282:2: ( rule__House__FloorsAssignment_11 )
            // InternalHouseBuilder.g:1282:3: rule__House__FloorsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__House__FloorsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getFloorsAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__11__Impl"


    // $ANTLR start "rule__House__Group__12"
    // InternalHouseBuilder.g:1290:1: rule__House__Group__12 : rule__House__Group__12__Impl rule__House__Group__13 ;
    public final void rule__House__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1294:1: ( rule__House__Group__12__Impl rule__House__Group__13 )
            // InternalHouseBuilder.g:1295:2: rule__House__Group__12__Impl rule__House__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__12"


    // $ANTLR start "rule__House__Group__12__Impl"
    // InternalHouseBuilder.g:1302:1: rule__House__Group__12__Impl : ( ( rule__House__Group_12__0 )* ) ;
    public final void rule__House__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1306:1: ( ( ( rule__House__Group_12__0 )* ) )
            // InternalHouseBuilder.g:1307:1: ( ( rule__House__Group_12__0 )* )
            {
            // InternalHouseBuilder.g:1307:1: ( ( rule__House__Group_12__0 )* )
            // InternalHouseBuilder.g:1308:2: ( rule__House__Group_12__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_12()); 
            // InternalHouseBuilder.g:1309:2: ( rule__House__Group_12__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==68) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalHouseBuilder.g:1309:3: rule__House__Group_12__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__12__Impl"


    // $ANTLR start "rule__House__Group__13"
    // InternalHouseBuilder.g:1317:1: rule__House__Group__13 : rule__House__Group__13__Impl rule__House__Group__14 ;
    public final void rule__House__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1321:1: ( rule__House__Group__13__Impl rule__House__Group__14 )
            // InternalHouseBuilder.g:1322:2: rule__House__Group__13__Impl rule__House__Group__14
            {
            pushFollow(FOLLOW_9);
            rule__House__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__13"


    // $ANTLR start "rule__House__Group__13__Impl"
    // InternalHouseBuilder.g:1329:1: rule__House__Group__13__Impl : ( '}' ) ;
    public final void rule__House__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1333:1: ( ( '}' ) )
            // InternalHouseBuilder.g:1334:1: ( '}' )
            {
            // InternalHouseBuilder.g:1334:1: ( '}' )
            // InternalHouseBuilder.g:1335:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__13__Impl"


    // $ANTLR start "rule__House__Group__14"
    // InternalHouseBuilder.g:1344:1: rule__House__Group__14 : rule__House__Group__14__Impl rule__House__Group__15 ;
    public final void rule__House__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1348:1: ( rule__House__Group__14__Impl rule__House__Group__15 )
            // InternalHouseBuilder.g:1349:2: rule__House__Group__14__Impl rule__House__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__House__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__14"


    // $ANTLR start "rule__House__Group__14__Impl"
    // InternalHouseBuilder.g:1356:1: rule__House__Group__14__Impl : ( 'entrances' ) ;
    public final void rule__House__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1360:1: ( ( 'entrances' ) )
            // InternalHouseBuilder.g:1361:1: ( 'entrances' )
            {
            // InternalHouseBuilder.g:1361:1: ( 'entrances' )
            // InternalHouseBuilder.g:1362:2: 'entrances'
            {
             before(grammarAccess.getHouseAccess().getEntrancesKeyword_14()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getEntrancesKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__14__Impl"


    // $ANTLR start "rule__House__Group__15"
    // InternalHouseBuilder.g:1371:1: rule__House__Group__15 : rule__House__Group__15__Impl rule__House__Group__16 ;
    public final void rule__House__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1375:1: ( rule__House__Group__15__Impl rule__House__Group__16 )
            // InternalHouseBuilder.g:1376:2: rule__House__Group__15__Impl rule__House__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__House__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__15"


    // $ANTLR start "rule__House__Group__15__Impl"
    // InternalHouseBuilder.g:1383:1: rule__House__Group__15__Impl : ( '{' ) ;
    public final void rule__House__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1387:1: ( ( '{' ) )
            // InternalHouseBuilder.g:1388:1: ( '{' )
            {
            // InternalHouseBuilder.g:1388:1: ( '{' )
            // InternalHouseBuilder.g:1389:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__15__Impl"


    // $ANTLR start "rule__House__Group__16"
    // InternalHouseBuilder.g:1398:1: rule__House__Group__16 : rule__House__Group__16__Impl rule__House__Group__17 ;
    public final void rule__House__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1402:1: ( rule__House__Group__16__Impl rule__House__Group__17 )
            // InternalHouseBuilder.g:1403:2: rule__House__Group__16__Impl rule__House__Group__17
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__16"


    // $ANTLR start "rule__House__Group__16__Impl"
    // InternalHouseBuilder.g:1410:1: rule__House__Group__16__Impl : ( ( rule__House__EntrancesAssignment_16 ) ) ;
    public final void rule__House__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1414:1: ( ( ( rule__House__EntrancesAssignment_16 ) ) )
            // InternalHouseBuilder.g:1415:1: ( ( rule__House__EntrancesAssignment_16 ) )
            {
            // InternalHouseBuilder.g:1415:1: ( ( rule__House__EntrancesAssignment_16 ) )
            // InternalHouseBuilder.g:1416:2: ( rule__House__EntrancesAssignment_16 )
            {
             before(grammarAccess.getHouseAccess().getEntrancesAssignment_16()); 
            // InternalHouseBuilder.g:1417:2: ( rule__House__EntrancesAssignment_16 )
            // InternalHouseBuilder.g:1417:3: rule__House__EntrancesAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__House__EntrancesAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getEntrancesAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__16__Impl"


    // $ANTLR start "rule__House__Group__17"
    // InternalHouseBuilder.g:1425:1: rule__House__Group__17 : rule__House__Group__17__Impl rule__House__Group__18 ;
    public final void rule__House__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1429:1: ( rule__House__Group__17__Impl rule__House__Group__18 )
            // InternalHouseBuilder.g:1430:2: rule__House__Group__17__Impl rule__House__Group__18
            {
            pushFollow(FOLLOW_7);
            rule__House__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__17"


    // $ANTLR start "rule__House__Group__17__Impl"
    // InternalHouseBuilder.g:1437:1: rule__House__Group__17__Impl : ( ( rule__House__Group_17__0 )* ) ;
    public final void rule__House__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1441:1: ( ( ( rule__House__Group_17__0 )* ) )
            // InternalHouseBuilder.g:1442:1: ( ( rule__House__Group_17__0 )* )
            {
            // InternalHouseBuilder.g:1442:1: ( ( rule__House__Group_17__0 )* )
            // InternalHouseBuilder.g:1443:2: ( rule__House__Group_17__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_17()); 
            // InternalHouseBuilder.g:1444:2: ( rule__House__Group_17__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==68) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalHouseBuilder.g:1444:3: rule__House__Group_17__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__17__Impl"


    // $ANTLR start "rule__House__Group__18"
    // InternalHouseBuilder.g:1452:1: rule__House__Group__18 : rule__House__Group__18__Impl rule__House__Group__19 ;
    public final void rule__House__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1456:1: ( rule__House__Group__18__Impl rule__House__Group__19 )
            // InternalHouseBuilder.g:1457:2: rule__House__Group__18__Impl rule__House__Group__19
            {
            pushFollow(FOLLOW_11);
            rule__House__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__18"


    // $ANTLR start "rule__House__Group__18__Impl"
    // InternalHouseBuilder.g:1464:1: rule__House__Group__18__Impl : ( '}' ) ;
    public final void rule__House__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1468:1: ( ( '}' ) )
            // InternalHouseBuilder.g:1469:1: ( '}' )
            {
            // InternalHouseBuilder.g:1469:1: ( '}' )
            // InternalHouseBuilder.g:1470:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_18()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__18__Impl"


    // $ANTLR start "rule__House__Group__19"
    // InternalHouseBuilder.g:1479:1: rule__House__Group__19 : rule__House__Group__19__Impl rule__House__Group__20 ;
    public final void rule__House__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1483:1: ( rule__House__Group__19__Impl rule__House__Group__20 )
            // InternalHouseBuilder.g:1484:2: rule__House__Group__19__Impl rule__House__Group__20
            {
            pushFollow(FOLLOW_11);
            rule__House__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__19"


    // $ANTLR start "rule__House__Group__19__Impl"
    // InternalHouseBuilder.g:1491:1: rule__House__Group__19__Impl : ( ( rule__House__Group_19__0 )? ) ;
    public final void rule__House__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1495:1: ( ( ( rule__House__Group_19__0 )? ) )
            // InternalHouseBuilder.g:1496:1: ( ( rule__House__Group_19__0 )? )
            {
            // InternalHouseBuilder.g:1496:1: ( ( rule__House__Group_19__0 )? )
            // InternalHouseBuilder.g:1497:2: ( rule__House__Group_19__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_19()); 
            // InternalHouseBuilder.g:1498:2: ( rule__House__Group_19__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==69) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalHouseBuilder.g:1498:3: rule__House__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__19__Impl"


    // $ANTLR start "rule__House__Group__20"
    // InternalHouseBuilder.g:1506:1: rule__House__Group__20 : rule__House__Group__20__Impl rule__House__Group__21 ;
    public final void rule__House__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1510:1: ( rule__House__Group__20__Impl rule__House__Group__21 )
            // InternalHouseBuilder.g:1511:2: rule__House__Group__20__Impl rule__House__Group__21
            {
            pushFollow(FOLLOW_11);
            rule__House__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__20"


    // $ANTLR start "rule__House__Group__20__Impl"
    // InternalHouseBuilder.g:1518:1: rule__House__Group__20__Impl : ( ( rule__House__Group_20__0 )? ) ;
    public final void rule__House__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1522:1: ( ( ( rule__House__Group_20__0 )? ) )
            // InternalHouseBuilder.g:1523:1: ( ( rule__House__Group_20__0 )? )
            {
            // InternalHouseBuilder.g:1523:1: ( ( rule__House__Group_20__0 )? )
            // InternalHouseBuilder.g:1524:2: ( rule__House__Group_20__0 )?
            {
             before(grammarAccess.getHouseAccess().getGroup_20()); 
            // InternalHouseBuilder.g:1525:2: ( rule__House__Group_20__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==70) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHouseBuilder.g:1525:3: rule__House__Group_20__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__House__Group_20__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHouseAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__20__Impl"


    // $ANTLR start "rule__House__Group__21"
    // InternalHouseBuilder.g:1533:1: rule__House__Group__21 : rule__House__Group__21__Impl ;
    public final void rule__House__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1537:1: ( rule__House__Group__21__Impl )
            // InternalHouseBuilder.g:1538:2: rule__House__Group__21__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group__21__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__21"


    // $ANTLR start "rule__House__Group__21__Impl"
    // InternalHouseBuilder.g:1544:1: rule__House__Group__21__Impl : ( '}' ) ;
    public final void rule__House__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1548:1: ( ( '}' ) )
            // InternalHouseBuilder.g:1549:1: ( '}' )
            {
            // InternalHouseBuilder.g:1549:1: ( '}' )
            // InternalHouseBuilder.g:1550:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group__21__Impl"


    // $ANTLR start "rule__House__Group_3__0"
    // InternalHouseBuilder.g:1560:1: rule__House__Group_3__0 : rule__House__Group_3__0__Impl rule__House__Group_3__1 ;
    public final void rule__House__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1564:1: ( rule__House__Group_3__0__Impl rule__House__Group_3__1 )
            // InternalHouseBuilder.g:1565:2: rule__House__Group_3__0__Impl rule__House__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__0"


    // $ANTLR start "rule__House__Group_3__0__Impl"
    // InternalHouseBuilder.g:1572:1: rule__House__Group_3__0__Impl : ( 'state' ) ;
    public final void rule__House__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1576:1: ( ( 'state' ) )
            // InternalHouseBuilder.g:1577:1: ( 'state' )
            {
            // InternalHouseBuilder.g:1577:1: ( 'state' )
            // InternalHouseBuilder.g:1578:2: 'state'
            {
             before(grammarAccess.getHouseAccess().getStateKeyword_3_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getStateKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__0__Impl"


    // $ANTLR start "rule__House__Group_3__1"
    // InternalHouseBuilder.g:1587:1: rule__House__Group_3__1 : rule__House__Group_3__1__Impl ;
    public final void rule__House__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1591:1: ( rule__House__Group_3__1__Impl )
            // InternalHouseBuilder.g:1592:2: rule__House__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__1"


    // $ANTLR start "rule__House__Group_3__1__Impl"
    // InternalHouseBuilder.g:1598:1: rule__House__Group_3__1__Impl : ( ( rule__House__StateAssignment_3_1 ) ) ;
    public final void rule__House__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1602:1: ( ( ( rule__House__StateAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:1603:1: ( ( rule__House__StateAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:1603:1: ( ( rule__House__StateAssignment_3_1 ) )
            // InternalHouseBuilder.g:1604:2: ( rule__House__StateAssignment_3_1 )
            {
             before(grammarAccess.getHouseAccess().getStateAssignment_3_1()); 
            // InternalHouseBuilder.g:1605:2: ( rule__House__StateAssignment_3_1 )
            // InternalHouseBuilder.g:1605:3: rule__House__StateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__StateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getStateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_3__1__Impl"


    // $ANTLR start "rule__House__Group_4__0"
    // InternalHouseBuilder.g:1614:1: rule__House__Group_4__0 : rule__House__Group_4__0__Impl rule__House__Group_4__1 ;
    public final void rule__House__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1618:1: ( rule__House__Group_4__0__Impl rule__House__Group_4__1 )
            // InternalHouseBuilder.g:1619:2: rule__House__Group_4__0__Impl rule__House__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__0"


    // $ANTLR start "rule__House__Group_4__0__Impl"
    // InternalHouseBuilder.g:1626:1: rule__House__Group_4__0__Impl : ( 'province' ) ;
    public final void rule__House__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1630:1: ( ( 'province' ) )
            // InternalHouseBuilder.g:1631:1: ( 'province' )
            {
            // InternalHouseBuilder.g:1631:1: ( 'province' )
            // InternalHouseBuilder.g:1632:2: 'province'
            {
             before(grammarAccess.getHouseAccess().getProvinceKeyword_4_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getProvinceKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__0__Impl"


    // $ANTLR start "rule__House__Group_4__1"
    // InternalHouseBuilder.g:1641:1: rule__House__Group_4__1 : rule__House__Group_4__1__Impl ;
    public final void rule__House__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1645:1: ( rule__House__Group_4__1__Impl )
            // InternalHouseBuilder.g:1646:2: rule__House__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__1"


    // $ANTLR start "rule__House__Group_4__1__Impl"
    // InternalHouseBuilder.g:1652:1: rule__House__Group_4__1__Impl : ( ( rule__House__ProvinceAssignment_4_1 ) ) ;
    public final void rule__House__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1656:1: ( ( ( rule__House__ProvinceAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:1657:1: ( ( rule__House__ProvinceAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:1657:1: ( ( rule__House__ProvinceAssignment_4_1 ) )
            // InternalHouseBuilder.g:1658:2: ( rule__House__ProvinceAssignment_4_1 )
            {
             before(grammarAccess.getHouseAccess().getProvinceAssignment_4_1()); 
            // InternalHouseBuilder.g:1659:2: ( rule__House__ProvinceAssignment_4_1 )
            // InternalHouseBuilder.g:1659:3: rule__House__ProvinceAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__House__ProvinceAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getProvinceAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_4__1__Impl"


    // $ANTLR start "rule__House__Group_5__0"
    // InternalHouseBuilder.g:1668:1: rule__House__Group_5__0 : rule__House__Group_5__0__Impl rule__House__Group_5__1 ;
    public final void rule__House__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1672:1: ( rule__House__Group_5__0__Impl rule__House__Group_5__1 )
            // InternalHouseBuilder.g:1673:2: rule__House__Group_5__0__Impl rule__House__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__0"


    // $ANTLR start "rule__House__Group_5__0__Impl"
    // InternalHouseBuilder.g:1680:1: rule__House__Group_5__0__Impl : ( 'city' ) ;
    public final void rule__House__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1684:1: ( ( 'city' ) )
            // InternalHouseBuilder.g:1685:1: ( 'city' )
            {
            // InternalHouseBuilder.g:1685:1: ( 'city' )
            // InternalHouseBuilder.g:1686:2: 'city'
            {
             before(grammarAccess.getHouseAccess().getCityKeyword_5_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCityKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__0__Impl"


    // $ANTLR start "rule__House__Group_5__1"
    // InternalHouseBuilder.g:1695:1: rule__House__Group_5__1 : rule__House__Group_5__1__Impl ;
    public final void rule__House__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1699:1: ( rule__House__Group_5__1__Impl )
            // InternalHouseBuilder.g:1700:2: rule__House__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__1"


    // $ANTLR start "rule__House__Group_5__1__Impl"
    // InternalHouseBuilder.g:1706:1: rule__House__Group_5__1__Impl : ( ( rule__House__CityAssignment_5_1 ) ) ;
    public final void rule__House__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1710:1: ( ( ( rule__House__CityAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:1711:1: ( ( rule__House__CityAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:1711:1: ( ( rule__House__CityAssignment_5_1 ) )
            // InternalHouseBuilder.g:1712:2: ( rule__House__CityAssignment_5_1 )
            {
             before(grammarAccess.getHouseAccess().getCityAssignment_5_1()); 
            // InternalHouseBuilder.g:1713:2: ( rule__House__CityAssignment_5_1 )
            // InternalHouseBuilder.g:1713:3: rule__House__CityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__House__CityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getCityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_5__1__Impl"


    // $ANTLR start "rule__House__Group_6__0"
    // InternalHouseBuilder.g:1722:1: rule__House__Group_6__0 : rule__House__Group_6__0__Impl rule__House__Group_6__1 ;
    public final void rule__House__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1726:1: ( rule__House__Group_6__0__Impl rule__House__Group_6__1 )
            // InternalHouseBuilder.g:1727:2: rule__House__Group_6__0__Impl rule__House__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__0"


    // $ANTLR start "rule__House__Group_6__0__Impl"
    // InternalHouseBuilder.g:1734:1: rule__House__Group_6__0__Impl : ( 'postalCode' ) ;
    public final void rule__House__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1738:1: ( ( 'postalCode' ) )
            // InternalHouseBuilder.g:1739:1: ( 'postalCode' )
            {
            // InternalHouseBuilder.g:1739:1: ( 'postalCode' )
            // InternalHouseBuilder.g:1740:2: 'postalCode'
            {
             before(grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__0__Impl"


    // $ANTLR start "rule__House__Group_6__1"
    // InternalHouseBuilder.g:1749:1: rule__House__Group_6__1 : rule__House__Group_6__1__Impl ;
    public final void rule__House__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1753:1: ( rule__House__Group_6__1__Impl )
            // InternalHouseBuilder.g:1754:2: rule__House__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__1"


    // $ANTLR start "rule__House__Group_6__1__Impl"
    // InternalHouseBuilder.g:1760:1: rule__House__Group_6__1__Impl : ( ( rule__House__PostalCodeAssignment_6_1 ) ) ;
    public final void rule__House__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1764:1: ( ( ( rule__House__PostalCodeAssignment_6_1 ) ) )
            // InternalHouseBuilder.g:1765:1: ( ( rule__House__PostalCodeAssignment_6_1 ) )
            {
            // InternalHouseBuilder.g:1765:1: ( ( rule__House__PostalCodeAssignment_6_1 ) )
            // InternalHouseBuilder.g:1766:2: ( rule__House__PostalCodeAssignment_6_1 )
            {
             before(grammarAccess.getHouseAccess().getPostalCodeAssignment_6_1()); 
            // InternalHouseBuilder.g:1767:2: ( rule__House__PostalCodeAssignment_6_1 )
            // InternalHouseBuilder.g:1767:3: rule__House__PostalCodeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__House__PostalCodeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPostalCodeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_6__1__Impl"


    // $ANTLR start "rule__House__Group_7__0"
    // InternalHouseBuilder.g:1776:1: rule__House__Group_7__0 : rule__House__Group_7__0__Impl rule__House__Group_7__1 ;
    public final void rule__House__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1780:1: ( rule__House__Group_7__0__Impl rule__House__Group_7__1 )
            // InternalHouseBuilder.g:1781:2: rule__House__Group_7__0__Impl rule__House__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__House__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__0"


    // $ANTLR start "rule__House__Group_7__0__Impl"
    // InternalHouseBuilder.g:1788:1: rule__House__Group_7__0__Impl : ( 'address' ) ;
    public final void rule__House__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1792:1: ( ( 'address' ) )
            // InternalHouseBuilder.g:1793:1: ( 'address' )
            {
            // InternalHouseBuilder.g:1793:1: ( 'address' )
            // InternalHouseBuilder.g:1794:2: 'address'
            {
             before(grammarAccess.getHouseAccess().getAddressKeyword_7_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getAddressKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__0__Impl"


    // $ANTLR start "rule__House__Group_7__1"
    // InternalHouseBuilder.g:1803:1: rule__House__Group_7__1 : rule__House__Group_7__1__Impl ;
    public final void rule__House__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1807:1: ( rule__House__Group_7__1__Impl )
            // InternalHouseBuilder.g:1808:2: rule__House__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__1"


    // $ANTLR start "rule__House__Group_7__1__Impl"
    // InternalHouseBuilder.g:1814:1: rule__House__Group_7__1__Impl : ( ( rule__House__AddressAssignment_7_1 ) ) ;
    public final void rule__House__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1818:1: ( ( ( rule__House__AddressAssignment_7_1 ) ) )
            // InternalHouseBuilder.g:1819:1: ( ( rule__House__AddressAssignment_7_1 ) )
            {
            // InternalHouseBuilder.g:1819:1: ( ( rule__House__AddressAssignment_7_1 ) )
            // InternalHouseBuilder.g:1820:2: ( rule__House__AddressAssignment_7_1 )
            {
             before(grammarAccess.getHouseAccess().getAddressAssignment_7_1()); 
            // InternalHouseBuilder.g:1821:2: ( rule__House__AddressAssignment_7_1 )
            // InternalHouseBuilder.g:1821:3: rule__House__AddressAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__House__AddressAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getAddressAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_7__1__Impl"


    // $ANTLR start "rule__House__Group_8__0"
    // InternalHouseBuilder.g:1830:1: rule__House__Group_8__0 : rule__House__Group_8__0__Impl rule__House__Group_8__1 ;
    public final void rule__House__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1834:1: ( rule__House__Group_8__0__Impl rule__House__Group_8__1 )
            // InternalHouseBuilder.g:1835:2: rule__House__Group_8__0__Impl rule__House__Group_8__1
            {
            pushFollow(FOLLOW_12);
            rule__House__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__0"


    // $ANTLR start "rule__House__Group_8__0__Impl"
    // InternalHouseBuilder.g:1842:1: rule__House__Group_8__0__Impl : ( 'buildingDate' ) ;
    public final void rule__House__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1846:1: ( ( 'buildingDate' ) )
            // InternalHouseBuilder.g:1847:1: ( 'buildingDate' )
            {
            // InternalHouseBuilder.g:1847:1: ( 'buildingDate' )
            // InternalHouseBuilder.g:1848:2: 'buildingDate'
            {
             before(grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__0__Impl"


    // $ANTLR start "rule__House__Group_8__1"
    // InternalHouseBuilder.g:1857:1: rule__House__Group_8__1 : rule__House__Group_8__1__Impl ;
    public final void rule__House__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1861:1: ( rule__House__Group_8__1__Impl )
            // InternalHouseBuilder.g:1862:2: rule__House__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__1"


    // $ANTLR start "rule__House__Group_8__1__Impl"
    // InternalHouseBuilder.g:1868:1: rule__House__Group_8__1__Impl : ( ( rule__House__BuildingDateAssignment_8_1 ) ) ;
    public final void rule__House__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1872:1: ( ( ( rule__House__BuildingDateAssignment_8_1 ) ) )
            // InternalHouseBuilder.g:1873:1: ( ( rule__House__BuildingDateAssignment_8_1 ) )
            {
            // InternalHouseBuilder.g:1873:1: ( ( rule__House__BuildingDateAssignment_8_1 ) )
            // InternalHouseBuilder.g:1874:2: ( rule__House__BuildingDateAssignment_8_1 )
            {
             before(grammarAccess.getHouseAccess().getBuildingDateAssignment_8_1()); 
            // InternalHouseBuilder.g:1875:2: ( rule__House__BuildingDateAssignment_8_1 )
            // InternalHouseBuilder.g:1875:3: rule__House__BuildingDateAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__House__BuildingDateAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getBuildingDateAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_8__1__Impl"


    // $ANTLR start "rule__House__Group_12__0"
    // InternalHouseBuilder.g:1884:1: rule__House__Group_12__0 : rule__House__Group_12__0__Impl rule__House__Group_12__1 ;
    public final void rule__House__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1888:1: ( rule__House__Group_12__0__Impl rule__House__Group_12__1 )
            // InternalHouseBuilder.g:1889:2: rule__House__Group_12__0__Impl rule__House__Group_12__1
            {
            pushFollow(FOLLOW_6);
            rule__House__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__0"


    // $ANTLR start "rule__House__Group_12__0__Impl"
    // InternalHouseBuilder.g:1896:1: rule__House__Group_12__0__Impl : ( ',' ) ;
    public final void rule__House__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1900:1: ( ( ',' ) )
            // InternalHouseBuilder.g:1901:1: ( ',' )
            {
            // InternalHouseBuilder.g:1901:1: ( ',' )
            // InternalHouseBuilder.g:1902:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_12_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__0__Impl"


    // $ANTLR start "rule__House__Group_12__1"
    // InternalHouseBuilder.g:1911:1: rule__House__Group_12__1 : rule__House__Group_12__1__Impl ;
    public final void rule__House__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1915:1: ( rule__House__Group_12__1__Impl )
            // InternalHouseBuilder.g:1916:2: rule__House__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__1"


    // $ANTLR start "rule__House__Group_12__1__Impl"
    // InternalHouseBuilder.g:1922:1: rule__House__Group_12__1__Impl : ( ( rule__House__FloorsAssignment_12_1 ) ) ;
    public final void rule__House__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1926:1: ( ( ( rule__House__FloorsAssignment_12_1 ) ) )
            // InternalHouseBuilder.g:1927:1: ( ( rule__House__FloorsAssignment_12_1 ) )
            {
            // InternalHouseBuilder.g:1927:1: ( ( rule__House__FloorsAssignment_12_1 ) )
            // InternalHouseBuilder.g:1928:2: ( rule__House__FloorsAssignment_12_1 )
            {
             before(grammarAccess.getHouseAccess().getFloorsAssignment_12_1()); 
            // InternalHouseBuilder.g:1929:2: ( rule__House__FloorsAssignment_12_1 )
            // InternalHouseBuilder.g:1929:3: rule__House__FloorsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__House__FloorsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getFloorsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_12__1__Impl"


    // $ANTLR start "rule__House__Group_17__0"
    // InternalHouseBuilder.g:1938:1: rule__House__Group_17__0 : rule__House__Group_17__0__Impl rule__House__Group_17__1 ;
    public final void rule__House__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1942:1: ( rule__House__Group_17__0__Impl rule__House__Group_17__1 )
            // InternalHouseBuilder.g:1943:2: rule__House__Group_17__0__Impl rule__House__Group_17__1
            {
            pushFollow(FOLLOW_10);
            rule__House__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_17__0"


    // $ANTLR start "rule__House__Group_17__0__Impl"
    // InternalHouseBuilder.g:1950:1: rule__House__Group_17__0__Impl : ( ',' ) ;
    public final void rule__House__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1954:1: ( ( ',' ) )
            // InternalHouseBuilder.g:1955:1: ( ',' )
            {
            // InternalHouseBuilder.g:1955:1: ( ',' )
            // InternalHouseBuilder.g:1956:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_17_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_17__0__Impl"


    // $ANTLR start "rule__House__Group_17__1"
    // InternalHouseBuilder.g:1965:1: rule__House__Group_17__1 : rule__House__Group_17__1__Impl ;
    public final void rule__House__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1969:1: ( rule__House__Group_17__1__Impl )
            // InternalHouseBuilder.g:1970:2: rule__House__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_17__1"


    // $ANTLR start "rule__House__Group_17__1__Impl"
    // InternalHouseBuilder.g:1976:1: rule__House__Group_17__1__Impl : ( ( rule__House__EntrancesAssignment_17_1 ) ) ;
    public final void rule__House__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1980:1: ( ( ( rule__House__EntrancesAssignment_17_1 ) ) )
            // InternalHouseBuilder.g:1981:1: ( ( rule__House__EntrancesAssignment_17_1 ) )
            {
            // InternalHouseBuilder.g:1981:1: ( ( rule__House__EntrancesAssignment_17_1 ) )
            // InternalHouseBuilder.g:1982:2: ( rule__House__EntrancesAssignment_17_1 )
            {
             before(grammarAccess.getHouseAccess().getEntrancesAssignment_17_1()); 
            // InternalHouseBuilder.g:1983:2: ( rule__House__EntrancesAssignment_17_1 )
            // InternalHouseBuilder.g:1983:3: rule__House__EntrancesAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__House__EntrancesAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getEntrancesAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_17__1__Impl"


    // $ANTLR start "rule__House__Group_19__0"
    // InternalHouseBuilder.g:1992:1: rule__House__Group_19__0 : rule__House__Group_19__0__Impl rule__House__Group_19__1 ;
    public final void rule__House__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:1996:1: ( rule__House__Group_19__0__Impl rule__House__Group_19__1 )
            // InternalHouseBuilder.g:1997:2: rule__House__Group_19__0__Impl rule__House__Group_19__1
            {
            pushFollow(FOLLOW_4);
            rule__House__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__0"


    // $ANTLR start "rule__House__Group_19__0__Impl"
    // InternalHouseBuilder.g:2004:1: rule__House__Group_19__0__Impl : ( 'passages' ) ;
    public final void rule__House__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2008:1: ( ( 'passages' ) )
            // InternalHouseBuilder.g:2009:1: ( 'passages' )
            {
            // InternalHouseBuilder.g:2009:1: ( 'passages' )
            // InternalHouseBuilder.g:2010:2: 'passages'
            {
             before(grammarAccess.getHouseAccess().getPassagesKeyword_19_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getPassagesKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__0__Impl"


    // $ANTLR start "rule__House__Group_19__1"
    // InternalHouseBuilder.g:2019:1: rule__House__Group_19__1 : rule__House__Group_19__1__Impl rule__House__Group_19__2 ;
    public final void rule__House__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2023:1: ( rule__House__Group_19__1__Impl rule__House__Group_19__2 )
            // InternalHouseBuilder.g:2024:2: rule__House__Group_19__1__Impl rule__House__Group_19__2
            {
            pushFollow(FOLLOW_13);
            rule__House__Group_19__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__1"


    // $ANTLR start "rule__House__Group_19__1__Impl"
    // InternalHouseBuilder.g:2031:1: rule__House__Group_19__1__Impl : ( '{' ) ;
    public final void rule__House__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2035:1: ( ( '{' ) )
            // InternalHouseBuilder.g:2036:1: ( '{' )
            {
            // InternalHouseBuilder.g:2036:1: ( '{' )
            // InternalHouseBuilder.g:2037:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_19_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__1__Impl"


    // $ANTLR start "rule__House__Group_19__2"
    // InternalHouseBuilder.g:2046:1: rule__House__Group_19__2 : rule__House__Group_19__2__Impl rule__House__Group_19__3 ;
    public final void rule__House__Group_19__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2050:1: ( rule__House__Group_19__2__Impl rule__House__Group_19__3 )
            // InternalHouseBuilder.g:2051:2: rule__House__Group_19__2__Impl rule__House__Group_19__3
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_19__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__2"


    // $ANTLR start "rule__House__Group_19__2__Impl"
    // InternalHouseBuilder.g:2058:1: rule__House__Group_19__2__Impl : ( ( rule__House__PassagesAssignment_19_2 ) ) ;
    public final void rule__House__Group_19__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2062:1: ( ( ( rule__House__PassagesAssignment_19_2 ) ) )
            // InternalHouseBuilder.g:2063:1: ( ( rule__House__PassagesAssignment_19_2 ) )
            {
            // InternalHouseBuilder.g:2063:1: ( ( rule__House__PassagesAssignment_19_2 ) )
            // InternalHouseBuilder.g:2064:2: ( rule__House__PassagesAssignment_19_2 )
            {
             before(grammarAccess.getHouseAccess().getPassagesAssignment_19_2()); 
            // InternalHouseBuilder.g:2065:2: ( rule__House__PassagesAssignment_19_2 )
            // InternalHouseBuilder.g:2065:3: rule__House__PassagesAssignment_19_2
            {
            pushFollow(FOLLOW_2);
            rule__House__PassagesAssignment_19_2();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPassagesAssignment_19_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__2__Impl"


    // $ANTLR start "rule__House__Group_19__3"
    // InternalHouseBuilder.g:2073:1: rule__House__Group_19__3 : rule__House__Group_19__3__Impl rule__House__Group_19__4 ;
    public final void rule__House__Group_19__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2077:1: ( rule__House__Group_19__3__Impl rule__House__Group_19__4 )
            // InternalHouseBuilder.g:2078:2: rule__House__Group_19__3__Impl rule__House__Group_19__4
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_19__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__3"


    // $ANTLR start "rule__House__Group_19__3__Impl"
    // InternalHouseBuilder.g:2085:1: rule__House__Group_19__3__Impl : ( ( rule__House__Group_19_3__0 )* ) ;
    public final void rule__House__Group_19__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2089:1: ( ( ( rule__House__Group_19_3__0 )* ) )
            // InternalHouseBuilder.g:2090:1: ( ( rule__House__Group_19_3__0 )* )
            {
            // InternalHouseBuilder.g:2090:1: ( ( rule__House__Group_19_3__0 )* )
            // InternalHouseBuilder.g:2091:2: ( rule__House__Group_19_3__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_19_3()); 
            // InternalHouseBuilder.g:2092:2: ( rule__House__Group_19_3__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==68) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalHouseBuilder.g:2092:3: rule__House__Group_19_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_19_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_19_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__3__Impl"


    // $ANTLR start "rule__House__Group_19__4"
    // InternalHouseBuilder.g:2100:1: rule__House__Group_19__4 : rule__House__Group_19__4__Impl ;
    public final void rule__House__Group_19__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2104:1: ( rule__House__Group_19__4__Impl )
            // InternalHouseBuilder.g:2105:2: rule__House__Group_19__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_19__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__4"


    // $ANTLR start "rule__House__Group_19__4__Impl"
    // InternalHouseBuilder.g:2111:1: rule__House__Group_19__4__Impl : ( '}' ) ;
    public final void rule__House__Group_19__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2115:1: ( ( '}' ) )
            // InternalHouseBuilder.g:2116:1: ( '}' )
            {
            // InternalHouseBuilder.g:2116:1: ( '}' )
            // InternalHouseBuilder.g:2117:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_19_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_19_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19__4__Impl"


    // $ANTLR start "rule__House__Group_19_3__0"
    // InternalHouseBuilder.g:2127:1: rule__House__Group_19_3__0 : rule__House__Group_19_3__0__Impl rule__House__Group_19_3__1 ;
    public final void rule__House__Group_19_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2131:1: ( rule__House__Group_19_3__0__Impl rule__House__Group_19_3__1 )
            // InternalHouseBuilder.g:2132:2: rule__House__Group_19_3__0__Impl rule__House__Group_19_3__1
            {
            pushFollow(FOLLOW_13);
            rule__House__Group_19_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_19_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19_3__0"


    // $ANTLR start "rule__House__Group_19_3__0__Impl"
    // InternalHouseBuilder.g:2139:1: rule__House__Group_19_3__0__Impl : ( ',' ) ;
    public final void rule__House__Group_19_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2143:1: ( ( ',' ) )
            // InternalHouseBuilder.g:2144:1: ( ',' )
            {
            // InternalHouseBuilder.g:2144:1: ( ',' )
            // InternalHouseBuilder.g:2145:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_19_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_19_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19_3__0__Impl"


    // $ANTLR start "rule__House__Group_19_3__1"
    // InternalHouseBuilder.g:2154:1: rule__House__Group_19_3__1 : rule__House__Group_19_3__1__Impl ;
    public final void rule__House__Group_19_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2158:1: ( rule__House__Group_19_3__1__Impl )
            // InternalHouseBuilder.g:2159:2: rule__House__Group_19_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_19_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19_3__1"


    // $ANTLR start "rule__House__Group_19_3__1__Impl"
    // InternalHouseBuilder.g:2165:1: rule__House__Group_19_3__1__Impl : ( ( rule__House__PassagesAssignment_19_3_1 ) ) ;
    public final void rule__House__Group_19_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2169:1: ( ( ( rule__House__PassagesAssignment_19_3_1 ) ) )
            // InternalHouseBuilder.g:2170:1: ( ( rule__House__PassagesAssignment_19_3_1 ) )
            {
            // InternalHouseBuilder.g:2170:1: ( ( rule__House__PassagesAssignment_19_3_1 ) )
            // InternalHouseBuilder.g:2171:2: ( rule__House__PassagesAssignment_19_3_1 )
            {
             before(grammarAccess.getHouseAccess().getPassagesAssignment_19_3_1()); 
            // InternalHouseBuilder.g:2172:2: ( rule__House__PassagesAssignment_19_3_1 )
            // InternalHouseBuilder.g:2172:3: rule__House__PassagesAssignment_19_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__PassagesAssignment_19_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getPassagesAssignment_19_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_19_3__1__Impl"


    // $ANTLR start "rule__House__Group_20__0"
    // InternalHouseBuilder.g:2181:1: rule__House__Group_20__0 : rule__House__Group_20__0__Impl rule__House__Group_20__1 ;
    public final void rule__House__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2185:1: ( rule__House__Group_20__0__Impl rule__House__Group_20__1 )
            // InternalHouseBuilder.g:2186:2: rule__House__Group_20__0__Impl rule__House__Group_20__1
            {
            pushFollow(FOLLOW_4);
            rule__House__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__0"


    // $ANTLR start "rule__House__Group_20__0__Impl"
    // InternalHouseBuilder.g:2193:1: rule__House__Group_20__0__Impl : ( 'controllers' ) ;
    public final void rule__House__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2197:1: ( ( 'controllers' ) )
            // InternalHouseBuilder.g:2198:1: ( 'controllers' )
            {
            // InternalHouseBuilder.g:2198:1: ( 'controllers' )
            // InternalHouseBuilder.g:2199:2: 'controllers'
            {
             before(grammarAccess.getHouseAccess().getControllersKeyword_20_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getControllersKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__0__Impl"


    // $ANTLR start "rule__House__Group_20__1"
    // InternalHouseBuilder.g:2208:1: rule__House__Group_20__1 : rule__House__Group_20__1__Impl rule__House__Group_20__2 ;
    public final void rule__House__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2212:1: ( rule__House__Group_20__1__Impl rule__House__Group_20__2 )
            // InternalHouseBuilder.g:2213:2: rule__House__Group_20__1__Impl rule__House__Group_20__2
            {
            pushFollow(FOLLOW_14);
            rule__House__Group_20__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_20__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__1"


    // $ANTLR start "rule__House__Group_20__1__Impl"
    // InternalHouseBuilder.g:2220:1: rule__House__Group_20__1__Impl : ( '{' ) ;
    public final void rule__House__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2224:1: ( ( '{' ) )
            // InternalHouseBuilder.g:2225:1: ( '{' )
            {
            // InternalHouseBuilder.g:2225:1: ( '{' )
            // InternalHouseBuilder.g:2226:2: '{'
            {
             before(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_20_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__1__Impl"


    // $ANTLR start "rule__House__Group_20__2"
    // InternalHouseBuilder.g:2235:1: rule__House__Group_20__2 : rule__House__Group_20__2__Impl rule__House__Group_20__3 ;
    public final void rule__House__Group_20__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2239:1: ( rule__House__Group_20__2__Impl rule__House__Group_20__3 )
            // InternalHouseBuilder.g:2240:2: rule__House__Group_20__2__Impl rule__House__Group_20__3
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_20__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_20__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__2"


    // $ANTLR start "rule__House__Group_20__2__Impl"
    // InternalHouseBuilder.g:2247:1: rule__House__Group_20__2__Impl : ( ( rule__House__ControllersAssignment_20_2 ) ) ;
    public final void rule__House__Group_20__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2251:1: ( ( ( rule__House__ControllersAssignment_20_2 ) ) )
            // InternalHouseBuilder.g:2252:1: ( ( rule__House__ControllersAssignment_20_2 ) )
            {
            // InternalHouseBuilder.g:2252:1: ( ( rule__House__ControllersAssignment_20_2 ) )
            // InternalHouseBuilder.g:2253:2: ( rule__House__ControllersAssignment_20_2 )
            {
             before(grammarAccess.getHouseAccess().getControllersAssignment_20_2()); 
            // InternalHouseBuilder.g:2254:2: ( rule__House__ControllersAssignment_20_2 )
            // InternalHouseBuilder.g:2254:3: rule__House__ControllersAssignment_20_2
            {
            pushFollow(FOLLOW_2);
            rule__House__ControllersAssignment_20_2();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getControllersAssignment_20_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__2__Impl"


    // $ANTLR start "rule__House__Group_20__3"
    // InternalHouseBuilder.g:2262:1: rule__House__Group_20__3 : rule__House__Group_20__3__Impl rule__House__Group_20__4 ;
    public final void rule__House__Group_20__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2266:1: ( rule__House__Group_20__3__Impl rule__House__Group_20__4 )
            // InternalHouseBuilder.g:2267:2: rule__House__Group_20__3__Impl rule__House__Group_20__4
            {
            pushFollow(FOLLOW_7);
            rule__House__Group_20__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_20__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__3"


    // $ANTLR start "rule__House__Group_20__3__Impl"
    // InternalHouseBuilder.g:2274:1: rule__House__Group_20__3__Impl : ( ( rule__House__Group_20_3__0 )* ) ;
    public final void rule__House__Group_20__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2278:1: ( ( ( rule__House__Group_20_3__0 )* ) )
            // InternalHouseBuilder.g:2279:1: ( ( rule__House__Group_20_3__0 )* )
            {
            // InternalHouseBuilder.g:2279:1: ( ( rule__House__Group_20_3__0 )* )
            // InternalHouseBuilder.g:2280:2: ( rule__House__Group_20_3__0 )*
            {
             before(grammarAccess.getHouseAccess().getGroup_20_3()); 
            // InternalHouseBuilder.g:2281:2: ( rule__House__Group_20_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==68) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalHouseBuilder.g:2281:3: rule__House__Group_20_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__House__Group_20_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getHouseAccess().getGroup_20_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__3__Impl"


    // $ANTLR start "rule__House__Group_20__4"
    // InternalHouseBuilder.g:2289:1: rule__House__Group_20__4 : rule__House__Group_20__4__Impl ;
    public final void rule__House__Group_20__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2293:1: ( rule__House__Group_20__4__Impl )
            // InternalHouseBuilder.g:2294:2: rule__House__Group_20__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_20__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__4"


    // $ANTLR start "rule__House__Group_20__4__Impl"
    // InternalHouseBuilder.g:2300:1: rule__House__Group_20__4__Impl : ( '}' ) ;
    public final void rule__House__Group_20__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2304:1: ( ( '}' ) )
            // InternalHouseBuilder.g:2305:1: ( '}' )
            {
            // InternalHouseBuilder.g:2305:1: ( '}' )
            // InternalHouseBuilder.g:2306:2: '}'
            {
             before(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20__4__Impl"


    // $ANTLR start "rule__House__Group_20_3__0"
    // InternalHouseBuilder.g:2316:1: rule__House__Group_20_3__0 : rule__House__Group_20_3__0__Impl rule__House__Group_20_3__1 ;
    public final void rule__House__Group_20_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2320:1: ( rule__House__Group_20_3__0__Impl rule__House__Group_20_3__1 )
            // InternalHouseBuilder.g:2321:2: rule__House__Group_20_3__0__Impl rule__House__Group_20_3__1
            {
            pushFollow(FOLLOW_14);
            rule__House__Group_20_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__House__Group_20_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20_3__0"


    // $ANTLR start "rule__House__Group_20_3__0__Impl"
    // InternalHouseBuilder.g:2328:1: rule__House__Group_20_3__0__Impl : ( ',' ) ;
    public final void rule__House__Group_20_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2332:1: ( ( ',' ) )
            // InternalHouseBuilder.g:2333:1: ( ',' )
            {
            // InternalHouseBuilder.g:2333:1: ( ',' )
            // InternalHouseBuilder.g:2334:2: ','
            {
             before(grammarAccess.getHouseAccess().getCommaKeyword_20_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getHouseAccess().getCommaKeyword_20_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20_3__0__Impl"


    // $ANTLR start "rule__House__Group_20_3__1"
    // InternalHouseBuilder.g:2343:1: rule__House__Group_20_3__1 : rule__House__Group_20_3__1__Impl ;
    public final void rule__House__Group_20_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2347:1: ( rule__House__Group_20_3__1__Impl )
            // InternalHouseBuilder.g:2348:2: rule__House__Group_20_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__House__Group_20_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20_3__1"


    // $ANTLR start "rule__House__Group_20_3__1__Impl"
    // InternalHouseBuilder.g:2354:1: rule__House__Group_20_3__1__Impl : ( ( rule__House__ControllersAssignment_20_3_1 ) ) ;
    public final void rule__House__Group_20_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2358:1: ( ( ( rule__House__ControllersAssignment_20_3_1 ) ) )
            // InternalHouseBuilder.g:2359:1: ( ( rule__House__ControllersAssignment_20_3_1 ) )
            {
            // InternalHouseBuilder.g:2359:1: ( ( rule__House__ControllersAssignment_20_3_1 ) )
            // InternalHouseBuilder.g:2360:2: ( rule__House__ControllersAssignment_20_3_1 )
            {
             before(grammarAccess.getHouseAccess().getControllersAssignment_20_3_1()); 
            // InternalHouseBuilder.g:2361:2: ( rule__House__ControllersAssignment_20_3_1 )
            // InternalHouseBuilder.g:2361:3: rule__House__ControllersAssignment_20_3_1
            {
            pushFollow(FOLLOW_2);
            rule__House__ControllersAssignment_20_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHouseAccess().getControllersAssignment_20_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__Group_20_3__1__Impl"


    // $ANTLR start "rule__Floor__Group__0"
    // InternalHouseBuilder.g:2370:1: rule__Floor__Group__0 : rule__Floor__Group__0__Impl rule__Floor__Group__1 ;
    public final void rule__Floor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2374:1: ( rule__Floor__Group__0__Impl rule__Floor__Group__1 )
            // InternalHouseBuilder.g:2375:2: rule__Floor__Group__0__Impl rule__Floor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Floor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0"


    // $ANTLR start "rule__Floor__Group__0__Impl"
    // InternalHouseBuilder.g:2382:1: rule__Floor__Group__0__Impl : ( 'Floor' ) ;
    public final void rule__Floor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2386:1: ( ( 'Floor' ) )
            // InternalHouseBuilder.g:2387:1: ( 'Floor' )
            {
            // InternalHouseBuilder.g:2387:1: ( 'Floor' )
            // InternalHouseBuilder.g:2388:2: 'Floor'
            {
             before(grammarAccess.getFloorAccess().getFloorKeyword_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getFloorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__0__Impl"


    // $ANTLR start "rule__Floor__Group__1"
    // InternalHouseBuilder.g:2397:1: rule__Floor__Group__1 : rule__Floor__Group__1__Impl rule__Floor__Group__2 ;
    public final void rule__Floor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2401:1: ( rule__Floor__Group__1__Impl rule__Floor__Group__2 )
            // InternalHouseBuilder.g:2402:2: rule__Floor__Group__1__Impl rule__Floor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1"


    // $ANTLR start "rule__Floor__Group__1__Impl"
    // InternalHouseBuilder.g:2409:1: rule__Floor__Group__1__Impl : ( ( rule__Floor__NameAssignment_1 ) ) ;
    public final void rule__Floor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2413:1: ( ( ( rule__Floor__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:2414:1: ( ( rule__Floor__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:2414:1: ( ( rule__Floor__NameAssignment_1 ) )
            // InternalHouseBuilder.g:2415:2: ( rule__Floor__NameAssignment_1 )
            {
             before(grammarAccess.getFloorAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:2416:2: ( rule__Floor__NameAssignment_1 )
            // InternalHouseBuilder.g:2416:3: rule__Floor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__1__Impl"


    // $ANTLR start "rule__Floor__Group__2"
    // InternalHouseBuilder.g:2424:1: rule__Floor__Group__2 : rule__Floor__Group__2__Impl rule__Floor__Group__3 ;
    public final void rule__Floor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2428:1: ( rule__Floor__Group__2__Impl rule__Floor__Group__3 )
            // InternalHouseBuilder.g:2429:2: rule__Floor__Group__2__Impl rule__Floor__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Floor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2"


    // $ANTLR start "rule__Floor__Group__2__Impl"
    // InternalHouseBuilder.g:2436:1: rule__Floor__Group__2__Impl : ( '{' ) ;
    public final void rule__Floor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2440:1: ( ( '{' ) )
            // InternalHouseBuilder.g:2441:1: ( '{' )
            {
            // InternalHouseBuilder.g:2441:1: ( '{' )
            // InternalHouseBuilder.g:2442:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__2__Impl"


    // $ANTLR start "rule__Floor__Group__3"
    // InternalHouseBuilder.g:2451:1: rule__Floor__Group__3 : rule__Floor__Group__3__Impl rule__Floor__Group__4 ;
    public final void rule__Floor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2455:1: ( rule__Floor__Group__3__Impl rule__Floor__Group__4 )
            // InternalHouseBuilder.g:2456:2: rule__Floor__Group__3__Impl rule__Floor__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Floor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3"


    // $ANTLR start "rule__Floor__Group__3__Impl"
    // InternalHouseBuilder.g:2463:1: rule__Floor__Group__3__Impl : ( 'level' ) ;
    public final void rule__Floor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2467:1: ( ( 'level' ) )
            // InternalHouseBuilder.g:2468:1: ( 'level' )
            {
            // InternalHouseBuilder.g:2468:1: ( 'level' )
            // InternalHouseBuilder.g:2469:2: 'level'
            {
             before(grammarAccess.getFloorAccess().getLevelKeyword_3()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLevelKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__3__Impl"


    // $ANTLR start "rule__Floor__Group__4"
    // InternalHouseBuilder.g:2478:1: rule__Floor__Group__4 : rule__Floor__Group__4__Impl rule__Floor__Group__5 ;
    public final void rule__Floor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2482:1: ( rule__Floor__Group__4__Impl rule__Floor__Group__5 )
            // InternalHouseBuilder.g:2483:2: rule__Floor__Group__4__Impl rule__Floor__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Floor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4"


    // $ANTLR start "rule__Floor__Group__4__Impl"
    // InternalHouseBuilder.g:2490:1: rule__Floor__Group__4__Impl : ( ( rule__Floor__LevelAssignment_4 ) ) ;
    public final void rule__Floor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2494:1: ( ( ( rule__Floor__LevelAssignment_4 ) ) )
            // InternalHouseBuilder.g:2495:1: ( ( rule__Floor__LevelAssignment_4 ) )
            {
            // InternalHouseBuilder.g:2495:1: ( ( rule__Floor__LevelAssignment_4 ) )
            // InternalHouseBuilder.g:2496:2: ( rule__Floor__LevelAssignment_4 )
            {
             before(grammarAccess.getFloorAccess().getLevelAssignment_4()); 
            // InternalHouseBuilder.g:2497:2: ( rule__Floor__LevelAssignment_4 )
            // InternalHouseBuilder.g:2497:3: rule__Floor__LevelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Floor__LevelAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getLevelAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__4__Impl"


    // $ANTLR start "rule__Floor__Group__5"
    // InternalHouseBuilder.g:2505:1: rule__Floor__Group__5 : rule__Floor__Group__5__Impl rule__Floor__Group__6 ;
    public final void rule__Floor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2509:1: ( rule__Floor__Group__5__Impl rule__Floor__Group__6 )
            // InternalHouseBuilder.g:2510:2: rule__Floor__Group__5__Impl rule__Floor__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Floor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5"


    // $ANTLR start "rule__Floor__Group__5__Impl"
    // InternalHouseBuilder.g:2517:1: rule__Floor__Group__5__Impl : ( 'spaces' ) ;
    public final void rule__Floor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2521:1: ( ( 'spaces' ) )
            // InternalHouseBuilder.g:2522:1: ( 'spaces' )
            {
            // InternalHouseBuilder.g:2522:1: ( 'spaces' )
            // InternalHouseBuilder.g:2523:2: 'spaces'
            {
             before(grammarAccess.getFloorAccess().getSpacesKeyword_5()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getSpacesKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__5__Impl"


    // $ANTLR start "rule__Floor__Group__6"
    // InternalHouseBuilder.g:2532:1: rule__Floor__Group__6 : rule__Floor__Group__6__Impl rule__Floor__Group__7 ;
    public final void rule__Floor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2536:1: ( rule__Floor__Group__6__Impl rule__Floor__Group__7 )
            // InternalHouseBuilder.g:2537:2: rule__Floor__Group__6__Impl rule__Floor__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Floor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6"


    // $ANTLR start "rule__Floor__Group__6__Impl"
    // InternalHouseBuilder.g:2544:1: rule__Floor__Group__6__Impl : ( '{' ) ;
    public final void rule__Floor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2548:1: ( ( '{' ) )
            // InternalHouseBuilder.g:2549:1: ( '{' )
            {
            // InternalHouseBuilder.g:2549:1: ( '{' )
            // InternalHouseBuilder.g:2550:2: '{'
            {
             before(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__6__Impl"


    // $ANTLR start "rule__Floor__Group__7"
    // InternalHouseBuilder.g:2559:1: rule__Floor__Group__7 : rule__Floor__Group__7__Impl rule__Floor__Group__8 ;
    public final void rule__Floor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2563:1: ( rule__Floor__Group__7__Impl rule__Floor__Group__8 )
            // InternalHouseBuilder.g:2564:2: rule__Floor__Group__7__Impl rule__Floor__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Floor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7"


    // $ANTLR start "rule__Floor__Group__7__Impl"
    // InternalHouseBuilder.g:2571:1: rule__Floor__Group__7__Impl : ( ( rule__Floor__SpacesAssignment_7 ) ) ;
    public final void rule__Floor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2575:1: ( ( ( rule__Floor__SpacesAssignment_7 ) ) )
            // InternalHouseBuilder.g:2576:1: ( ( rule__Floor__SpacesAssignment_7 ) )
            {
            // InternalHouseBuilder.g:2576:1: ( ( rule__Floor__SpacesAssignment_7 ) )
            // InternalHouseBuilder.g:2577:2: ( rule__Floor__SpacesAssignment_7 )
            {
             before(grammarAccess.getFloorAccess().getSpacesAssignment_7()); 
            // InternalHouseBuilder.g:2578:2: ( rule__Floor__SpacesAssignment_7 )
            // InternalHouseBuilder.g:2578:3: rule__Floor__SpacesAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Floor__SpacesAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSpacesAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__7__Impl"


    // $ANTLR start "rule__Floor__Group__8"
    // InternalHouseBuilder.g:2586:1: rule__Floor__Group__8 : rule__Floor__Group__8__Impl rule__Floor__Group__9 ;
    public final void rule__Floor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2590:1: ( rule__Floor__Group__8__Impl rule__Floor__Group__9 )
            // InternalHouseBuilder.g:2591:2: rule__Floor__Group__8__Impl rule__Floor__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Floor__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__8"


    // $ANTLR start "rule__Floor__Group__8__Impl"
    // InternalHouseBuilder.g:2598:1: rule__Floor__Group__8__Impl : ( ( rule__Floor__Group_8__0 )* ) ;
    public final void rule__Floor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2602:1: ( ( ( rule__Floor__Group_8__0 )* ) )
            // InternalHouseBuilder.g:2603:1: ( ( rule__Floor__Group_8__0 )* )
            {
            // InternalHouseBuilder.g:2603:1: ( ( rule__Floor__Group_8__0 )* )
            // InternalHouseBuilder.g:2604:2: ( rule__Floor__Group_8__0 )*
            {
             before(grammarAccess.getFloorAccess().getGroup_8()); 
            // InternalHouseBuilder.g:2605:2: ( rule__Floor__Group_8__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==68) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalHouseBuilder.g:2605:3: rule__Floor__Group_8__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Floor__Group_8__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getFloorAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__8__Impl"


    // $ANTLR start "rule__Floor__Group__9"
    // InternalHouseBuilder.g:2613:1: rule__Floor__Group__9 : rule__Floor__Group__9__Impl rule__Floor__Group__10 ;
    public final void rule__Floor__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2617:1: ( rule__Floor__Group__9__Impl rule__Floor__Group__10 )
            // InternalHouseBuilder.g:2618:2: rule__Floor__Group__9__Impl rule__Floor__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Floor__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__9"


    // $ANTLR start "rule__Floor__Group__9__Impl"
    // InternalHouseBuilder.g:2625:1: rule__Floor__Group__9__Impl : ( '}' ) ;
    public final void rule__Floor__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2629:1: ( ( '}' ) )
            // InternalHouseBuilder.g:2630:1: ( '}' )
            {
            // InternalHouseBuilder.g:2630:1: ( '}' )
            // InternalHouseBuilder.g:2631:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__9__Impl"


    // $ANTLR start "rule__Floor__Group__10"
    // InternalHouseBuilder.g:2640:1: rule__Floor__Group__10 : rule__Floor__Group__10__Impl ;
    public final void rule__Floor__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2644:1: ( rule__Floor__Group__10__Impl )
            // InternalHouseBuilder.g:2645:2: rule__Floor__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__10"


    // $ANTLR start "rule__Floor__Group__10__Impl"
    // InternalHouseBuilder.g:2651:1: rule__Floor__Group__10__Impl : ( '}' ) ;
    public final void rule__Floor__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2655:1: ( ( '}' ) )
            // InternalHouseBuilder.g:2656:1: ( '}' )
            {
            // InternalHouseBuilder.g:2656:1: ( '}' )
            // InternalHouseBuilder.g:2657:2: '}'
            {
             before(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group__10__Impl"


    // $ANTLR start "rule__Floor__Group_8__0"
    // InternalHouseBuilder.g:2667:1: rule__Floor__Group_8__0 : rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1 ;
    public final void rule__Floor__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2671:1: ( rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1 )
            // InternalHouseBuilder.g:2672:2: rule__Floor__Group_8__0__Impl rule__Floor__Group_8__1
            {
            pushFollow(FOLLOW_18);
            rule__Floor__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Floor__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__0"


    // $ANTLR start "rule__Floor__Group_8__0__Impl"
    // InternalHouseBuilder.g:2679:1: rule__Floor__Group_8__0__Impl : ( ',' ) ;
    public final void rule__Floor__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2683:1: ( ( ',' ) )
            // InternalHouseBuilder.g:2684:1: ( ',' )
            {
            // InternalHouseBuilder.g:2684:1: ( ',' )
            // InternalHouseBuilder.g:2685:2: ','
            {
             before(grammarAccess.getFloorAccess().getCommaKeyword_8_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getFloorAccess().getCommaKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__0__Impl"


    // $ANTLR start "rule__Floor__Group_8__1"
    // InternalHouseBuilder.g:2694:1: rule__Floor__Group_8__1 : rule__Floor__Group_8__1__Impl ;
    public final void rule__Floor__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2698:1: ( rule__Floor__Group_8__1__Impl )
            // InternalHouseBuilder.g:2699:2: rule__Floor__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Floor__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__1"


    // $ANTLR start "rule__Floor__Group_8__1__Impl"
    // InternalHouseBuilder.g:2705:1: rule__Floor__Group_8__1__Impl : ( ( rule__Floor__SpacesAssignment_8_1 ) ) ;
    public final void rule__Floor__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2709:1: ( ( ( rule__Floor__SpacesAssignment_8_1 ) ) )
            // InternalHouseBuilder.g:2710:1: ( ( rule__Floor__SpacesAssignment_8_1 ) )
            {
            // InternalHouseBuilder.g:2710:1: ( ( rule__Floor__SpacesAssignment_8_1 ) )
            // InternalHouseBuilder.g:2711:2: ( rule__Floor__SpacesAssignment_8_1 )
            {
             before(grammarAccess.getFloorAccess().getSpacesAssignment_8_1()); 
            // InternalHouseBuilder.g:2712:2: ( rule__Floor__SpacesAssignment_8_1 )
            // InternalHouseBuilder.g:2712:3: rule__Floor__SpacesAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Floor__SpacesAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getFloorAccess().getSpacesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__Group_8__1__Impl"


    // $ANTLR start "rule__Passage__Group__0"
    // InternalHouseBuilder.g:2721:1: rule__Passage__Group__0 : rule__Passage__Group__0__Impl rule__Passage__Group__1 ;
    public final void rule__Passage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2725:1: ( rule__Passage__Group__0__Impl rule__Passage__Group__1 )
            // InternalHouseBuilder.g:2726:2: rule__Passage__Group__0__Impl rule__Passage__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__0"


    // $ANTLR start "rule__Passage__Group__0__Impl"
    // InternalHouseBuilder.g:2733:1: rule__Passage__Group__0__Impl : ( 'Passage' ) ;
    public final void rule__Passage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2737:1: ( ( 'Passage' ) )
            // InternalHouseBuilder.g:2738:1: ( 'Passage' )
            {
            // InternalHouseBuilder.g:2738:1: ( 'Passage' )
            // InternalHouseBuilder.g:2739:2: 'Passage'
            {
             before(grammarAccess.getPassageAccess().getPassageKeyword_0()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getPassageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__0__Impl"


    // $ANTLR start "rule__Passage__Group__1"
    // InternalHouseBuilder.g:2748:1: rule__Passage__Group__1 : rule__Passage__Group__1__Impl rule__Passage__Group__2 ;
    public final void rule__Passage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2752:1: ( rule__Passage__Group__1__Impl rule__Passage__Group__2 )
            // InternalHouseBuilder.g:2753:2: rule__Passage__Group__1__Impl rule__Passage__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Passage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__1"


    // $ANTLR start "rule__Passage__Group__1__Impl"
    // InternalHouseBuilder.g:2760:1: rule__Passage__Group__1__Impl : ( ( rule__Passage__NameAssignment_1 ) ) ;
    public final void rule__Passage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2764:1: ( ( ( rule__Passage__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:2765:1: ( ( rule__Passage__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:2765:1: ( ( rule__Passage__NameAssignment_1 ) )
            // InternalHouseBuilder.g:2766:2: ( rule__Passage__NameAssignment_1 )
            {
             before(grammarAccess.getPassageAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:2767:2: ( rule__Passage__NameAssignment_1 )
            // InternalHouseBuilder.g:2767:3: rule__Passage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__1__Impl"


    // $ANTLR start "rule__Passage__Group__2"
    // InternalHouseBuilder.g:2775:1: rule__Passage__Group__2 : rule__Passage__Group__2__Impl rule__Passage__Group__3 ;
    public final void rule__Passage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2779:1: ( rule__Passage__Group__2__Impl rule__Passage__Group__3 )
            // InternalHouseBuilder.g:2780:2: rule__Passage__Group__2__Impl rule__Passage__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__Passage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__2"


    // $ANTLR start "rule__Passage__Group__2__Impl"
    // InternalHouseBuilder.g:2787:1: rule__Passage__Group__2__Impl : ( '{' ) ;
    public final void rule__Passage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2791:1: ( ( '{' ) )
            // InternalHouseBuilder.g:2792:1: ( '{' )
            {
            // InternalHouseBuilder.g:2792:1: ( '{' )
            // InternalHouseBuilder.g:2793:2: '{'
            {
             before(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__2__Impl"


    // $ANTLR start "rule__Passage__Group__3"
    // InternalHouseBuilder.g:2802:1: rule__Passage__Group__3 : rule__Passage__Group__3__Impl rule__Passage__Group__4 ;
    public final void rule__Passage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2806:1: ( rule__Passage__Group__3__Impl rule__Passage__Group__4 )
            // InternalHouseBuilder.g:2807:2: rule__Passage__Group__3__Impl rule__Passage__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Passage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__3"


    // $ANTLR start "rule__Passage__Group__3__Impl"
    // InternalHouseBuilder.g:2814:1: rule__Passage__Group__3__Impl : ( ( rule__Passage__Group_3__0 )? ) ;
    public final void rule__Passage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2818:1: ( ( ( rule__Passage__Group_3__0 )? ) )
            // InternalHouseBuilder.g:2819:1: ( ( rule__Passage__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:2819:1: ( ( rule__Passage__Group_3__0 )? )
            // InternalHouseBuilder.g:2820:2: ( rule__Passage__Group_3__0 )?
            {
             before(grammarAccess.getPassageAccess().getGroup_3()); 
            // InternalHouseBuilder.g:2821:2: ( rule__Passage__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==77) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalHouseBuilder.g:2821:3: rule__Passage__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Passage__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPassageAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__3__Impl"


    // $ANTLR start "rule__Passage__Group__4"
    // InternalHouseBuilder.g:2829:1: rule__Passage__Group__4 : rule__Passage__Group__4__Impl rule__Passage__Group__5 ;
    public final void rule__Passage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2833:1: ( rule__Passage__Group__4__Impl rule__Passage__Group__5 )
            // InternalHouseBuilder.g:2834:2: rule__Passage__Group__4__Impl rule__Passage__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Passage__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__4"


    // $ANTLR start "rule__Passage__Group__4__Impl"
    // InternalHouseBuilder.g:2841:1: rule__Passage__Group__4__Impl : ( ( rule__Passage__Group_4__0 )? ) ;
    public final void rule__Passage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2845:1: ( ( ( rule__Passage__Group_4__0 )? ) )
            // InternalHouseBuilder.g:2846:1: ( ( rule__Passage__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:2846:1: ( ( rule__Passage__Group_4__0 )? )
            // InternalHouseBuilder.g:2847:2: ( rule__Passage__Group_4__0 )?
            {
             before(grammarAccess.getPassageAccess().getGroup_4()); 
            // InternalHouseBuilder.g:2848:2: ( rule__Passage__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==78) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalHouseBuilder.g:2848:3: rule__Passage__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Passage__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPassageAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__4__Impl"


    // $ANTLR start "rule__Passage__Group__5"
    // InternalHouseBuilder.g:2856:1: rule__Passage__Group__5 : rule__Passage__Group__5__Impl rule__Passage__Group__6 ;
    public final void rule__Passage__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2860:1: ( rule__Passage__Group__5__Impl rule__Passage__Group__6 )
            // InternalHouseBuilder.g:2861:2: rule__Passage__Group__5__Impl rule__Passage__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Passage__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__5"


    // $ANTLR start "rule__Passage__Group__5__Impl"
    // InternalHouseBuilder.g:2868:1: rule__Passage__Group__5__Impl : ( ( rule__Passage__Group_5__0 )? ) ;
    public final void rule__Passage__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2872:1: ( ( ( rule__Passage__Group_5__0 )? ) )
            // InternalHouseBuilder.g:2873:1: ( ( rule__Passage__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:2873:1: ( ( rule__Passage__Group_5__0 )? )
            // InternalHouseBuilder.g:2874:2: ( rule__Passage__Group_5__0 )?
            {
             before(grammarAccess.getPassageAccess().getGroup_5()); 
            // InternalHouseBuilder.g:2875:2: ( rule__Passage__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==79) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHouseBuilder.g:2875:3: rule__Passage__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Passage__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPassageAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__5__Impl"


    // $ANTLR start "rule__Passage__Group__6"
    // InternalHouseBuilder.g:2883:1: rule__Passage__Group__6 : rule__Passage__Group__6__Impl rule__Passage__Group__7 ;
    public final void rule__Passage__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2887:1: ( rule__Passage__Group__6__Impl rule__Passage__Group__7 )
            // InternalHouseBuilder.g:2888:2: rule__Passage__Group__6__Impl rule__Passage__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__6"


    // $ANTLR start "rule__Passage__Group__6__Impl"
    // InternalHouseBuilder.g:2895:1: rule__Passage__Group__6__Impl : ( 'spaceA' ) ;
    public final void rule__Passage__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2899:1: ( ( 'spaceA' ) )
            // InternalHouseBuilder.g:2900:1: ( 'spaceA' )
            {
            // InternalHouseBuilder.g:2900:1: ( 'spaceA' )
            // InternalHouseBuilder.g:2901:2: 'spaceA'
            {
             before(grammarAccess.getPassageAccess().getSpaceAKeyword_6()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getSpaceAKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__6__Impl"


    // $ANTLR start "rule__Passage__Group__7"
    // InternalHouseBuilder.g:2910:1: rule__Passage__Group__7 : rule__Passage__Group__7__Impl rule__Passage__Group__8 ;
    public final void rule__Passage__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2914:1: ( rule__Passage__Group__7__Impl rule__Passage__Group__8 )
            // InternalHouseBuilder.g:2915:2: rule__Passage__Group__7__Impl rule__Passage__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Passage__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__7"


    // $ANTLR start "rule__Passage__Group__7__Impl"
    // InternalHouseBuilder.g:2922:1: rule__Passage__Group__7__Impl : ( ( rule__Passage__SpaceAAssignment_7 ) ) ;
    public final void rule__Passage__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2926:1: ( ( ( rule__Passage__SpaceAAssignment_7 ) ) )
            // InternalHouseBuilder.g:2927:1: ( ( rule__Passage__SpaceAAssignment_7 ) )
            {
            // InternalHouseBuilder.g:2927:1: ( ( rule__Passage__SpaceAAssignment_7 ) )
            // InternalHouseBuilder.g:2928:2: ( rule__Passage__SpaceAAssignment_7 )
            {
             before(grammarAccess.getPassageAccess().getSpaceAAssignment_7()); 
            // InternalHouseBuilder.g:2929:2: ( rule__Passage__SpaceAAssignment_7 )
            // InternalHouseBuilder.g:2929:3: rule__Passage__SpaceAAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Passage__SpaceAAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getSpaceAAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__7__Impl"


    // $ANTLR start "rule__Passage__Group__8"
    // InternalHouseBuilder.g:2937:1: rule__Passage__Group__8 : rule__Passage__Group__8__Impl rule__Passage__Group__9 ;
    public final void rule__Passage__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2941:1: ( rule__Passage__Group__8__Impl rule__Passage__Group__9 )
            // InternalHouseBuilder.g:2942:2: rule__Passage__Group__8__Impl rule__Passage__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Passage__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__8"


    // $ANTLR start "rule__Passage__Group__8__Impl"
    // InternalHouseBuilder.g:2949:1: rule__Passage__Group__8__Impl : ( 'spaceB' ) ;
    public final void rule__Passage__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2953:1: ( ( 'spaceB' ) )
            // InternalHouseBuilder.g:2954:1: ( 'spaceB' )
            {
            // InternalHouseBuilder.g:2954:1: ( 'spaceB' )
            // InternalHouseBuilder.g:2955:2: 'spaceB'
            {
             before(grammarAccess.getPassageAccess().getSpaceBKeyword_8()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getSpaceBKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__8__Impl"


    // $ANTLR start "rule__Passage__Group__9"
    // InternalHouseBuilder.g:2964:1: rule__Passage__Group__9 : rule__Passage__Group__9__Impl rule__Passage__Group__10 ;
    public final void rule__Passage__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2968:1: ( rule__Passage__Group__9__Impl rule__Passage__Group__10 )
            // InternalHouseBuilder.g:2969:2: rule__Passage__Group__9__Impl rule__Passage__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Passage__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__9"


    // $ANTLR start "rule__Passage__Group__9__Impl"
    // InternalHouseBuilder.g:2976:1: rule__Passage__Group__9__Impl : ( ( rule__Passage__SpaceBAssignment_9 ) ) ;
    public final void rule__Passage__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2980:1: ( ( ( rule__Passage__SpaceBAssignment_9 ) ) )
            // InternalHouseBuilder.g:2981:1: ( ( rule__Passage__SpaceBAssignment_9 ) )
            {
            // InternalHouseBuilder.g:2981:1: ( ( rule__Passage__SpaceBAssignment_9 ) )
            // InternalHouseBuilder.g:2982:2: ( rule__Passage__SpaceBAssignment_9 )
            {
             before(grammarAccess.getPassageAccess().getSpaceBAssignment_9()); 
            // InternalHouseBuilder.g:2983:2: ( rule__Passage__SpaceBAssignment_9 )
            // InternalHouseBuilder.g:2983:3: rule__Passage__SpaceBAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Passage__SpaceBAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getSpaceBAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__9__Impl"


    // $ANTLR start "rule__Passage__Group__10"
    // InternalHouseBuilder.g:2991:1: rule__Passage__Group__10 : rule__Passage__Group__10__Impl rule__Passage__Group__11 ;
    public final void rule__Passage__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:2995:1: ( rule__Passage__Group__10__Impl rule__Passage__Group__11 )
            // InternalHouseBuilder.g:2996:2: rule__Passage__Group__10__Impl rule__Passage__Group__11
            {
            pushFollow(FOLLOW_22);
            rule__Passage__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__10"


    // $ANTLR start "rule__Passage__Group__10__Impl"
    // InternalHouseBuilder.g:3003:1: rule__Passage__Group__10__Impl : ( ( rule__Passage__Group_10__0 )? ) ;
    public final void rule__Passage__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3007:1: ( ( ( rule__Passage__Group_10__0 )? ) )
            // InternalHouseBuilder.g:3008:1: ( ( rule__Passage__Group_10__0 )? )
            {
            // InternalHouseBuilder.g:3008:1: ( ( rule__Passage__Group_10__0 )? )
            // InternalHouseBuilder.g:3009:2: ( rule__Passage__Group_10__0 )?
            {
             before(grammarAccess.getPassageAccess().getGroup_10()); 
            // InternalHouseBuilder.g:3010:2: ( rule__Passage__Group_10__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==81) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHouseBuilder.g:3010:3: rule__Passage__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Passage__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPassageAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__10__Impl"


    // $ANTLR start "rule__Passage__Group__11"
    // InternalHouseBuilder.g:3018:1: rule__Passage__Group__11 : rule__Passage__Group__11__Impl ;
    public final void rule__Passage__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3022:1: ( rule__Passage__Group__11__Impl )
            // InternalHouseBuilder.g:3023:2: rule__Passage__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__11"


    // $ANTLR start "rule__Passage__Group__11__Impl"
    // InternalHouseBuilder.g:3029:1: rule__Passage__Group__11__Impl : ( '}' ) ;
    public final void rule__Passage__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3033:1: ( ( '}' ) )
            // InternalHouseBuilder.g:3034:1: ( '}' )
            {
            // InternalHouseBuilder.g:3034:1: ( '}' )
            // InternalHouseBuilder.g:3035:2: '}'
            {
             before(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_11()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group__11__Impl"


    // $ANTLR start "rule__Passage__Group_3__0"
    // InternalHouseBuilder.g:3045:1: rule__Passage__Group_3__0 : rule__Passage__Group_3__0__Impl rule__Passage__Group_3__1 ;
    public final void rule__Passage__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3049:1: ( rule__Passage__Group_3__0__Impl rule__Passage__Group_3__1 )
            // InternalHouseBuilder.g:3050:2: rule__Passage__Group_3__0__Impl rule__Passage__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Passage__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_3__0"


    // $ANTLR start "rule__Passage__Group_3__0__Impl"
    // InternalHouseBuilder.g:3057:1: rule__Passage__Group_3__0__Impl : ( 'doorType' ) ;
    public final void rule__Passage__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3061:1: ( ( 'doorType' ) )
            // InternalHouseBuilder.g:3062:1: ( 'doorType' )
            {
            // InternalHouseBuilder.g:3062:1: ( 'doorType' )
            // InternalHouseBuilder.g:3063:2: 'doorType'
            {
             before(grammarAccess.getPassageAccess().getDoorTypeKeyword_3_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDoorTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_3__0__Impl"


    // $ANTLR start "rule__Passage__Group_3__1"
    // InternalHouseBuilder.g:3072:1: rule__Passage__Group_3__1 : rule__Passage__Group_3__1__Impl ;
    public final void rule__Passage__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3076:1: ( rule__Passage__Group_3__1__Impl )
            // InternalHouseBuilder.g:3077:2: rule__Passage__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_3__1"


    // $ANTLR start "rule__Passage__Group_3__1__Impl"
    // InternalHouseBuilder.g:3083:1: rule__Passage__Group_3__1__Impl : ( ( rule__Passage__DoorTypeAssignment_3_1 ) ) ;
    public final void rule__Passage__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3087:1: ( ( ( rule__Passage__DoorTypeAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:3088:1: ( ( rule__Passage__DoorTypeAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:3088:1: ( ( rule__Passage__DoorTypeAssignment_3_1 ) )
            // InternalHouseBuilder.g:3089:2: ( rule__Passage__DoorTypeAssignment_3_1 )
            {
             before(grammarAccess.getPassageAccess().getDoorTypeAssignment_3_1()); 
            // InternalHouseBuilder.g:3090:2: ( rule__Passage__DoorTypeAssignment_3_1 )
            // InternalHouseBuilder.g:3090:3: rule__Passage__DoorTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DoorTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDoorTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_3__1__Impl"


    // $ANTLR start "rule__Passage__Group_4__0"
    // InternalHouseBuilder.g:3099:1: rule__Passage__Group_4__0 : rule__Passage__Group_4__0__Impl rule__Passage__Group_4__1 ;
    public final void rule__Passage__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3103:1: ( rule__Passage__Group_4__0__Impl rule__Passage__Group_4__1 )
            // InternalHouseBuilder.g:3104:2: rule__Passage__Group_4__0__Impl rule__Passage__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Passage__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_4__0"


    // $ANTLR start "rule__Passage__Group_4__0__Impl"
    // InternalHouseBuilder.g:3111:1: rule__Passage__Group_4__0__Impl : ( 'doorsNumber' ) ;
    public final void rule__Passage__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3115:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilder.g:3116:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilder.g:3116:1: ( 'doorsNumber' )
            // InternalHouseBuilder.g:3117:2: 'doorsNumber'
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDoorsNumberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_4__0__Impl"


    // $ANTLR start "rule__Passage__Group_4__1"
    // InternalHouseBuilder.g:3126:1: rule__Passage__Group_4__1 : rule__Passage__Group_4__1__Impl ;
    public final void rule__Passage__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3130:1: ( rule__Passage__Group_4__1__Impl )
            // InternalHouseBuilder.g:3131:2: rule__Passage__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_4__1"


    // $ANTLR start "rule__Passage__Group_4__1__Impl"
    // InternalHouseBuilder.g:3137:1: rule__Passage__Group_4__1__Impl : ( ( rule__Passage__DoorsNumberAssignment_4_1 ) ) ;
    public final void rule__Passage__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3141:1: ( ( ( rule__Passage__DoorsNumberAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:3142:1: ( ( rule__Passage__DoorsNumberAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:3142:1: ( ( rule__Passage__DoorsNumberAssignment_4_1 ) )
            // InternalHouseBuilder.g:3143:2: ( rule__Passage__DoorsNumberAssignment_4_1 )
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberAssignment_4_1()); 
            // InternalHouseBuilder.g:3144:2: ( rule__Passage__DoorsNumberAssignment_4_1 )
            // InternalHouseBuilder.g:3144:3: rule__Passage__DoorsNumberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DoorsNumberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDoorsNumberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_4__1__Impl"


    // $ANTLR start "rule__Passage__Group_5__0"
    // InternalHouseBuilder.g:3153:1: rule__Passage__Group_5__0 : rule__Passage__Group_5__0__Impl rule__Passage__Group_5__1 ;
    public final void rule__Passage__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3157:1: ( rule__Passage__Group_5__0__Impl rule__Passage__Group_5__1 )
            // InternalHouseBuilder.g:3158:2: rule__Passage__Group_5__0__Impl rule__Passage__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Passage__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__0"


    // $ANTLR start "rule__Passage__Group_5__0__Impl"
    // InternalHouseBuilder.g:3165:1: rule__Passage__Group_5__0__Impl : ( 'WxH:' ) ;
    public final void rule__Passage__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3169:1: ( ( 'WxH:' ) )
            // InternalHouseBuilder.g:3170:1: ( 'WxH:' )
            {
            // InternalHouseBuilder.g:3170:1: ( 'WxH:' )
            // InternalHouseBuilder.g:3171:2: 'WxH:'
            {
             before(grammarAccess.getPassageAccess().getWxHKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getWxHKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__0__Impl"


    // $ANTLR start "rule__Passage__Group_5__1"
    // InternalHouseBuilder.g:3180:1: rule__Passage__Group_5__1 : rule__Passage__Group_5__1__Impl rule__Passage__Group_5__2 ;
    public final void rule__Passage__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3184:1: ( rule__Passage__Group_5__1__Impl rule__Passage__Group_5__2 )
            // InternalHouseBuilder.g:3185:2: rule__Passage__Group_5__1__Impl rule__Passage__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__Passage__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__1"


    // $ANTLR start "rule__Passage__Group_5__1__Impl"
    // InternalHouseBuilder.g:3192:1: rule__Passage__Group_5__1__Impl : ( ( rule__Passage__HeightAssignment_5_1 ) ) ;
    public final void rule__Passage__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3196:1: ( ( ( rule__Passage__HeightAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:3197:1: ( ( rule__Passage__HeightAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:3197:1: ( ( rule__Passage__HeightAssignment_5_1 ) )
            // InternalHouseBuilder.g:3198:2: ( rule__Passage__HeightAssignment_5_1 )
            {
             before(grammarAccess.getPassageAccess().getHeightAssignment_5_1()); 
            // InternalHouseBuilder.g:3199:2: ( rule__Passage__HeightAssignment_5_1 )
            // InternalHouseBuilder.g:3199:3: rule__Passage__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__1__Impl"


    // $ANTLR start "rule__Passage__Group_5__2"
    // InternalHouseBuilder.g:3207:1: rule__Passage__Group_5__2 : rule__Passage__Group_5__2__Impl rule__Passage__Group_5__3 ;
    public final void rule__Passage__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3211:1: ( rule__Passage__Group_5__2__Impl rule__Passage__Group_5__3 )
            // InternalHouseBuilder.g:3212:2: rule__Passage__Group_5__2__Impl rule__Passage__Group_5__3
            {
            pushFollow(FOLLOW_24);
            rule__Passage__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__2"


    // $ANTLR start "rule__Passage__Group_5__2__Impl"
    // InternalHouseBuilder.g:3219:1: rule__Passage__Group_5__2__Impl : ( 'x' ) ;
    public final void rule__Passage__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3223:1: ( ( 'x' ) )
            // InternalHouseBuilder.g:3224:1: ( 'x' )
            {
            // InternalHouseBuilder.g:3224:1: ( 'x' )
            // InternalHouseBuilder.g:3225:2: 'x'
            {
             before(grammarAccess.getPassageAccess().getXKeyword_5_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getXKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__2__Impl"


    // $ANTLR start "rule__Passage__Group_5__3"
    // InternalHouseBuilder.g:3234:1: rule__Passage__Group_5__3 : rule__Passage__Group_5__3__Impl ;
    public final void rule__Passage__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3238:1: ( rule__Passage__Group_5__3__Impl )
            // InternalHouseBuilder.g:3239:2: rule__Passage__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__3"


    // $ANTLR start "rule__Passage__Group_5__3__Impl"
    // InternalHouseBuilder.g:3245:1: rule__Passage__Group_5__3__Impl : ( ( rule__Passage__WidthAssignment_5_3 ) ) ;
    public final void rule__Passage__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3249:1: ( ( ( rule__Passage__WidthAssignment_5_3 ) ) )
            // InternalHouseBuilder.g:3250:1: ( ( rule__Passage__WidthAssignment_5_3 ) )
            {
            // InternalHouseBuilder.g:3250:1: ( ( rule__Passage__WidthAssignment_5_3 ) )
            // InternalHouseBuilder.g:3251:2: ( rule__Passage__WidthAssignment_5_3 )
            {
             before(grammarAccess.getPassageAccess().getWidthAssignment_5_3()); 
            // InternalHouseBuilder.g:3252:2: ( rule__Passage__WidthAssignment_5_3 )
            // InternalHouseBuilder.g:3252:3: rule__Passage__WidthAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Passage__WidthAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getWidthAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_5__3__Impl"


    // $ANTLR start "rule__Passage__Group_10__0"
    // InternalHouseBuilder.g:3261:1: rule__Passage__Group_10__0 : rule__Passage__Group_10__0__Impl rule__Passage__Group_10__1 ;
    public final void rule__Passage__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3265:1: ( rule__Passage__Group_10__0__Impl rule__Passage__Group_10__1 )
            // InternalHouseBuilder.g:3266:2: rule__Passage__Group_10__0__Impl rule__Passage__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Passage__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__0"


    // $ANTLR start "rule__Passage__Group_10__0__Impl"
    // InternalHouseBuilder.g:3273:1: rule__Passage__Group_10__0__Impl : ( 'devices' ) ;
    public final void rule__Passage__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3277:1: ( ( 'devices' ) )
            // InternalHouseBuilder.g:3278:1: ( 'devices' )
            {
            // InternalHouseBuilder.g:3278:1: ( 'devices' )
            // InternalHouseBuilder.g:3279:2: 'devices'
            {
             before(grammarAccess.getPassageAccess().getDevicesKeyword_10_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getDevicesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__0__Impl"


    // $ANTLR start "rule__Passage__Group_10__1"
    // InternalHouseBuilder.g:3288:1: rule__Passage__Group_10__1 : rule__Passage__Group_10__1__Impl rule__Passage__Group_10__2 ;
    public final void rule__Passage__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3292:1: ( rule__Passage__Group_10__1__Impl rule__Passage__Group_10__2 )
            // InternalHouseBuilder.g:3293:2: rule__Passage__Group_10__1__Impl rule__Passage__Group_10__2
            {
            pushFollow(FOLLOW_26);
            rule__Passage__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__1"


    // $ANTLR start "rule__Passage__Group_10__1__Impl"
    // InternalHouseBuilder.g:3300:1: rule__Passage__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Passage__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3304:1: ( ( '{' ) )
            // InternalHouseBuilder.g:3305:1: ( '{' )
            {
            // InternalHouseBuilder.g:3305:1: ( '{' )
            // InternalHouseBuilder.g:3306:2: '{'
            {
             before(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__1__Impl"


    // $ANTLR start "rule__Passage__Group_10__2"
    // InternalHouseBuilder.g:3315:1: rule__Passage__Group_10__2 : rule__Passage__Group_10__2__Impl rule__Passage__Group_10__3 ;
    public final void rule__Passage__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3319:1: ( rule__Passage__Group_10__2__Impl rule__Passage__Group_10__3 )
            // InternalHouseBuilder.g:3320:2: rule__Passage__Group_10__2__Impl rule__Passage__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__Passage__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__2"


    // $ANTLR start "rule__Passage__Group_10__2__Impl"
    // InternalHouseBuilder.g:3327:1: rule__Passage__Group_10__2__Impl : ( ( rule__Passage__DevicesAssignment_10_2 ) ) ;
    public final void rule__Passage__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3331:1: ( ( ( rule__Passage__DevicesAssignment_10_2 ) ) )
            // InternalHouseBuilder.g:3332:1: ( ( rule__Passage__DevicesAssignment_10_2 ) )
            {
            // InternalHouseBuilder.g:3332:1: ( ( rule__Passage__DevicesAssignment_10_2 ) )
            // InternalHouseBuilder.g:3333:2: ( rule__Passage__DevicesAssignment_10_2 )
            {
             before(grammarAccess.getPassageAccess().getDevicesAssignment_10_2()); 
            // InternalHouseBuilder.g:3334:2: ( rule__Passage__DevicesAssignment_10_2 )
            // InternalHouseBuilder.g:3334:3: rule__Passage__DevicesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DevicesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDevicesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__2__Impl"


    // $ANTLR start "rule__Passage__Group_10__3"
    // InternalHouseBuilder.g:3342:1: rule__Passage__Group_10__3 : rule__Passage__Group_10__3__Impl rule__Passage__Group_10__4 ;
    public final void rule__Passage__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3346:1: ( rule__Passage__Group_10__3__Impl rule__Passage__Group_10__4 )
            // InternalHouseBuilder.g:3347:2: rule__Passage__Group_10__3__Impl rule__Passage__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Passage__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__3"


    // $ANTLR start "rule__Passage__Group_10__3__Impl"
    // InternalHouseBuilder.g:3354:1: rule__Passage__Group_10__3__Impl : ( ( rule__Passage__Group_10_3__0 )* ) ;
    public final void rule__Passage__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3358:1: ( ( ( rule__Passage__Group_10_3__0 )* ) )
            // InternalHouseBuilder.g:3359:1: ( ( rule__Passage__Group_10_3__0 )* )
            {
            // InternalHouseBuilder.g:3359:1: ( ( rule__Passage__Group_10_3__0 )* )
            // InternalHouseBuilder.g:3360:2: ( rule__Passage__Group_10_3__0 )*
            {
             before(grammarAccess.getPassageAccess().getGroup_10_3()); 
            // InternalHouseBuilder.g:3361:2: ( rule__Passage__Group_10_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==68) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalHouseBuilder.g:3361:3: rule__Passage__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Passage__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getPassageAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__3__Impl"


    // $ANTLR start "rule__Passage__Group_10__4"
    // InternalHouseBuilder.g:3369:1: rule__Passage__Group_10__4 : rule__Passage__Group_10__4__Impl ;
    public final void rule__Passage__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3373:1: ( rule__Passage__Group_10__4__Impl )
            // InternalHouseBuilder.g:3374:2: rule__Passage__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__4"


    // $ANTLR start "rule__Passage__Group_10__4__Impl"
    // InternalHouseBuilder.g:3380:1: rule__Passage__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Passage__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3384:1: ( ( '}' ) )
            // InternalHouseBuilder.g:3385:1: ( '}' )
            {
            // InternalHouseBuilder.g:3385:1: ( '}' )
            // InternalHouseBuilder.g:3386:2: '}'
            {
             before(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10__4__Impl"


    // $ANTLR start "rule__Passage__Group_10_3__0"
    // InternalHouseBuilder.g:3396:1: rule__Passage__Group_10_3__0 : rule__Passage__Group_10_3__0__Impl rule__Passage__Group_10_3__1 ;
    public final void rule__Passage__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3400:1: ( rule__Passage__Group_10_3__0__Impl rule__Passage__Group_10_3__1 )
            // InternalHouseBuilder.g:3401:2: rule__Passage__Group_10_3__0__Impl rule__Passage__Group_10_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Passage__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Passage__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10_3__0"


    // $ANTLR start "rule__Passage__Group_10_3__0__Impl"
    // InternalHouseBuilder.g:3408:1: rule__Passage__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Passage__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3412:1: ( ( ',' ) )
            // InternalHouseBuilder.g:3413:1: ( ',' )
            {
            // InternalHouseBuilder.g:3413:1: ( ',' )
            // InternalHouseBuilder.g:3414:2: ','
            {
             before(grammarAccess.getPassageAccess().getCommaKeyword_10_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPassageAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10_3__0__Impl"


    // $ANTLR start "rule__Passage__Group_10_3__1"
    // InternalHouseBuilder.g:3423:1: rule__Passage__Group_10_3__1 : rule__Passage__Group_10_3__1__Impl ;
    public final void rule__Passage__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3427:1: ( rule__Passage__Group_10_3__1__Impl )
            // InternalHouseBuilder.g:3428:2: rule__Passage__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Passage__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10_3__1"


    // $ANTLR start "rule__Passage__Group_10_3__1__Impl"
    // InternalHouseBuilder.g:3434:1: rule__Passage__Group_10_3__1__Impl : ( ( rule__Passage__DevicesAssignment_10_3_1 ) ) ;
    public final void rule__Passage__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3438:1: ( ( ( rule__Passage__DevicesAssignment_10_3_1 ) ) )
            // InternalHouseBuilder.g:3439:1: ( ( rule__Passage__DevicesAssignment_10_3_1 ) )
            {
            // InternalHouseBuilder.g:3439:1: ( ( rule__Passage__DevicesAssignment_10_3_1 ) )
            // InternalHouseBuilder.g:3440:2: ( rule__Passage__DevicesAssignment_10_3_1 )
            {
             before(grammarAccess.getPassageAccess().getDevicesAssignment_10_3_1()); 
            // InternalHouseBuilder.g:3441:2: ( rule__Passage__DevicesAssignment_10_3_1 )
            // InternalHouseBuilder.g:3441:3: rule__Passage__DevicesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Passage__DevicesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPassageAccess().getDevicesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__Group_10_3__1__Impl"


    // $ANTLR start "rule__Controller__Group__0"
    // InternalHouseBuilder.g:3450:1: rule__Controller__Group__0 : rule__Controller__Group__0__Impl rule__Controller__Group__1 ;
    public final void rule__Controller__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3454:1: ( rule__Controller__Group__0__Impl rule__Controller__Group__1 )
            // InternalHouseBuilder.g:3455:2: rule__Controller__Group__0__Impl rule__Controller__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0"


    // $ANTLR start "rule__Controller__Group__0__Impl"
    // InternalHouseBuilder.g:3462:1: rule__Controller__Group__0__Impl : ( 'Controller' ) ;
    public final void rule__Controller__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3466:1: ( ( 'Controller' ) )
            // InternalHouseBuilder.g:3467:1: ( 'Controller' )
            {
            // InternalHouseBuilder.g:3467:1: ( 'Controller' )
            // InternalHouseBuilder.g:3468:2: 'Controller'
            {
             before(grammarAccess.getControllerAccess().getControllerKeyword_0()); 
            match(input,82,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getControllerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__0__Impl"


    // $ANTLR start "rule__Controller__Group__1"
    // InternalHouseBuilder.g:3477:1: rule__Controller__Group__1 : rule__Controller__Group__1__Impl rule__Controller__Group__2 ;
    public final void rule__Controller__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3481:1: ( rule__Controller__Group__1__Impl rule__Controller__Group__2 )
            // InternalHouseBuilder.g:3482:2: rule__Controller__Group__1__Impl rule__Controller__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1"


    // $ANTLR start "rule__Controller__Group__1__Impl"
    // InternalHouseBuilder.g:3489:1: rule__Controller__Group__1__Impl : ( ( rule__Controller__NameAssignment_1 ) ) ;
    public final void rule__Controller__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3493:1: ( ( ( rule__Controller__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:3494:1: ( ( rule__Controller__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:3494:1: ( ( rule__Controller__NameAssignment_1 ) )
            // InternalHouseBuilder.g:3495:2: ( rule__Controller__NameAssignment_1 )
            {
             before(grammarAccess.getControllerAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:3496:2: ( rule__Controller__NameAssignment_1 )
            // InternalHouseBuilder.g:3496:3: rule__Controller__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__1__Impl"


    // $ANTLR start "rule__Controller__Group__2"
    // InternalHouseBuilder.g:3504:1: rule__Controller__Group__2 : rule__Controller__Group__2__Impl rule__Controller__Group__3 ;
    public final void rule__Controller__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3508:1: ( rule__Controller__Group__2__Impl rule__Controller__Group__3 )
            // InternalHouseBuilder.g:3509:2: rule__Controller__Group__2__Impl rule__Controller__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Controller__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__2"


    // $ANTLR start "rule__Controller__Group__2__Impl"
    // InternalHouseBuilder.g:3516:1: rule__Controller__Group__2__Impl : ( '{' ) ;
    public final void rule__Controller__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3520:1: ( ( '{' ) )
            // InternalHouseBuilder.g:3521:1: ( '{' )
            {
            // InternalHouseBuilder.g:3521:1: ( '{' )
            // InternalHouseBuilder.g:3522:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__2__Impl"


    // $ANTLR start "rule__Controller__Group__3"
    // InternalHouseBuilder.g:3531:1: rule__Controller__Group__3 : rule__Controller__Group__3__Impl rule__Controller__Group__4 ;
    public final void rule__Controller__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3535:1: ( rule__Controller__Group__3__Impl rule__Controller__Group__4 )
            // InternalHouseBuilder.g:3536:2: rule__Controller__Group__3__Impl rule__Controller__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Controller__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__3"


    // $ANTLR start "rule__Controller__Group__3__Impl"
    // InternalHouseBuilder.g:3543:1: rule__Controller__Group__3__Impl : ( ( rule__Controller__Group_3__0 )? ) ;
    public final void rule__Controller__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3547:1: ( ( ( rule__Controller__Group_3__0 )? ) )
            // InternalHouseBuilder.g:3548:1: ( ( rule__Controller__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:3548:1: ( ( rule__Controller__Group_3__0 )? )
            // InternalHouseBuilder.g:3549:2: ( rule__Controller__Group_3__0 )?
            {
             before(grammarAccess.getControllerAccess().getGroup_3()); 
            // InternalHouseBuilder.g:3550:2: ( rule__Controller__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==85) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalHouseBuilder.g:3550:3: rule__Controller__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Controller__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControllerAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__3__Impl"


    // $ANTLR start "rule__Controller__Group__4"
    // InternalHouseBuilder.g:3558:1: rule__Controller__Group__4 : rule__Controller__Group__4__Impl rule__Controller__Group__5 ;
    public final void rule__Controller__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3562:1: ( rule__Controller__Group__4__Impl rule__Controller__Group__5 )
            // InternalHouseBuilder.g:3563:2: rule__Controller__Group__4__Impl rule__Controller__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Controller__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__4"


    // $ANTLR start "rule__Controller__Group__4__Impl"
    // InternalHouseBuilder.g:3570:1: rule__Controller__Group__4__Impl : ( ( rule__Controller__Group_4__0 )? ) ;
    public final void rule__Controller__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3574:1: ( ( ( rule__Controller__Group_4__0 )? ) )
            // InternalHouseBuilder.g:3575:1: ( ( rule__Controller__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:3575:1: ( ( rule__Controller__Group_4__0 )? )
            // InternalHouseBuilder.g:3576:2: ( rule__Controller__Group_4__0 )?
            {
             before(grammarAccess.getControllerAccess().getGroup_4()); 
            // InternalHouseBuilder.g:3577:2: ( rule__Controller__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==86) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHouseBuilder.g:3577:3: rule__Controller__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Controller__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControllerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__4__Impl"


    // $ANTLR start "rule__Controller__Group__5"
    // InternalHouseBuilder.g:3585:1: rule__Controller__Group__5 : rule__Controller__Group__5__Impl rule__Controller__Group__6 ;
    public final void rule__Controller__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3589:1: ( rule__Controller__Group__5__Impl rule__Controller__Group__6 )
            // InternalHouseBuilder.g:3590:2: rule__Controller__Group__5__Impl rule__Controller__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__Controller__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__5"


    // $ANTLR start "rule__Controller__Group__5__Impl"
    // InternalHouseBuilder.g:3597:1: rule__Controller__Group__5__Impl : ( ( rule__Controller__Group_5__0 )? ) ;
    public final void rule__Controller__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3601:1: ( ( ( rule__Controller__Group_5__0 )? ) )
            // InternalHouseBuilder.g:3602:1: ( ( rule__Controller__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:3602:1: ( ( rule__Controller__Group_5__0 )? )
            // InternalHouseBuilder.g:3603:2: ( rule__Controller__Group_5__0 )?
            {
             before(grammarAccess.getControllerAccess().getGroup_5()); 
            // InternalHouseBuilder.g:3604:2: ( rule__Controller__Group_5__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==87) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalHouseBuilder.g:3604:3: rule__Controller__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Controller__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getControllerAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__5__Impl"


    // $ANTLR start "rule__Controller__Group__6"
    // InternalHouseBuilder.g:3612:1: rule__Controller__Group__6 : rule__Controller__Group__6__Impl rule__Controller__Group__7 ;
    public final void rule__Controller__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3616:1: ( rule__Controller__Group__6__Impl rule__Controller__Group__7 )
            // InternalHouseBuilder.g:3617:2: rule__Controller__Group__6__Impl rule__Controller__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__6"


    // $ANTLR start "rule__Controller__Group__6__Impl"
    // InternalHouseBuilder.g:3624:1: rule__Controller__Group__6__Impl : ( 'actuators' ) ;
    public final void rule__Controller__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3628:1: ( ( 'actuators' ) )
            // InternalHouseBuilder.g:3629:1: ( 'actuators' )
            {
            // InternalHouseBuilder.g:3629:1: ( 'actuators' )
            // InternalHouseBuilder.g:3630:2: 'actuators'
            {
             before(grammarAccess.getControllerAccess().getActuatorsKeyword_6()); 
            match(input,83,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getActuatorsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__6__Impl"


    // $ANTLR start "rule__Controller__Group__7"
    // InternalHouseBuilder.g:3639:1: rule__Controller__Group__7 : rule__Controller__Group__7__Impl rule__Controller__Group__8 ;
    public final void rule__Controller__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3643:1: ( rule__Controller__Group__7__Impl rule__Controller__Group__8 )
            // InternalHouseBuilder.g:3644:2: rule__Controller__Group__7__Impl rule__Controller__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Controller__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__7"


    // $ANTLR start "rule__Controller__Group__7__Impl"
    // InternalHouseBuilder.g:3651:1: rule__Controller__Group__7__Impl : ( '{' ) ;
    public final void rule__Controller__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3655:1: ( ( '{' ) )
            // InternalHouseBuilder.g:3656:1: ( '{' )
            {
            // InternalHouseBuilder.g:3656:1: ( '{' )
            // InternalHouseBuilder.g:3657:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__7__Impl"


    // $ANTLR start "rule__Controller__Group__8"
    // InternalHouseBuilder.g:3666:1: rule__Controller__Group__8 : rule__Controller__Group__8__Impl rule__Controller__Group__9 ;
    public final void rule__Controller__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3670:1: ( rule__Controller__Group__8__Impl rule__Controller__Group__9 )
            // InternalHouseBuilder.g:3671:2: rule__Controller__Group__8__Impl rule__Controller__Group__9
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__8"


    // $ANTLR start "rule__Controller__Group__8__Impl"
    // InternalHouseBuilder.g:3678:1: rule__Controller__Group__8__Impl : ( ( rule__Controller__ActuatorsAssignment_8 ) ) ;
    public final void rule__Controller__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3682:1: ( ( ( rule__Controller__ActuatorsAssignment_8 ) ) )
            // InternalHouseBuilder.g:3683:1: ( ( rule__Controller__ActuatorsAssignment_8 ) )
            {
            // InternalHouseBuilder.g:3683:1: ( ( rule__Controller__ActuatorsAssignment_8 ) )
            // InternalHouseBuilder.g:3684:2: ( rule__Controller__ActuatorsAssignment_8 )
            {
             before(grammarAccess.getControllerAccess().getActuatorsAssignment_8()); 
            // InternalHouseBuilder.g:3685:2: ( rule__Controller__ActuatorsAssignment_8 )
            // InternalHouseBuilder.g:3685:3: rule__Controller__ActuatorsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ActuatorsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getActuatorsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__8__Impl"


    // $ANTLR start "rule__Controller__Group__9"
    // InternalHouseBuilder.g:3693:1: rule__Controller__Group__9 : rule__Controller__Group__9__Impl rule__Controller__Group__10 ;
    public final void rule__Controller__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3697:1: ( rule__Controller__Group__9__Impl rule__Controller__Group__10 )
            // InternalHouseBuilder.g:3698:2: rule__Controller__Group__9__Impl rule__Controller__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__9"


    // $ANTLR start "rule__Controller__Group__9__Impl"
    // InternalHouseBuilder.g:3705:1: rule__Controller__Group__9__Impl : ( ( rule__Controller__Group_9__0 )* ) ;
    public final void rule__Controller__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3709:1: ( ( ( rule__Controller__Group_9__0 )* ) )
            // InternalHouseBuilder.g:3710:1: ( ( rule__Controller__Group_9__0 )* )
            {
            // InternalHouseBuilder.g:3710:1: ( ( rule__Controller__Group_9__0 )* )
            // InternalHouseBuilder.g:3711:2: ( rule__Controller__Group_9__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_9()); 
            // InternalHouseBuilder.g:3712:2: ( rule__Controller__Group_9__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==68) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalHouseBuilder.g:3712:3: rule__Controller__Group_9__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Controller__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__9__Impl"


    // $ANTLR start "rule__Controller__Group__10"
    // InternalHouseBuilder.g:3720:1: rule__Controller__Group__10 : rule__Controller__Group__10__Impl rule__Controller__Group__11 ;
    public final void rule__Controller__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3724:1: ( rule__Controller__Group__10__Impl rule__Controller__Group__11 )
            // InternalHouseBuilder.g:3725:2: rule__Controller__Group__10__Impl rule__Controller__Group__11
            {
            pushFollow(FOLLOW_29);
            rule__Controller__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__10"


    // $ANTLR start "rule__Controller__Group__10__Impl"
    // InternalHouseBuilder.g:3732:1: rule__Controller__Group__10__Impl : ( '}' ) ;
    public final void rule__Controller__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3736:1: ( ( '}' ) )
            // InternalHouseBuilder.g:3737:1: ( '}' )
            {
            // InternalHouseBuilder.g:3737:1: ( '}' )
            // InternalHouseBuilder.g:3738:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_10()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__10__Impl"


    // $ANTLR start "rule__Controller__Group__11"
    // InternalHouseBuilder.g:3747:1: rule__Controller__Group__11 : rule__Controller__Group__11__Impl rule__Controller__Group__12 ;
    public final void rule__Controller__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3751:1: ( rule__Controller__Group__11__Impl rule__Controller__Group__12 )
            // InternalHouseBuilder.g:3752:2: rule__Controller__Group__11__Impl rule__Controller__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Controller__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__11"


    // $ANTLR start "rule__Controller__Group__11__Impl"
    // InternalHouseBuilder.g:3759:1: rule__Controller__Group__11__Impl : ( 'sensors' ) ;
    public final void rule__Controller__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3763:1: ( ( 'sensors' ) )
            // InternalHouseBuilder.g:3764:1: ( 'sensors' )
            {
            // InternalHouseBuilder.g:3764:1: ( 'sensors' )
            // InternalHouseBuilder.g:3765:2: 'sensors'
            {
             before(grammarAccess.getControllerAccess().getSensorsKeyword_11()); 
            match(input,84,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getSensorsKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__11__Impl"


    // $ANTLR start "rule__Controller__Group__12"
    // InternalHouseBuilder.g:3774:1: rule__Controller__Group__12 : rule__Controller__Group__12__Impl rule__Controller__Group__13 ;
    public final void rule__Controller__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3778:1: ( rule__Controller__Group__12__Impl rule__Controller__Group__13 )
            // InternalHouseBuilder.g:3779:2: rule__Controller__Group__12__Impl rule__Controller__Group__13
            {
            pushFollow(FOLLOW_30);
            rule__Controller__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__12"


    // $ANTLR start "rule__Controller__Group__12__Impl"
    // InternalHouseBuilder.g:3786:1: rule__Controller__Group__12__Impl : ( '{' ) ;
    public final void rule__Controller__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3790:1: ( ( '{' ) )
            // InternalHouseBuilder.g:3791:1: ( '{' )
            {
            // InternalHouseBuilder.g:3791:1: ( '{' )
            // InternalHouseBuilder.g:3792:2: '{'
            {
             before(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_12()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__12__Impl"


    // $ANTLR start "rule__Controller__Group__13"
    // InternalHouseBuilder.g:3801:1: rule__Controller__Group__13 : rule__Controller__Group__13__Impl rule__Controller__Group__14 ;
    public final void rule__Controller__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3805:1: ( rule__Controller__Group__13__Impl rule__Controller__Group__14 )
            // InternalHouseBuilder.g:3806:2: rule__Controller__Group__13__Impl rule__Controller__Group__14
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__13"


    // $ANTLR start "rule__Controller__Group__13__Impl"
    // InternalHouseBuilder.g:3813:1: rule__Controller__Group__13__Impl : ( ( rule__Controller__SensorsAssignment_13 ) ) ;
    public final void rule__Controller__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3817:1: ( ( ( rule__Controller__SensorsAssignment_13 ) ) )
            // InternalHouseBuilder.g:3818:1: ( ( rule__Controller__SensorsAssignment_13 ) )
            {
            // InternalHouseBuilder.g:3818:1: ( ( rule__Controller__SensorsAssignment_13 ) )
            // InternalHouseBuilder.g:3819:2: ( rule__Controller__SensorsAssignment_13 )
            {
             before(grammarAccess.getControllerAccess().getSensorsAssignment_13()); 
            // InternalHouseBuilder.g:3820:2: ( rule__Controller__SensorsAssignment_13 )
            // InternalHouseBuilder.g:3820:3: rule__Controller__SensorsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Controller__SensorsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getSensorsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__13__Impl"


    // $ANTLR start "rule__Controller__Group__14"
    // InternalHouseBuilder.g:3828:1: rule__Controller__Group__14 : rule__Controller__Group__14__Impl rule__Controller__Group__15 ;
    public final void rule__Controller__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3832:1: ( rule__Controller__Group__14__Impl rule__Controller__Group__15 )
            // InternalHouseBuilder.g:3833:2: rule__Controller__Group__14__Impl rule__Controller__Group__15
            {
            pushFollow(FOLLOW_7);
            rule__Controller__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__14"


    // $ANTLR start "rule__Controller__Group__14__Impl"
    // InternalHouseBuilder.g:3840:1: rule__Controller__Group__14__Impl : ( ( rule__Controller__Group_14__0 )* ) ;
    public final void rule__Controller__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3844:1: ( ( ( rule__Controller__Group_14__0 )* ) )
            // InternalHouseBuilder.g:3845:1: ( ( rule__Controller__Group_14__0 )* )
            {
            // InternalHouseBuilder.g:3845:1: ( ( rule__Controller__Group_14__0 )* )
            // InternalHouseBuilder.g:3846:2: ( rule__Controller__Group_14__0 )*
            {
             before(grammarAccess.getControllerAccess().getGroup_14()); 
            // InternalHouseBuilder.g:3847:2: ( rule__Controller__Group_14__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==68) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalHouseBuilder.g:3847:3: rule__Controller__Group_14__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Controller__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getControllerAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__14__Impl"


    // $ANTLR start "rule__Controller__Group__15"
    // InternalHouseBuilder.g:3855:1: rule__Controller__Group__15 : rule__Controller__Group__15__Impl rule__Controller__Group__16 ;
    public final void rule__Controller__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3859:1: ( rule__Controller__Group__15__Impl rule__Controller__Group__16 )
            // InternalHouseBuilder.g:3860:2: rule__Controller__Group__15__Impl rule__Controller__Group__16
            {
            pushFollow(FOLLOW_19);
            rule__Controller__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__15"


    // $ANTLR start "rule__Controller__Group__15__Impl"
    // InternalHouseBuilder.g:3867:1: rule__Controller__Group__15__Impl : ( '}' ) ;
    public final void rule__Controller__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3871:1: ( ( '}' ) )
            // InternalHouseBuilder.g:3872:1: ( '}' )
            {
            // InternalHouseBuilder.g:3872:1: ( '}' )
            // InternalHouseBuilder.g:3873:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_15()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__15__Impl"


    // $ANTLR start "rule__Controller__Group__16"
    // InternalHouseBuilder.g:3882:1: rule__Controller__Group__16 : rule__Controller__Group__16__Impl ;
    public final void rule__Controller__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3886:1: ( rule__Controller__Group__16__Impl )
            // InternalHouseBuilder.g:3887:2: rule__Controller__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__16"


    // $ANTLR start "rule__Controller__Group__16__Impl"
    // InternalHouseBuilder.g:3893:1: rule__Controller__Group__16__Impl : ( '}' ) ;
    public final void rule__Controller__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3897:1: ( ( '}' ) )
            // InternalHouseBuilder.g:3898:1: ( '}' )
            {
            // InternalHouseBuilder.g:3898:1: ( '}' )
            // InternalHouseBuilder.g:3899:2: '}'
            {
             before(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group__16__Impl"


    // $ANTLR start "rule__Controller__Group_3__0"
    // InternalHouseBuilder.g:3909:1: rule__Controller__Group_3__0 : rule__Controller__Group_3__0__Impl rule__Controller__Group_3__1 ;
    public final void rule__Controller__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3913:1: ( rule__Controller__Group_3__0__Impl rule__Controller__Group_3__1 )
            // InternalHouseBuilder.g:3914:2: rule__Controller__Group_3__0__Impl rule__Controller__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_3__0"


    // $ANTLR start "rule__Controller__Group_3__0__Impl"
    // InternalHouseBuilder.g:3921:1: rule__Controller__Group_3__0__Impl : ( 'model' ) ;
    public final void rule__Controller__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3925:1: ( ( 'model' ) )
            // InternalHouseBuilder.g:3926:1: ( 'model' )
            {
            // InternalHouseBuilder.g:3926:1: ( 'model' )
            // InternalHouseBuilder.g:3927:2: 'model'
            {
             before(grammarAccess.getControllerAccess().getModelKeyword_3_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getModelKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_3__0__Impl"


    // $ANTLR start "rule__Controller__Group_3__1"
    // InternalHouseBuilder.g:3936:1: rule__Controller__Group_3__1 : rule__Controller__Group_3__1__Impl ;
    public final void rule__Controller__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3940:1: ( rule__Controller__Group_3__1__Impl )
            // InternalHouseBuilder.g:3941:2: rule__Controller__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_3__1"


    // $ANTLR start "rule__Controller__Group_3__1__Impl"
    // InternalHouseBuilder.g:3947:1: rule__Controller__Group_3__1__Impl : ( ( rule__Controller__ModelAssignment_3_1 ) ) ;
    public final void rule__Controller__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3951:1: ( ( ( rule__Controller__ModelAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:3952:1: ( ( rule__Controller__ModelAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:3952:1: ( ( rule__Controller__ModelAssignment_3_1 ) )
            // InternalHouseBuilder.g:3953:2: ( rule__Controller__ModelAssignment_3_1 )
            {
             before(grammarAccess.getControllerAccess().getModelAssignment_3_1()); 
            // InternalHouseBuilder.g:3954:2: ( rule__Controller__ModelAssignment_3_1 )
            // InternalHouseBuilder.g:3954:3: rule__Controller__ModelAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ModelAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getModelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_3__1__Impl"


    // $ANTLR start "rule__Controller__Group_4__0"
    // InternalHouseBuilder.g:3963:1: rule__Controller__Group_4__0 : rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 ;
    public final void rule__Controller__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3967:1: ( rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1 )
            // InternalHouseBuilder.g:3968:2: rule__Controller__Group_4__0__Impl rule__Controller__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_4__0"


    // $ANTLR start "rule__Controller__Group_4__0__Impl"
    // InternalHouseBuilder.g:3975:1: rule__Controller__Group_4__0__Impl : ( 'os' ) ;
    public final void rule__Controller__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3979:1: ( ( 'os' ) )
            // InternalHouseBuilder.g:3980:1: ( 'os' )
            {
            // InternalHouseBuilder.g:3980:1: ( 'os' )
            // InternalHouseBuilder.g:3981:2: 'os'
            {
             before(grammarAccess.getControllerAccess().getOsKeyword_4_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getOsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_4__0__Impl"


    // $ANTLR start "rule__Controller__Group_4__1"
    // InternalHouseBuilder.g:3990:1: rule__Controller__Group_4__1 : rule__Controller__Group_4__1__Impl ;
    public final void rule__Controller__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:3994:1: ( rule__Controller__Group_4__1__Impl )
            // InternalHouseBuilder.g:3995:2: rule__Controller__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_4__1"


    // $ANTLR start "rule__Controller__Group_4__1__Impl"
    // InternalHouseBuilder.g:4001:1: rule__Controller__Group_4__1__Impl : ( ( rule__Controller__OsAssignment_4_1 ) ) ;
    public final void rule__Controller__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4005:1: ( ( ( rule__Controller__OsAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:4006:1: ( ( rule__Controller__OsAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:4006:1: ( ( rule__Controller__OsAssignment_4_1 ) )
            // InternalHouseBuilder.g:4007:2: ( rule__Controller__OsAssignment_4_1 )
            {
             before(grammarAccess.getControllerAccess().getOsAssignment_4_1()); 
            // InternalHouseBuilder.g:4008:2: ( rule__Controller__OsAssignment_4_1 )
            // InternalHouseBuilder.g:4008:3: rule__Controller__OsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__OsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getOsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_4__1__Impl"


    // $ANTLR start "rule__Controller__Group_5__0"
    // InternalHouseBuilder.g:4017:1: rule__Controller__Group_5__0 : rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1 ;
    public final void rule__Controller__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4021:1: ( rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1 )
            // InternalHouseBuilder.g:4022:2: rule__Controller__Group_5__0__Impl rule__Controller__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Controller__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__0"


    // $ANTLR start "rule__Controller__Group_5__0__Impl"
    // InternalHouseBuilder.g:4029:1: rule__Controller__Group_5__0__Impl : ( 'osVersion' ) ;
    public final void rule__Controller__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4033:1: ( ( 'osVersion' ) )
            // InternalHouseBuilder.g:4034:1: ( 'osVersion' )
            {
            // InternalHouseBuilder.g:4034:1: ( 'osVersion' )
            // InternalHouseBuilder.g:4035:2: 'osVersion'
            {
             before(grammarAccess.getControllerAccess().getOsVersionKeyword_5_0()); 
            match(input,87,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getOsVersionKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__0__Impl"


    // $ANTLR start "rule__Controller__Group_5__1"
    // InternalHouseBuilder.g:4044:1: rule__Controller__Group_5__1 : rule__Controller__Group_5__1__Impl ;
    public final void rule__Controller__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4048:1: ( rule__Controller__Group_5__1__Impl )
            // InternalHouseBuilder.g:4049:2: rule__Controller__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__1"


    // $ANTLR start "rule__Controller__Group_5__1__Impl"
    // InternalHouseBuilder.g:4055:1: rule__Controller__Group_5__1__Impl : ( ( rule__Controller__OsVersionAssignment_5_1 ) ) ;
    public final void rule__Controller__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4059:1: ( ( ( rule__Controller__OsVersionAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:4060:1: ( ( rule__Controller__OsVersionAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:4060:1: ( ( rule__Controller__OsVersionAssignment_5_1 ) )
            // InternalHouseBuilder.g:4061:2: ( rule__Controller__OsVersionAssignment_5_1 )
            {
             before(grammarAccess.getControllerAccess().getOsVersionAssignment_5_1()); 
            // InternalHouseBuilder.g:4062:2: ( rule__Controller__OsVersionAssignment_5_1 )
            // InternalHouseBuilder.g:4062:3: rule__Controller__OsVersionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__OsVersionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getOsVersionAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_5__1__Impl"


    // $ANTLR start "rule__Controller__Group_9__0"
    // InternalHouseBuilder.g:4071:1: rule__Controller__Group_9__0 : rule__Controller__Group_9__0__Impl rule__Controller__Group_9__1 ;
    public final void rule__Controller__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4075:1: ( rule__Controller__Group_9__0__Impl rule__Controller__Group_9__1 )
            // InternalHouseBuilder.g:4076:2: rule__Controller__Group_9__0__Impl rule__Controller__Group_9__1
            {
            pushFollow(FOLLOW_28);
            rule__Controller__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_9__0"


    // $ANTLR start "rule__Controller__Group_9__0__Impl"
    // InternalHouseBuilder.g:4083:1: rule__Controller__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4087:1: ( ( ',' ) )
            // InternalHouseBuilder.g:4088:1: ( ',' )
            {
            // InternalHouseBuilder.g:4088:1: ( ',' )
            // InternalHouseBuilder.g:4089:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_9_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_9__0__Impl"


    // $ANTLR start "rule__Controller__Group_9__1"
    // InternalHouseBuilder.g:4098:1: rule__Controller__Group_9__1 : rule__Controller__Group_9__1__Impl ;
    public final void rule__Controller__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4102:1: ( rule__Controller__Group_9__1__Impl )
            // InternalHouseBuilder.g:4103:2: rule__Controller__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_9__1"


    // $ANTLR start "rule__Controller__Group_9__1__Impl"
    // InternalHouseBuilder.g:4109:1: rule__Controller__Group_9__1__Impl : ( ( rule__Controller__ActuatorsAssignment_9_1 ) ) ;
    public final void rule__Controller__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4113:1: ( ( ( rule__Controller__ActuatorsAssignment_9_1 ) ) )
            // InternalHouseBuilder.g:4114:1: ( ( rule__Controller__ActuatorsAssignment_9_1 ) )
            {
            // InternalHouseBuilder.g:4114:1: ( ( rule__Controller__ActuatorsAssignment_9_1 ) )
            // InternalHouseBuilder.g:4115:2: ( rule__Controller__ActuatorsAssignment_9_1 )
            {
             before(grammarAccess.getControllerAccess().getActuatorsAssignment_9_1()); 
            // InternalHouseBuilder.g:4116:2: ( rule__Controller__ActuatorsAssignment_9_1 )
            // InternalHouseBuilder.g:4116:3: rule__Controller__ActuatorsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__ActuatorsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getActuatorsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_9__1__Impl"


    // $ANTLR start "rule__Controller__Group_14__0"
    // InternalHouseBuilder.g:4125:1: rule__Controller__Group_14__0 : rule__Controller__Group_14__0__Impl rule__Controller__Group_14__1 ;
    public final void rule__Controller__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4129:1: ( rule__Controller__Group_14__0__Impl rule__Controller__Group_14__1 )
            // InternalHouseBuilder.g:4130:2: rule__Controller__Group_14__0__Impl rule__Controller__Group_14__1
            {
            pushFollow(FOLLOW_30);
            rule__Controller__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Controller__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_14__0"


    // $ANTLR start "rule__Controller__Group_14__0__Impl"
    // InternalHouseBuilder.g:4137:1: rule__Controller__Group_14__0__Impl : ( ',' ) ;
    public final void rule__Controller__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4141:1: ( ( ',' ) )
            // InternalHouseBuilder.g:4142:1: ( ',' )
            {
            // InternalHouseBuilder.g:4142:1: ( ',' )
            // InternalHouseBuilder.g:4143:2: ','
            {
             before(grammarAccess.getControllerAccess().getCommaKeyword_14_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getControllerAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_14__0__Impl"


    // $ANTLR start "rule__Controller__Group_14__1"
    // InternalHouseBuilder.g:4152:1: rule__Controller__Group_14__1 : rule__Controller__Group_14__1__Impl ;
    public final void rule__Controller__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4156:1: ( rule__Controller__Group_14__1__Impl )
            // InternalHouseBuilder.g:4157:2: rule__Controller__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Controller__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_14__1"


    // $ANTLR start "rule__Controller__Group_14__1__Impl"
    // InternalHouseBuilder.g:4163:1: rule__Controller__Group_14__1__Impl : ( ( rule__Controller__SensorsAssignment_14_1 ) ) ;
    public final void rule__Controller__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4167:1: ( ( ( rule__Controller__SensorsAssignment_14_1 ) ) )
            // InternalHouseBuilder.g:4168:1: ( ( rule__Controller__SensorsAssignment_14_1 ) )
            {
            // InternalHouseBuilder.g:4168:1: ( ( rule__Controller__SensorsAssignment_14_1 ) )
            // InternalHouseBuilder.g:4169:2: ( rule__Controller__SensorsAssignment_14_1 )
            {
             before(grammarAccess.getControllerAccess().getSensorsAssignment_14_1()); 
            // InternalHouseBuilder.g:4170:2: ( rule__Controller__SensorsAssignment_14_1 )
            // InternalHouseBuilder.g:4170:3: rule__Controller__SensorsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Controller__SensorsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getControllerAccess().getSensorsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__Group_14__1__Impl"


    // $ANTLR start "rule__Entrance__Group__0"
    // InternalHouseBuilder.g:4179:1: rule__Entrance__Group__0 : rule__Entrance__Group__0__Impl rule__Entrance__Group__1 ;
    public final void rule__Entrance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4183:1: ( rule__Entrance__Group__0__Impl rule__Entrance__Group__1 )
            // InternalHouseBuilder.g:4184:2: rule__Entrance__Group__0__Impl rule__Entrance__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entrance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__0"


    // $ANTLR start "rule__Entrance__Group__0__Impl"
    // InternalHouseBuilder.g:4191:1: rule__Entrance__Group__0__Impl : ( 'Entrance' ) ;
    public final void rule__Entrance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4195:1: ( ( 'Entrance' ) )
            // InternalHouseBuilder.g:4196:1: ( 'Entrance' )
            {
            // InternalHouseBuilder.g:4196:1: ( 'Entrance' )
            // InternalHouseBuilder.g:4197:2: 'Entrance'
            {
             before(grammarAccess.getEntranceAccess().getEntranceKeyword_0()); 
            match(input,88,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getEntranceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__0__Impl"


    // $ANTLR start "rule__Entrance__Group__1"
    // InternalHouseBuilder.g:4206:1: rule__Entrance__Group__1 : rule__Entrance__Group__1__Impl rule__Entrance__Group__2 ;
    public final void rule__Entrance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4210:1: ( rule__Entrance__Group__1__Impl rule__Entrance__Group__2 )
            // InternalHouseBuilder.g:4211:2: rule__Entrance__Group__1__Impl rule__Entrance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entrance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__1"


    // $ANTLR start "rule__Entrance__Group__1__Impl"
    // InternalHouseBuilder.g:4218:1: rule__Entrance__Group__1__Impl : ( ( rule__Entrance__NameAssignment_1 ) ) ;
    public final void rule__Entrance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4222:1: ( ( ( rule__Entrance__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:4223:1: ( ( rule__Entrance__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:4223:1: ( ( rule__Entrance__NameAssignment_1 ) )
            // InternalHouseBuilder.g:4224:2: ( rule__Entrance__NameAssignment_1 )
            {
             before(grammarAccess.getEntranceAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:4225:2: ( rule__Entrance__NameAssignment_1 )
            // InternalHouseBuilder.g:4225:3: rule__Entrance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__1__Impl"


    // $ANTLR start "rule__Entrance__Group__2"
    // InternalHouseBuilder.g:4233:1: rule__Entrance__Group__2 : rule__Entrance__Group__2__Impl rule__Entrance__Group__3 ;
    public final void rule__Entrance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4237:1: ( rule__Entrance__Group__2__Impl rule__Entrance__Group__3 )
            // InternalHouseBuilder.g:4238:2: rule__Entrance__Group__2__Impl rule__Entrance__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Entrance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__2"


    // $ANTLR start "rule__Entrance__Group__2__Impl"
    // InternalHouseBuilder.g:4245:1: rule__Entrance__Group__2__Impl : ( '{' ) ;
    public final void rule__Entrance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4249:1: ( ( '{' ) )
            // InternalHouseBuilder.g:4250:1: ( '{' )
            {
            // InternalHouseBuilder.g:4250:1: ( '{' )
            // InternalHouseBuilder.g:4251:2: '{'
            {
             before(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__2__Impl"


    // $ANTLR start "rule__Entrance__Group__3"
    // InternalHouseBuilder.g:4260:1: rule__Entrance__Group__3 : rule__Entrance__Group__3__Impl rule__Entrance__Group__4 ;
    public final void rule__Entrance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4264:1: ( rule__Entrance__Group__3__Impl rule__Entrance__Group__4 )
            // InternalHouseBuilder.g:4265:2: rule__Entrance__Group__3__Impl rule__Entrance__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__Entrance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__3"


    // $ANTLR start "rule__Entrance__Group__3__Impl"
    // InternalHouseBuilder.g:4272:1: rule__Entrance__Group__3__Impl : ( ( rule__Entrance__Group_3__0 )? ) ;
    public final void rule__Entrance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4276:1: ( ( ( rule__Entrance__Group_3__0 )? ) )
            // InternalHouseBuilder.g:4277:1: ( ( rule__Entrance__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:4277:1: ( ( rule__Entrance__Group_3__0 )? )
            // InternalHouseBuilder.g:4278:2: ( rule__Entrance__Group_3__0 )?
            {
             before(grammarAccess.getEntranceAccess().getGroup_3()); 
            // InternalHouseBuilder.g:4279:2: ( rule__Entrance__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==77) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalHouseBuilder.g:4279:3: rule__Entrance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntranceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__3__Impl"


    // $ANTLR start "rule__Entrance__Group__4"
    // InternalHouseBuilder.g:4287:1: rule__Entrance__Group__4 : rule__Entrance__Group__4__Impl rule__Entrance__Group__5 ;
    public final void rule__Entrance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4291:1: ( rule__Entrance__Group__4__Impl rule__Entrance__Group__5 )
            // InternalHouseBuilder.g:4292:2: rule__Entrance__Group__4__Impl rule__Entrance__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__Entrance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__4"


    // $ANTLR start "rule__Entrance__Group__4__Impl"
    // InternalHouseBuilder.g:4299:1: rule__Entrance__Group__4__Impl : ( ( rule__Entrance__Group_4__0 )? ) ;
    public final void rule__Entrance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4303:1: ( ( ( rule__Entrance__Group_4__0 )? ) )
            // InternalHouseBuilder.g:4304:1: ( ( rule__Entrance__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:4304:1: ( ( rule__Entrance__Group_4__0 )? )
            // InternalHouseBuilder.g:4305:2: ( rule__Entrance__Group_4__0 )?
            {
             before(grammarAccess.getEntranceAccess().getGroup_4()); 
            // InternalHouseBuilder.g:4306:2: ( rule__Entrance__Group_4__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==78) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalHouseBuilder.g:4306:3: rule__Entrance__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrance__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntranceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__4__Impl"


    // $ANTLR start "rule__Entrance__Group__5"
    // InternalHouseBuilder.g:4314:1: rule__Entrance__Group__5 : rule__Entrance__Group__5__Impl rule__Entrance__Group__6 ;
    public final void rule__Entrance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4318:1: ( rule__Entrance__Group__5__Impl rule__Entrance__Group__6 )
            // InternalHouseBuilder.g:4319:2: rule__Entrance__Group__5__Impl rule__Entrance__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__Entrance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__5"


    // $ANTLR start "rule__Entrance__Group__5__Impl"
    // InternalHouseBuilder.g:4326:1: rule__Entrance__Group__5__Impl : ( ( rule__Entrance__Group_5__0 )? ) ;
    public final void rule__Entrance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4330:1: ( ( ( rule__Entrance__Group_5__0 )? ) )
            // InternalHouseBuilder.g:4331:1: ( ( rule__Entrance__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:4331:1: ( ( rule__Entrance__Group_5__0 )? )
            // InternalHouseBuilder.g:4332:2: ( rule__Entrance__Group_5__0 )?
            {
             before(grammarAccess.getEntranceAccess().getGroup_5()); 
            // InternalHouseBuilder.g:4333:2: ( rule__Entrance__Group_5__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==79) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHouseBuilder.g:4333:3: rule__Entrance__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrance__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntranceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__5__Impl"


    // $ANTLR start "rule__Entrance__Group__6"
    // InternalHouseBuilder.g:4341:1: rule__Entrance__Group__6 : rule__Entrance__Group__6__Impl rule__Entrance__Group__7 ;
    public final void rule__Entrance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4345:1: ( rule__Entrance__Group__6__Impl rule__Entrance__Group__7 )
            // InternalHouseBuilder.g:4346:2: rule__Entrance__Group__6__Impl rule__Entrance__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Entrance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__6"


    // $ANTLR start "rule__Entrance__Group__6__Impl"
    // InternalHouseBuilder.g:4353:1: rule__Entrance__Group__6__Impl : ( 'space' ) ;
    public final void rule__Entrance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4357:1: ( ( 'space' ) )
            // InternalHouseBuilder.g:4358:1: ( 'space' )
            {
            // InternalHouseBuilder.g:4358:1: ( 'space' )
            // InternalHouseBuilder.g:4359:2: 'space'
            {
             before(grammarAccess.getEntranceAccess().getSpaceKeyword_6()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getSpaceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__6__Impl"


    // $ANTLR start "rule__Entrance__Group__7"
    // InternalHouseBuilder.g:4368:1: rule__Entrance__Group__7 : rule__Entrance__Group__7__Impl rule__Entrance__Group__8 ;
    public final void rule__Entrance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4372:1: ( rule__Entrance__Group__7__Impl rule__Entrance__Group__8 )
            // InternalHouseBuilder.g:4373:2: rule__Entrance__Group__7__Impl rule__Entrance__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__Entrance__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__7"


    // $ANTLR start "rule__Entrance__Group__7__Impl"
    // InternalHouseBuilder.g:4380:1: rule__Entrance__Group__7__Impl : ( ( rule__Entrance__SpaceAssignment_7 ) ) ;
    public final void rule__Entrance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4384:1: ( ( ( rule__Entrance__SpaceAssignment_7 ) ) )
            // InternalHouseBuilder.g:4385:1: ( ( rule__Entrance__SpaceAssignment_7 ) )
            {
            // InternalHouseBuilder.g:4385:1: ( ( rule__Entrance__SpaceAssignment_7 ) )
            // InternalHouseBuilder.g:4386:2: ( rule__Entrance__SpaceAssignment_7 )
            {
             before(grammarAccess.getEntranceAccess().getSpaceAssignment_7()); 
            // InternalHouseBuilder.g:4387:2: ( rule__Entrance__SpaceAssignment_7 )
            // InternalHouseBuilder.g:4387:3: rule__Entrance__SpaceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__SpaceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getSpaceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__7__Impl"


    // $ANTLR start "rule__Entrance__Group__8"
    // InternalHouseBuilder.g:4395:1: rule__Entrance__Group__8 : rule__Entrance__Group__8__Impl rule__Entrance__Group__9 ;
    public final void rule__Entrance__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4399:1: ( rule__Entrance__Group__8__Impl rule__Entrance__Group__9 )
            // InternalHouseBuilder.g:4400:2: rule__Entrance__Group__8__Impl rule__Entrance__Group__9
            {
            pushFollow(FOLLOW_22);
            rule__Entrance__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__8"


    // $ANTLR start "rule__Entrance__Group__8__Impl"
    // InternalHouseBuilder.g:4407:1: rule__Entrance__Group__8__Impl : ( ( rule__Entrance__Group_8__0 )? ) ;
    public final void rule__Entrance__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4411:1: ( ( ( rule__Entrance__Group_8__0 )? ) )
            // InternalHouseBuilder.g:4412:1: ( ( rule__Entrance__Group_8__0 )? )
            {
            // InternalHouseBuilder.g:4412:1: ( ( rule__Entrance__Group_8__0 )? )
            // InternalHouseBuilder.g:4413:2: ( rule__Entrance__Group_8__0 )?
            {
             before(grammarAccess.getEntranceAccess().getGroup_8()); 
            // InternalHouseBuilder.g:4414:2: ( rule__Entrance__Group_8__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==81) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHouseBuilder.g:4414:3: rule__Entrance__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entrance__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntranceAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__8__Impl"


    // $ANTLR start "rule__Entrance__Group__9"
    // InternalHouseBuilder.g:4422:1: rule__Entrance__Group__9 : rule__Entrance__Group__9__Impl ;
    public final void rule__Entrance__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4426:1: ( rule__Entrance__Group__9__Impl )
            // InternalHouseBuilder.g:4427:2: rule__Entrance__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__9"


    // $ANTLR start "rule__Entrance__Group__9__Impl"
    // InternalHouseBuilder.g:4433:1: rule__Entrance__Group__9__Impl : ( '}' ) ;
    public final void rule__Entrance__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4437:1: ( ( '}' ) )
            // InternalHouseBuilder.g:4438:1: ( '}' )
            {
            // InternalHouseBuilder.g:4438:1: ( '}' )
            // InternalHouseBuilder.g:4439:2: '}'
            {
             before(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_9()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group__9__Impl"


    // $ANTLR start "rule__Entrance__Group_3__0"
    // InternalHouseBuilder.g:4449:1: rule__Entrance__Group_3__0 : rule__Entrance__Group_3__0__Impl rule__Entrance__Group_3__1 ;
    public final void rule__Entrance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4453:1: ( rule__Entrance__Group_3__0__Impl rule__Entrance__Group_3__1 )
            // InternalHouseBuilder.g:4454:2: rule__Entrance__Group_3__0__Impl rule__Entrance__Group_3__1
            {
            pushFollow(FOLLOW_23);
            rule__Entrance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_3__0"


    // $ANTLR start "rule__Entrance__Group_3__0__Impl"
    // InternalHouseBuilder.g:4461:1: rule__Entrance__Group_3__0__Impl : ( 'doorType' ) ;
    public final void rule__Entrance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4465:1: ( ( 'doorType' ) )
            // InternalHouseBuilder.g:4466:1: ( 'doorType' )
            {
            // InternalHouseBuilder.g:4466:1: ( 'doorType' )
            // InternalHouseBuilder.g:4467:2: 'doorType'
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeKeyword_3_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDoorTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_3__0__Impl"


    // $ANTLR start "rule__Entrance__Group_3__1"
    // InternalHouseBuilder.g:4476:1: rule__Entrance__Group_3__1 : rule__Entrance__Group_3__1__Impl ;
    public final void rule__Entrance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4480:1: ( rule__Entrance__Group_3__1__Impl )
            // InternalHouseBuilder.g:4481:2: rule__Entrance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_3__1"


    // $ANTLR start "rule__Entrance__Group_3__1__Impl"
    // InternalHouseBuilder.g:4487:1: rule__Entrance__Group_3__1__Impl : ( ( rule__Entrance__DoorTypeAssignment_3_1 ) ) ;
    public final void rule__Entrance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4491:1: ( ( ( rule__Entrance__DoorTypeAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:4492:1: ( ( rule__Entrance__DoorTypeAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:4492:1: ( ( rule__Entrance__DoorTypeAssignment_3_1 ) )
            // InternalHouseBuilder.g:4493:2: ( rule__Entrance__DoorTypeAssignment_3_1 )
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeAssignment_3_1()); 
            // InternalHouseBuilder.g:4494:2: ( rule__Entrance__DoorTypeAssignment_3_1 )
            // InternalHouseBuilder.g:4494:3: rule__Entrance__DoorTypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DoorTypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDoorTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_3__1__Impl"


    // $ANTLR start "rule__Entrance__Group_4__0"
    // InternalHouseBuilder.g:4503:1: rule__Entrance__Group_4__0 : rule__Entrance__Group_4__0__Impl rule__Entrance__Group_4__1 ;
    public final void rule__Entrance__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4507:1: ( rule__Entrance__Group_4__0__Impl rule__Entrance__Group_4__1 )
            // InternalHouseBuilder.g:4508:2: rule__Entrance__Group_4__0__Impl rule__Entrance__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Entrance__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_4__0"


    // $ANTLR start "rule__Entrance__Group_4__0__Impl"
    // InternalHouseBuilder.g:4515:1: rule__Entrance__Group_4__0__Impl : ( 'doorsNumber' ) ;
    public final void rule__Entrance__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4519:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilder.g:4520:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilder.g:4520:1: ( 'doorsNumber' )
            // InternalHouseBuilder.g:4521:2: 'doorsNumber'
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDoorsNumberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_4__0__Impl"


    // $ANTLR start "rule__Entrance__Group_4__1"
    // InternalHouseBuilder.g:4530:1: rule__Entrance__Group_4__1 : rule__Entrance__Group_4__1__Impl ;
    public final void rule__Entrance__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4534:1: ( rule__Entrance__Group_4__1__Impl )
            // InternalHouseBuilder.g:4535:2: rule__Entrance__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_4__1"


    // $ANTLR start "rule__Entrance__Group_4__1__Impl"
    // InternalHouseBuilder.g:4541:1: rule__Entrance__Group_4__1__Impl : ( ( rule__Entrance__DoorsNumberAssignment_4_1 ) ) ;
    public final void rule__Entrance__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4545:1: ( ( ( rule__Entrance__DoorsNumberAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:4546:1: ( ( rule__Entrance__DoorsNumberAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:4546:1: ( ( rule__Entrance__DoorsNumberAssignment_4_1 ) )
            // InternalHouseBuilder.g:4547:2: ( rule__Entrance__DoorsNumberAssignment_4_1 )
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberAssignment_4_1()); 
            // InternalHouseBuilder.g:4548:2: ( rule__Entrance__DoorsNumberAssignment_4_1 )
            // InternalHouseBuilder.g:4548:3: rule__Entrance__DoorsNumberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DoorsNumberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDoorsNumberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_4__1__Impl"


    // $ANTLR start "rule__Entrance__Group_5__0"
    // InternalHouseBuilder.g:4557:1: rule__Entrance__Group_5__0 : rule__Entrance__Group_5__0__Impl rule__Entrance__Group_5__1 ;
    public final void rule__Entrance__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4561:1: ( rule__Entrance__Group_5__0__Impl rule__Entrance__Group_5__1 )
            // InternalHouseBuilder.g:4562:2: rule__Entrance__Group_5__0__Impl rule__Entrance__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Entrance__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__0"


    // $ANTLR start "rule__Entrance__Group_5__0__Impl"
    // InternalHouseBuilder.g:4569:1: rule__Entrance__Group_5__0__Impl : ( 'WxH:' ) ;
    public final void rule__Entrance__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4573:1: ( ( 'WxH:' ) )
            // InternalHouseBuilder.g:4574:1: ( 'WxH:' )
            {
            // InternalHouseBuilder.g:4574:1: ( 'WxH:' )
            // InternalHouseBuilder.g:4575:2: 'WxH:'
            {
             before(grammarAccess.getEntranceAccess().getWxHKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getWxHKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__0__Impl"


    // $ANTLR start "rule__Entrance__Group_5__1"
    // InternalHouseBuilder.g:4584:1: rule__Entrance__Group_5__1 : rule__Entrance__Group_5__1__Impl rule__Entrance__Group_5__2 ;
    public final void rule__Entrance__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4588:1: ( rule__Entrance__Group_5__1__Impl rule__Entrance__Group_5__2 )
            // InternalHouseBuilder.g:4589:2: rule__Entrance__Group_5__1__Impl rule__Entrance__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__Entrance__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__1"


    // $ANTLR start "rule__Entrance__Group_5__1__Impl"
    // InternalHouseBuilder.g:4596:1: rule__Entrance__Group_5__1__Impl : ( ( rule__Entrance__HeightAssignment_5_1 ) ) ;
    public final void rule__Entrance__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4600:1: ( ( ( rule__Entrance__HeightAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:4601:1: ( ( rule__Entrance__HeightAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:4601:1: ( ( rule__Entrance__HeightAssignment_5_1 ) )
            // InternalHouseBuilder.g:4602:2: ( rule__Entrance__HeightAssignment_5_1 )
            {
             before(grammarAccess.getEntranceAccess().getHeightAssignment_5_1()); 
            // InternalHouseBuilder.g:4603:2: ( rule__Entrance__HeightAssignment_5_1 )
            // InternalHouseBuilder.g:4603:3: rule__Entrance__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__1__Impl"


    // $ANTLR start "rule__Entrance__Group_5__2"
    // InternalHouseBuilder.g:4611:1: rule__Entrance__Group_5__2 : rule__Entrance__Group_5__2__Impl rule__Entrance__Group_5__3 ;
    public final void rule__Entrance__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4615:1: ( rule__Entrance__Group_5__2__Impl rule__Entrance__Group_5__3 )
            // InternalHouseBuilder.g:4616:2: rule__Entrance__Group_5__2__Impl rule__Entrance__Group_5__3
            {
            pushFollow(FOLLOW_24);
            rule__Entrance__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__2"


    // $ANTLR start "rule__Entrance__Group_5__2__Impl"
    // InternalHouseBuilder.g:4623:1: rule__Entrance__Group_5__2__Impl : ( 'x' ) ;
    public final void rule__Entrance__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4627:1: ( ( 'x' ) )
            // InternalHouseBuilder.g:4628:1: ( 'x' )
            {
            // InternalHouseBuilder.g:4628:1: ( 'x' )
            // InternalHouseBuilder.g:4629:2: 'x'
            {
             before(grammarAccess.getEntranceAccess().getXKeyword_5_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getXKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__2__Impl"


    // $ANTLR start "rule__Entrance__Group_5__3"
    // InternalHouseBuilder.g:4638:1: rule__Entrance__Group_5__3 : rule__Entrance__Group_5__3__Impl ;
    public final void rule__Entrance__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4642:1: ( rule__Entrance__Group_5__3__Impl )
            // InternalHouseBuilder.g:4643:2: rule__Entrance__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__3"


    // $ANTLR start "rule__Entrance__Group_5__3__Impl"
    // InternalHouseBuilder.g:4649:1: rule__Entrance__Group_5__3__Impl : ( ( rule__Entrance__WidthAssignment_5_3 ) ) ;
    public final void rule__Entrance__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4653:1: ( ( ( rule__Entrance__WidthAssignment_5_3 ) ) )
            // InternalHouseBuilder.g:4654:1: ( ( rule__Entrance__WidthAssignment_5_3 ) )
            {
            // InternalHouseBuilder.g:4654:1: ( ( rule__Entrance__WidthAssignment_5_3 ) )
            // InternalHouseBuilder.g:4655:2: ( rule__Entrance__WidthAssignment_5_3 )
            {
             before(grammarAccess.getEntranceAccess().getWidthAssignment_5_3()); 
            // InternalHouseBuilder.g:4656:2: ( rule__Entrance__WidthAssignment_5_3 )
            // InternalHouseBuilder.g:4656:3: rule__Entrance__WidthAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__WidthAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getWidthAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_5__3__Impl"


    // $ANTLR start "rule__Entrance__Group_8__0"
    // InternalHouseBuilder.g:4665:1: rule__Entrance__Group_8__0 : rule__Entrance__Group_8__0__Impl rule__Entrance__Group_8__1 ;
    public final void rule__Entrance__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4669:1: ( rule__Entrance__Group_8__0__Impl rule__Entrance__Group_8__1 )
            // InternalHouseBuilder.g:4670:2: rule__Entrance__Group_8__0__Impl rule__Entrance__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Entrance__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__0"


    // $ANTLR start "rule__Entrance__Group_8__0__Impl"
    // InternalHouseBuilder.g:4677:1: rule__Entrance__Group_8__0__Impl : ( 'devices' ) ;
    public final void rule__Entrance__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4681:1: ( ( 'devices' ) )
            // InternalHouseBuilder.g:4682:1: ( 'devices' )
            {
            // InternalHouseBuilder.g:4682:1: ( 'devices' )
            // InternalHouseBuilder.g:4683:2: 'devices'
            {
             before(grammarAccess.getEntranceAccess().getDevicesKeyword_8_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getDevicesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__0__Impl"


    // $ANTLR start "rule__Entrance__Group_8__1"
    // InternalHouseBuilder.g:4692:1: rule__Entrance__Group_8__1 : rule__Entrance__Group_8__1__Impl rule__Entrance__Group_8__2 ;
    public final void rule__Entrance__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4696:1: ( rule__Entrance__Group_8__1__Impl rule__Entrance__Group_8__2 )
            // InternalHouseBuilder.g:4697:2: rule__Entrance__Group_8__1__Impl rule__Entrance__Group_8__2
            {
            pushFollow(FOLLOW_26);
            rule__Entrance__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__1"


    // $ANTLR start "rule__Entrance__Group_8__1__Impl"
    // InternalHouseBuilder.g:4704:1: rule__Entrance__Group_8__1__Impl : ( '{' ) ;
    public final void rule__Entrance__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4708:1: ( ( '{' ) )
            // InternalHouseBuilder.g:4709:1: ( '{' )
            {
            // InternalHouseBuilder.g:4709:1: ( '{' )
            // InternalHouseBuilder.g:4710:2: '{'
            {
             before(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_8_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__1__Impl"


    // $ANTLR start "rule__Entrance__Group_8__2"
    // InternalHouseBuilder.g:4719:1: rule__Entrance__Group_8__2 : rule__Entrance__Group_8__2__Impl rule__Entrance__Group_8__3 ;
    public final void rule__Entrance__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4723:1: ( rule__Entrance__Group_8__2__Impl rule__Entrance__Group_8__3 )
            // InternalHouseBuilder.g:4724:2: rule__Entrance__Group_8__2__Impl rule__Entrance__Group_8__3
            {
            pushFollow(FOLLOW_7);
            rule__Entrance__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__2"


    // $ANTLR start "rule__Entrance__Group_8__2__Impl"
    // InternalHouseBuilder.g:4731:1: rule__Entrance__Group_8__2__Impl : ( ( rule__Entrance__DevicesAssignment_8_2 ) ) ;
    public final void rule__Entrance__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4735:1: ( ( ( rule__Entrance__DevicesAssignment_8_2 ) ) )
            // InternalHouseBuilder.g:4736:1: ( ( rule__Entrance__DevicesAssignment_8_2 ) )
            {
            // InternalHouseBuilder.g:4736:1: ( ( rule__Entrance__DevicesAssignment_8_2 ) )
            // InternalHouseBuilder.g:4737:2: ( rule__Entrance__DevicesAssignment_8_2 )
            {
             before(grammarAccess.getEntranceAccess().getDevicesAssignment_8_2()); 
            // InternalHouseBuilder.g:4738:2: ( rule__Entrance__DevicesAssignment_8_2 )
            // InternalHouseBuilder.g:4738:3: rule__Entrance__DevicesAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DevicesAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDevicesAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__2__Impl"


    // $ANTLR start "rule__Entrance__Group_8__3"
    // InternalHouseBuilder.g:4746:1: rule__Entrance__Group_8__3 : rule__Entrance__Group_8__3__Impl rule__Entrance__Group_8__4 ;
    public final void rule__Entrance__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4750:1: ( rule__Entrance__Group_8__3__Impl rule__Entrance__Group_8__4 )
            // InternalHouseBuilder.g:4751:2: rule__Entrance__Group_8__3__Impl rule__Entrance__Group_8__4
            {
            pushFollow(FOLLOW_7);
            rule__Entrance__Group_8__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__3"


    // $ANTLR start "rule__Entrance__Group_8__3__Impl"
    // InternalHouseBuilder.g:4758:1: rule__Entrance__Group_8__3__Impl : ( ( rule__Entrance__Group_8_3__0 )* ) ;
    public final void rule__Entrance__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4762:1: ( ( ( rule__Entrance__Group_8_3__0 )* ) )
            // InternalHouseBuilder.g:4763:1: ( ( rule__Entrance__Group_8_3__0 )* )
            {
            // InternalHouseBuilder.g:4763:1: ( ( rule__Entrance__Group_8_3__0 )* )
            // InternalHouseBuilder.g:4764:2: ( rule__Entrance__Group_8_3__0 )*
            {
             before(grammarAccess.getEntranceAccess().getGroup_8_3()); 
            // InternalHouseBuilder.g:4765:2: ( rule__Entrance__Group_8_3__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==68) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalHouseBuilder.g:4765:3: rule__Entrance__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Entrance__Group_8_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getEntranceAccess().getGroup_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__3__Impl"


    // $ANTLR start "rule__Entrance__Group_8__4"
    // InternalHouseBuilder.g:4773:1: rule__Entrance__Group_8__4 : rule__Entrance__Group_8__4__Impl ;
    public final void rule__Entrance__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4777:1: ( rule__Entrance__Group_8__4__Impl )
            // InternalHouseBuilder.g:4778:2: rule__Entrance__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__4"


    // $ANTLR start "rule__Entrance__Group_8__4__Impl"
    // InternalHouseBuilder.g:4784:1: rule__Entrance__Group_8__4__Impl : ( '}' ) ;
    public final void rule__Entrance__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4788:1: ( ( '}' ) )
            // InternalHouseBuilder.g:4789:1: ( '}' )
            {
            // InternalHouseBuilder.g:4789:1: ( '}' )
            // InternalHouseBuilder.g:4790:2: '}'
            {
             before(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_8_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_8_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8__4__Impl"


    // $ANTLR start "rule__Entrance__Group_8_3__0"
    // InternalHouseBuilder.g:4800:1: rule__Entrance__Group_8_3__0 : rule__Entrance__Group_8_3__0__Impl rule__Entrance__Group_8_3__1 ;
    public final void rule__Entrance__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4804:1: ( rule__Entrance__Group_8_3__0__Impl rule__Entrance__Group_8_3__1 )
            // InternalHouseBuilder.g:4805:2: rule__Entrance__Group_8_3__0__Impl rule__Entrance__Group_8_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Entrance__Group_8_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8_3__0"


    // $ANTLR start "rule__Entrance__Group_8_3__0__Impl"
    // InternalHouseBuilder.g:4812:1: rule__Entrance__Group_8_3__0__Impl : ( ',' ) ;
    public final void rule__Entrance__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4816:1: ( ( ',' ) )
            // InternalHouseBuilder.g:4817:1: ( ',' )
            {
            // InternalHouseBuilder.g:4817:1: ( ',' )
            // InternalHouseBuilder.g:4818:2: ','
            {
             before(grammarAccess.getEntranceAccess().getCommaKeyword_8_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getEntranceAccess().getCommaKeyword_8_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8_3__0__Impl"


    // $ANTLR start "rule__Entrance__Group_8_3__1"
    // InternalHouseBuilder.g:4827:1: rule__Entrance__Group_8_3__1 : rule__Entrance__Group_8_3__1__Impl ;
    public final void rule__Entrance__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4831:1: ( rule__Entrance__Group_8_3__1__Impl )
            // InternalHouseBuilder.g:4832:2: rule__Entrance__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__Group_8_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8_3__1"


    // $ANTLR start "rule__Entrance__Group_8_3__1__Impl"
    // InternalHouseBuilder.g:4838:1: rule__Entrance__Group_8_3__1__Impl : ( ( rule__Entrance__DevicesAssignment_8_3_1 ) ) ;
    public final void rule__Entrance__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4842:1: ( ( ( rule__Entrance__DevicesAssignment_8_3_1 ) ) )
            // InternalHouseBuilder.g:4843:1: ( ( rule__Entrance__DevicesAssignment_8_3_1 ) )
            {
            // InternalHouseBuilder.g:4843:1: ( ( rule__Entrance__DevicesAssignment_8_3_1 ) )
            // InternalHouseBuilder.g:4844:2: ( rule__Entrance__DevicesAssignment_8_3_1 )
            {
             before(grammarAccess.getEntranceAccess().getDevicesAssignment_8_3_1()); 
            // InternalHouseBuilder.g:4845:2: ( rule__Entrance__DevicesAssignment_8_3_1 )
            // InternalHouseBuilder.g:4845:3: rule__Entrance__DevicesAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entrance__DevicesAssignment_8_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntranceAccess().getDevicesAssignment_8_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__Group_8_3__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalHouseBuilder.g:4854:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4858:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalHouseBuilder.g:4859:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalHouseBuilder.g:4866:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4870:1: ( ( ( '-' )? ) )
            // InternalHouseBuilder.g:4871:1: ( ( '-' )? )
            {
            // InternalHouseBuilder.g:4871:1: ( ( '-' )? )
            // InternalHouseBuilder.g:4872:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalHouseBuilder.g:4873:2: ( '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==90) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHouseBuilder.g:4873:3: '-'
                    {
                    match(input,90,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalHouseBuilder.g:4881:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4885:1: ( rule__EInt__Group__1__Impl )
            // InternalHouseBuilder.g:4886:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalHouseBuilder.g:4892:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4896:1: ( ( RULE_INT ) )
            // InternalHouseBuilder.g:4897:1: ( RULE_INT )
            {
            // InternalHouseBuilder.g:4897:1: ( RULE_INT )
            // InternalHouseBuilder.g:4898:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__0"
    // InternalHouseBuilder.g:4908:1: rule__EFloat__Group__0 : rule__EFloat__Group__0__Impl rule__EFloat__Group__1 ;
    public final void rule__EFloat__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4912:1: ( rule__EFloat__Group__0__Impl rule__EFloat__Group__1 )
            // InternalHouseBuilder.g:4913:2: rule__EFloat__Group__0__Impl rule__EFloat__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__EFloat__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0"


    // $ANTLR start "rule__EFloat__Group__0__Impl"
    // InternalHouseBuilder.g:4920:1: rule__EFloat__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4924:1: ( ( ( '-' )? ) )
            // InternalHouseBuilder.g:4925:1: ( ( '-' )? )
            {
            // InternalHouseBuilder.g:4925:1: ( ( '-' )? )
            // InternalHouseBuilder.g:4926:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
            // InternalHouseBuilder.g:4927:2: ( '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==90) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHouseBuilder.g:4927:3: '-'
                    {
                    match(input,90,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__0__Impl"


    // $ANTLR start "rule__EFloat__Group__1"
    // InternalHouseBuilder.g:4935:1: rule__EFloat__Group__1 : rule__EFloat__Group__1__Impl rule__EFloat__Group__2 ;
    public final void rule__EFloat__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4939:1: ( rule__EFloat__Group__1__Impl rule__EFloat__Group__2 )
            // InternalHouseBuilder.g:4940:2: rule__EFloat__Group__1__Impl rule__EFloat__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__EFloat__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1"


    // $ANTLR start "rule__EFloat__Group__1__Impl"
    // InternalHouseBuilder.g:4947:1: rule__EFloat__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EFloat__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4951:1: ( ( ( RULE_INT )? ) )
            // InternalHouseBuilder.g:4952:1: ( ( RULE_INT )? )
            {
            // InternalHouseBuilder.g:4952:1: ( ( RULE_INT )? )
            // InternalHouseBuilder.g:4953:2: ( RULE_INT )?
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
            // InternalHouseBuilder.g:4954:2: ( RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalHouseBuilder.g:4954:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__1__Impl"


    // $ANTLR start "rule__EFloat__Group__2"
    // InternalHouseBuilder.g:4962:1: rule__EFloat__Group__2 : rule__EFloat__Group__2__Impl rule__EFloat__Group__3 ;
    public final void rule__EFloat__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4966:1: ( rule__EFloat__Group__2__Impl rule__EFloat__Group__3 )
            // InternalHouseBuilder.g:4967:2: rule__EFloat__Group__2__Impl rule__EFloat__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__EFloat__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2"


    // $ANTLR start "rule__EFloat__Group__2__Impl"
    // InternalHouseBuilder.g:4974:1: rule__EFloat__Group__2__Impl : ( '.' ) ;
    public final void rule__EFloat__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4978:1: ( ( '.' ) )
            // InternalHouseBuilder.g:4979:1: ( '.' )
            {
            // InternalHouseBuilder.g:4979:1: ( '.' )
            // InternalHouseBuilder.g:4980:2: '.'
            {
             before(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
            match(input,91,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__2__Impl"


    // $ANTLR start "rule__EFloat__Group__3"
    // InternalHouseBuilder.g:4989:1: rule__EFloat__Group__3 : rule__EFloat__Group__3__Impl rule__EFloat__Group__4 ;
    public final void rule__EFloat__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:4993:1: ( rule__EFloat__Group__3__Impl rule__EFloat__Group__4 )
            // InternalHouseBuilder.g:4994:2: rule__EFloat__Group__3__Impl rule__EFloat__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__EFloat__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3"


    // $ANTLR start "rule__EFloat__Group__3__Impl"
    // InternalHouseBuilder.g:5001:1: rule__EFloat__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5005:1: ( ( RULE_INT ) )
            // InternalHouseBuilder.g:5006:1: ( RULE_INT )
            {
            // InternalHouseBuilder.g:5006:1: ( RULE_INT )
            // InternalHouseBuilder.g:5007:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__3__Impl"


    // $ANTLR start "rule__EFloat__Group__4"
    // InternalHouseBuilder.g:5016:1: rule__EFloat__Group__4 : rule__EFloat__Group__4__Impl ;
    public final void rule__EFloat__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5020:1: ( rule__EFloat__Group__4__Impl )
            // InternalHouseBuilder.g:5021:2: rule__EFloat__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4"


    // $ANTLR start "rule__EFloat__Group__4__Impl"
    // InternalHouseBuilder.g:5027:1: rule__EFloat__Group__4__Impl : ( ( rule__EFloat__Group_4__0 )? ) ;
    public final void rule__EFloat__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5031:1: ( ( ( rule__EFloat__Group_4__0 )? ) )
            // InternalHouseBuilder.g:5032:1: ( ( rule__EFloat__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:5032:1: ( ( rule__EFloat__Group_4__0 )? )
            // InternalHouseBuilder.g:5033:2: ( rule__EFloat__Group_4__0 )?
            {
             before(grammarAccess.getEFloatAccess().getGroup_4()); 
            // InternalHouseBuilder.g:5034:2: ( rule__EFloat__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=11 && LA42_0<=12)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHouseBuilder.g:5034:3: rule__EFloat__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EFloat__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group__4__Impl"


    // $ANTLR start "rule__EFloat__Group_4__0"
    // InternalHouseBuilder.g:5043:1: rule__EFloat__Group_4__0 : rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 ;
    public final void rule__EFloat__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5047:1: ( rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1 )
            // InternalHouseBuilder.g:5048:2: rule__EFloat__Group_4__0__Impl rule__EFloat__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__EFloat__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0"


    // $ANTLR start "rule__EFloat__Group_4__0__Impl"
    // InternalHouseBuilder.g:5055:1: rule__EFloat__Group_4__0__Impl : ( ( rule__EFloat__Alternatives_4_0 ) ) ;
    public final void rule__EFloat__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5059:1: ( ( ( rule__EFloat__Alternatives_4_0 ) ) )
            // InternalHouseBuilder.g:5060:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            {
            // InternalHouseBuilder.g:5060:1: ( ( rule__EFloat__Alternatives_4_0 ) )
            // InternalHouseBuilder.g:5061:2: ( rule__EFloat__Alternatives_4_0 )
            {
             before(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 
            // InternalHouseBuilder.g:5062:2: ( rule__EFloat__Alternatives_4_0 )
            // InternalHouseBuilder.g:5062:3: rule__EFloat__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEFloatAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__0__Impl"


    // $ANTLR start "rule__EFloat__Group_4__1"
    // InternalHouseBuilder.g:5070:1: rule__EFloat__Group_4__1 : rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 ;
    public final void rule__EFloat__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5074:1: ( rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2 )
            // InternalHouseBuilder.g:5075:2: rule__EFloat__Group_4__1__Impl rule__EFloat__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__EFloat__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1"


    // $ANTLR start "rule__EFloat__Group_4__1__Impl"
    // InternalHouseBuilder.g:5082:1: rule__EFloat__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EFloat__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5086:1: ( ( ( '-' )? ) )
            // InternalHouseBuilder.g:5087:1: ( ( '-' )? )
            {
            // InternalHouseBuilder.g:5087:1: ( ( '-' )? )
            // InternalHouseBuilder.g:5088:2: ( '-' )?
            {
             before(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
            // InternalHouseBuilder.g:5089:2: ( '-' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==90) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHouseBuilder.g:5089:3: '-'
                    {
                    match(input,90,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__1__Impl"


    // $ANTLR start "rule__EFloat__Group_4__2"
    // InternalHouseBuilder.g:5097:1: rule__EFloat__Group_4__2 : rule__EFloat__Group_4__2__Impl ;
    public final void rule__EFloat__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5101:1: ( rule__EFloat__Group_4__2__Impl )
            // InternalHouseBuilder.g:5102:2: rule__EFloat__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EFloat__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2"


    // $ANTLR start "rule__EFloat__Group_4__2__Impl"
    // InternalHouseBuilder.g:5108:1: rule__EFloat__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EFloat__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5112:1: ( ( RULE_INT ) )
            // InternalHouseBuilder.g:5113:1: ( RULE_INT )
            {
            // InternalHouseBuilder.g:5113:1: ( RULE_INT )
            // InternalHouseBuilder.g:5114:2: RULE_INT
            {
             before(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EFloat__Group_4__2__Impl"


    // $ANTLR start "rule__Device__Group__0"
    // InternalHouseBuilder.g:5124:1: rule__Device__Group__0 : rule__Device__Group__0__Impl rule__Device__Group__1 ;
    public final void rule__Device__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5128:1: ( rule__Device__Group__0__Impl rule__Device__Group__1 )
            // InternalHouseBuilder.g:5129:2: rule__Device__Group__0__Impl rule__Device__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Device__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0"


    // $ANTLR start "rule__Device__Group__0__Impl"
    // InternalHouseBuilder.g:5136:1: rule__Device__Group__0__Impl : ( () ) ;
    public final void rule__Device__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5140:1: ( ( () ) )
            // InternalHouseBuilder.g:5141:1: ( () )
            {
            // InternalHouseBuilder.g:5141:1: ( () )
            // InternalHouseBuilder.g:5142:2: ()
            {
             before(grammarAccess.getDeviceAccess().getDeviceAction_0()); 
            // InternalHouseBuilder.g:5143:2: ()
            // InternalHouseBuilder.g:5143:3: 
            {
            }

             after(grammarAccess.getDeviceAccess().getDeviceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__0__Impl"


    // $ANTLR start "rule__Device__Group__1"
    // InternalHouseBuilder.g:5151:1: rule__Device__Group__1 : rule__Device__Group__1__Impl rule__Device__Group__2 ;
    public final void rule__Device__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5155:1: ( rule__Device__Group__1__Impl rule__Device__Group__2 )
            // InternalHouseBuilder.g:5156:2: rule__Device__Group__1__Impl rule__Device__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1"


    // $ANTLR start "rule__Device__Group__1__Impl"
    // InternalHouseBuilder.g:5163:1: rule__Device__Group__1__Impl : ( 'Device' ) ;
    public final void rule__Device__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5167:1: ( ( 'Device' ) )
            // InternalHouseBuilder.g:5168:1: ( 'Device' )
            {
            // InternalHouseBuilder.g:5168:1: ( 'Device' )
            // InternalHouseBuilder.g:5169:2: 'Device'
            {
             before(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 
            match(input,92,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getDeviceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__1__Impl"


    // $ANTLR start "rule__Device__Group__2"
    // InternalHouseBuilder.g:5178:1: rule__Device__Group__2 : rule__Device__Group__2__Impl rule__Device__Group__3 ;
    public final void rule__Device__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5182:1: ( rule__Device__Group__2__Impl rule__Device__Group__3 )
            // InternalHouseBuilder.g:5183:2: rule__Device__Group__2__Impl rule__Device__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Device__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2"


    // $ANTLR start "rule__Device__Group__2__Impl"
    // InternalHouseBuilder.g:5190:1: rule__Device__Group__2__Impl : ( ( rule__Device__NameAssignment_2 ) ) ;
    public final void rule__Device__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5194:1: ( ( ( rule__Device__NameAssignment_2 ) ) )
            // InternalHouseBuilder.g:5195:1: ( ( rule__Device__NameAssignment_2 ) )
            {
            // InternalHouseBuilder.g:5195:1: ( ( rule__Device__NameAssignment_2 ) )
            // InternalHouseBuilder.g:5196:2: ( rule__Device__NameAssignment_2 )
            {
             before(grammarAccess.getDeviceAccess().getNameAssignment_2()); 
            // InternalHouseBuilder.g:5197:2: ( rule__Device__NameAssignment_2 )
            // InternalHouseBuilder.g:5197:3: rule__Device__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Device__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__2__Impl"


    // $ANTLR start "rule__Device__Group__3"
    // InternalHouseBuilder.g:5205:1: rule__Device__Group__3 : rule__Device__Group__3__Impl rule__Device__Group__4 ;
    public final void rule__Device__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5209:1: ( rule__Device__Group__3__Impl rule__Device__Group__4 )
            // InternalHouseBuilder.g:5210:2: rule__Device__Group__3__Impl rule__Device__Group__4
            {
            pushFollow(FOLLOW_34);
            rule__Device__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3"


    // $ANTLR start "rule__Device__Group__3__Impl"
    // InternalHouseBuilder.g:5217:1: rule__Device__Group__3__Impl : ( '{' ) ;
    public final void rule__Device__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5221:1: ( ( '{' ) )
            // InternalHouseBuilder.g:5222:1: ( '{' )
            {
            // InternalHouseBuilder.g:5222:1: ( '{' )
            // InternalHouseBuilder.g:5223:2: '{'
            {
             before(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__3__Impl"


    // $ANTLR start "rule__Device__Group__4"
    // InternalHouseBuilder.g:5232:1: rule__Device__Group__4 : rule__Device__Group__4__Impl rule__Device__Group__5 ;
    public final void rule__Device__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5236:1: ( rule__Device__Group__4__Impl rule__Device__Group__5 )
            // InternalHouseBuilder.g:5237:2: rule__Device__Group__4__Impl rule__Device__Group__5
            {
            pushFollow(FOLLOW_34);
            rule__Device__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4"


    // $ANTLR start "rule__Device__Group__4__Impl"
    // InternalHouseBuilder.g:5244:1: rule__Device__Group__4__Impl : ( ( rule__Device__Group_4__0 )? ) ;
    public final void rule__Device__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5248:1: ( ( ( rule__Device__Group_4__0 )? ) )
            // InternalHouseBuilder.g:5249:1: ( ( rule__Device__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:5249:1: ( ( rule__Device__Group_4__0 )? )
            // InternalHouseBuilder.g:5250:2: ( rule__Device__Group_4__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_4()); 
            // InternalHouseBuilder.g:5251:2: ( rule__Device__Group_4__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==93) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalHouseBuilder.g:5251:3: rule__Device__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__4__Impl"


    // $ANTLR start "rule__Device__Group__5"
    // InternalHouseBuilder.g:5259:1: rule__Device__Group__5 : rule__Device__Group__5__Impl rule__Device__Group__6 ;
    public final void rule__Device__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5263:1: ( rule__Device__Group__5__Impl rule__Device__Group__6 )
            // InternalHouseBuilder.g:5264:2: rule__Device__Group__5__Impl rule__Device__Group__6
            {
            pushFollow(FOLLOW_34);
            rule__Device__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5"


    // $ANTLR start "rule__Device__Group__5__Impl"
    // InternalHouseBuilder.g:5271:1: rule__Device__Group__5__Impl : ( ( rule__Device__Group_5__0 )? ) ;
    public final void rule__Device__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5275:1: ( ( ( rule__Device__Group_5__0 )? ) )
            // InternalHouseBuilder.g:5276:1: ( ( rule__Device__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:5276:1: ( ( rule__Device__Group_5__0 )? )
            // InternalHouseBuilder.g:5277:2: ( rule__Device__Group_5__0 )?
            {
             before(grammarAccess.getDeviceAccess().getGroup_5()); 
            // InternalHouseBuilder.g:5278:2: ( rule__Device__Group_5__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==85) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalHouseBuilder.g:5278:3: rule__Device__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Device__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDeviceAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__5__Impl"


    // $ANTLR start "rule__Device__Group__6"
    // InternalHouseBuilder.g:5286:1: rule__Device__Group__6 : rule__Device__Group__6__Impl ;
    public final void rule__Device__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5290:1: ( rule__Device__Group__6__Impl )
            // InternalHouseBuilder.g:5291:2: rule__Device__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6"


    // $ANTLR start "rule__Device__Group__6__Impl"
    // InternalHouseBuilder.g:5297:1: rule__Device__Group__6__Impl : ( '}' ) ;
    public final void rule__Device__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5301:1: ( ( '}' ) )
            // InternalHouseBuilder.g:5302:1: ( '}' )
            {
            // InternalHouseBuilder.g:5302:1: ( '}' )
            // InternalHouseBuilder.g:5303:2: '}'
            {
             before(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group__6__Impl"


    // $ANTLR start "rule__Device__Group_4__0"
    // InternalHouseBuilder.g:5313:1: rule__Device__Group_4__0 : rule__Device__Group_4__0__Impl rule__Device__Group_4__1 ;
    public final void rule__Device__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5317:1: ( rule__Device__Group_4__0__Impl rule__Device__Group_4__1 )
            // InternalHouseBuilder.g:5318:2: rule__Device__Group_4__0__Impl rule__Device__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__Device__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__0"


    // $ANTLR start "rule__Device__Group_4__0__Impl"
    // InternalHouseBuilder.g:5325:1: rule__Device__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Device__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5329:1: ( ( 'type' ) )
            // InternalHouseBuilder.g:5330:1: ( 'type' )
            {
            // InternalHouseBuilder.g:5330:1: ( 'type' )
            // InternalHouseBuilder.g:5331:2: 'type'
            {
             before(grammarAccess.getDeviceAccess().getTypeKeyword_4_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__0__Impl"


    // $ANTLR start "rule__Device__Group_4__1"
    // InternalHouseBuilder.g:5340:1: rule__Device__Group_4__1 : rule__Device__Group_4__1__Impl ;
    public final void rule__Device__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5344:1: ( rule__Device__Group_4__1__Impl )
            // InternalHouseBuilder.g:5345:2: rule__Device__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__1"


    // $ANTLR start "rule__Device__Group_4__1__Impl"
    // InternalHouseBuilder.g:5351:1: rule__Device__Group_4__1__Impl : ( ( rule__Device__TypeAssignment_4_1 ) ) ;
    public final void rule__Device__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5355:1: ( ( ( rule__Device__TypeAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:5356:1: ( ( rule__Device__TypeAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:5356:1: ( ( rule__Device__TypeAssignment_4_1 ) )
            // InternalHouseBuilder.g:5357:2: ( rule__Device__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDeviceAccess().getTypeAssignment_4_1()); 
            // InternalHouseBuilder.g:5358:2: ( rule__Device__TypeAssignment_4_1 )
            // InternalHouseBuilder.g:5358:3: rule__Device__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_4__1__Impl"


    // $ANTLR start "rule__Device__Group_5__0"
    // InternalHouseBuilder.g:5367:1: rule__Device__Group_5__0 : rule__Device__Group_5__0__Impl rule__Device__Group_5__1 ;
    public final void rule__Device__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5371:1: ( rule__Device__Group_5__0__Impl rule__Device__Group_5__1 )
            // InternalHouseBuilder.g:5372:2: rule__Device__Group_5__0__Impl rule__Device__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Device__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Device__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0"


    // $ANTLR start "rule__Device__Group_5__0__Impl"
    // InternalHouseBuilder.g:5379:1: rule__Device__Group_5__0__Impl : ( 'model' ) ;
    public final void rule__Device__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5383:1: ( ( 'model' ) )
            // InternalHouseBuilder.g:5384:1: ( 'model' )
            {
            // InternalHouseBuilder.g:5384:1: ( 'model' )
            // InternalHouseBuilder.g:5385:2: 'model'
            {
             before(grammarAccess.getDeviceAccess().getModelKeyword_5_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getDeviceAccess().getModelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__0__Impl"


    // $ANTLR start "rule__Device__Group_5__1"
    // InternalHouseBuilder.g:5394:1: rule__Device__Group_5__1 : rule__Device__Group_5__1__Impl ;
    public final void rule__Device__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5398:1: ( rule__Device__Group_5__1__Impl )
            // InternalHouseBuilder.g:5399:2: rule__Device__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Device__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1"


    // $ANTLR start "rule__Device__Group_5__1__Impl"
    // InternalHouseBuilder.g:5405:1: rule__Device__Group_5__1__Impl : ( ( rule__Device__ModelAssignment_5_1 ) ) ;
    public final void rule__Device__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5409:1: ( ( ( rule__Device__ModelAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:5410:1: ( ( rule__Device__ModelAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:5410:1: ( ( rule__Device__ModelAssignment_5_1 ) )
            // InternalHouseBuilder.g:5411:2: ( rule__Device__ModelAssignment_5_1 )
            {
             before(grammarAccess.getDeviceAccess().getModelAssignment_5_1()); 
            // InternalHouseBuilder.g:5412:2: ( rule__Device__ModelAssignment_5_1 )
            // InternalHouseBuilder.g:5412:3: rule__Device__ModelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Device__ModelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDeviceAccess().getModelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__Group_5__1__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalHouseBuilder.g:5421:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5425:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalHouseBuilder.g:5426:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalHouseBuilder.g:5433:1: rule__Sensor__Group__0__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5437:1: ( ( 'Sensor' ) )
            // InternalHouseBuilder.g:5438:1: ( 'Sensor' )
            {
            // InternalHouseBuilder.g:5438:1: ( 'Sensor' )
            // InternalHouseBuilder.g:5439:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_0()); 
            match(input,94,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalHouseBuilder.g:5448:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5452:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalHouseBuilder.g:5453:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalHouseBuilder.g:5460:1: rule__Sensor__Group__1__Impl : ( ( rule__Sensor__NameAssignment_1 ) ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5464:1: ( ( ( rule__Sensor__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:5465:1: ( ( rule__Sensor__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:5465:1: ( ( rule__Sensor__NameAssignment_1 ) )
            // InternalHouseBuilder.g:5466:2: ( rule__Sensor__NameAssignment_1 )
            {
             before(grammarAccess.getSensorAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:5467:2: ( rule__Sensor__NameAssignment_1 )
            // InternalHouseBuilder.g:5467:3: rule__Sensor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalHouseBuilder.g:5475:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5479:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalHouseBuilder.g:5480:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalHouseBuilder.g:5487:1: rule__Sensor__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5491:1: ( ( '{' ) )
            // InternalHouseBuilder.g:5492:1: ( '{' )
            {
            // InternalHouseBuilder.g:5492:1: ( '{' )
            // InternalHouseBuilder.g:5493:2: '{'
            {
             before(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalHouseBuilder.g:5502:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5506:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalHouseBuilder.g:5507:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_36);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalHouseBuilder.g:5514:1: rule__Sensor__Group__3__Impl : ( ( rule__Sensor__Group_3__0 )? ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5518:1: ( ( ( rule__Sensor__Group_3__0 )? ) )
            // InternalHouseBuilder.g:5519:1: ( ( rule__Sensor__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:5519:1: ( ( rule__Sensor__Group_3__0 )? )
            // InternalHouseBuilder.g:5520:2: ( rule__Sensor__Group_3__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_3()); 
            // InternalHouseBuilder.g:5521:2: ( rule__Sensor__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==93) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalHouseBuilder.g:5521:3: rule__Sensor__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalHouseBuilder.g:5529:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5533:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalHouseBuilder.g:5534:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalHouseBuilder.g:5541:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__Group_4__0 )? ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5545:1: ( ( ( rule__Sensor__Group_4__0 )? ) )
            // InternalHouseBuilder.g:5546:1: ( ( rule__Sensor__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:5546:1: ( ( rule__Sensor__Group_4__0 )? )
            // InternalHouseBuilder.g:5547:2: ( rule__Sensor__Group_4__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_4()); 
            // InternalHouseBuilder.g:5548:2: ( rule__Sensor__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==95) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalHouseBuilder.g:5548:3: rule__Sensor__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalHouseBuilder.g:5556:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5560:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalHouseBuilder.g:5561:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalHouseBuilder.g:5568:1: rule__Sensor__Group__5__Impl : ( ( rule__Sensor__Group_5__0 )? ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5572:1: ( ( ( rule__Sensor__Group_5__0 )? ) )
            // InternalHouseBuilder.g:5573:1: ( ( rule__Sensor__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:5573:1: ( ( rule__Sensor__Group_5__0 )? )
            // InternalHouseBuilder.g:5574:2: ( rule__Sensor__Group_5__0 )?
            {
             before(grammarAccess.getSensorAccess().getGroup_5()); 
            // InternalHouseBuilder.g:5575:2: ( rule__Sensor__Group_5__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==85) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalHouseBuilder.g:5575:3: rule__Sensor__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalHouseBuilder.g:5583:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl rule__Sensor__Group__7 ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5587:1: ( rule__Sensor__Group__6__Impl rule__Sensor__Group__7 )
            // InternalHouseBuilder.g:5588:2: rule__Sensor__Group__6__Impl rule__Sensor__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalHouseBuilder.g:5595:1: rule__Sensor__Group__6__Impl : ( 'space' ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5599:1: ( ( 'space' ) )
            // InternalHouseBuilder.g:5600:1: ( 'space' )
            {
            // InternalHouseBuilder.g:5600:1: ( 'space' )
            // InternalHouseBuilder.g:5601:2: 'space'
            {
             before(grammarAccess.getSensorAccess().getSpaceKeyword_6()); 
            match(input,89,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSpaceKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Sensor__Group__7"
    // InternalHouseBuilder.g:5610:1: rule__Sensor__Group__7 : rule__Sensor__Group__7__Impl rule__Sensor__Group__8 ;
    public final void rule__Sensor__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5614:1: ( rule__Sensor__Group__7__Impl rule__Sensor__Group__8 )
            // InternalHouseBuilder.g:5615:2: rule__Sensor__Group__7__Impl rule__Sensor__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Sensor__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7"


    // $ANTLR start "rule__Sensor__Group__7__Impl"
    // InternalHouseBuilder.g:5622:1: rule__Sensor__Group__7__Impl : ( ( rule__Sensor__SpaceAssignment_7 ) ) ;
    public final void rule__Sensor__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5626:1: ( ( ( rule__Sensor__SpaceAssignment_7 ) ) )
            // InternalHouseBuilder.g:5627:1: ( ( rule__Sensor__SpaceAssignment_7 ) )
            {
            // InternalHouseBuilder.g:5627:1: ( ( rule__Sensor__SpaceAssignment_7 ) )
            // InternalHouseBuilder.g:5628:2: ( rule__Sensor__SpaceAssignment_7 )
            {
             before(grammarAccess.getSensorAccess().getSpaceAssignment_7()); 
            // InternalHouseBuilder.g:5629:2: ( rule__Sensor__SpaceAssignment_7 )
            // InternalHouseBuilder.g:5629:3: rule__Sensor__SpaceAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SpaceAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSpaceAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__7__Impl"


    // $ANTLR start "rule__Sensor__Group__8"
    // InternalHouseBuilder.g:5637:1: rule__Sensor__Group__8 : rule__Sensor__Group__8__Impl ;
    public final void rule__Sensor__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5641:1: ( rule__Sensor__Group__8__Impl )
            // InternalHouseBuilder.g:5642:2: rule__Sensor__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8"


    // $ANTLR start "rule__Sensor__Group__8__Impl"
    // InternalHouseBuilder.g:5648:1: rule__Sensor__Group__8__Impl : ( '}' ) ;
    public final void rule__Sensor__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5652:1: ( ( '}' ) )
            // InternalHouseBuilder.g:5653:1: ( '}' )
            {
            // InternalHouseBuilder.g:5653:1: ( '}' )
            // InternalHouseBuilder.g:5654:2: '}'
            {
             before(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_8()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__8__Impl"


    // $ANTLR start "rule__Sensor__Group_3__0"
    // InternalHouseBuilder.g:5664:1: rule__Sensor__Group_3__0 : rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 ;
    public final void rule__Sensor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5668:1: ( rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1 )
            // InternalHouseBuilder.g:5669:2: rule__Sensor__Group_3__0__Impl rule__Sensor__Group_3__1
            {
            pushFollow(FOLLOW_37);
            rule__Sensor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0"


    // $ANTLR start "rule__Sensor__Group_3__0__Impl"
    // InternalHouseBuilder.g:5676:1: rule__Sensor__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Sensor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5680:1: ( ( 'type' ) )
            // InternalHouseBuilder.g:5681:1: ( 'type' )
            {
            // InternalHouseBuilder.g:5681:1: ( 'type' )
            // InternalHouseBuilder.g:5682:2: 'type'
            {
             before(grammarAccess.getSensorAccess().getTypeKeyword_3_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor__Group_3__1"
    // InternalHouseBuilder.g:5691:1: rule__Sensor__Group_3__1 : rule__Sensor__Group_3__1__Impl ;
    public final void rule__Sensor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5695:1: ( rule__Sensor__Group_3__1__Impl )
            // InternalHouseBuilder.g:5696:2: rule__Sensor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1"


    // $ANTLR start "rule__Sensor__Group_3__1__Impl"
    // InternalHouseBuilder.g:5702:1: rule__Sensor__Group_3__1__Impl : ( ( rule__Sensor__TypeAssignment_3_1 ) ) ;
    public final void rule__Sensor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5706:1: ( ( ( rule__Sensor__TypeAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:5707:1: ( ( rule__Sensor__TypeAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:5707:1: ( ( rule__Sensor__TypeAssignment_3_1 ) )
            // InternalHouseBuilder.g:5708:2: ( rule__Sensor__TypeAssignment_3_1 )
            {
             before(grammarAccess.getSensorAccess().getTypeAssignment_3_1()); 
            // InternalHouseBuilder.g:5709:2: ( rule__Sensor__TypeAssignment_3_1 )
            // InternalHouseBuilder.g:5709:3: rule__Sensor__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_3__1__Impl"


    // $ANTLR start "rule__Sensor__Group_4__0"
    // InternalHouseBuilder.g:5718:1: rule__Sensor__Group_4__0 : rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 ;
    public final void rule__Sensor__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5722:1: ( rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1 )
            // InternalHouseBuilder.g:5723:2: rule__Sensor__Group_4__0__Impl rule__Sensor__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Sensor__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__0"


    // $ANTLR start "rule__Sensor__Group_4__0__Impl"
    // InternalHouseBuilder.g:5730:1: rule__Sensor__Group_4__0__Impl : ( 'value' ) ;
    public final void rule__Sensor__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5734:1: ( ( 'value' ) )
            // InternalHouseBuilder.g:5735:1: ( 'value' )
            {
            // InternalHouseBuilder.g:5735:1: ( 'value' )
            // InternalHouseBuilder.g:5736:2: 'value'
            {
             before(grammarAccess.getSensorAccess().getValueKeyword_4_0()); 
            match(input,95,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getValueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__0__Impl"


    // $ANTLR start "rule__Sensor__Group_4__1"
    // InternalHouseBuilder.g:5745:1: rule__Sensor__Group_4__1 : rule__Sensor__Group_4__1__Impl ;
    public final void rule__Sensor__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5749:1: ( rule__Sensor__Group_4__1__Impl )
            // InternalHouseBuilder.g:5750:2: rule__Sensor__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__1"


    // $ANTLR start "rule__Sensor__Group_4__1__Impl"
    // InternalHouseBuilder.g:5756:1: rule__Sensor__Group_4__1__Impl : ( ( rule__Sensor__ValueAssignment_4_1 ) ) ;
    public final void rule__Sensor__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5760:1: ( ( ( rule__Sensor__ValueAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:5761:1: ( ( rule__Sensor__ValueAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:5761:1: ( ( rule__Sensor__ValueAssignment_4_1 ) )
            // InternalHouseBuilder.g:5762:2: ( rule__Sensor__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSensorAccess().getValueAssignment_4_1()); 
            // InternalHouseBuilder.g:5763:2: ( rule__Sensor__ValueAssignment_4_1 )
            // InternalHouseBuilder.g:5763:3: rule__Sensor__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_4__1__Impl"


    // $ANTLR start "rule__Sensor__Group_5__0"
    // InternalHouseBuilder.g:5772:1: rule__Sensor__Group_5__0 : rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 ;
    public final void rule__Sensor__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5776:1: ( rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1 )
            // InternalHouseBuilder.g:5777:2: rule__Sensor__Group_5__0__Impl rule__Sensor__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__0"


    // $ANTLR start "rule__Sensor__Group_5__0__Impl"
    // InternalHouseBuilder.g:5784:1: rule__Sensor__Group_5__0__Impl : ( 'model' ) ;
    public final void rule__Sensor__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5788:1: ( ( 'model' ) )
            // InternalHouseBuilder.g:5789:1: ( 'model' )
            {
            // InternalHouseBuilder.g:5789:1: ( 'model' )
            // InternalHouseBuilder.g:5790:2: 'model'
            {
             before(grammarAccess.getSensorAccess().getModelKeyword_5_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getModelKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__0__Impl"


    // $ANTLR start "rule__Sensor__Group_5__1"
    // InternalHouseBuilder.g:5799:1: rule__Sensor__Group_5__1 : rule__Sensor__Group_5__1__Impl ;
    public final void rule__Sensor__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5803:1: ( rule__Sensor__Group_5__1__Impl )
            // InternalHouseBuilder.g:5804:2: rule__Sensor__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__1"


    // $ANTLR start "rule__Sensor__Group_5__1__Impl"
    // InternalHouseBuilder.g:5810:1: rule__Sensor__Group_5__1__Impl : ( ( rule__Sensor__ModelAssignment_5_1 ) ) ;
    public final void rule__Sensor__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5814:1: ( ( ( rule__Sensor__ModelAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:5815:1: ( ( rule__Sensor__ModelAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:5815:1: ( ( rule__Sensor__ModelAssignment_5_1 ) )
            // InternalHouseBuilder.g:5816:2: ( rule__Sensor__ModelAssignment_5_1 )
            {
             before(grammarAccess.getSensorAccess().getModelAssignment_5_1()); 
            // InternalHouseBuilder.g:5817:2: ( rule__Sensor__ModelAssignment_5_1 )
            // InternalHouseBuilder.g:5817:3: rule__Sensor__ModelAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ModelAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getModelAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group_5__1__Impl"


    // $ANTLR start "rule__Room__Group__0"
    // InternalHouseBuilder.g:5826:1: rule__Room__Group__0 : rule__Room__Group__0__Impl rule__Room__Group__1 ;
    public final void rule__Room__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5830:1: ( rule__Room__Group__0__Impl rule__Room__Group__1 )
            // InternalHouseBuilder.g:5831:2: rule__Room__Group__0__Impl rule__Room__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Room__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0"


    // $ANTLR start "rule__Room__Group__0__Impl"
    // InternalHouseBuilder.g:5838:1: rule__Room__Group__0__Impl : ( 'Room' ) ;
    public final void rule__Room__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5842:1: ( ( 'Room' ) )
            // InternalHouseBuilder.g:5843:1: ( 'Room' )
            {
            // InternalHouseBuilder.g:5843:1: ( 'Room' )
            // InternalHouseBuilder.g:5844:2: 'Room'
            {
             before(grammarAccess.getRoomAccess().getRoomKeyword_0()); 
            match(input,96,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__0__Impl"


    // $ANTLR start "rule__Room__Group__1"
    // InternalHouseBuilder.g:5853:1: rule__Room__Group__1 : rule__Room__Group__1__Impl rule__Room__Group__2 ;
    public final void rule__Room__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5857:1: ( rule__Room__Group__1__Impl rule__Room__Group__2 )
            // InternalHouseBuilder.g:5858:2: rule__Room__Group__1__Impl rule__Room__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1"


    // $ANTLR start "rule__Room__Group__1__Impl"
    // InternalHouseBuilder.g:5865:1: rule__Room__Group__1__Impl : ( ( rule__Room__NameAssignment_1 ) ) ;
    public final void rule__Room__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5869:1: ( ( ( rule__Room__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:5870:1: ( ( rule__Room__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:5870:1: ( ( rule__Room__NameAssignment_1 ) )
            // InternalHouseBuilder.g:5871:2: ( rule__Room__NameAssignment_1 )
            {
             before(grammarAccess.getRoomAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:5872:2: ( rule__Room__NameAssignment_1 )
            // InternalHouseBuilder.g:5872:3: rule__Room__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__1__Impl"


    // $ANTLR start "rule__Room__Group__2"
    // InternalHouseBuilder.g:5880:1: rule__Room__Group__2 : rule__Room__Group__2__Impl rule__Room__Group__3 ;
    public final void rule__Room__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5884:1: ( rule__Room__Group__2__Impl rule__Room__Group__3 )
            // InternalHouseBuilder.g:5885:2: rule__Room__Group__2__Impl rule__Room__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__Room__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2"


    // $ANTLR start "rule__Room__Group__2__Impl"
    // InternalHouseBuilder.g:5892:1: rule__Room__Group__2__Impl : ( '{' ) ;
    public final void rule__Room__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5896:1: ( ( '{' ) )
            // InternalHouseBuilder.g:5897:1: ( '{' )
            {
            // InternalHouseBuilder.g:5897:1: ( '{' )
            // InternalHouseBuilder.g:5898:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__2__Impl"


    // $ANTLR start "rule__Room__Group__3"
    // InternalHouseBuilder.g:5907:1: rule__Room__Group__3 : rule__Room__Group__3__Impl rule__Room__Group__4 ;
    public final void rule__Room__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5911:1: ( rule__Room__Group__3__Impl rule__Room__Group__4 )
            // InternalHouseBuilder.g:5912:2: rule__Room__Group__3__Impl rule__Room__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Room__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3"


    // $ANTLR start "rule__Room__Group__3__Impl"
    // InternalHouseBuilder.g:5919:1: rule__Room__Group__3__Impl : ( 'LxHxW:' ) ;
    public final void rule__Room__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5923:1: ( ( 'LxHxW:' ) )
            // InternalHouseBuilder.g:5924:1: ( 'LxHxW:' )
            {
            // InternalHouseBuilder.g:5924:1: ( 'LxHxW:' )
            // InternalHouseBuilder.g:5925:2: 'LxHxW:'
            {
             before(grammarAccess.getRoomAccess().getLxHxWKeyword_3()); 
            match(input,97,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLxHxWKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__3__Impl"


    // $ANTLR start "rule__Room__Group__4"
    // InternalHouseBuilder.g:5934:1: rule__Room__Group__4 : rule__Room__Group__4__Impl rule__Room__Group__5 ;
    public final void rule__Room__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5938:1: ( rule__Room__Group__4__Impl rule__Room__Group__5 )
            // InternalHouseBuilder.g:5939:2: rule__Room__Group__4__Impl rule__Room__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__Room__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4"


    // $ANTLR start "rule__Room__Group__4__Impl"
    // InternalHouseBuilder.g:5946:1: rule__Room__Group__4__Impl : ( ( rule__Room__LengthAssignment_4 ) ) ;
    public final void rule__Room__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5950:1: ( ( ( rule__Room__LengthAssignment_4 ) ) )
            // InternalHouseBuilder.g:5951:1: ( ( rule__Room__LengthAssignment_4 ) )
            {
            // InternalHouseBuilder.g:5951:1: ( ( rule__Room__LengthAssignment_4 ) )
            // InternalHouseBuilder.g:5952:2: ( rule__Room__LengthAssignment_4 )
            {
             before(grammarAccess.getRoomAccess().getLengthAssignment_4()); 
            // InternalHouseBuilder.g:5953:2: ( rule__Room__LengthAssignment_4 )
            // InternalHouseBuilder.g:5953:3: rule__Room__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Room__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__4__Impl"


    // $ANTLR start "rule__Room__Group__5"
    // InternalHouseBuilder.g:5961:1: rule__Room__Group__5 : rule__Room__Group__5__Impl rule__Room__Group__6 ;
    public final void rule__Room__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5965:1: ( rule__Room__Group__5__Impl rule__Room__Group__6 )
            // InternalHouseBuilder.g:5966:2: rule__Room__Group__5__Impl rule__Room__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Room__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5"


    // $ANTLR start "rule__Room__Group__5__Impl"
    // InternalHouseBuilder.g:5973:1: rule__Room__Group__5__Impl : ( 'x' ) ;
    public final void rule__Room__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5977:1: ( ( 'x' ) )
            // InternalHouseBuilder.g:5978:1: ( 'x' )
            {
            // InternalHouseBuilder.g:5978:1: ( 'x' )
            // InternalHouseBuilder.g:5979:2: 'x'
            {
             before(grammarAccess.getRoomAccess().getXKeyword_5()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getXKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__5__Impl"


    // $ANTLR start "rule__Room__Group__6"
    // InternalHouseBuilder.g:5988:1: rule__Room__Group__6 : rule__Room__Group__6__Impl rule__Room__Group__7 ;
    public final void rule__Room__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:5992:1: ( rule__Room__Group__6__Impl rule__Room__Group__7 )
            // InternalHouseBuilder.g:5993:2: rule__Room__Group__6__Impl rule__Room__Group__7
            {
            pushFollow(FOLLOW_39);
            rule__Room__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6"


    // $ANTLR start "rule__Room__Group__6__Impl"
    // InternalHouseBuilder.g:6000:1: rule__Room__Group__6__Impl : ( ( rule__Room__WidthAssignment_6 ) ) ;
    public final void rule__Room__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6004:1: ( ( ( rule__Room__WidthAssignment_6 ) ) )
            // InternalHouseBuilder.g:6005:1: ( ( rule__Room__WidthAssignment_6 ) )
            {
            // InternalHouseBuilder.g:6005:1: ( ( rule__Room__WidthAssignment_6 ) )
            // InternalHouseBuilder.g:6006:2: ( rule__Room__WidthAssignment_6 )
            {
             before(grammarAccess.getRoomAccess().getWidthAssignment_6()); 
            // InternalHouseBuilder.g:6007:2: ( rule__Room__WidthAssignment_6 )
            // InternalHouseBuilder.g:6007:3: rule__Room__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Room__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__6__Impl"


    // $ANTLR start "rule__Room__Group__7"
    // InternalHouseBuilder.g:6015:1: rule__Room__Group__7 : rule__Room__Group__7__Impl rule__Room__Group__8 ;
    public final void rule__Room__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6019:1: ( rule__Room__Group__7__Impl rule__Room__Group__8 )
            // InternalHouseBuilder.g:6020:2: rule__Room__Group__7__Impl rule__Room__Group__8
            {
            pushFollow(FOLLOW_39);
            rule__Room__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7"


    // $ANTLR start "rule__Room__Group__7__Impl"
    // InternalHouseBuilder.g:6027:1: rule__Room__Group__7__Impl : ( ( rule__Room__Group_7__0 )? ) ;
    public final void rule__Room__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6031:1: ( ( ( rule__Room__Group_7__0 )? ) )
            // InternalHouseBuilder.g:6032:1: ( ( rule__Room__Group_7__0 )? )
            {
            // InternalHouseBuilder.g:6032:1: ( ( rule__Room__Group_7__0 )? )
            // InternalHouseBuilder.g:6033:2: ( rule__Room__Group_7__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_7()); 
            // InternalHouseBuilder.g:6034:2: ( rule__Room__Group_7__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==80) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalHouseBuilder.g:6034:3: rule__Room__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__7__Impl"


    // $ANTLR start "rule__Room__Group__8"
    // InternalHouseBuilder.g:6042:1: rule__Room__Group__8 : rule__Room__Group__8__Impl rule__Room__Group__9 ;
    public final void rule__Room__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6046:1: ( rule__Room__Group__8__Impl rule__Room__Group__9 )
            // InternalHouseBuilder.g:6047:2: rule__Room__Group__8__Impl rule__Room__Group__9
            {
            pushFollow(FOLLOW_39);
            rule__Room__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8"


    // $ANTLR start "rule__Room__Group__8__Impl"
    // InternalHouseBuilder.g:6054:1: rule__Room__Group__8__Impl : ( ( rule__Room__Group_8__0 )? ) ;
    public final void rule__Room__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6058:1: ( ( ( rule__Room__Group_8__0 )? ) )
            // InternalHouseBuilder.g:6059:1: ( ( rule__Room__Group_8__0 )? )
            {
            // InternalHouseBuilder.g:6059:1: ( ( rule__Room__Group_8__0 )? )
            // InternalHouseBuilder.g:6060:2: ( rule__Room__Group_8__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_8()); 
            // InternalHouseBuilder.g:6061:2: ( rule__Room__Group_8__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==98) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalHouseBuilder.g:6061:3: rule__Room__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__8__Impl"


    // $ANTLR start "rule__Room__Group__9"
    // InternalHouseBuilder.g:6069:1: rule__Room__Group__9 : rule__Room__Group__9__Impl rule__Room__Group__10 ;
    public final void rule__Room__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6073:1: ( rule__Room__Group__9__Impl rule__Room__Group__10 )
            // InternalHouseBuilder.g:6074:2: rule__Room__Group__9__Impl rule__Room__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__Room__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9"


    // $ANTLR start "rule__Room__Group__9__Impl"
    // InternalHouseBuilder.g:6081:1: rule__Room__Group__9__Impl : ( ( rule__Room__Group_9__0 )? ) ;
    public final void rule__Room__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6085:1: ( ( ( rule__Room__Group_9__0 )? ) )
            // InternalHouseBuilder.g:6086:1: ( ( rule__Room__Group_9__0 )? )
            {
            // InternalHouseBuilder.g:6086:1: ( ( rule__Room__Group_9__0 )? )
            // InternalHouseBuilder.g:6087:2: ( rule__Room__Group_9__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_9()); 
            // InternalHouseBuilder.g:6088:2: ( rule__Room__Group_9__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==81) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalHouseBuilder.g:6088:3: rule__Room__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__9__Impl"


    // $ANTLR start "rule__Room__Group__10"
    // InternalHouseBuilder.g:6096:1: rule__Room__Group__10 : rule__Room__Group__10__Impl rule__Room__Group__11 ;
    public final void rule__Room__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6100:1: ( rule__Room__Group__10__Impl rule__Room__Group__11 )
            // InternalHouseBuilder.g:6101:2: rule__Room__Group__10__Impl rule__Room__Group__11
            {
            pushFollow(FOLLOW_39);
            rule__Room__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__10"


    // $ANTLR start "rule__Room__Group__10__Impl"
    // InternalHouseBuilder.g:6108:1: rule__Room__Group__10__Impl : ( ( rule__Room__Group_10__0 )? ) ;
    public final void rule__Room__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6112:1: ( ( ( rule__Room__Group_10__0 )? ) )
            // InternalHouseBuilder.g:6113:1: ( ( rule__Room__Group_10__0 )? )
            {
            // InternalHouseBuilder.g:6113:1: ( ( rule__Room__Group_10__0 )? )
            // InternalHouseBuilder.g:6114:2: ( rule__Room__Group_10__0 )?
            {
             before(grammarAccess.getRoomAccess().getGroup_10()); 
            // InternalHouseBuilder.g:6115:2: ( rule__Room__Group_10__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==99) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalHouseBuilder.g:6115:3: rule__Room__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Room__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoomAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__10__Impl"


    // $ANTLR start "rule__Room__Group__11"
    // InternalHouseBuilder.g:6123:1: rule__Room__Group__11 : rule__Room__Group__11__Impl ;
    public final void rule__Room__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6127:1: ( rule__Room__Group__11__Impl )
            // InternalHouseBuilder.g:6128:2: rule__Room__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__11"


    // $ANTLR start "rule__Room__Group__11__Impl"
    // InternalHouseBuilder.g:6134:1: rule__Room__Group__11__Impl : ( '}' ) ;
    public final void rule__Room__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6138:1: ( ( '}' ) )
            // InternalHouseBuilder.g:6139:1: ( '}' )
            {
            // InternalHouseBuilder.g:6139:1: ( '}' )
            // InternalHouseBuilder.g:6140:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_11()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group__11__Impl"


    // $ANTLR start "rule__Room__Group_7__0"
    // InternalHouseBuilder.g:6150:1: rule__Room__Group_7__0 : rule__Room__Group_7__0__Impl rule__Room__Group_7__1 ;
    public final void rule__Room__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6154:1: ( rule__Room__Group_7__0__Impl rule__Room__Group_7__1 )
            // InternalHouseBuilder.g:6155:2: rule__Room__Group_7__0__Impl rule__Room__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__Room__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_7__0"


    // $ANTLR start "rule__Room__Group_7__0__Impl"
    // InternalHouseBuilder.g:6162:1: rule__Room__Group_7__0__Impl : ( 'x' ) ;
    public final void rule__Room__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6166:1: ( ( 'x' ) )
            // InternalHouseBuilder.g:6167:1: ( 'x' )
            {
            // InternalHouseBuilder.g:6167:1: ( 'x' )
            // InternalHouseBuilder.g:6168:2: 'x'
            {
             before(grammarAccess.getRoomAccess().getXKeyword_7_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getXKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_7__0__Impl"


    // $ANTLR start "rule__Room__Group_7__1"
    // InternalHouseBuilder.g:6177:1: rule__Room__Group_7__1 : rule__Room__Group_7__1__Impl ;
    public final void rule__Room__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6181:1: ( rule__Room__Group_7__1__Impl )
            // InternalHouseBuilder.g:6182:2: rule__Room__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_7__1"


    // $ANTLR start "rule__Room__Group_7__1__Impl"
    // InternalHouseBuilder.g:6188:1: rule__Room__Group_7__1__Impl : ( ( rule__Room__HeightAssignment_7_1 ) ) ;
    public final void rule__Room__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6192:1: ( ( ( rule__Room__HeightAssignment_7_1 ) ) )
            // InternalHouseBuilder.g:6193:1: ( ( rule__Room__HeightAssignment_7_1 ) )
            {
            // InternalHouseBuilder.g:6193:1: ( ( rule__Room__HeightAssignment_7_1 ) )
            // InternalHouseBuilder.g:6194:2: ( rule__Room__HeightAssignment_7_1 )
            {
             before(grammarAccess.getRoomAccess().getHeightAssignment_7_1()); 
            // InternalHouseBuilder.g:6195:2: ( rule__Room__HeightAssignment_7_1 )
            // InternalHouseBuilder.g:6195:3: rule__Room__HeightAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__HeightAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getHeightAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_7__1__Impl"


    // $ANTLR start "rule__Room__Group_8__0"
    // InternalHouseBuilder.g:6204:1: rule__Room__Group_8__0 : rule__Room__Group_8__0__Impl rule__Room__Group_8__1 ;
    public final void rule__Room__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6208:1: ( rule__Room__Group_8__0__Impl rule__Room__Group_8__1 )
            // InternalHouseBuilder.g:6209:2: rule__Room__Group_8__0__Impl rule__Room__Group_8__1
            {
            pushFollow(FOLLOW_40);
            rule__Room__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_8__0"


    // $ANTLR start "rule__Room__Group_8__0__Impl"
    // InternalHouseBuilder.g:6216:1: rule__Room__Group_8__0__Impl : ( 'roomType' ) ;
    public final void rule__Room__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6220:1: ( ( 'roomType' ) )
            // InternalHouseBuilder.g:6221:1: ( 'roomType' )
            {
            // InternalHouseBuilder.g:6221:1: ( 'roomType' )
            // InternalHouseBuilder.g:6222:2: 'roomType'
            {
             before(grammarAccess.getRoomAccess().getRoomTypeKeyword_8_0()); 
            match(input,98,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRoomTypeKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_8__0__Impl"


    // $ANTLR start "rule__Room__Group_8__1"
    // InternalHouseBuilder.g:6231:1: rule__Room__Group_8__1 : rule__Room__Group_8__1__Impl ;
    public final void rule__Room__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6235:1: ( rule__Room__Group_8__1__Impl )
            // InternalHouseBuilder.g:6236:2: rule__Room__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_8__1"


    // $ANTLR start "rule__Room__Group_8__1__Impl"
    // InternalHouseBuilder.g:6242:1: rule__Room__Group_8__1__Impl : ( ( rule__Room__RoomTypeAssignment_8_1 ) ) ;
    public final void rule__Room__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6246:1: ( ( ( rule__Room__RoomTypeAssignment_8_1 ) ) )
            // InternalHouseBuilder.g:6247:1: ( ( rule__Room__RoomTypeAssignment_8_1 ) )
            {
            // InternalHouseBuilder.g:6247:1: ( ( rule__Room__RoomTypeAssignment_8_1 ) )
            // InternalHouseBuilder.g:6248:2: ( rule__Room__RoomTypeAssignment_8_1 )
            {
             before(grammarAccess.getRoomAccess().getRoomTypeAssignment_8_1()); 
            // InternalHouseBuilder.g:6249:2: ( rule__Room__RoomTypeAssignment_8_1 )
            // InternalHouseBuilder.g:6249:3: rule__Room__RoomTypeAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__RoomTypeAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getRoomTypeAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_8__1__Impl"


    // $ANTLR start "rule__Room__Group_9__0"
    // InternalHouseBuilder.g:6258:1: rule__Room__Group_9__0 : rule__Room__Group_9__0__Impl rule__Room__Group_9__1 ;
    public final void rule__Room__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6262:1: ( rule__Room__Group_9__0__Impl rule__Room__Group_9__1 )
            // InternalHouseBuilder.g:6263:2: rule__Room__Group_9__0__Impl rule__Room__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__0"


    // $ANTLR start "rule__Room__Group_9__0__Impl"
    // InternalHouseBuilder.g:6270:1: rule__Room__Group_9__0__Impl : ( 'devices' ) ;
    public final void rule__Room__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6274:1: ( ( 'devices' ) )
            // InternalHouseBuilder.g:6275:1: ( 'devices' )
            {
            // InternalHouseBuilder.g:6275:1: ( 'devices' )
            // InternalHouseBuilder.g:6276:2: 'devices'
            {
             before(grammarAccess.getRoomAccess().getDevicesKeyword_9_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getDevicesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__0__Impl"


    // $ANTLR start "rule__Room__Group_9__1"
    // InternalHouseBuilder.g:6285:1: rule__Room__Group_9__1 : rule__Room__Group_9__1__Impl rule__Room__Group_9__2 ;
    public final void rule__Room__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6289:1: ( rule__Room__Group_9__1__Impl rule__Room__Group_9__2 )
            // InternalHouseBuilder.g:6290:2: rule__Room__Group_9__1__Impl rule__Room__Group_9__2
            {
            pushFollow(FOLLOW_26);
            rule__Room__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__1"


    // $ANTLR start "rule__Room__Group_9__1__Impl"
    // InternalHouseBuilder.g:6297:1: rule__Room__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6301:1: ( ( '{' ) )
            // InternalHouseBuilder.g:6302:1: ( '{' )
            {
            // InternalHouseBuilder.g:6302:1: ( '{' )
            // InternalHouseBuilder.g:6303:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__1__Impl"


    // $ANTLR start "rule__Room__Group_9__2"
    // InternalHouseBuilder.g:6312:1: rule__Room__Group_9__2 : rule__Room__Group_9__2__Impl rule__Room__Group_9__3 ;
    public final void rule__Room__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6316:1: ( rule__Room__Group_9__2__Impl rule__Room__Group_9__3 )
            // InternalHouseBuilder.g:6317:2: rule__Room__Group_9__2__Impl rule__Room__Group_9__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__2"


    // $ANTLR start "rule__Room__Group_9__2__Impl"
    // InternalHouseBuilder.g:6324:1: rule__Room__Group_9__2__Impl : ( ( rule__Room__DevicesAssignment_9_2 ) ) ;
    public final void rule__Room__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6328:1: ( ( ( rule__Room__DevicesAssignment_9_2 ) ) )
            // InternalHouseBuilder.g:6329:1: ( ( rule__Room__DevicesAssignment_9_2 ) )
            {
            // InternalHouseBuilder.g:6329:1: ( ( rule__Room__DevicesAssignment_9_2 ) )
            // InternalHouseBuilder.g:6330:2: ( rule__Room__DevicesAssignment_9_2 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_9_2()); 
            // InternalHouseBuilder.g:6331:2: ( rule__Room__DevicesAssignment_9_2 )
            // InternalHouseBuilder.g:6331:3: rule__Room__DevicesAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__2__Impl"


    // $ANTLR start "rule__Room__Group_9__3"
    // InternalHouseBuilder.g:6339:1: rule__Room__Group_9__3 : rule__Room__Group_9__3__Impl rule__Room__Group_9__4 ;
    public final void rule__Room__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6343:1: ( rule__Room__Group_9__3__Impl rule__Room__Group_9__4 )
            // InternalHouseBuilder.g:6344:2: rule__Room__Group_9__3__Impl rule__Room__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__3"


    // $ANTLR start "rule__Room__Group_9__3__Impl"
    // InternalHouseBuilder.g:6351:1: rule__Room__Group_9__3__Impl : ( ( rule__Room__Group_9_3__0 )* ) ;
    public final void rule__Room__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6355:1: ( ( ( rule__Room__Group_9_3__0 )* ) )
            // InternalHouseBuilder.g:6356:1: ( ( rule__Room__Group_9_3__0 )* )
            {
            // InternalHouseBuilder.g:6356:1: ( ( rule__Room__Group_9_3__0 )* )
            // InternalHouseBuilder.g:6357:2: ( rule__Room__Group_9_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_9_3()); 
            // InternalHouseBuilder.g:6358:2: ( rule__Room__Group_9_3__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==68) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalHouseBuilder.g:6358:3: rule__Room__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__3__Impl"


    // $ANTLR start "rule__Room__Group_9__4"
    // InternalHouseBuilder.g:6366:1: rule__Room__Group_9__4 : rule__Room__Group_9__4__Impl ;
    public final void rule__Room__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6370:1: ( rule__Room__Group_9__4__Impl )
            // InternalHouseBuilder.g:6371:2: rule__Room__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__4"


    // $ANTLR start "rule__Room__Group_9__4__Impl"
    // InternalHouseBuilder.g:6377:1: rule__Room__Group_9__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6381:1: ( ( '}' ) )
            // InternalHouseBuilder.g:6382:1: ( '}' )
            {
            // InternalHouseBuilder.g:6382:1: ( '}' )
            // InternalHouseBuilder.g:6383:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9__4__Impl"


    // $ANTLR start "rule__Room__Group_9_3__0"
    // InternalHouseBuilder.g:6393:1: rule__Room__Group_9_3__0 : rule__Room__Group_9_3__0__Impl rule__Room__Group_9_3__1 ;
    public final void rule__Room__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6397:1: ( rule__Room__Group_9_3__0__Impl rule__Room__Group_9_3__1 )
            // InternalHouseBuilder.g:6398:2: rule__Room__Group_9_3__0__Impl rule__Room__Group_9_3__1
            {
            pushFollow(FOLLOW_26);
            rule__Room__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_9_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9_3__0"


    // $ANTLR start "rule__Room__Group_9_3__0__Impl"
    // InternalHouseBuilder.g:6405:1: rule__Room__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6409:1: ( ( ',' ) )
            // InternalHouseBuilder.g:6410:1: ( ',' )
            {
            // InternalHouseBuilder.g:6410:1: ( ',' )
            // InternalHouseBuilder.g:6411:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_9_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_9_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9_3__0__Impl"


    // $ANTLR start "rule__Room__Group_9_3__1"
    // InternalHouseBuilder.g:6420:1: rule__Room__Group_9_3__1 : rule__Room__Group_9_3__1__Impl ;
    public final void rule__Room__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6424:1: ( rule__Room__Group_9_3__1__Impl )
            // InternalHouseBuilder.g:6425:2: rule__Room__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_9_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9_3__1"


    // $ANTLR start "rule__Room__Group_9_3__1__Impl"
    // InternalHouseBuilder.g:6431:1: rule__Room__Group_9_3__1__Impl : ( ( rule__Room__DevicesAssignment_9_3_1 ) ) ;
    public final void rule__Room__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6435:1: ( ( ( rule__Room__DevicesAssignment_9_3_1 ) ) )
            // InternalHouseBuilder.g:6436:1: ( ( rule__Room__DevicesAssignment_9_3_1 ) )
            {
            // InternalHouseBuilder.g:6436:1: ( ( rule__Room__DevicesAssignment_9_3_1 ) )
            // InternalHouseBuilder.g:6437:2: ( rule__Room__DevicesAssignment_9_3_1 )
            {
             before(grammarAccess.getRoomAccess().getDevicesAssignment_9_3_1()); 
            // InternalHouseBuilder.g:6438:2: ( rule__Room__DevicesAssignment_9_3_1 )
            // InternalHouseBuilder.g:6438:3: rule__Room__DevicesAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__DevicesAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getDevicesAssignment_9_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_9_3__1__Impl"


    // $ANTLR start "rule__Room__Group_10__0"
    // InternalHouseBuilder.g:6447:1: rule__Room__Group_10__0 : rule__Room__Group_10__0__Impl rule__Room__Group_10__1 ;
    public final void rule__Room__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6451:1: ( rule__Room__Group_10__0__Impl rule__Room__Group_10__1 )
            // InternalHouseBuilder.g:6452:2: rule__Room__Group_10__0__Impl rule__Room__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Room__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__0"


    // $ANTLR start "rule__Room__Group_10__0__Impl"
    // InternalHouseBuilder.g:6459:1: rule__Room__Group_10__0__Impl : ( 'windows' ) ;
    public final void rule__Room__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6463:1: ( ( 'windows' ) )
            // InternalHouseBuilder.g:6464:1: ( 'windows' )
            {
            // InternalHouseBuilder.g:6464:1: ( 'windows' )
            // InternalHouseBuilder.g:6465:2: 'windows'
            {
             before(grammarAccess.getRoomAccess().getWindowsKeyword_10_0()); 
            match(input,99,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getWindowsKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__0__Impl"


    // $ANTLR start "rule__Room__Group_10__1"
    // InternalHouseBuilder.g:6474:1: rule__Room__Group_10__1 : rule__Room__Group_10__1__Impl rule__Room__Group_10__2 ;
    public final void rule__Room__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6478:1: ( rule__Room__Group_10__1__Impl rule__Room__Group_10__2 )
            // InternalHouseBuilder.g:6479:2: rule__Room__Group_10__1__Impl rule__Room__Group_10__2
            {
            pushFollow(FOLLOW_41);
            rule__Room__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__1"


    // $ANTLR start "rule__Room__Group_10__1__Impl"
    // InternalHouseBuilder.g:6486:1: rule__Room__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Room__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6490:1: ( ( '{' ) )
            // InternalHouseBuilder.g:6491:1: ( '{' )
            {
            // InternalHouseBuilder.g:6491:1: ( '{' )
            // InternalHouseBuilder.g:6492:2: '{'
            {
             before(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__1__Impl"


    // $ANTLR start "rule__Room__Group_10__2"
    // InternalHouseBuilder.g:6501:1: rule__Room__Group_10__2 : rule__Room__Group_10__2__Impl rule__Room__Group_10__3 ;
    public final void rule__Room__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6505:1: ( rule__Room__Group_10__2__Impl rule__Room__Group_10__3 )
            // InternalHouseBuilder.g:6506:2: rule__Room__Group_10__2__Impl rule__Room__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__2"


    // $ANTLR start "rule__Room__Group_10__2__Impl"
    // InternalHouseBuilder.g:6513:1: rule__Room__Group_10__2__Impl : ( ( rule__Room__WindowsAssignment_10_2 ) ) ;
    public final void rule__Room__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6517:1: ( ( ( rule__Room__WindowsAssignment_10_2 ) ) )
            // InternalHouseBuilder.g:6518:1: ( ( rule__Room__WindowsAssignment_10_2 ) )
            {
            // InternalHouseBuilder.g:6518:1: ( ( rule__Room__WindowsAssignment_10_2 ) )
            // InternalHouseBuilder.g:6519:2: ( rule__Room__WindowsAssignment_10_2 )
            {
             before(grammarAccess.getRoomAccess().getWindowsAssignment_10_2()); 
            // InternalHouseBuilder.g:6520:2: ( rule__Room__WindowsAssignment_10_2 )
            // InternalHouseBuilder.g:6520:3: rule__Room__WindowsAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Room__WindowsAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWindowsAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__2__Impl"


    // $ANTLR start "rule__Room__Group_10__3"
    // InternalHouseBuilder.g:6528:1: rule__Room__Group_10__3 : rule__Room__Group_10__3__Impl rule__Room__Group_10__4 ;
    public final void rule__Room__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6532:1: ( rule__Room__Group_10__3__Impl rule__Room__Group_10__4 )
            // InternalHouseBuilder.g:6533:2: rule__Room__Group_10__3__Impl rule__Room__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Room__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__3"


    // $ANTLR start "rule__Room__Group_10__3__Impl"
    // InternalHouseBuilder.g:6540:1: rule__Room__Group_10__3__Impl : ( ( rule__Room__Group_10_3__0 )* ) ;
    public final void rule__Room__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6544:1: ( ( ( rule__Room__Group_10_3__0 )* ) )
            // InternalHouseBuilder.g:6545:1: ( ( rule__Room__Group_10_3__0 )* )
            {
            // InternalHouseBuilder.g:6545:1: ( ( rule__Room__Group_10_3__0 )* )
            // InternalHouseBuilder.g:6546:2: ( rule__Room__Group_10_3__0 )*
            {
             before(grammarAccess.getRoomAccess().getGroup_10_3()); 
            // InternalHouseBuilder.g:6547:2: ( rule__Room__Group_10_3__0 )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==68) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalHouseBuilder.g:6547:3: rule__Room__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Room__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

             after(grammarAccess.getRoomAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__3__Impl"


    // $ANTLR start "rule__Room__Group_10__4"
    // InternalHouseBuilder.g:6555:1: rule__Room__Group_10__4 : rule__Room__Group_10__4__Impl ;
    public final void rule__Room__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6559:1: ( rule__Room__Group_10__4__Impl )
            // InternalHouseBuilder.g:6560:2: rule__Room__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__4"


    // $ANTLR start "rule__Room__Group_10__4__Impl"
    // InternalHouseBuilder.g:6566:1: rule__Room__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Room__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6570:1: ( ( '}' ) )
            // InternalHouseBuilder.g:6571:1: ( '}' )
            {
            // InternalHouseBuilder.g:6571:1: ( '}' )
            // InternalHouseBuilder.g:6572:2: '}'
            {
             before(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10__4__Impl"


    // $ANTLR start "rule__Room__Group_10_3__0"
    // InternalHouseBuilder.g:6582:1: rule__Room__Group_10_3__0 : rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1 ;
    public final void rule__Room__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6586:1: ( rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1 )
            // InternalHouseBuilder.g:6587:2: rule__Room__Group_10_3__0__Impl rule__Room__Group_10_3__1
            {
            pushFollow(FOLLOW_41);
            rule__Room__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Room__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__0"


    // $ANTLR start "rule__Room__Group_10_3__0__Impl"
    // InternalHouseBuilder.g:6594:1: rule__Room__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Room__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6598:1: ( ( ',' ) )
            // InternalHouseBuilder.g:6599:1: ( ',' )
            {
            // InternalHouseBuilder.g:6599:1: ( ',' )
            // InternalHouseBuilder.g:6600:2: ','
            {
             before(grammarAccess.getRoomAccess().getCommaKeyword_10_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRoomAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__0__Impl"


    // $ANTLR start "rule__Room__Group_10_3__1"
    // InternalHouseBuilder.g:6609:1: rule__Room__Group_10_3__1 : rule__Room__Group_10_3__1__Impl ;
    public final void rule__Room__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6613:1: ( rule__Room__Group_10_3__1__Impl )
            // InternalHouseBuilder.g:6614:2: rule__Room__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Room__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__1"


    // $ANTLR start "rule__Room__Group_10_3__1__Impl"
    // InternalHouseBuilder.g:6620:1: rule__Room__Group_10_3__1__Impl : ( ( rule__Room__WindowsAssignment_10_3_1 ) ) ;
    public final void rule__Room__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6624:1: ( ( ( rule__Room__WindowsAssignment_10_3_1 ) ) )
            // InternalHouseBuilder.g:6625:1: ( ( rule__Room__WindowsAssignment_10_3_1 ) )
            {
            // InternalHouseBuilder.g:6625:1: ( ( rule__Room__WindowsAssignment_10_3_1 ) )
            // InternalHouseBuilder.g:6626:2: ( rule__Room__WindowsAssignment_10_3_1 )
            {
             before(grammarAccess.getRoomAccess().getWindowsAssignment_10_3_1()); 
            // InternalHouseBuilder.g:6627:2: ( rule__Room__WindowsAssignment_10_3_1 )
            // InternalHouseBuilder.g:6627:3: rule__Room__WindowsAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Room__WindowsAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRoomAccess().getWindowsAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__Group_10_3__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__0"
    // InternalHouseBuilder.g:6636:1: rule__ExternalSpace__Group__0 : rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1 ;
    public final void rule__ExternalSpace__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6640:1: ( rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1 )
            // InternalHouseBuilder.g:6641:2: rule__ExternalSpace__Group__0__Impl rule__ExternalSpace__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ExternalSpace__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__0"


    // $ANTLR start "rule__ExternalSpace__Group__0__Impl"
    // InternalHouseBuilder.g:6648:1: rule__ExternalSpace__Group__0__Impl : ( 'ExternalSpace' ) ;
    public final void rule__ExternalSpace__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6652:1: ( ( 'ExternalSpace' ) )
            // InternalHouseBuilder.g:6653:1: ( 'ExternalSpace' )
            {
            // InternalHouseBuilder.g:6653:1: ( 'ExternalSpace' )
            // InternalHouseBuilder.g:6654:2: 'ExternalSpace'
            {
             before(grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0()); 
            match(input,100,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__1"
    // InternalHouseBuilder.g:6663:1: rule__ExternalSpace__Group__1 : rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2 ;
    public final void rule__ExternalSpace__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6667:1: ( rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2 )
            // InternalHouseBuilder.g:6668:2: rule__ExternalSpace__Group__1__Impl rule__ExternalSpace__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ExternalSpace__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__1"


    // $ANTLR start "rule__ExternalSpace__Group__1__Impl"
    // InternalHouseBuilder.g:6675:1: rule__ExternalSpace__Group__1__Impl : ( ( rule__ExternalSpace__NameAssignment_1 ) ) ;
    public final void rule__ExternalSpace__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6679:1: ( ( ( rule__ExternalSpace__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:6680:1: ( ( rule__ExternalSpace__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:6680:1: ( ( rule__ExternalSpace__NameAssignment_1 ) )
            // InternalHouseBuilder.g:6681:2: ( rule__ExternalSpace__NameAssignment_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:6682:2: ( rule__ExternalSpace__NameAssignment_1 )
            // InternalHouseBuilder.g:6682:3: rule__ExternalSpace__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__2"
    // InternalHouseBuilder.g:6690:1: rule__ExternalSpace__Group__2 : rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3 ;
    public final void rule__ExternalSpace__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6694:1: ( rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3 )
            // InternalHouseBuilder.g:6695:2: rule__ExternalSpace__Group__2__Impl rule__ExternalSpace__Group__3
            {
            pushFollow(FOLLOW_42);
            rule__ExternalSpace__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__2"


    // $ANTLR start "rule__ExternalSpace__Group__2__Impl"
    // InternalHouseBuilder.g:6702:1: rule__ExternalSpace__Group__2__Impl : ( '{' ) ;
    public final void rule__ExternalSpace__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6706:1: ( ( '{' ) )
            // InternalHouseBuilder.g:6707:1: ( '{' )
            {
            // InternalHouseBuilder.g:6707:1: ( '{' )
            // InternalHouseBuilder.g:6708:2: '{'
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__3"
    // InternalHouseBuilder.g:6717:1: rule__ExternalSpace__Group__3 : rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4 ;
    public final void rule__ExternalSpace__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6721:1: ( rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4 )
            // InternalHouseBuilder.g:6722:2: rule__ExternalSpace__Group__3__Impl rule__ExternalSpace__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ExternalSpace__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__3"


    // $ANTLR start "rule__ExternalSpace__Group__3__Impl"
    // InternalHouseBuilder.g:6729:1: rule__ExternalSpace__Group__3__Impl : ( 'length' ) ;
    public final void rule__ExternalSpace__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6733:1: ( ( 'length' ) )
            // InternalHouseBuilder.g:6734:1: ( 'length' )
            {
            // InternalHouseBuilder.g:6734:1: ( 'length' )
            // InternalHouseBuilder.g:6735:2: 'length'
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthKeyword_3()); 
            match(input,101,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLengthKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__4"
    // InternalHouseBuilder.g:6744:1: rule__ExternalSpace__Group__4 : rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5 ;
    public final void rule__ExternalSpace__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6748:1: ( rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5 )
            // InternalHouseBuilder.g:6749:2: rule__ExternalSpace__Group__4__Impl rule__ExternalSpace__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__ExternalSpace__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__4"


    // $ANTLR start "rule__ExternalSpace__Group__4__Impl"
    // InternalHouseBuilder.g:6756:1: rule__ExternalSpace__Group__4__Impl : ( ( rule__ExternalSpace__LengthAssignment_4 ) ) ;
    public final void rule__ExternalSpace__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6760:1: ( ( ( rule__ExternalSpace__LengthAssignment_4 ) ) )
            // InternalHouseBuilder.g:6761:1: ( ( rule__ExternalSpace__LengthAssignment_4 ) )
            {
            // InternalHouseBuilder.g:6761:1: ( ( rule__ExternalSpace__LengthAssignment_4 ) )
            // InternalHouseBuilder.g:6762:2: ( rule__ExternalSpace__LengthAssignment_4 )
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthAssignment_4()); 
            // InternalHouseBuilder.g:6763:2: ( rule__ExternalSpace__LengthAssignment_4 )
            // InternalHouseBuilder.g:6763:3: rule__ExternalSpace__LengthAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__LengthAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getLengthAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__5"
    // InternalHouseBuilder.g:6771:1: rule__ExternalSpace__Group__5 : rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6 ;
    public final void rule__ExternalSpace__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6775:1: ( rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6 )
            // InternalHouseBuilder.g:6776:2: rule__ExternalSpace__Group__5__Impl rule__ExternalSpace__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__ExternalSpace__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__5"


    // $ANTLR start "rule__ExternalSpace__Group__5__Impl"
    // InternalHouseBuilder.g:6783:1: rule__ExternalSpace__Group__5__Impl : ( 'width' ) ;
    public final void rule__ExternalSpace__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6787:1: ( ( 'width' ) )
            // InternalHouseBuilder.g:6788:1: ( 'width' )
            {
            // InternalHouseBuilder.g:6788:1: ( 'width' )
            // InternalHouseBuilder.g:6789:2: 'width'
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthKeyword_5()); 
            match(input,102,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getWidthKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__5__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__6"
    // InternalHouseBuilder.g:6798:1: rule__ExternalSpace__Group__6 : rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7 ;
    public final void rule__ExternalSpace__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6802:1: ( rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7 )
            // InternalHouseBuilder.g:6803:2: rule__ExternalSpace__Group__6__Impl rule__ExternalSpace__Group__7
            {
            pushFollow(FOLLOW_44);
            rule__ExternalSpace__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__6"


    // $ANTLR start "rule__ExternalSpace__Group__6__Impl"
    // InternalHouseBuilder.g:6810:1: rule__ExternalSpace__Group__6__Impl : ( ( rule__ExternalSpace__WidthAssignment_6 ) ) ;
    public final void rule__ExternalSpace__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6814:1: ( ( ( rule__ExternalSpace__WidthAssignment_6 ) ) )
            // InternalHouseBuilder.g:6815:1: ( ( rule__ExternalSpace__WidthAssignment_6 ) )
            {
            // InternalHouseBuilder.g:6815:1: ( ( rule__ExternalSpace__WidthAssignment_6 ) )
            // InternalHouseBuilder.g:6816:2: ( rule__ExternalSpace__WidthAssignment_6 )
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthAssignment_6()); 
            // InternalHouseBuilder.g:6817:2: ( rule__ExternalSpace__WidthAssignment_6 )
            // InternalHouseBuilder.g:6817:3: rule__ExternalSpace__WidthAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__WidthAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getWidthAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__6__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__7"
    // InternalHouseBuilder.g:6825:1: rule__ExternalSpace__Group__7 : rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8 ;
    public final void rule__ExternalSpace__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6829:1: ( rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8 )
            // InternalHouseBuilder.g:6830:2: rule__ExternalSpace__Group__7__Impl rule__ExternalSpace__Group__8
            {
            pushFollow(FOLLOW_45);
            rule__ExternalSpace__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__7"


    // $ANTLR start "rule__ExternalSpace__Group__7__Impl"
    // InternalHouseBuilder.g:6837:1: rule__ExternalSpace__Group__7__Impl : ( 'type' ) ;
    public final void rule__ExternalSpace__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6841:1: ( ( 'type' ) )
            // InternalHouseBuilder.g:6842:1: ( 'type' )
            {
            // InternalHouseBuilder.g:6842:1: ( 'type' )
            // InternalHouseBuilder.g:6843:2: 'type'
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeKeyword_7()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getTypeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__7__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__8"
    // InternalHouseBuilder.g:6852:1: rule__ExternalSpace__Group__8 : rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9 ;
    public final void rule__ExternalSpace__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6856:1: ( rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9 )
            // InternalHouseBuilder.g:6857:2: rule__ExternalSpace__Group__8__Impl rule__ExternalSpace__Group__9
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__8"


    // $ANTLR start "rule__ExternalSpace__Group__8__Impl"
    // InternalHouseBuilder.g:6864:1: rule__ExternalSpace__Group__8__Impl : ( ( rule__ExternalSpace__TypeAssignment_8 ) ) ;
    public final void rule__ExternalSpace__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6868:1: ( ( ( rule__ExternalSpace__TypeAssignment_8 ) ) )
            // InternalHouseBuilder.g:6869:1: ( ( rule__ExternalSpace__TypeAssignment_8 ) )
            {
            // InternalHouseBuilder.g:6869:1: ( ( rule__ExternalSpace__TypeAssignment_8 ) )
            // InternalHouseBuilder.g:6870:2: ( rule__ExternalSpace__TypeAssignment_8 )
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeAssignment_8()); 
            // InternalHouseBuilder.g:6871:2: ( rule__ExternalSpace__TypeAssignment_8 )
            // InternalHouseBuilder.g:6871:3: rule__ExternalSpace__TypeAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__TypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__8__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__9"
    // InternalHouseBuilder.g:6879:1: rule__ExternalSpace__Group__9 : rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10 ;
    public final void rule__ExternalSpace__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6883:1: ( rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10 )
            // InternalHouseBuilder.g:6884:2: rule__ExternalSpace__Group__9__Impl rule__ExternalSpace__Group__10
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__9"


    // $ANTLR start "rule__ExternalSpace__Group__9__Impl"
    // InternalHouseBuilder.g:6891:1: rule__ExternalSpace__Group__9__Impl : ( ( rule__ExternalSpace__Group_9__0 )? ) ;
    public final void rule__ExternalSpace__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6895:1: ( ( ( rule__ExternalSpace__Group_9__0 )? ) )
            // InternalHouseBuilder.g:6896:1: ( ( rule__ExternalSpace__Group_9__0 )? )
            {
            // InternalHouseBuilder.g:6896:1: ( ( rule__ExternalSpace__Group_9__0 )? )
            // InternalHouseBuilder.g:6897:2: ( rule__ExternalSpace__Group_9__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_9()); 
            // InternalHouseBuilder.g:6898:2: ( rule__ExternalSpace__Group_9__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==103) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalHouseBuilder.g:6898:3: rule__ExternalSpace__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__9__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__10"
    // InternalHouseBuilder.g:6906:1: rule__ExternalSpace__Group__10 : rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11 ;
    public final void rule__ExternalSpace__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6910:1: ( rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11 )
            // InternalHouseBuilder.g:6911:2: rule__ExternalSpace__Group__10__Impl rule__ExternalSpace__Group__11
            {
            pushFollow(FOLLOW_46);
            rule__ExternalSpace__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__10"


    // $ANTLR start "rule__ExternalSpace__Group__10__Impl"
    // InternalHouseBuilder.g:6918:1: rule__ExternalSpace__Group__10__Impl : ( ( rule__ExternalSpace__Group_10__0 )? ) ;
    public final void rule__ExternalSpace__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6922:1: ( ( ( rule__ExternalSpace__Group_10__0 )? ) )
            // InternalHouseBuilder.g:6923:1: ( ( rule__ExternalSpace__Group_10__0 )? )
            {
            // InternalHouseBuilder.g:6923:1: ( ( rule__ExternalSpace__Group_10__0 )? )
            // InternalHouseBuilder.g:6924:2: ( rule__ExternalSpace__Group_10__0 )?
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_10()); 
            // InternalHouseBuilder.g:6925:2: ( rule__ExternalSpace__Group_10__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==81) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalHouseBuilder.g:6925:3: rule__ExternalSpace__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalSpace__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExternalSpaceAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__10__Impl"


    // $ANTLR start "rule__ExternalSpace__Group__11"
    // InternalHouseBuilder.g:6933:1: rule__ExternalSpace__Group__11 : rule__ExternalSpace__Group__11__Impl ;
    public final void rule__ExternalSpace__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6937:1: ( rule__ExternalSpace__Group__11__Impl )
            // InternalHouseBuilder.g:6938:2: rule__ExternalSpace__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__11"


    // $ANTLR start "rule__ExternalSpace__Group__11__Impl"
    // InternalHouseBuilder.g:6944:1: rule__ExternalSpace__Group__11__Impl : ( '}' ) ;
    public final void rule__ExternalSpace__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6948:1: ( ( '}' ) )
            // InternalHouseBuilder.g:6949:1: ( '}' )
            {
            // InternalHouseBuilder.g:6949:1: ( '}' )
            // InternalHouseBuilder.g:6950:2: '}'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group__11__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__0"
    // InternalHouseBuilder.g:6960:1: rule__ExternalSpace__Group_9__0 : rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1 ;
    public final void rule__ExternalSpace__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6964:1: ( rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1 )
            // InternalHouseBuilder.g:6965:2: rule__ExternalSpace__Group_9__0__Impl rule__ExternalSpace__Group_9__1
            {
            pushFollow(FOLLOW_47);
            rule__ExternalSpace__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__0"


    // $ANTLR start "rule__ExternalSpace__Group_9__0__Impl"
    // InternalHouseBuilder.g:6972:1: rule__ExternalSpace__Group_9__0__Impl : ( 'ground' ) ;
    public final void rule__ExternalSpace__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6976:1: ( ( 'ground' ) )
            // InternalHouseBuilder.g:6977:1: ( 'ground' )
            {
            // InternalHouseBuilder.g:6977:1: ( 'ground' )
            // InternalHouseBuilder.g:6978:2: 'ground'
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundKeyword_9_0()); 
            match(input,103,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getGroundKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_9__1"
    // InternalHouseBuilder.g:6987:1: rule__ExternalSpace__Group_9__1 : rule__ExternalSpace__Group_9__1__Impl ;
    public final void rule__ExternalSpace__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:6991:1: ( rule__ExternalSpace__Group_9__1__Impl )
            // InternalHouseBuilder.g:6992:2: rule__ExternalSpace__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__1"


    // $ANTLR start "rule__ExternalSpace__Group_9__1__Impl"
    // InternalHouseBuilder.g:6998:1: rule__ExternalSpace__Group_9__1__Impl : ( ( rule__ExternalSpace__GroundAssignment_9_1 ) ) ;
    public final void rule__ExternalSpace__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7002:1: ( ( ( rule__ExternalSpace__GroundAssignment_9_1 ) ) )
            // InternalHouseBuilder.g:7003:1: ( ( rule__ExternalSpace__GroundAssignment_9_1 ) )
            {
            // InternalHouseBuilder.g:7003:1: ( ( rule__ExternalSpace__GroundAssignment_9_1 ) )
            // InternalHouseBuilder.g:7004:2: ( rule__ExternalSpace__GroundAssignment_9_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundAssignment_9_1()); 
            // InternalHouseBuilder.g:7005:2: ( rule__ExternalSpace__GroundAssignment_9_1 )
            // InternalHouseBuilder.g:7005:3: rule__ExternalSpace__GroundAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__GroundAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getGroundAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_9__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__0"
    // InternalHouseBuilder.g:7014:1: rule__ExternalSpace__Group_10__0 : rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1 ;
    public final void rule__ExternalSpace__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7018:1: ( rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1 )
            // InternalHouseBuilder.g:7019:2: rule__ExternalSpace__Group_10__0__Impl rule__ExternalSpace__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__ExternalSpace__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__0"


    // $ANTLR start "rule__ExternalSpace__Group_10__0__Impl"
    // InternalHouseBuilder.g:7026:1: rule__ExternalSpace__Group_10__0__Impl : ( 'devices' ) ;
    public final void rule__ExternalSpace__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7030:1: ( ( 'devices' ) )
            // InternalHouseBuilder.g:7031:1: ( 'devices' )
            {
            // InternalHouseBuilder.g:7031:1: ( 'devices' )
            // InternalHouseBuilder.g:7032:2: 'devices'
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesKeyword_10_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getDevicesKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__1"
    // InternalHouseBuilder.g:7041:1: rule__ExternalSpace__Group_10__1 : rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2 ;
    public final void rule__ExternalSpace__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7045:1: ( rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2 )
            // InternalHouseBuilder.g:7046:2: rule__ExternalSpace__Group_10__1__Impl rule__ExternalSpace__Group_10__2
            {
            pushFollow(FOLLOW_26);
            rule__ExternalSpace__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__1"


    // $ANTLR start "rule__ExternalSpace__Group_10__1__Impl"
    // InternalHouseBuilder.g:7053:1: rule__ExternalSpace__Group_10__1__Impl : ( '{' ) ;
    public final void rule__ExternalSpace__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7057:1: ( ( '{' ) )
            // InternalHouseBuilder.g:7058:1: ( '{' )
            {
            // InternalHouseBuilder.g:7058:1: ( '{' )
            // InternalHouseBuilder.g:7059:2: '{'
            {
             before(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__1__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__2"
    // InternalHouseBuilder.g:7068:1: rule__ExternalSpace__Group_10__2 : rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3 ;
    public final void rule__ExternalSpace__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7072:1: ( rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3 )
            // InternalHouseBuilder.g:7073:2: rule__ExternalSpace__Group_10__2__Impl rule__ExternalSpace__Group_10__3
            {
            pushFollow(FOLLOW_7);
            rule__ExternalSpace__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__2"


    // $ANTLR start "rule__ExternalSpace__Group_10__2__Impl"
    // InternalHouseBuilder.g:7080:1: rule__ExternalSpace__Group_10__2__Impl : ( ( rule__ExternalSpace__DevicesAssignment_10_2 ) ) ;
    public final void rule__ExternalSpace__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7084:1: ( ( ( rule__ExternalSpace__DevicesAssignment_10_2 ) ) )
            // InternalHouseBuilder.g:7085:1: ( ( rule__ExternalSpace__DevicesAssignment_10_2 ) )
            {
            // InternalHouseBuilder.g:7085:1: ( ( rule__ExternalSpace__DevicesAssignment_10_2 ) )
            // InternalHouseBuilder.g:7086:2: ( rule__ExternalSpace__DevicesAssignment_10_2 )
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_10_2()); 
            // InternalHouseBuilder.g:7087:2: ( rule__ExternalSpace__DevicesAssignment_10_2 )
            // InternalHouseBuilder.g:7087:3: rule__ExternalSpace__DevicesAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__DevicesAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__2__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__3"
    // InternalHouseBuilder.g:7095:1: rule__ExternalSpace__Group_10__3 : rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4 ;
    public final void rule__ExternalSpace__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7099:1: ( rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4 )
            // InternalHouseBuilder.g:7100:2: rule__ExternalSpace__Group_10__3__Impl rule__ExternalSpace__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__ExternalSpace__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__3"


    // $ANTLR start "rule__ExternalSpace__Group_10__3__Impl"
    // InternalHouseBuilder.g:7107:1: rule__ExternalSpace__Group_10__3__Impl : ( ( rule__ExternalSpace__Group_10_3__0 )* ) ;
    public final void rule__ExternalSpace__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7111:1: ( ( ( rule__ExternalSpace__Group_10_3__0 )* ) )
            // InternalHouseBuilder.g:7112:1: ( ( rule__ExternalSpace__Group_10_3__0 )* )
            {
            // InternalHouseBuilder.g:7112:1: ( ( rule__ExternalSpace__Group_10_3__0 )* )
            // InternalHouseBuilder.g:7113:2: ( rule__ExternalSpace__Group_10_3__0 )*
            {
             before(grammarAccess.getExternalSpaceAccess().getGroup_10_3()); 
            // InternalHouseBuilder.g:7114:2: ( rule__ExternalSpace__Group_10_3__0 )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==68) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalHouseBuilder.g:7114:3: rule__ExternalSpace__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ExternalSpace__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);

             after(grammarAccess.getExternalSpaceAccess().getGroup_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__3__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10__4"
    // InternalHouseBuilder.g:7122:1: rule__ExternalSpace__Group_10__4 : rule__ExternalSpace__Group_10__4__Impl ;
    public final void rule__ExternalSpace__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7126:1: ( rule__ExternalSpace__Group_10__4__Impl )
            // InternalHouseBuilder.g:7127:2: rule__ExternalSpace__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__4"


    // $ANTLR start "rule__ExternalSpace__Group_10__4__Impl"
    // InternalHouseBuilder.g:7133:1: rule__ExternalSpace__Group_10__4__Impl : ( '}' ) ;
    public final void rule__ExternalSpace__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7137:1: ( ( '}' ) )
            // InternalHouseBuilder.g:7138:1: ( '}' )
            {
            // InternalHouseBuilder.g:7138:1: ( '}' )
            // InternalHouseBuilder.g:7139:2: '}'
            {
             before(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10__4__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__0"
    // InternalHouseBuilder.g:7149:1: rule__ExternalSpace__Group_10_3__0 : rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1 ;
    public final void rule__ExternalSpace__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7153:1: ( rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1 )
            // InternalHouseBuilder.g:7154:2: rule__ExternalSpace__Group_10_3__0__Impl rule__ExternalSpace__Group_10_3__1
            {
            pushFollow(FOLLOW_26);
            rule__ExternalSpace__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__0"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__0__Impl"
    // InternalHouseBuilder.g:7161:1: rule__ExternalSpace__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__ExternalSpace__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7165:1: ( ( ',' ) )
            // InternalHouseBuilder.g:7166:1: ( ',' )
            {
            // InternalHouseBuilder.g:7166:1: ( ',' )
            // InternalHouseBuilder.g:7167:2: ','
            {
             before(grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__0__Impl"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__1"
    // InternalHouseBuilder.g:7176:1: rule__ExternalSpace__Group_10_3__1 : rule__ExternalSpace__Group_10_3__1__Impl ;
    public final void rule__ExternalSpace__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7180:1: ( rule__ExternalSpace__Group_10_3__1__Impl )
            // InternalHouseBuilder.g:7181:2: rule__ExternalSpace__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__Group_10_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__1"


    // $ANTLR start "rule__ExternalSpace__Group_10_3__1__Impl"
    // InternalHouseBuilder.g:7187:1: rule__ExternalSpace__Group_10_3__1__Impl : ( ( rule__ExternalSpace__DevicesAssignment_10_3_1 ) ) ;
    public final void rule__ExternalSpace__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7191:1: ( ( ( rule__ExternalSpace__DevicesAssignment_10_3_1 ) ) )
            // InternalHouseBuilder.g:7192:1: ( ( rule__ExternalSpace__DevicesAssignment_10_3_1 ) )
            {
            // InternalHouseBuilder.g:7192:1: ( ( rule__ExternalSpace__DevicesAssignment_10_3_1 ) )
            // InternalHouseBuilder.g:7193:2: ( rule__ExternalSpace__DevicesAssignment_10_3_1 )
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_10_3_1()); 
            // InternalHouseBuilder.g:7194:2: ( rule__ExternalSpace__DevicesAssignment_10_3_1 )
            // InternalHouseBuilder.g:7194:3: rule__ExternalSpace__DevicesAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalSpace__DevicesAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalSpaceAccess().getDevicesAssignment_10_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__Group_10_3__1__Impl"


    // $ANTLR start "rule__Actuator__Group__0"
    // InternalHouseBuilder.g:7203:1: rule__Actuator__Group__0 : rule__Actuator__Group__0__Impl rule__Actuator__Group__1 ;
    public final void rule__Actuator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7207:1: ( rule__Actuator__Group__0__Impl rule__Actuator__Group__1 )
            // InternalHouseBuilder.g:7208:2: rule__Actuator__Group__0__Impl rule__Actuator__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0"


    // $ANTLR start "rule__Actuator__Group__0__Impl"
    // InternalHouseBuilder.g:7215:1: rule__Actuator__Group__0__Impl : ( 'Actuator' ) ;
    public final void rule__Actuator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7219:1: ( ( 'Actuator' ) )
            // InternalHouseBuilder.g:7220:1: ( 'Actuator' )
            {
            // InternalHouseBuilder.g:7220:1: ( 'Actuator' )
            // InternalHouseBuilder.g:7221:2: 'Actuator'
            {
             before(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 
            match(input,104,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getActuatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__0__Impl"


    // $ANTLR start "rule__Actuator__Group__1"
    // InternalHouseBuilder.g:7230:1: rule__Actuator__Group__1 : rule__Actuator__Group__1__Impl rule__Actuator__Group__2 ;
    public final void rule__Actuator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7234:1: ( rule__Actuator__Group__1__Impl rule__Actuator__Group__2 )
            // InternalHouseBuilder.g:7235:2: rule__Actuator__Group__1__Impl rule__Actuator__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Actuator__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1"


    // $ANTLR start "rule__Actuator__Group__1__Impl"
    // InternalHouseBuilder.g:7242:1: rule__Actuator__Group__1__Impl : ( ( rule__Actuator__NameAssignment_1 ) ) ;
    public final void rule__Actuator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7246:1: ( ( ( rule__Actuator__NameAssignment_1 ) ) )
            // InternalHouseBuilder.g:7247:1: ( ( rule__Actuator__NameAssignment_1 ) )
            {
            // InternalHouseBuilder.g:7247:1: ( ( rule__Actuator__NameAssignment_1 ) )
            // InternalHouseBuilder.g:7248:2: ( rule__Actuator__NameAssignment_1 )
            {
             before(grammarAccess.getActuatorAccess().getNameAssignment_1()); 
            // InternalHouseBuilder.g:7249:2: ( rule__Actuator__NameAssignment_1 )
            // InternalHouseBuilder.g:7249:3: rule__Actuator__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__1__Impl"


    // $ANTLR start "rule__Actuator__Group__2"
    // InternalHouseBuilder.g:7257:1: rule__Actuator__Group__2 : rule__Actuator__Group__2__Impl rule__Actuator__Group__3 ;
    public final void rule__Actuator__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7261:1: ( rule__Actuator__Group__2__Impl rule__Actuator__Group__3 )
            // InternalHouseBuilder.g:7262:2: rule__Actuator__Group__2__Impl rule__Actuator__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__Actuator__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2"


    // $ANTLR start "rule__Actuator__Group__2__Impl"
    // InternalHouseBuilder.g:7269:1: rule__Actuator__Group__2__Impl : ( '{' ) ;
    public final void rule__Actuator__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7273:1: ( ( '{' ) )
            // InternalHouseBuilder.g:7274:1: ( '{' )
            {
            // InternalHouseBuilder.g:7274:1: ( '{' )
            // InternalHouseBuilder.g:7275:2: '{'
            {
             before(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__2__Impl"


    // $ANTLR start "rule__Actuator__Group__3"
    // InternalHouseBuilder.g:7284:1: rule__Actuator__Group__3 : rule__Actuator__Group__3__Impl rule__Actuator__Group__4 ;
    public final void rule__Actuator__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7288:1: ( rule__Actuator__Group__3__Impl rule__Actuator__Group__4 )
            // InternalHouseBuilder.g:7289:2: rule__Actuator__Group__3__Impl rule__Actuator__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__Actuator__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3"


    // $ANTLR start "rule__Actuator__Group__3__Impl"
    // InternalHouseBuilder.g:7296:1: rule__Actuator__Group__3__Impl : ( ( rule__Actuator__Group_3__0 )? ) ;
    public final void rule__Actuator__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7300:1: ( ( ( rule__Actuator__Group_3__0 )? ) )
            // InternalHouseBuilder.g:7301:1: ( ( rule__Actuator__Group_3__0 )? )
            {
            // InternalHouseBuilder.g:7301:1: ( ( rule__Actuator__Group_3__0 )? )
            // InternalHouseBuilder.g:7302:2: ( rule__Actuator__Group_3__0 )?
            {
             before(grammarAccess.getActuatorAccess().getGroup_3()); 
            // InternalHouseBuilder.g:7303:2: ( rule__Actuator__Group_3__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==93) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalHouseBuilder.g:7303:3: rule__Actuator__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actuator__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__3__Impl"


    // $ANTLR start "rule__Actuator__Group__4"
    // InternalHouseBuilder.g:7311:1: rule__Actuator__Group__4 : rule__Actuator__Group__4__Impl rule__Actuator__Group__5 ;
    public final void rule__Actuator__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7315:1: ( rule__Actuator__Group__4__Impl rule__Actuator__Group__5 )
            // InternalHouseBuilder.g:7316:2: rule__Actuator__Group__4__Impl rule__Actuator__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__Actuator__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4"


    // $ANTLR start "rule__Actuator__Group__4__Impl"
    // InternalHouseBuilder.g:7323:1: rule__Actuator__Group__4__Impl : ( ( rule__Actuator__Group_4__0 )? ) ;
    public final void rule__Actuator__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7327:1: ( ( ( rule__Actuator__Group_4__0 )? ) )
            // InternalHouseBuilder.g:7328:1: ( ( rule__Actuator__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:7328:1: ( ( rule__Actuator__Group_4__0 )? )
            // InternalHouseBuilder.g:7329:2: ( rule__Actuator__Group_4__0 )?
            {
             before(grammarAccess.getActuatorAccess().getGroup_4()); 
            // InternalHouseBuilder.g:7330:2: ( rule__Actuator__Group_4__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==85) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalHouseBuilder.g:7330:3: rule__Actuator__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Actuator__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActuatorAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__4__Impl"


    // $ANTLR start "rule__Actuator__Group__5"
    // InternalHouseBuilder.g:7338:1: rule__Actuator__Group__5 : rule__Actuator__Group__5__Impl rule__Actuator__Group__6 ;
    public final void rule__Actuator__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7342:1: ( rule__Actuator__Group__5__Impl rule__Actuator__Group__6 )
            // InternalHouseBuilder.g:7343:2: rule__Actuator__Group__5__Impl rule__Actuator__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5"


    // $ANTLR start "rule__Actuator__Group__5__Impl"
    // InternalHouseBuilder.g:7350:1: rule__Actuator__Group__5__Impl : ( 'device' ) ;
    public final void rule__Actuator__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7354:1: ( ( 'device' ) )
            // InternalHouseBuilder.g:7355:1: ( 'device' )
            {
            // InternalHouseBuilder.g:7355:1: ( 'device' )
            // InternalHouseBuilder.g:7356:2: 'device'
            {
             before(grammarAccess.getActuatorAccess().getDeviceKeyword_5()); 
            match(input,105,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getDeviceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__5__Impl"


    // $ANTLR start "rule__Actuator__Group__6"
    // InternalHouseBuilder.g:7365:1: rule__Actuator__Group__6 : rule__Actuator__Group__6__Impl rule__Actuator__Group__7 ;
    public final void rule__Actuator__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7369:1: ( rule__Actuator__Group__6__Impl rule__Actuator__Group__7 )
            // InternalHouseBuilder.g:7370:2: rule__Actuator__Group__6__Impl rule__Actuator__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__Actuator__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6"


    // $ANTLR start "rule__Actuator__Group__6__Impl"
    // InternalHouseBuilder.g:7377:1: rule__Actuator__Group__6__Impl : ( ( rule__Actuator__DeviceAssignment_6 ) ) ;
    public final void rule__Actuator__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7381:1: ( ( ( rule__Actuator__DeviceAssignment_6 ) ) )
            // InternalHouseBuilder.g:7382:1: ( ( rule__Actuator__DeviceAssignment_6 ) )
            {
            // InternalHouseBuilder.g:7382:1: ( ( rule__Actuator__DeviceAssignment_6 ) )
            // InternalHouseBuilder.g:7383:2: ( rule__Actuator__DeviceAssignment_6 )
            {
             before(grammarAccess.getActuatorAccess().getDeviceAssignment_6()); 
            // InternalHouseBuilder.g:7384:2: ( rule__Actuator__DeviceAssignment_6 )
            // InternalHouseBuilder.g:7384:3: rule__Actuator__DeviceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__DeviceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getDeviceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__6__Impl"


    // $ANTLR start "rule__Actuator__Group__7"
    // InternalHouseBuilder.g:7392:1: rule__Actuator__Group__7 : rule__Actuator__Group__7__Impl ;
    public final void rule__Actuator__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7396:1: ( rule__Actuator__Group__7__Impl )
            // InternalHouseBuilder.g:7397:2: rule__Actuator__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7"


    // $ANTLR start "rule__Actuator__Group__7__Impl"
    // InternalHouseBuilder.g:7403:1: rule__Actuator__Group__7__Impl : ( '}' ) ;
    public final void rule__Actuator__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7407:1: ( ( '}' ) )
            // InternalHouseBuilder.g:7408:1: ( '}' )
            {
            // InternalHouseBuilder.g:7408:1: ( '}' )
            // InternalHouseBuilder.g:7409:2: '}'
            {
             before(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_7()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group__7__Impl"


    // $ANTLR start "rule__Actuator__Group_3__0"
    // InternalHouseBuilder.g:7419:1: rule__Actuator__Group_3__0 : rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1 ;
    public final void rule__Actuator__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7423:1: ( rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1 )
            // InternalHouseBuilder.g:7424:2: rule__Actuator__Group_3__0__Impl rule__Actuator__Group_3__1
            {
            pushFollow(FOLLOW_49);
            rule__Actuator__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_3__0"


    // $ANTLR start "rule__Actuator__Group_3__0__Impl"
    // InternalHouseBuilder.g:7431:1: rule__Actuator__Group_3__0__Impl : ( 'type' ) ;
    public final void rule__Actuator__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7435:1: ( ( 'type' ) )
            // InternalHouseBuilder.g:7436:1: ( 'type' )
            {
            // InternalHouseBuilder.g:7436:1: ( 'type' )
            // InternalHouseBuilder.g:7437:2: 'type'
            {
             before(grammarAccess.getActuatorAccess().getTypeKeyword_3_0()); 
            match(input,93,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getTypeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_3__0__Impl"


    // $ANTLR start "rule__Actuator__Group_3__1"
    // InternalHouseBuilder.g:7446:1: rule__Actuator__Group_3__1 : rule__Actuator__Group_3__1__Impl ;
    public final void rule__Actuator__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7450:1: ( rule__Actuator__Group_3__1__Impl )
            // InternalHouseBuilder.g:7451:2: rule__Actuator__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_3__1"


    // $ANTLR start "rule__Actuator__Group_3__1__Impl"
    // InternalHouseBuilder.g:7457:1: rule__Actuator__Group_3__1__Impl : ( ( rule__Actuator__TypeAssignment_3_1 ) ) ;
    public final void rule__Actuator__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7461:1: ( ( ( rule__Actuator__TypeAssignment_3_1 ) ) )
            // InternalHouseBuilder.g:7462:1: ( ( rule__Actuator__TypeAssignment_3_1 ) )
            {
            // InternalHouseBuilder.g:7462:1: ( ( rule__Actuator__TypeAssignment_3_1 ) )
            // InternalHouseBuilder.g:7463:2: ( rule__Actuator__TypeAssignment_3_1 )
            {
             before(grammarAccess.getActuatorAccess().getTypeAssignment_3_1()); 
            // InternalHouseBuilder.g:7464:2: ( rule__Actuator__TypeAssignment_3_1 )
            // InternalHouseBuilder.g:7464:3: rule__Actuator__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__TypeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_3__1__Impl"


    // $ANTLR start "rule__Actuator__Group_4__0"
    // InternalHouseBuilder.g:7473:1: rule__Actuator__Group_4__0 : rule__Actuator__Group_4__0__Impl rule__Actuator__Group_4__1 ;
    public final void rule__Actuator__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7477:1: ( rule__Actuator__Group_4__0__Impl rule__Actuator__Group_4__1 )
            // InternalHouseBuilder.g:7478:2: rule__Actuator__Group_4__0__Impl rule__Actuator__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Actuator__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Actuator__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_4__0"


    // $ANTLR start "rule__Actuator__Group_4__0__Impl"
    // InternalHouseBuilder.g:7485:1: rule__Actuator__Group_4__0__Impl : ( 'model' ) ;
    public final void rule__Actuator__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7489:1: ( ( 'model' ) )
            // InternalHouseBuilder.g:7490:1: ( 'model' )
            {
            // InternalHouseBuilder.g:7490:1: ( 'model' )
            // InternalHouseBuilder.g:7491:2: 'model'
            {
             before(grammarAccess.getActuatorAccess().getModelKeyword_4_0()); 
            match(input,85,FOLLOW_2); 
             after(grammarAccess.getActuatorAccess().getModelKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_4__0__Impl"


    // $ANTLR start "rule__Actuator__Group_4__1"
    // InternalHouseBuilder.g:7500:1: rule__Actuator__Group_4__1 : rule__Actuator__Group_4__1__Impl ;
    public final void rule__Actuator__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7504:1: ( rule__Actuator__Group_4__1__Impl )
            // InternalHouseBuilder.g:7505:2: rule__Actuator__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_4__1"


    // $ANTLR start "rule__Actuator__Group_4__1__Impl"
    // InternalHouseBuilder.g:7511:1: rule__Actuator__Group_4__1__Impl : ( ( rule__Actuator__ModelAssignment_4_1 ) ) ;
    public final void rule__Actuator__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7515:1: ( ( ( rule__Actuator__ModelAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:7516:1: ( ( rule__Actuator__ModelAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:7516:1: ( ( rule__Actuator__ModelAssignment_4_1 ) )
            // InternalHouseBuilder.g:7517:2: ( rule__Actuator__ModelAssignment_4_1 )
            {
             before(grammarAccess.getActuatorAccess().getModelAssignment_4_1()); 
            // InternalHouseBuilder.g:7518:2: ( rule__Actuator__ModelAssignment_4_1 )
            // InternalHouseBuilder.g:7518:3: rule__Actuator__ModelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__ModelAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getModelAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Group_4__1__Impl"


    // $ANTLR start "rule__Window__Group__0"
    // InternalHouseBuilder.g:7527:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7531:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // InternalHouseBuilder.g:7532:2: rule__Window__Group__0__Impl rule__Window__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__Window__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0"


    // $ANTLR start "rule__Window__Group__0__Impl"
    // InternalHouseBuilder.g:7539:1: rule__Window__Group__0__Impl : ( () ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7543:1: ( ( () ) )
            // InternalHouseBuilder.g:7544:1: ( () )
            {
            // InternalHouseBuilder.g:7544:1: ( () )
            // InternalHouseBuilder.g:7545:2: ()
            {
             before(grammarAccess.getWindowAccess().getWindowAction_0()); 
            // InternalHouseBuilder.g:7546:2: ()
            // InternalHouseBuilder.g:7546:3: 
            {
            }

             after(grammarAccess.getWindowAccess().getWindowAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0__Impl"


    // $ANTLR start "rule__Window__Group__1"
    // InternalHouseBuilder.g:7554:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7558:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // InternalHouseBuilder.g:7559:2: rule__Window__Group__1__Impl rule__Window__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Window__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1"


    // $ANTLR start "rule__Window__Group__1__Impl"
    // InternalHouseBuilder.g:7566:1: rule__Window__Group__1__Impl : ( 'Window' ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7570:1: ( ( 'Window' ) )
            // InternalHouseBuilder.g:7571:1: ( 'Window' )
            {
            // InternalHouseBuilder.g:7571:1: ( 'Window' )
            // InternalHouseBuilder.g:7572:2: 'Window'
            {
             before(grammarAccess.getWindowAccess().getWindowKeyword_1()); 
            match(input,106,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getWindowKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1__Impl"


    // $ANTLR start "rule__Window__Group__2"
    // InternalHouseBuilder.g:7581:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7585:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // InternalHouseBuilder.g:7586:2: rule__Window__Group__2__Impl rule__Window__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Window__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2"


    // $ANTLR start "rule__Window__Group__2__Impl"
    // InternalHouseBuilder.g:7593:1: rule__Window__Group__2__Impl : ( ( rule__Window__NameAssignment_2 ) ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7597:1: ( ( ( rule__Window__NameAssignment_2 ) ) )
            // InternalHouseBuilder.g:7598:1: ( ( rule__Window__NameAssignment_2 ) )
            {
            // InternalHouseBuilder.g:7598:1: ( ( rule__Window__NameAssignment_2 ) )
            // InternalHouseBuilder.g:7599:2: ( rule__Window__NameAssignment_2 )
            {
             before(grammarAccess.getWindowAccess().getNameAssignment_2()); 
            // InternalHouseBuilder.g:7600:2: ( rule__Window__NameAssignment_2 )
            // InternalHouseBuilder.g:7600:3: rule__Window__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Window__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2__Impl"


    // $ANTLR start "rule__Window__Group__3"
    // InternalHouseBuilder.g:7608:1: rule__Window__Group__3 : rule__Window__Group__3__Impl rule__Window__Group__4 ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7612:1: ( rule__Window__Group__3__Impl rule__Window__Group__4 )
            // InternalHouseBuilder.g:7613:2: rule__Window__Group__3__Impl rule__Window__Group__4
            {
            pushFollow(FOLLOW_50);
            rule__Window__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3"


    // $ANTLR start "rule__Window__Group__3__Impl"
    // InternalHouseBuilder.g:7620:1: rule__Window__Group__3__Impl : ( '{' ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7624:1: ( ( '{' ) )
            // InternalHouseBuilder.g:7625:1: ( '{' )
            {
            // InternalHouseBuilder.g:7625:1: ( '{' )
            // InternalHouseBuilder.g:7626:2: '{'
            {
             before(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3__Impl"


    // $ANTLR start "rule__Window__Group__4"
    // InternalHouseBuilder.g:7635:1: rule__Window__Group__4 : rule__Window__Group__4__Impl rule__Window__Group__5 ;
    public final void rule__Window__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7639:1: ( rule__Window__Group__4__Impl rule__Window__Group__5 )
            // InternalHouseBuilder.g:7640:2: rule__Window__Group__4__Impl rule__Window__Group__5
            {
            pushFollow(FOLLOW_50);
            rule__Window__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4"


    // $ANTLR start "rule__Window__Group__4__Impl"
    // InternalHouseBuilder.g:7647:1: rule__Window__Group__4__Impl : ( ( rule__Window__Group_4__0 )? ) ;
    public final void rule__Window__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7651:1: ( ( ( rule__Window__Group_4__0 )? ) )
            // InternalHouseBuilder.g:7652:1: ( ( rule__Window__Group_4__0 )? )
            {
            // InternalHouseBuilder.g:7652:1: ( ( rule__Window__Group_4__0 )? )
            // InternalHouseBuilder.g:7653:2: ( rule__Window__Group_4__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_4()); 
            // InternalHouseBuilder.g:7654:2: ( rule__Window__Group_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==78) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalHouseBuilder.g:7654:3: rule__Window__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__4__Impl"


    // $ANTLR start "rule__Window__Group__5"
    // InternalHouseBuilder.g:7662:1: rule__Window__Group__5 : rule__Window__Group__5__Impl rule__Window__Group__6 ;
    public final void rule__Window__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7666:1: ( rule__Window__Group__5__Impl rule__Window__Group__6 )
            // InternalHouseBuilder.g:7667:2: rule__Window__Group__5__Impl rule__Window__Group__6
            {
            pushFollow(FOLLOW_50);
            rule__Window__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5"


    // $ANTLR start "rule__Window__Group__5__Impl"
    // InternalHouseBuilder.g:7674:1: rule__Window__Group__5__Impl : ( ( rule__Window__Group_5__0 )? ) ;
    public final void rule__Window__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7678:1: ( ( ( rule__Window__Group_5__0 )? ) )
            // InternalHouseBuilder.g:7679:1: ( ( rule__Window__Group_5__0 )? )
            {
            // InternalHouseBuilder.g:7679:1: ( ( rule__Window__Group_5__0 )? )
            // InternalHouseBuilder.g:7680:2: ( rule__Window__Group_5__0 )?
            {
             before(grammarAccess.getWindowAccess().getGroup_5()); 
            // InternalHouseBuilder.g:7681:2: ( rule__Window__Group_5__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==79) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalHouseBuilder.g:7681:3: rule__Window__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__5__Impl"


    // $ANTLR start "rule__Window__Group__6"
    // InternalHouseBuilder.g:7689:1: rule__Window__Group__6 : rule__Window__Group__6__Impl ;
    public final void rule__Window__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7693:1: ( rule__Window__Group__6__Impl )
            // InternalHouseBuilder.g:7694:2: rule__Window__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6"


    // $ANTLR start "rule__Window__Group__6__Impl"
    // InternalHouseBuilder.g:7700:1: rule__Window__Group__6__Impl : ( '}' ) ;
    public final void rule__Window__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7704:1: ( ( '}' ) )
            // InternalHouseBuilder.g:7705:1: ( '}' )
            {
            // InternalHouseBuilder.g:7705:1: ( '}' )
            // InternalHouseBuilder.g:7706:2: '}'
            {
             before(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__6__Impl"


    // $ANTLR start "rule__Window__Group_4__0"
    // InternalHouseBuilder.g:7716:1: rule__Window__Group_4__0 : rule__Window__Group_4__0__Impl rule__Window__Group_4__1 ;
    public final void rule__Window__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7720:1: ( rule__Window__Group_4__0__Impl rule__Window__Group_4__1 )
            // InternalHouseBuilder.g:7721:2: rule__Window__Group_4__0__Impl rule__Window__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Window__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__0"


    // $ANTLR start "rule__Window__Group_4__0__Impl"
    // InternalHouseBuilder.g:7728:1: rule__Window__Group_4__0__Impl : ( 'doorsNumber' ) ;
    public final void rule__Window__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7732:1: ( ( 'doorsNumber' ) )
            // InternalHouseBuilder.g:7733:1: ( 'doorsNumber' )
            {
            // InternalHouseBuilder.g:7733:1: ( 'doorsNumber' )
            // InternalHouseBuilder.g:7734:2: 'doorsNumber'
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getDoorsNumberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__0__Impl"


    // $ANTLR start "rule__Window__Group_4__1"
    // InternalHouseBuilder.g:7743:1: rule__Window__Group_4__1 : rule__Window__Group_4__1__Impl ;
    public final void rule__Window__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7747:1: ( rule__Window__Group_4__1__Impl )
            // InternalHouseBuilder.g:7748:2: rule__Window__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__1"


    // $ANTLR start "rule__Window__Group_4__1__Impl"
    // InternalHouseBuilder.g:7754:1: rule__Window__Group_4__1__Impl : ( ( rule__Window__DoorsNumberAssignment_4_1 ) ) ;
    public final void rule__Window__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7758:1: ( ( ( rule__Window__DoorsNumberAssignment_4_1 ) ) )
            // InternalHouseBuilder.g:7759:1: ( ( rule__Window__DoorsNumberAssignment_4_1 ) )
            {
            // InternalHouseBuilder.g:7759:1: ( ( rule__Window__DoorsNumberAssignment_4_1 ) )
            // InternalHouseBuilder.g:7760:2: ( rule__Window__DoorsNumberAssignment_4_1 )
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberAssignment_4_1()); 
            // InternalHouseBuilder.g:7761:2: ( rule__Window__DoorsNumberAssignment_4_1 )
            // InternalHouseBuilder.g:7761:3: rule__Window__DoorsNumberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__DoorsNumberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getDoorsNumberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_4__1__Impl"


    // $ANTLR start "rule__Window__Group_5__0"
    // InternalHouseBuilder.g:7770:1: rule__Window__Group_5__0 : rule__Window__Group_5__0__Impl rule__Window__Group_5__1 ;
    public final void rule__Window__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7774:1: ( rule__Window__Group_5__0__Impl rule__Window__Group_5__1 )
            // InternalHouseBuilder.g:7775:2: rule__Window__Group_5__0__Impl rule__Window__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Window__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__0"


    // $ANTLR start "rule__Window__Group_5__0__Impl"
    // InternalHouseBuilder.g:7782:1: rule__Window__Group_5__0__Impl : ( 'WxH:' ) ;
    public final void rule__Window__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7786:1: ( ( 'WxH:' ) )
            // InternalHouseBuilder.g:7787:1: ( 'WxH:' )
            {
            // InternalHouseBuilder.g:7787:1: ( 'WxH:' )
            // InternalHouseBuilder.g:7788:2: 'WxH:'
            {
             before(grammarAccess.getWindowAccess().getWxHKeyword_5_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getWxHKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__0__Impl"


    // $ANTLR start "rule__Window__Group_5__1"
    // InternalHouseBuilder.g:7797:1: rule__Window__Group_5__1 : rule__Window__Group_5__1__Impl rule__Window__Group_5__2 ;
    public final void rule__Window__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7801:1: ( rule__Window__Group_5__1__Impl rule__Window__Group_5__2 )
            // InternalHouseBuilder.g:7802:2: rule__Window__Group_5__1__Impl rule__Window__Group_5__2
            {
            pushFollow(FOLLOW_25);
            rule__Window__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__1"


    // $ANTLR start "rule__Window__Group_5__1__Impl"
    // InternalHouseBuilder.g:7809:1: rule__Window__Group_5__1__Impl : ( ( rule__Window__HeightAssignment_5_1 ) ) ;
    public final void rule__Window__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7813:1: ( ( ( rule__Window__HeightAssignment_5_1 ) ) )
            // InternalHouseBuilder.g:7814:1: ( ( rule__Window__HeightAssignment_5_1 ) )
            {
            // InternalHouseBuilder.g:7814:1: ( ( rule__Window__HeightAssignment_5_1 ) )
            // InternalHouseBuilder.g:7815:2: ( rule__Window__HeightAssignment_5_1 )
            {
             before(grammarAccess.getWindowAccess().getHeightAssignment_5_1()); 
            // InternalHouseBuilder.g:7816:2: ( rule__Window__HeightAssignment_5_1 )
            // InternalHouseBuilder.g:7816:3: rule__Window__HeightAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Window__HeightAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getHeightAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__1__Impl"


    // $ANTLR start "rule__Window__Group_5__2"
    // InternalHouseBuilder.g:7824:1: rule__Window__Group_5__2 : rule__Window__Group_5__2__Impl rule__Window__Group_5__3 ;
    public final void rule__Window__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7828:1: ( rule__Window__Group_5__2__Impl rule__Window__Group_5__3 )
            // InternalHouseBuilder.g:7829:2: rule__Window__Group_5__2__Impl rule__Window__Group_5__3
            {
            pushFollow(FOLLOW_24);
            rule__Window__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__2"


    // $ANTLR start "rule__Window__Group_5__2__Impl"
    // InternalHouseBuilder.g:7836:1: rule__Window__Group_5__2__Impl : ( 'x' ) ;
    public final void rule__Window__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7840:1: ( ( 'x' ) )
            // InternalHouseBuilder.g:7841:1: ( 'x' )
            {
            // InternalHouseBuilder.g:7841:1: ( 'x' )
            // InternalHouseBuilder.g:7842:2: 'x'
            {
             before(grammarAccess.getWindowAccess().getXKeyword_5_2()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getXKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__2__Impl"


    // $ANTLR start "rule__Window__Group_5__3"
    // InternalHouseBuilder.g:7851:1: rule__Window__Group_5__3 : rule__Window__Group_5__3__Impl ;
    public final void rule__Window__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7855:1: ( rule__Window__Group_5__3__Impl )
            // InternalHouseBuilder.g:7856:2: rule__Window__Group_5__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_5__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__3"


    // $ANTLR start "rule__Window__Group_5__3__Impl"
    // InternalHouseBuilder.g:7862:1: rule__Window__Group_5__3__Impl : ( ( rule__Window__WidthAssignment_5_3 ) ) ;
    public final void rule__Window__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7866:1: ( ( ( rule__Window__WidthAssignment_5_3 ) ) )
            // InternalHouseBuilder.g:7867:1: ( ( rule__Window__WidthAssignment_5_3 ) )
            {
            // InternalHouseBuilder.g:7867:1: ( ( rule__Window__WidthAssignment_5_3 ) )
            // InternalHouseBuilder.g:7868:2: ( rule__Window__WidthAssignment_5_3 )
            {
             before(grammarAccess.getWindowAccess().getWidthAssignment_5_3()); 
            // InternalHouseBuilder.g:7869:2: ( rule__Window__WidthAssignment_5_3 )
            // InternalHouseBuilder.g:7869:3: rule__Window__WidthAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__Window__WidthAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getWidthAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_5__3__Impl"


    // $ANTLR start "rule__House__NameAssignment_1"
    // InternalHouseBuilder.g:7878:1: rule__House__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__House__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7882:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7883:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7883:2: ( ruleEString )
            // InternalHouseBuilder.g:7884:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__NameAssignment_1"


    // $ANTLR start "rule__House__StateAssignment_3_1"
    // InternalHouseBuilder.g:7893:1: rule__House__StateAssignment_3_1 : ( ruleEString ) ;
    public final void rule__House__StateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7897:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7898:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7898:2: ( ruleEString )
            // InternalHouseBuilder.g:7899:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__StateAssignment_3_1"


    // $ANTLR start "rule__House__ProvinceAssignment_4_1"
    // InternalHouseBuilder.g:7908:1: rule__House__ProvinceAssignment_4_1 : ( ruleEString ) ;
    public final void rule__House__ProvinceAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7912:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7913:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7913:2: ( ruleEString )
            // InternalHouseBuilder.g:7914:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ProvinceAssignment_4_1"


    // $ANTLR start "rule__House__CityAssignment_5_1"
    // InternalHouseBuilder.g:7923:1: rule__House__CityAssignment_5_1 : ( ruleEString ) ;
    public final void rule__House__CityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7927:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7928:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7928:2: ( ruleEString )
            // InternalHouseBuilder.g:7929:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__CityAssignment_5_1"


    // $ANTLR start "rule__House__PostalCodeAssignment_6_1"
    // InternalHouseBuilder.g:7938:1: rule__House__PostalCodeAssignment_6_1 : ( ruleEString ) ;
    public final void rule__House__PostalCodeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7942:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7943:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7943:2: ( ruleEString )
            // InternalHouseBuilder.g:7944:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PostalCodeAssignment_6_1"


    // $ANTLR start "rule__House__AddressAssignment_7_1"
    // InternalHouseBuilder.g:7953:1: rule__House__AddressAssignment_7_1 : ( ruleEString ) ;
    public final void rule__House__AddressAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7957:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:7958:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:7958:2: ( ruleEString )
            // InternalHouseBuilder.g:7959:3: ruleEString
            {
             before(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__AddressAssignment_7_1"


    // $ANTLR start "rule__House__BuildingDateAssignment_8_1"
    // InternalHouseBuilder.g:7968:1: rule__House__BuildingDateAssignment_8_1 : ( ruleEDate ) ;
    public final void rule__House__BuildingDateAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7972:1: ( ( ruleEDate ) )
            // InternalHouseBuilder.g:7973:2: ( ruleEDate )
            {
            // InternalHouseBuilder.g:7973:2: ( ruleEDate )
            // InternalHouseBuilder.g:7974:3: ruleEDate
            {
             before(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDate();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__BuildingDateAssignment_8_1"


    // $ANTLR start "rule__House__FloorsAssignment_11"
    // InternalHouseBuilder.g:7983:1: rule__House__FloorsAssignment_11 : ( ruleFloor ) ;
    public final void rule__House__FloorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:7987:1: ( ( ruleFloor ) )
            // InternalHouseBuilder.g:7988:2: ( ruleFloor )
            {
            // InternalHouseBuilder.g:7988:2: ( ruleFloor )
            // InternalHouseBuilder.g:7989:3: ruleFloor
            {
             before(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__FloorsAssignment_11"


    // $ANTLR start "rule__House__FloorsAssignment_12_1"
    // InternalHouseBuilder.g:7998:1: rule__House__FloorsAssignment_12_1 : ( ruleFloor ) ;
    public final void rule__House__FloorsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8002:1: ( ( ruleFloor ) )
            // InternalHouseBuilder.g:8003:2: ( ruleFloor )
            {
            // InternalHouseBuilder.g:8003:2: ( ruleFloor )
            // InternalHouseBuilder.g:8004:3: ruleFloor
            {
             before(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFloor();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__FloorsAssignment_12_1"


    // $ANTLR start "rule__House__EntrancesAssignment_16"
    // InternalHouseBuilder.g:8013:1: rule__House__EntrancesAssignment_16 : ( ruleEntrance ) ;
    public final void rule__House__EntrancesAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8017:1: ( ( ruleEntrance ) )
            // InternalHouseBuilder.g:8018:2: ( ruleEntrance )
            {
            // InternalHouseBuilder.g:8018:2: ( ruleEntrance )
            // InternalHouseBuilder.g:8019:3: ruleEntrance
            {
             before(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__EntrancesAssignment_16"


    // $ANTLR start "rule__House__EntrancesAssignment_17_1"
    // InternalHouseBuilder.g:8028:1: rule__House__EntrancesAssignment_17_1 : ( ruleEntrance ) ;
    public final void rule__House__EntrancesAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8032:1: ( ( ruleEntrance ) )
            // InternalHouseBuilder.g:8033:2: ( ruleEntrance )
            {
            // InternalHouseBuilder.g:8033:2: ( ruleEntrance )
            // InternalHouseBuilder.g:8034:3: ruleEntrance
            {
             before(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntrance();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__EntrancesAssignment_17_1"


    // $ANTLR start "rule__House__PassagesAssignment_19_2"
    // InternalHouseBuilder.g:8043:1: rule__House__PassagesAssignment_19_2 : ( rulePassage ) ;
    public final void rule__House__PassagesAssignment_19_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8047:1: ( ( rulePassage ) )
            // InternalHouseBuilder.g:8048:2: ( rulePassage )
            {
            // InternalHouseBuilder.g:8048:2: ( rulePassage )
            // InternalHouseBuilder.g:8049:3: rulePassage
            {
             before(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_2_0()); 
            pushFollow(FOLLOW_2);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PassagesAssignment_19_2"


    // $ANTLR start "rule__House__PassagesAssignment_19_3_1"
    // InternalHouseBuilder.g:8058:1: rule__House__PassagesAssignment_19_3_1 : ( rulePassage ) ;
    public final void rule__House__PassagesAssignment_19_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8062:1: ( ( rulePassage ) )
            // InternalHouseBuilder.g:8063:2: ( rulePassage )
            {
            // InternalHouseBuilder.g:8063:2: ( rulePassage )
            // InternalHouseBuilder.g:8064:3: rulePassage
            {
             before(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePassage();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__PassagesAssignment_19_3_1"


    // $ANTLR start "rule__House__ControllersAssignment_20_2"
    // InternalHouseBuilder.g:8073:1: rule__House__ControllersAssignment_20_2 : ( ruleController ) ;
    public final void rule__House__ControllersAssignment_20_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8077:1: ( ( ruleController ) )
            // InternalHouseBuilder.g:8078:2: ( ruleController )
            {
            // InternalHouseBuilder.g:8078:2: ( ruleController )
            // InternalHouseBuilder.g:8079:3: ruleController
            {
             before(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_2_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ControllersAssignment_20_2"


    // $ANTLR start "rule__House__ControllersAssignment_20_3_1"
    // InternalHouseBuilder.g:8088:1: rule__House__ControllersAssignment_20_3_1 : ( ruleController ) ;
    public final void rule__House__ControllersAssignment_20_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8092:1: ( ( ruleController ) )
            // InternalHouseBuilder.g:8093:2: ( ruleController )
            {
            // InternalHouseBuilder.g:8093:2: ( ruleController )
            // InternalHouseBuilder.g:8094:3: ruleController
            {
             before(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleController();

            state._fsp--;

             after(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__House__ControllersAssignment_20_3_1"


    // $ANTLR start "rule__Floor__NameAssignment_1"
    // InternalHouseBuilder.g:8103:1: rule__Floor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Floor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8107:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8108:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8108:2: ( ruleEString )
            // InternalHouseBuilder.g:8109:3: ruleEString
            {
             before(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__NameAssignment_1"


    // $ANTLR start "rule__Floor__LevelAssignment_4"
    // InternalHouseBuilder.g:8118:1: rule__Floor__LevelAssignment_4 : ( ruleEInt ) ;
    public final void rule__Floor__LevelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8122:1: ( ( ruleEInt ) )
            // InternalHouseBuilder.g:8123:2: ( ruleEInt )
            {
            // InternalHouseBuilder.g:8123:2: ( ruleEInt )
            // InternalHouseBuilder.g:8124:3: ruleEInt
            {
             before(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__LevelAssignment_4"


    // $ANTLR start "rule__Floor__SpacesAssignment_7"
    // InternalHouseBuilder.g:8133:1: rule__Floor__SpacesAssignment_7 : ( ruleSpace ) ;
    public final void rule__Floor__SpacesAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8137:1: ( ( ruleSpace ) )
            // InternalHouseBuilder.g:8138:2: ( ruleSpace )
            {
            // InternalHouseBuilder.g:8138:2: ( ruleSpace )
            // InternalHouseBuilder.g:8139:3: ruleSpace
            {
             before(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__SpacesAssignment_7"


    // $ANTLR start "rule__Floor__SpacesAssignment_8_1"
    // InternalHouseBuilder.g:8148:1: rule__Floor__SpacesAssignment_8_1 : ( ruleSpace ) ;
    public final void rule__Floor__SpacesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8152:1: ( ( ruleSpace ) )
            // InternalHouseBuilder.g:8153:2: ( ruleSpace )
            {
            // InternalHouseBuilder.g:8153:2: ( ruleSpace )
            // InternalHouseBuilder.g:8154:3: ruleSpace
            {
             before(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpace();

            state._fsp--;

             after(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Floor__SpacesAssignment_8_1"


    // $ANTLR start "rule__Passage__NameAssignment_1"
    // InternalHouseBuilder.g:8163:1: rule__Passage__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Passage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8167:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8168:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8168:2: ( ruleEString )
            // InternalHouseBuilder.g:8169:3: ruleEString
            {
             before(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__NameAssignment_1"


    // $ANTLR start "rule__Passage__DoorTypeAssignment_3_1"
    // InternalHouseBuilder.g:8178:1: rule__Passage__DoorTypeAssignment_3_1 : ( ruleDoorType ) ;
    public final void rule__Passage__DoorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8182:1: ( ( ruleDoorType ) )
            // InternalHouseBuilder.g:8183:2: ( ruleDoorType )
            {
            // InternalHouseBuilder.g:8183:2: ( ruleDoorType )
            // InternalHouseBuilder.g:8184:3: ruleDoorType
            {
             before(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorType();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DoorTypeAssignment_3_1"


    // $ANTLR start "rule__Passage__DoorsNumberAssignment_4_1"
    // InternalHouseBuilder.g:8193:1: rule__Passage__DoorsNumberAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Passage__DoorsNumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8197:1: ( ( ruleEInt ) )
            // InternalHouseBuilder.g:8198:2: ( ruleEInt )
            {
            // InternalHouseBuilder.g:8198:2: ( ruleEInt )
            // InternalHouseBuilder.g:8199:3: ruleEInt
            {
             before(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DoorsNumberAssignment_4_1"


    // $ANTLR start "rule__Passage__HeightAssignment_5_1"
    // InternalHouseBuilder.g:8208:1: rule__Passage__HeightAssignment_5_1 : ( ruleEFloat ) ;
    public final void rule__Passage__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8212:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8213:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8213:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8214:3: ruleEFloat
            {
             before(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__HeightAssignment_5_1"


    // $ANTLR start "rule__Passage__WidthAssignment_5_3"
    // InternalHouseBuilder.g:8223:1: rule__Passage__WidthAssignment_5_3 : ( ruleEFloat ) ;
    public final void rule__Passage__WidthAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8227:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8228:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8228:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8229:3: ruleEFloat
            {
             before(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__WidthAssignment_5_3"


    // $ANTLR start "rule__Passage__SpaceAAssignment_7"
    // InternalHouseBuilder.g:8238:1: rule__Passage__SpaceAAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Passage__SpaceAAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8242:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilder.g:8243:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilder.g:8243:2: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8244:3: ( ruleEString )
            {
             before(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_7_0()); 
            // InternalHouseBuilder.g:8245:3: ( ruleEString )
            // InternalHouseBuilder.g:8246:4: ruleEString
            {
             before(grammarAccess.getPassageAccess().getSpaceASpaceEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getSpaceASpaceEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__SpaceAAssignment_7"


    // $ANTLR start "rule__Passage__SpaceBAssignment_9"
    // InternalHouseBuilder.g:8257:1: rule__Passage__SpaceBAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__Passage__SpaceBAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8261:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilder.g:8262:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilder.g:8262:2: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8263:3: ( ruleEString )
            {
             before(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_9_0()); 
            // InternalHouseBuilder.g:8264:3: ( ruleEString )
            // InternalHouseBuilder.g:8265:4: ruleEString
            {
             before(grammarAccess.getPassageAccess().getSpaceBSpaceEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getSpaceBSpaceEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__SpaceBAssignment_9"


    // $ANTLR start "rule__Passage__DevicesAssignment_10_2"
    // InternalHouseBuilder.g:8276:1: rule__Passage__DevicesAssignment_10_2 : ( ruleDevice ) ;
    public final void rule__Passage__DevicesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8280:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8281:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8281:2: ( ruleDevice )
            // InternalHouseBuilder.g:8282:3: ruleDevice
            {
             before(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DevicesAssignment_10_2"


    // $ANTLR start "rule__Passage__DevicesAssignment_10_3_1"
    // InternalHouseBuilder.g:8291:1: rule__Passage__DevicesAssignment_10_3_1 : ( ruleDevice ) ;
    public final void rule__Passage__DevicesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8295:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8296:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8296:2: ( ruleDevice )
            // InternalHouseBuilder.g:8297:3: ruleDevice
            {
             before(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Passage__DevicesAssignment_10_3_1"


    // $ANTLR start "rule__Controller__NameAssignment_1"
    // InternalHouseBuilder.g:8306:1: rule__Controller__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Controller__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8310:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8311:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8311:2: ( ruleEString )
            // InternalHouseBuilder.g:8312:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__NameAssignment_1"


    // $ANTLR start "rule__Controller__ModelAssignment_3_1"
    // InternalHouseBuilder.g:8321:1: rule__Controller__ModelAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Controller__ModelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8325:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8326:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8326:2: ( ruleEString )
            // InternalHouseBuilder.g:8327:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ModelAssignment_3_1"


    // $ANTLR start "rule__Controller__OsAssignment_4_1"
    // InternalHouseBuilder.g:8336:1: rule__Controller__OsAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Controller__OsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8340:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8341:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8341:2: ( ruleEString )
            // InternalHouseBuilder.g:8342:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__OsAssignment_4_1"


    // $ANTLR start "rule__Controller__OsVersionAssignment_5_1"
    // InternalHouseBuilder.g:8351:1: rule__Controller__OsVersionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Controller__OsVersionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8355:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8356:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8356:2: ( ruleEString )
            // InternalHouseBuilder.g:8357:3: ruleEString
            {
             before(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__OsVersionAssignment_5_1"


    // $ANTLR start "rule__Controller__ActuatorsAssignment_8"
    // InternalHouseBuilder.g:8366:1: rule__Controller__ActuatorsAssignment_8 : ( ruleActuator ) ;
    public final void rule__Controller__ActuatorsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8370:1: ( ( ruleActuator ) )
            // InternalHouseBuilder.g:8371:2: ( ruleActuator )
            {
            // InternalHouseBuilder.g:8371:2: ( ruleActuator )
            // InternalHouseBuilder.g:8372:3: ruleActuator
            {
             before(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ActuatorsAssignment_8"


    // $ANTLR start "rule__Controller__ActuatorsAssignment_9_1"
    // InternalHouseBuilder.g:8381:1: rule__Controller__ActuatorsAssignment_9_1 : ( ruleActuator ) ;
    public final void rule__Controller__ActuatorsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8385:1: ( ( ruleActuator ) )
            // InternalHouseBuilder.g:8386:2: ( ruleActuator )
            {
            // InternalHouseBuilder.g:8386:2: ( ruleActuator )
            // InternalHouseBuilder.g:8387:3: ruleActuator
            {
             before(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__ActuatorsAssignment_9_1"


    // $ANTLR start "rule__Controller__SensorsAssignment_13"
    // InternalHouseBuilder.g:8396:1: rule__Controller__SensorsAssignment_13 : ( ruleSensor ) ;
    public final void rule__Controller__SensorsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8400:1: ( ( ruleSensor ) )
            // InternalHouseBuilder.g:8401:2: ( ruleSensor )
            {
            // InternalHouseBuilder.g:8401:2: ( ruleSensor )
            // InternalHouseBuilder.g:8402:3: ruleSensor
            {
             before(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__SensorsAssignment_13"


    // $ANTLR start "rule__Controller__SensorsAssignment_14_1"
    // InternalHouseBuilder.g:8411:1: rule__Controller__SensorsAssignment_14_1 : ( ruleSensor ) ;
    public final void rule__Controller__SensorsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8415:1: ( ( ruleSensor ) )
            // InternalHouseBuilder.g:8416:2: ( ruleSensor )
            {
            // InternalHouseBuilder.g:8416:2: ( ruleSensor )
            // InternalHouseBuilder.g:8417:3: ruleSensor
            {
             before(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Controller__SensorsAssignment_14_1"


    // $ANTLR start "rule__Entrance__NameAssignment_1"
    // InternalHouseBuilder.g:8426:1: rule__Entrance__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entrance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8430:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8431:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8431:2: ( ruleEString )
            // InternalHouseBuilder.g:8432:3: ruleEString
            {
             before(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__NameAssignment_1"


    // $ANTLR start "rule__Entrance__DoorTypeAssignment_3_1"
    // InternalHouseBuilder.g:8441:1: rule__Entrance__DoorTypeAssignment_3_1 : ( ruleDoorType ) ;
    public final void rule__Entrance__DoorTypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8445:1: ( ( ruleDoorType ) )
            // InternalHouseBuilder.g:8446:2: ( ruleDoorType )
            {
            // InternalHouseBuilder.g:8446:2: ( ruleDoorType )
            // InternalHouseBuilder.g:8447:3: ruleDoorType
            {
             before(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDoorType();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DoorTypeAssignment_3_1"


    // $ANTLR start "rule__Entrance__DoorsNumberAssignment_4_1"
    // InternalHouseBuilder.g:8456:1: rule__Entrance__DoorsNumberAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Entrance__DoorsNumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8460:1: ( ( ruleEInt ) )
            // InternalHouseBuilder.g:8461:2: ( ruleEInt )
            {
            // InternalHouseBuilder.g:8461:2: ( ruleEInt )
            // InternalHouseBuilder.g:8462:3: ruleEInt
            {
             before(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DoorsNumberAssignment_4_1"


    // $ANTLR start "rule__Entrance__HeightAssignment_5_1"
    // InternalHouseBuilder.g:8471:1: rule__Entrance__HeightAssignment_5_1 : ( ruleEFloat ) ;
    public final void rule__Entrance__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8475:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8476:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8476:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8477:3: ruleEFloat
            {
             before(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__HeightAssignment_5_1"


    // $ANTLR start "rule__Entrance__WidthAssignment_5_3"
    // InternalHouseBuilder.g:8486:1: rule__Entrance__WidthAssignment_5_3 : ( ruleEFloat ) ;
    public final void rule__Entrance__WidthAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8490:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8491:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8491:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8492:3: ruleEFloat
            {
             before(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__WidthAssignment_5_3"


    // $ANTLR start "rule__Entrance__SpaceAssignment_7"
    // InternalHouseBuilder.g:8501:1: rule__Entrance__SpaceAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Entrance__SpaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8505:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilder.g:8506:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilder.g:8506:2: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8507:3: ( ruleEString )
            {
             before(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_7_0()); 
            // InternalHouseBuilder.g:8508:3: ( ruleEString )
            // InternalHouseBuilder.g:8509:4: ruleEString
            {
             before(grammarAccess.getEntranceAccess().getSpaceSpaceEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getSpaceSpaceEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__SpaceAssignment_7"


    // $ANTLR start "rule__Entrance__DevicesAssignment_8_2"
    // InternalHouseBuilder.g:8520:1: rule__Entrance__DevicesAssignment_8_2 : ( ruleDevice ) ;
    public final void rule__Entrance__DevicesAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8524:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8525:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8525:2: ( ruleDevice )
            // InternalHouseBuilder.g:8526:3: ruleDevice
            {
             before(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DevicesAssignment_8_2"


    // $ANTLR start "rule__Entrance__DevicesAssignment_8_3_1"
    // InternalHouseBuilder.g:8535:1: rule__Entrance__DevicesAssignment_8_3_1 : ( ruleDevice ) ;
    public final void rule__Entrance__DevicesAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8539:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8540:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8540:2: ( ruleDevice )
            // InternalHouseBuilder.g:8541:3: ruleDevice
            {
             before(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entrance__DevicesAssignment_8_3_1"


    // $ANTLR start "rule__Device__NameAssignment_2"
    // InternalHouseBuilder.g:8550:1: rule__Device__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Device__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8554:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8555:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8555:2: ( ruleEString )
            // InternalHouseBuilder.g:8556:3: ruleEString
            {
             before(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__NameAssignment_2"


    // $ANTLR start "rule__Device__TypeAssignment_4_1"
    // InternalHouseBuilder.g:8565:1: rule__Device__TypeAssignment_4_1 : ( ruleDeviceType ) ;
    public final void rule__Device__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8569:1: ( ( ruleDeviceType ) )
            // InternalHouseBuilder.g:8570:2: ( ruleDeviceType )
            {
            // InternalHouseBuilder.g:8570:2: ( ruleDeviceType )
            // InternalHouseBuilder.g:8571:3: ruleDeviceType
            {
             before(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDeviceType();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__TypeAssignment_4_1"


    // $ANTLR start "rule__Device__ModelAssignment_5_1"
    // InternalHouseBuilder.g:8580:1: rule__Device__ModelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Device__ModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8584:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8585:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8585:2: ( ruleEString )
            // InternalHouseBuilder.g:8586:3: ruleEString
            {
             before(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Device__ModelAssignment_5_1"


    // $ANTLR start "rule__Sensor__NameAssignment_1"
    // InternalHouseBuilder.g:8595:1: rule__Sensor__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Sensor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8599:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8600:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8600:2: ( ruleEString )
            // InternalHouseBuilder.g:8601:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__NameAssignment_1"


    // $ANTLR start "rule__Sensor__TypeAssignment_3_1"
    // InternalHouseBuilder.g:8610:1: rule__Sensor__TypeAssignment_3_1 : ( ruleSensorType ) ;
    public final void rule__Sensor__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8614:1: ( ( ruleSensorType ) )
            // InternalHouseBuilder.g:8615:2: ( ruleSensorType )
            {
            // InternalHouseBuilder.g:8615:2: ( ruleSensorType )
            // InternalHouseBuilder.g:8616:3: ruleSensorType
            {
             before(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensorType();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__TypeAssignment_3_1"


    // $ANTLR start "rule__Sensor__ValueAssignment_4_1"
    // InternalHouseBuilder.g:8625:1: rule__Sensor__ValueAssignment_4_1 : ( ruleEFloat ) ;
    public final void rule__Sensor__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8629:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8630:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8630:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8631:3: ruleEFloat
            {
             before(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ValueAssignment_4_1"


    // $ANTLR start "rule__Sensor__ModelAssignment_5_1"
    // InternalHouseBuilder.g:8640:1: rule__Sensor__ModelAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Sensor__ModelAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8644:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8645:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8645:2: ( ruleEString )
            // InternalHouseBuilder.g:8646:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ModelAssignment_5_1"


    // $ANTLR start "rule__Sensor__SpaceAssignment_7"
    // InternalHouseBuilder.g:8655:1: rule__Sensor__SpaceAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Sensor__SpaceAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8659:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilder.g:8660:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilder.g:8660:2: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8661:3: ( ruleEString )
            {
             before(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_7_0()); 
            // InternalHouseBuilder.g:8662:3: ( ruleEString )
            // InternalHouseBuilder.g:8663:4: ruleEString
            {
             before(grammarAccess.getSensorAccess().getSpaceSpaceEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSpaceSpaceEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__SpaceAssignment_7"


    // $ANTLR start "rule__Room__NameAssignment_1"
    // InternalHouseBuilder.g:8674:1: rule__Room__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Room__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8678:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8679:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8679:2: ( ruleEString )
            // InternalHouseBuilder.g:8680:3: ruleEString
            {
             before(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__NameAssignment_1"


    // $ANTLR start "rule__Room__LengthAssignment_4"
    // InternalHouseBuilder.g:8689:1: rule__Room__LengthAssignment_4 : ( ruleEFloat ) ;
    public final void rule__Room__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8693:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8694:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8694:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8695:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__LengthAssignment_4"


    // $ANTLR start "rule__Room__WidthAssignment_6"
    // InternalHouseBuilder.g:8704:1: rule__Room__WidthAssignment_6 : ( ruleEFloat ) ;
    public final void rule__Room__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8708:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8709:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8709:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8710:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WidthAssignment_6"


    // $ANTLR start "rule__Room__HeightAssignment_7_1"
    // InternalHouseBuilder.g:8719:1: rule__Room__HeightAssignment_7_1 : ( ruleEFloat ) ;
    public final void rule__Room__HeightAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8723:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8724:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8724:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8725:3: ruleEFloat
            {
             before(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__HeightAssignment_7_1"


    // $ANTLR start "rule__Room__RoomTypeAssignment_8_1"
    // InternalHouseBuilder.g:8734:1: rule__Room__RoomTypeAssignment_8_1 : ( ruleRoomType ) ;
    public final void rule__Room__RoomTypeAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8738:1: ( ( ruleRoomType ) )
            // InternalHouseBuilder.g:8739:2: ( ruleRoomType )
            {
            // InternalHouseBuilder.g:8739:2: ( ruleRoomType )
            // InternalHouseBuilder.g:8740:3: ruleRoomType
            {
             before(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoomType();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__RoomTypeAssignment_8_1"


    // $ANTLR start "rule__Room__DevicesAssignment_9_2"
    // InternalHouseBuilder.g:8749:1: rule__Room__DevicesAssignment_9_2 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8753:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8754:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8754:2: ( ruleDevice )
            // InternalHouseBuilder.g:8755:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__DevicesAssignment_9_2"


    // $ANTLR start "rule__Room__DevicesAssignment_9_3_1"
    // InternalHouseBuilder.g:8764:1: rule__Room__DevicesAssignment_9_3_1 : ( ruleDevice ) ;
    public final void rule__Room__DevicesAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8768:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8769:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8769:2: ( ruleDevice )
            // InternalHouseBuilder.g:8770:3: ruleDevice
            {
             before(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__DevicesAssignment_9_3_1"


    // $ANTLR start "rule__Room__WindowsAssignment_10_2"
    // InternalHouseBuilder.g:8779:1: rule__Room__WindowsAssignment_10_2 : ( ruleWindow ) ;
    public final void rule__Room__WindowsAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8783:1: ( ( ruleWindow ) )
            // InternalHouseBuilder.g:8784:2: ( ruleWindow )
            {
            // InternalHouseBuilder.g:8784:2: ( ruleWindow )
            // InternalHouseBuilder.g:8785:3: ruleWindow
            {
             before(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WindowsAssignment_10_2"


    // $ANTLR start "rule__Room__WindowsAssignment_10_3_1"
    // InternalHouseBuilder.g:8794:1: rule__Room__WindowsAssignment_10_3_1 : ( ruleWindow ) ;
    public final void rule__Room__WindowsAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8798:1: ( ( ruleWindow ) )
            // InternalHouseBuilder.g:8799:2: ( ruleWindow )
            {
            // InternalHouseBuilder.g:8799:2: ( ruleWindow )
            // InternalHouseBuilder.g:8800:3: ruleWindow
            {
             before(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Room__WindowsAssignment_10_3_1"


    // $ANTLR start "rule__ExternalSpace__NameAssignment_1"
    // InternalHouseBuilder.g:8809:1: rule__ExternalSpace__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ExternalSpace__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8813:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8814:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8814:2: ( ruleEString )
            // InternalHouseBuilder.g:8815:3: ruleEString
            {
             before(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__NameAssignment_1"


    // $ANTLR start "rule__ExternalSpace__LengthAssignment_4"
    // InternalHouseBuilder.g:8824:1: rule__ExternalSpace__LengthAssignment_4 : ( ruleEFloat ) ;
    public final void rule__ExternalSpace__LengthAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8828:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8829:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8829:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8830:3: ruleEFloat
            {
             before(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__LengthAssignment_4"


    // $ANTLR start "rule__ExternalSpace__WidthAssignment_6"
    // InternalHouseBuilder.g:8839:1: rule__ExternalSpace__WidthAssignment_6 : ( ruleEFloat ) ;
    public final void rule__ExternalSpace__WidthAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8843:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:8844:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:8844:2: ( ruleEFloat )
            // InternalHouseBuilder.g:8845:3: ruleEFloat
            {
             before(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__WidthAssignment_6"


    // $ANTLR start "rule__ExternalSpace__TypeAssignment_8"
    // InternalHouseBuilder.g:8854:1: rule__ExternalSpace__TypeAssignment_8 : ( ruleExternalSpaceType ) ;
    public final void rule__ExternalSpace__TypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8858:1: ( ( ruleExternalSpaceType ) )
            // InternalHouseBuilder.g:8859:2: ( ruleExternalSpaceType )
            {
            // InternalHouseBuilder.g:8859:2: ( ruleExternalSpaceType )
            // InternalHouseBuilder.g:8860:3: ruleExternalSpaceType
            {
             before(grammarAccess.getExternalSpaceAccess().getTypeExternalSpaceTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleExternalSpaceType();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getTypeExternalSpaceTypeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__TypeAssignment_8"


    // $ANTLR start "rule__ExternalSpace__GroundAssignment_9_1"
    // InternalHouseBuilder.g:8869:1: rule__ExternalSpace__GroundAssignment_9_1 : ( ruleGroundType ) ;
    public final void rule__ExternalSpace__GroundAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8873:1: ( ( ruleGroundType ) )
            // InternalHouseBuilder.g:8874:2: ( ruleGroundType )
            {
            // InternalHouseBuilder.g:8874:2: ( ruleGroundType )
            // InternalHouseBuilder.g:8875:3: ruleGroundType
            {
             before(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroundType();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__GroundAssignment_9_1"


    // $ANTLR start "rule__ExternalSpace__DevicesAssignment_10_2"
    // InternalHouseBuilder.g:8884:1: rule__ExternalSpace__DevicesAssignment_10_2 : ( ruleDevice ) ;
    public final void rule__ExternalSpace__DevicesAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8888:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8889:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8889:2: ( ruleDevice )
            // InternalHouseBuilder.g:8890:3: ruleDevice
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__DevicesAssignment_10_2"


    // $ANTLR start "rule__ExternalSpace__DevicesAssignment_10_3_1"
    // InternalHouseBuilder.g:8899:1: rule__ExternalSpace__DevicesAssignment_10_3_1 : ( ruleDevice ) ;
    public final void rule__ExternalSpace__DevicesAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8903:1: ( ( ruleDevice ) )
            // InternalHouseBuilder.g:8904:2: ( ruleDevice )
            {
            // InternalHouseBuilder.g:8904:2: ( ruleDevice )
            // InternalHouseBuilder.g:8905:3: ruleDevice
            {
             before(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDevice();

            state._fsp--;

             after(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalSpace__DevicesAssignment_10_3_1"


    // $ANTLR start "rule__Actuator__NameAssignment_1"
    // InternalHouseBuilder.g:8914:1: rule__Actuator__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Actuator__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8918:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8919:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8919:2: ( ruleEString )
            // InternalHouseBuilder.g:8920:3: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__NameAssignment_1"


    // $ANTLR start "rule__Actuator__TypeAssignment_3_1"
    // InternalHouseBuilder.g:8929:1: rule__Actuator__TypeAssignment_3_1 : ( ruleActuatorType ) ;
    public final void rule__Actuator__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8933:1: ( ( ruleActuatorType ) )
            // InternalHouseBuilder.g:8934:2: ( ruleActuatorType )
            {
            // InternalHouseBuilder.g:8934:2: ( ruleActuatorType )
            // InternalHouseBuilder.g:8935:3: ruleActuatorType
            {
             before(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuatorType();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__TypeAssignment_3_1"


    // $ANTLR start "rule__Actuator__ModelAssignment_4_1"
    // InternalHouseBuilder.g:8944:1: rule__Actuator__ModelAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Actuator__ModelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8948:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8949:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8949:2: ( ruleEString )
            // InternalHouseBuilder.g:8950:3: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__ModelAssignment_4_1"


    // $ANTLR start "rule__Actuator__DeviceAssignment_6"
    // InternalHouseBuilder.g:8959:1: rule__Actuator__DeviceAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Actuator__DeviceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8963:1: ( ( ( ruleEString ) ) )
            // InternalHouseBuilder.g:8964:2: ( ( ruleEString ) )
            {
            // InternalHouseBuilder.g:8964:2: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8965:3: ( ruleEString )
            {
             before(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_6_0()); 
            // InternalHouseBuilder.g:8966:3: ( ruleEString )
            // InternalHouseBuilder.g:8967:4: ruleEString
            {
             before(grammarAccess.getActuatorAccess().getDeviceDeviceEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActuatorAccess().getDeviceDeviceEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__DeviceAssignment_6"


    // $ANTLR start "rule__Window__NameAssignment_2"
    // InternalHouseBuilder.g:8978:1: rule__Window__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Window__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8982:1: ( ( ruleEString ) )
            // InternalHouseBuilder.g:8983:2: ( ruleEString )
            {
            // InternalHouseBuilder.g:8983:2: ( ruleEString )
            // InternalHouseBuilder.g:8984:3: ruleEString
            {
             before(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NameAssignment_2"


    // $ANTLR start "rule__Window__DoorsNumberAssignment_4_1"
    // InternalHouseBuilder.g:8993:1: rule__Window__DoorsNumberAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Window__DoorsNumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:8997:1: ( ( ruleEInt ) )
            // InternalHouseBuilder.g:8998:2: ( ruleEInt )
            {
            // InternalHouseBuilder.g:8998:2: ( ruleEInt )
            // InternalHouseBuilder.g:8999:3: ruleEInt
            {
             before(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__DoorsNumberAssignment_4_1"


    // $ANTLR start "rule__Window__HeightAssignment_5_1"
    // InternalHouseBuilder.g:9008:1: rule__Window__HeightAssignment_5_1 : ( ruleEFloat ) ;
    public final void rule__Window__HeightAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:9012:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:9013:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:9013:2: ( ruleEFloat )
            // InternalHouseBuilder.g:9014:3: ruleEFloat
            {
             before(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__HeightAssignment_5_1"


    // $ANTLR start "rule__Window__WidthAssignment_5_3"
    // InternalHouseBuilder.g:9023:1: rule__Window__WidthAssignment_5_3 : ( ruleEFloat ) ;
    public final void rule__Window__WidthAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalHouseBuilder.g:9027:1: ( ( ruleEFloat ) )
            // InternalHouseBuilder.g:9028:2: ( ruleEFloat )
            {
            // InternalHouseBuilder.g:9028:2: ( ruleEFloat )
            // InternalHouseBuilder.g:9029:3: ruleEFloat
            {
             before(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEFloat();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__WidthAssignment_5_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0xC800000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L,0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000001100000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000000L,0x000000000000E800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x01F0000040020000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L,0x000000000C000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000E80000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x000000000200E000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x1000000000000000L,0x0000000020200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000000003E000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x00000000A2200000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000003F800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L,0x0000000C00030000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00003FFFC0000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L,0x0000008000020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000E000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000020020200000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L,0x000000000000C000L});

}