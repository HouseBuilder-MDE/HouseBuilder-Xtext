package it.univaq.disim.housebuilder.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import it.univaq.disim.housebuilder.xtext.services.HouseBuilderGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalHouseBuilderParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'House'", "'{'", "'state'", "'province'", "'city'", "'postalCode'", "'address'", "'buildingDate'", "'floors'", "','", "'}'", "'entrances'", "'passages'", "'controllers'", "'Floor'", "'level'", "'spaces'", "'Passage'", "'doorType'", "'doorsNumber'", "'WxH:'", "'x'", "'spaceA'", "'spaceB'", "'devices'", "'Controller'", "'model'", "'os'", "'osVersion'", "'actuators'", "'sensors'", "'Entrance'", "'space'", "'-'", "'.'", "'E'", "'e'", "'Device'", "'type'", "'Sensor'", "'value'", "'Room'", "'LxHxW:'", "'roomType'", "'windows'", "'ExternalSpace'", "'length'", "'width'", "'ground'", "'Actuator'", "'device'", "'Window'", "'THERMOSTAT'", "'APPLIANCE'", "'SOCKET'", "'ROLLER_SHUTTERS'", "'GATE'", "'IDRAULIC'", "'PNEUMATIC'", "'ELECTRICAL'", "'THERMAL'", "'MECHANICAL'", "'TEMPERATURE'", "'PRESSURE'", "'PROXIMITY'", "'ACCELEROMETER'", "'GAS'", "'SMOKE'", "'VIDEO_SURVAILLANCE_CAMERA'", "'SIMPLE'", "'BATHROOM'", "'LIVING_ROOM'", "'BEDROOM'", "'HALLWAY'", "'STUDY'", "'ENTRANCE'", "'STORAGE_ROOM'", "'GARAGE'", "'LAUNDRY_ROOM'", "'HOBBY_ROOM'", "'CELLAR'", "'LUNCHROOM'", "'RUMPUS_ROOM'", "'STAIRS'", "'KITCHEN'", "'BALCONY'", "'GARDEN'", "'TERRACE'", "'ASPALTH'", "'TERRAIN'", "'PAVING'", "'DOOR_WINDOW'", "'PANIC_DOOR'", "'ENTRANCE_DOOR'", "'SLIDING_DOOR'", "'EMPTY'"
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

        public InternalHouseBuilderParser(TokenStream input, HouseBuilderGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "House";
       	}

       	@Override
       	protected HouseBuilderGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleHouse"
    // InternalHouseBuilder.g:65:1: entryRuleHouse returns [EObject current=null] : iv_ruleHouse= ruleHouse EOF ;
    public final EObject entryRuleHouse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHouse = null;


        try {
            // InternalHouseBuilder.g:65:46: (iv_ruleHouse= ruleHouse EOF )
            // InternalHouseBuilder.g:66:2: iv_ruleHouse= ruleHouse EOF
            {
             newCompositeNode(grammarAccess.getHouseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHouse=ruleHouse();

            state._fsp--;

             current =iv_ruleHouse; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHouse"


    // $ANTLR start "ruleHouse"
    // InternalHouseBuilder.g:72:1: ruleHouse returns [EObject current=null] : (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' otherlv_21= 'entrances' otherlv_22= '{' ( (lv_entrances_23_0= ruleEntrance ) ) (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )* otherlv_26= '}' (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )? (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) ;
    public final EObject ruleHouse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_state_4_0 = null;

        AntlrDatatypeRuleToken lv_province_6_0 = null;

        AntlrDatatypeRuleToken lv_city_8_0 = null;

        AntlrDatatypeRuleToken lv_postalCode_10_0 = null;

        AntlrDatatypeRuleToken lv_address_12_0 = null;

        AntlrDatatypeRuleToken lv_buildingDate_14_0 = null;

        EObject lv_floors_17_0 = null;

        EObject lv_floors_19_0 = null;

        EObject lv_entrances_23_0 = null;

        EObject lv_entrances_25_0 = null;

        EObject lv_passages_29_0 = null;

        EObject lv_passages_31_0 = null;

        EObject lv_controllers_35_0 = null;

        EObject lv_controllers_37_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:78:2: ( (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' otherlv_21= 'entrances' otherlv_22= '{' ( (lv_entrances_23_0= ruleEntrance ) ) (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )* otherlv_26= '}' (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )? (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )? otherlv_39= '}' ) )
            // InternalHouseBuilder.g:79:2: (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' otherlv_21= 'entrances' otherlv_22= '{' ( (lv_entrances_23_0= ruleEntrance ) ) (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )* otherlv_26= '}' (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )? (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            {
            // InternalHouseBuilder.g:79:2: (otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' otherlv_21= 'entrances' otherlv_22= '{' ( (lv_entrances_23_0= ruleEntrance ) ) (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )* otherlv_26= '}' (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )? (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )? otherlv_39= '}' )
            // InternalHouseBuilder.g:80:3: otherlv_0= 'House' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )? (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )? (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )? (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )? (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )? (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )? otherlv_15= 'floors' otherlv_16= '{' ( (lv_floors_17_0= ruleFloor ) ) (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )* otherlv_20= '}' otherlv_21= 'entrances' otherlv_22= '{' ( (lv_entrances_23_0= ruleEntrance ) ) (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )* otherlv_26= '}' (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )? (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )? otherlv_39= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getHouseAccess().getHouseKeyword_0());
            		
            // InternalHouseBuilder.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:85:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:107:3: (otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalHouseBuilder.g:108:4: otherlv_3= 'state' ( (lv_state_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getHouseAccess().getStateKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:112:4: ( (lv_state_4_0= ruleEString ) )
                    // InternalHouseBuilder.g:113:5: (lv_state_4_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:113:5: (lv_state_4_0= ruleEString )
                    // InternalHouseBuilder.g:114:6: lv_state_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getStateEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_state_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:132:3: (otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalHouseBuilder.g:133:4: otherlv_5= 'province' ( (lv_province_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getHouseAccess().getProvinceKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:137:4: ( (lv_province_6_0= ruleEString ) )
                    // InternalHouseBuilder.g:138:5: (lv_province_6_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:138:5: (lv_province_6_0= ruleEString )
                    // InternalHouseBuilder.g:139:6: lv_province_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getProvinceEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_province_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"province",
                    							lv_province_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:157:3: (otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalHouseBuilder.g:158:4: otherlv_7= 'city' ( (lv_city_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getHouseAccess().getCityKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:162:4: ( (lv_city_8_0= ruleEString ) )
                    // InternalHouseBuilder.g:163:5: (lv_city_8_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:163:5: (lv_city_8_0= ruleEString )
                    // InternalHouseBuilder.g:164:6: lv_city_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getCityEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_city_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"city",
                    							lv_city_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:182:3: (otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalHouseBuilder.g:183:4: otherlv_9= 'postalCode' ( (lv_postalCode_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getHouseAccess().getPostalCodeKeyword_6_0());
                    			
                    // InternalHouseBuilder.g:187:4: ( (lv_postalCode_10_0= ruleEString ) )
                    // InternalHouseBuilder.g:188:5: (lv_postalCode_10_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:188:5: (lv_postalCode_10_0= ruleEString )
                    // InternalHouseBuilder.g:189:6: lv_postalCode_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getPostalCodeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_postalCode_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"postalCode",
                    							lv_postalCode_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:207:3: (otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalHouseBuilder.g:208:4: otherlv_11= 'address' ( (lv_address_12_0= ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getHouseAccess().getAddressKeyword_7_0());
                    			
                    // InternalHouseBuilder.g:212:4: ( (lv_address_12_0= ruleEString ) )
                    // InternalHouseBuilder.g:213:5: (lv_address_12_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:213:5: (lv_address_12_0= ruleEString )
                    // InternalHouseBuilder.g:214:6: lv_address_12_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getAddressEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_address_12_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"address",
                    							lv_address_12_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:232:3: (otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalHouseBuilder.g:233:4: otherlv_13= 'buildingDate' ( (lv_buildingDate_14_0= ruleEDate ) )
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_13, grammarAccess.getHouseAccess().getBuildingDateKeyword_8_0());
                    			
                    // InternalHouseBuilder.g:237:4: ( (lv_buildingDate_14_0= ruleEDate ) )
                    // InternalHouseBuilder.g:238:5: (lv_buildingDate_14_0= ruleEDate )
                    {
                    // InternalHouseBuilder.g:238:5: (lv_buildingDate_14_0= ruleEDate )
                    // InternalHouseBuilder.g:239:6: lv_buildingDate_14_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getBuildingDateEDateParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_buildingDate_14_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						set(
                    							current,
                    							"buildingDate",
                    							lv_buildingDate_14_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getHouseAccess().getFloorsKeyword_9());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalHouseBuilder.g:265:3: ( (lv_floors_17_0= ruleFloor ) )
            // InternalHouseBuilder.g:266:4: (lv_floors_17_0= ruleFloor )
            {
            // InternalHouseBuilder.g:266:4: (lv_floors_17_0= ruleFloor )
            // InternalHouseBuilder.g:267:5: lv_floors_17_0= ruleFloor
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_14);
            lv_floors_17_0=ruleFloor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					add(
            						current,
            						"floors",
            						lv_floors_17_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.Floor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:284:3: (otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalHouseBuilder.g:285:4: otherlv_18= ',' ( (lv_floors_19_0= ruleFloor ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_13); 

            	    				newLeafNode(otherlv_18, grammarAccess.getHouseAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalHouseBuilder.g:289:4: ( (lv_floors_19_0= ruleFloor ) )
            	    // InternalHouseBuilder.g:290:5: (lv_floors_19_0= ruleFloor )
            	    {
            	    // InternalHouseBuilder.g:290:5: (lv_floors_19_0= ruleFloor )
            	    // InternalHouseBuilder.g:291:6: lv_floors_19_0= ruleFloor
            	    {

            	    						newCompositeNode(grammarAccess.getHouseAccess().getFloorsFloorParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_floors_19_0=ruleFloor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHouseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"floors",
            	    							lv_floors_19_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Floor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_20=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_20, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_21=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_21, grammarAccess.getHouseAccess().getEntrancesKeyword_14());
            		
            otherlv_22=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_22, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalHouseBuilder.g:321:3: ( (lv_entrances_23_0= ruleEntrance ) )
            // InternalHouseBuilder.g:322:4: (lv_entrances_23_0= ruleEntrance )
            {
            // InternalHouseBuilder.g:322:4: (lv_entrances_23_0= ruleEntrance )
            // InternalHouseBuilder.g:323:5: lv_entrances_23_0= ruleEntrance
            {

            					newCompositeNode(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_14);
            lv_entrances_23_0=ruleEntrance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHouseRule());
            					}
            					add(
            						current,
            						"entrances",
            						lv_entrances_23_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.Entrance");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:340:3: (otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalHouseBuilder.g:341:4: otherlv_24= ',' ( (lv_entrances_25_0= ruleEntrance ) )
            	    {
            	    otherlv_24=(Token)match(input,20,FOLLOW_16); 

            	    				newLeafNode(otherlv_24, grammarAccess.getHouseAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalHouseBuilder.g:345:4: ( (lv_entrances_25_0= ruleEntrance ) )
            	    // InternalHouseBuilder.g:346:5: (lv_entrances_25_0= ruleEntrance )
            	    {
            	    // InternalHouseBuilder.g:346:5: (lv_entrances_25_0= ruleEntrance )
            	    // InternalHouseBuilder.g:347:6: lv_entrances_25_0= ruleEntrance
            	    {

            	    						newCompositeNode(grammarAccess.getHouseAccess().getEntrancesEntranceParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_entrances_25_0=ruleEntrance();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHouseRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entrances",
            	    							lv_entrances_25_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Entrance");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_26=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_26, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_18());
            		
            // InternalHouseBuilder.g:369:3: (otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalHouseBuilder.g:370:4: otherlv_27= 'passages' otherlv_28= '{' ( (lv_passages_29_0= rulePassage ) ) (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )* otherlv_32= '}'
                    {
                    otherlv_27=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_27, grammarAccess.getHouseAccess().getPassagesKeyword_19_0());
                    			
                    otherlv_28=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_28, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_19_1());
                    			
                    // InternalHouseBuilder.g:378:4: ( (lv_passages_29_0= rulePassage ) )
                    // InternalHouseBuilder.g:379:5: (lv_passages_29_0= rulePassage )
                    {
                    // InternalHouseBuilder.g:379:5: (lv_passages_29_0= rulePassage )
                    // InternalHouseBuilder.g:380:6: lv_passages_29_0= rulePassage
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_passages_29_0=rulePassage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						add(
                    							current,
                    							"passages",
                    							lv_passages_29_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Passage");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:397:4: (otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:398:5: otherlv_30= ',' ( (lv_passages_31_0= rulePassage ) )
                    	    {
                    	    otherlv_30=(Token)match(input,20,FOLLOW_18); 

                    	    					newLeafNode(otherlv_30, grammarAccess.getHouseAccess().getCommaKeyword_19_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:402:5: ( (lv_passages_31_0= rulePassage ) )
                    	    // InternalHouseBuilder.g:403:6: (lv_passages_31_0= rulePassage )
                    	    {
                    	    // InternalHouseBuilder.g:403:6: (lv_passages_31_0= rulePassage )
                    	    // InternalHouseBuilder.g:404:7: lv_passages_31_0= rulePassage
                    	    {

                    	    							newCompositeNode(grammarAccess.getHouseAccess().getPassagesPassageParserRuleCall_19_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_passages_31_0=rulePassage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHouseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"passages",
                    	    								lv_passages_31_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Passage");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_32, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_19_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilder.g:427:3: (otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalHouseBuilder.g:428:4: otherlv_33= 'controllers' otherlv_34= '{' ( (lv_controllers_35_0= ruleController ) ) (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )* otherlv_38= '}'
                    {
                    otherlv_33=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_33, grammarAccess.getHouseAccess().getControllersKeyword_20_0());
                    			
                    otherlv_34=(Token)match(input,12,FOLLOW_20); 

                    				newLeafNode(otherlv_34, grammarAccess.getHouseAccess().getLeftCurlyBracketKeyword_20_1());
                    			
                    // InternalHouseBuilder.g:436:4: ( (lv_controllers_35_0= ruleController ) )
                    // InternalHouseBuilder.g:437:5: (lv_controllers_35_0= ruleController )
                    {
                    // InternalHouseBuilder.g:437:5: (lv_controllers_35_0= ruleController )
                    // InternalHouseBuilder.g:438:6: lv_controllers_35_0= ruleController
                    {

                    						newCompositeNode(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_controllers_35_0=ruleController();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHouseRule());
                    						}
                    						add(
                    							current,
                    							"controllers",
                    							lv_controllers_35_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Controller");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:455:4: (otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==20) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:456:5: otherlv_36= ',' ( (lv_controllers_37_0= ruleController ) )
                    	    {
                    	    otherlv_36=(Token)match(input,20,FOLLOW_20); 

                    	    					newLeafNode(otherlv_36, grammarAccess.getHouseAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:460:5: ( (lv_controllers_37_0= ruleController ) )
                    	    // InternalHouseBuilder.g:461:6: (lv_controllers_37_0= ruleController )
                    	    {
                    	    // InternalHouseBuilder.g:461:6: (lv_controllers_37_0= ruleController )
                    	    // InternalHouseBuilder.g:462:7: lv_controllers_37_0= ruleController
                    	    {

                    	    							newCompositeNode(grammarAccess.getHouseAccess().getControllersControllerParserRuleCall_20_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_controllers_37_0=ruleController();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHouseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"controllers",
                    	    								lv_controllers_37_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Controller");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_38=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_38, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_20_4());
                    			

                    }
                    break;

            }

            otherlv_39=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_39, grammarAccess.getHouseAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHouse"


    // $ANTLR start "entryRuleSpace"
    // InternalHouseBuilder.g:493:1: entryRuleSpace returns [EObject current=null] : iv_ruleSpace= ruleSpace EOF ;
    public final EObject entryRuleSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpace = null;


        try {
            // InternalHouseBuilder.g:493:46: (iv_ruleSpace= ruleSpace EOF )
            // InternalHouseBuilder.g:494:2: iv_ruleSpace= ruleSpace EOF
            {
             newCompositeNode(grammarAccess.getSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpace=ruleSpace();

            state._fsp--;

             current =iv_ruleSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpace"


    // $ANTLR start "ruleSpace"
    // InternalHouseBuilder.g:500:1: ruleSpace returns [EObject current=null] : (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace ) ;
    public final EObject ruleSpace() throws RecognitionException {
        EObject current = null;

        EObject this_Room_0 = null;

        EObject this_ExternalSpace_1 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:506:2: ( (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace ) )
            // InternalHouseBuilder.g:507:2: (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace )
            {
            // InternalHouseBuilder.g:507:2: (this_Room_0= ruleRoom | this_ExternalSpace_1= ruleExternalSpace )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==52) ) {
                alt13=1;
            }
            else if ( (LA13_0==56) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalHouseBuilder.g:508:3: this_Room_0= ruleRoom
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getRoomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Room_0=ruleRoom();

                    state._fsp--;


                    			current = this_Room_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:517:3: this_ExternalSpace_1= ruleExternalSpace
                    {

                    			newCompositeNode(grammarAccess.getSpaceAccess().getExternalSpaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalSpace_1=ruleExternalSpace();

                    state._fsp--;


                    			current = this_ExternalSpace_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpace"


    // $ANTLR start "entryRuleEString"
    // InternalHouseBuilder.g:529:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalHouseBuilder.g:529:47: (iv_ruleEString= ruleEString EOF )
            // InternalHouseBuilder.g:530:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalHouseBuilder.g:536:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:542:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalHouseBuilder.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalHouseBuilder.g:543:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalHouseBuilder.g:544:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:552:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDate"
    // InternalHouseBuilder.g:563:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalHouseBuilder.g:563:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalHouseBuilder.g:564:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalHouseBuilder.g:570:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:576:2: (this_STRING_0= RULE_STRING )
            // InternalHouseBuilder.g:577:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleFloor"
    // InternalHouseBuilder.g:587:1: entryRuleFloor returns [EObject current=null] : iv_ruleFloor= ruleFloor EOF ;
    public final EObject entryRuleFloor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFloor = null;


        try {
            // InternalHouseBuilder.g:587:46: (iv_ruleFloor= ruleFloor EOF )
            // InternalHouseBuilder.g:588:2: iv_ruleFloor= ruleFloor EOF
            {
             newCompositeNode(grammarAccess.getFloorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloor=ruleFloor();

            state._fsp--;

             current =iv_ruleFloor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFloor"


    // $ANTLR start "ruleFloor"
    // InternalHouseBuilder.g:594:1: ruleFloor returns [EObject current=null] : (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleFloor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_level_4_0 = null;

        EObject lv_spaces_7_0 = null;

        EObject lv_spaces_9_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:600:2: ( (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // InternalHouseBuilder.g:601:2: (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // InternalHouseBuilder.g:601:2: (otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // InternalHouseBuilder.g:602:3: otherlv_0= 'Floor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'level' ( (lv_level_4_0= ruleEInt ) ) otherlv_5= 'spaces' otherlv_6= '{' ( (lv_spaces_7_0= ruleSpace ) ) (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getFloorAccess().getFloorKeyword_0());
            		
            // InternalHouseBuilder.g:606:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:607:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:607:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:608:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getFloorAccess().getLevelKeyword_3());
            		
            // InternalHouseBuilder.g:633:3: ( (lv_level_4_0= ruleEInt ) )
            // InternalHouseBuilder.g:634:4: (lv_level_4_0= ruleEInt )
            {
            // InternalHouseBuilder.g:634:4: (lv_level_4_0= ruleEInt )
            // InternalHouseBuilder.g:635:5: lv_level_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getLevelEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_level_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					set(
            						current,
            						"level",
            						lv_level_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getFloorAccess().getSpacesKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getFloorAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalHouseBuilder.g:660:3: ( (lv_spaces_7_0= ruleSpace ) )
            // InternalHouseBuilder.g:661:4: (lv_spaces_7_0= ruleSpace )
            {
            // InternalHouseBuilder.g:661:4: (lv_spaces_7_0= ruleSpace )
            // InternalHouseBuilder.g:662:5: lv_spaces_7_0= ruleSpace
            {

            					newCompositeNode(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_spaces_7_0=ruleSpace();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFloorRule());
            					}
            					add(
            						current,
            						"spaces",
            						lv_spaces_7_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.Space");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:679:3: (otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalHouseBuilder.g:680:4: otherlv_8= ',' ( (lv_spaces_9_0= ruleSpace ) )
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_25); 

            	    				newLeafNode(otherlv_8, grammarAccess.getFloorAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalHouseBuilder.g:684:4: ( (lv_spaces_9_0= ruleSpace ) )
            	    // InternalHouseBuilder.g:685:5: (lv_spaces_9_0= ruleSpace )
            	    {
            	    // InternalHouseBuilder.g:685:5: (lv_spaces_9_0= ruleSpace )
            	    // InternalHouseBuilder.g:686:6: lv_spaces_9_0= ruleSpace
            	    {

            	    						newCompositeNode(grammarAccess.getFloorAccess().getSpacesSpaceParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_spaces_9_0=ruleSpace();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFloorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"spaces",
            	    							lv_spaces_9_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Space");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_10, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getFloorAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloor"


    // $ANTLR start "entryRulePassage"
    // InternalHouseBuilder.g:716:1: entryRulePassage returns [EObject current=null] : iv_rulePassage= rulePassage EOF ;
    public final EObject entryRulePassage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePassage = null;


        try {
            // InternalHouseBuilder.g:716:48: (iv_rulePassage= rulePassage EOF )
            // InternalHouseBuilder.g:717:2: iv_rulePassage= rulePassage EOF
            {
             newCompositeNode(grammarAccess.getPassageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePassage=rulePassage();

            state._fsp--;

             current =iv_rulePassage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePassage"


    // $ANTLR start "rulePassage"
    // InternalHouseBuilder.g:723:1: rulePassage returns [EObject current=null] : (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject rulePassage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_doorType_4_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_6_0 = null;

        AntlrDatatypeRuleToken lv_height_8_0 = null;

        AntlrDatatypeRuleToken lv_width_10_0 = null;

        EObject lv_devices_17_0 = null;

        EObject lv_devices_19_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:729:2: ( (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalHouseBuilder.g:730:2: (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalHouseBuilder.g:730:2: (otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalHouseBuilder.g:731:3: otherlv_0= 'Passage' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'spaceA' ( ( ruleEString ) ) otherlv_13= 'spaceB' ( ( ruleEString ) ) (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPassageAccess().getPassageKeyword_0());
            		
            // InternalHouseBuilder.g:735:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:736:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:736:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:737:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPassageAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPassageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:758:3: (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalHouseBuilder.g:759:4: otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getPassageAccess().getDoorTypeKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:763:4: ( (lv_doorType_4_0= ruleDoorType ) )
                    // InternalHouseBuilder.g:764:5: (lv_doorType_4_0= ruleDoorType )
                    {
                    // InternalHouseBuilder.g:764:5: (lv_doorType_4_0= ruleDoorType )
                    // InternalHouseBuilder.g:765:6: lv_doorType_4_0= ruleDoorType
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_doorType_4_0=ruleDoorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						set(
                    							current,
                    							"doorType",
                    							lv_doorType_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.DoorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:783:3: (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==30) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalHouseBuilder.g:784:4: otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getPassageAccess().getDoorsNumberKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:788:4: ( (lv_doorsNumber_6_0= ruleEInt ) )
                    // InternalHouseBuilder.g:789:5: (lv_doorsNumber_6_0= ruleEInt )
                    {
                    // InternalHouseBuilder.g:789:5: (lv_doorsNumber_6_0= ruleEInt )
                    // InternalHouseBuilder.g:790:6: lv_doorsNumber_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getDoorsNumberEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_doorsNumber_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						set(
                    							current,
                    							"doorsNumber",
                    							lv_doorsNumber_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:808:3: (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalHouseBuilder.g:809:4: otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getPassageAccess().getWxHKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:813:4: ( (lv_height_8_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:814:5: (lv_height_8_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:814:5: (lv_height_8_0= ruleEFloat )
                    // InternalHouseBuilder.g:815:6: lv_height_8_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getHeightEFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_height_8_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getPassageAccess().getXKeyword_5_2());
                    			
                    // InternalHouseBuilder.g:836:4: ( (lv_width_10_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:837:5: (lv_width_10_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:837:5: (lv_width_10_0= ruleEFloat )
                    // InternalHouseBuilder.g:838:6: lv_width_10_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getWidthEFloatParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_width_10_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getPassageAccess().getSpaceAKeyword_6());
            		
            // InternalHouseBuilder.g:860:3: ( ( ruleEString ) )
            // InternalHouseBuilder.g:861:4: ( ruleEString )
            {
            // InternalHouseBuilder.g:861:4: ( ruleEString )
            // InternalHouseBuilder.g:862:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPassageAccess().getSpaceASpaceCrossReference_7_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getPassageAccess().getSpaceBKeyword_8());
            		
            // InternalHouseBuilder.g:880:3: ( ( ruleEString ) )
            // InternalHouseBuilder.g:881:4: ( ruleEString )
            {
            // InternalHouseBuilder.g:881:4: ( ruleEString )
            // InternalHouseBuilder.g:882:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPassageRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPassageAccess().getSpaceBSpaceCrossReference_9_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:896:3: (otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalHouseBuilder.g:897:4: otherlv_15= 'devices' otherlv_16= '{' ( (lv_devices_17_0= ruleDevice ) ) (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getPassageAccess().getDevicesKeyword_10_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_16, grammarAccess.getPassageAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalHouseBuilder.g:905:4: ( (lv_devices_17_0= ruleDevice ) )
                    // InternalHouseBuilder.g:906:5: (lv_devices_17_0= ruleDevice )
                    {
                    // InternalHouseBuilder.g:906:5: (lv_devices_17_0= ruleDevice )
                    // InternalHouseBuilder.g:907:6: lv_devices_17_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_17_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPassageRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_17_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:924:4: (otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:925:5: otherlv_18= ',' ( (lv_devices_19_0= ruleDevice ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getPassageAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:929:5: ( (lv_devices_19_0= ruleDevice ) )
                    	    // InternalHouseBuilder.g:930:6: (lv_devices_19_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilder.g:930:6: (lv_devices_19_0= ruleDevice )
                    	    // InternalHouseBuilder.g:931:7: lv_devices_19_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getPassageAccess().getDevicesDeviceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_19_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPassageRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_19_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_20, grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPassageAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePassage"


    // $ANTLR start "entryRuleController"
    // InternalHouseBuilder.g:962:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalHouseBuilder.g:962:51: (iv_ruleController= ruleController EOF )
            // InternalHouseBuilder.g:963:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalHouseBuilder.g:969:1: ruleController returns [EObject current=null] : (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )? (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_model_4_0 = null;

        AntlrDatatypeRuleToken lv_os_6_0 = null;

        AntlrDatatypeRuleToken lv_osVersion_8_0 = null;

        EObject lv_actuators_11_0 = null;

        EObject lv_actuators_13_0 = null;

        EObject lv_sensors_17_0 = null;

        EObject lv_sensors_19_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:975:2: ( (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )? (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalHouseBuilder.g:976:2: (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )? (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalHouseBuilder.g:976:2: (otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )? (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalHouseBuilder.g:977:3: otherlv_0= 'Controller' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )? (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )? (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )? otherlv_9= 'actuators' otherlv_10= '{' ( (lv_actuators_11_0= ruleActuator ) ) (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )* otherlv_14= '}' otherlv_15= 'sensors' otherlv_16= '{' ( (lv_sensors_17_0= ruleSensor ) ) (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getControllerAccess().getControllerKeyword_0());
            		
            // InternalHouseBuilder.g:981:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:982:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:982:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:983:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:1004:3: (otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==37) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalHouseBuilder.g:1005:4: otherlv_3= 'model' ( (lv_model_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getControllerAccess().getModelKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:1009:4: ( (lv_model_4_0= ruleEString ) )
                    // InternalHouseBuilder.g:1010:5: (lv_model_4_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:1010:5: (lv_model_4_0= ruleEString )
                    // InternalHouseBuilder.g:1011:6: lv_model_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getModelEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_model_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1029:3: (otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalHouseBuilder.g:1030:4: otherlv_5= 'os' ( (lv_os_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getOsKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:1034:4: ( (lv_os_6_0= ruleEString ) )
                    // InternalHouseBuilder.g:1035:5: (lv_os_6_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:1035:5: (lv_os_6_0= ruleEString )
                    // InternalHouseBuilder.g:1036:6: lv_os_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getOsEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_os_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"os",
                    							lv_os_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1054:3: (otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalHouseBuilder.g:1055:4: otherlv_7= 'osVersion' ( (lv_osVersion_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getControllerAccess().getOsVersionKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:1059:4: ( (lv_osVersion_8_0= ruleEString ) )
                    // InternalHouseBuilder.g:1060:5: (lv_osVersion_8_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:1060:5: (lv_osVersion_8_0= ruleEString )
                    // InternalHouseBuilder.g:1061:6: lv_osVersion_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getControllerAccess().getOsVersionEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_osVersion_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getControllerRule());
                    						}
                    						set(
                    							current,
                    							"osVersion",
                    							lv_osVersion_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getControllerAccess().getActuatorsKeyword_6());
            		
            otherlv_10=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalHouseBuilder.g:1087:3: ( (lv_actuators_11_0= ruleActuator ) )
            // InternalHouseBuilder.g:1088:4: (lv_actuators_11_0= ruleActuator )
            {
            // InternalHouseBuilder.g:1088:4: (lv_actuators_11_0= ruleActuator )
            // InternalHouseBuilder.g:1089:5: lv_actuators_11_0= ruleActuator
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_14);
            lv_actuators_11_0=ruleActuator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"actuators",
            						lv_actuators_11_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.Actuator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:1106:3: (otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==20) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalHouseBuilder.g:1107:4: otherlv_12= ',' ( (lv_actuators_13_0= ruleActuator ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_40); 

            	    				newLeafNode(otherlv_12, grammarAccess.getControllerAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalHouseBuilder.g:1111:4: ( (lv_actuators_13_0= ruleActuator ) )
            	    // InternalHouseBuilder.g:1112:5: (lv_actuators_13_0= ruleActuator )
            	    {
            	    // InternalHouseBuilder.g:1112:5: (lv_actuators_13_0= ruleActuator )
            	    // InternalHouseBuilder.g:1113:6: lv_actuators_13_0= ruleActuator
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getActuatorsActuatorParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_actuators_13_0=ruleActuator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actuators",
            	    							lv_actuators_13_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Actuator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_41); 

            			newLeafNode(otherlv_14, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_15=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getSensorsKeyword_11());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_16, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_12());
            		
            // InternalHouseBuilder.g:1143:3: ( (lv_sensors_17_0= ruleSensor ) )
            // InternalHouseBuilder.g:1144:4: (lv_sensors_17_0= ruleSensor )
            {
            // InternalHouseBuilder.g:1144:4: (lv_sensors_17_0= ruleSensor )
            // InternalHouseBuilder.g:1145:5: lv_sensors_17_0= ruleSensor
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_sensors_17_0=ruleSensor();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"sensors",
            						lv_sensors_17_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.Sensor");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:1162:3: (otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==20) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalHouseBuilder.g:1163:4: otherlv_18= ',' ( (lv_sensors_19_0= ruleSensor ) )
            	    {
            	    otherlv_18=(Token)match(input,20,FOLLOW_42); 

            	    				newLeafNode(otherlv_18, grammarAccess.getControllerAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalHouseBuilder.g:1167:4: ( (lv_sensors_19_0= ruleSensor ) )
            	    // InternalHouseBuilder.g:1168:5: (lv_sensors_19_0= ruleSensor )
            	    {
            	    // InternalHouseBuilder.g:1168:5: (lv_sensors_19_0= ruleSensor )
            	    // InternalHouseBuilder.g:1169:6: lv_sensors_19_0= ruleSensor
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getSensorsSensorParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_sensors_19_0=ruleSensor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sensors",
            	    							lv_sensors_19_0,
            	    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Sensor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_20=(Token)match(input,21,FOLLOW_21); 

            			newLeafNode(otherlv_20, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_21=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleEntrance"
    // InternalHouseBuilder.g:1199:1: entryRuleEntrance returns [EObject current=null] : iv_ruleEntrance= ruleEntrance EOF ;
    public final EObject entryRuleEntrance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntrance = null;


        try {
            // InternalHouseBuilder.g:1199:49: (iv_ruleEntrance= ruleEntrance EOF )
            // InternalHouseBuilder.g:1200:2: iv_ruleEntrance= ruleEntrance EOF
            {
             newCompositeNode(grammarAccess.getEntranceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntrance=ruleEntrance();

            state._fsp--;

             current =iv_ruleEntrance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntrance"


    // $ANTLR start "ruleEntrance"
    // InternalHouseBuilder.g:1206:1: ruleEntrance returns [EObject current=null] : (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) ;
    public final EObject ruleEntrance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_doorType_4_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_6_0 = null;

        AntlrDatatypeRuleToken lv_height_8_0 = null;

        AntlrDatatypeRuleToken lv_width_10_0 = null;

        EObject lv_devices_15_0 = null;

        EObject lv_devices_17_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:1212:2: ( (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' ) )
            // InternalHouseBuilder.g:1213:2: (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            {
            // InternalHouseBuilder.g:1213:2: (otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}' )
            // InternalHouseBuilder.g:1214:3: otherlv_0= 'Entrance' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )? (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )? (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )? otherlv_11= 'space' ( ( ruleEString ) ) (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntranceAccess().getEntranceKeyword_0());
            		
            // InternalHouseBuilder.g:1218:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:1219:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:1219:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:1220:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntranceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntranceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_43); 

            			newLeafNode(otherlv_2, grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:1241:3: (otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalHouseBuilder.g:1242:4: otherlv_3= 'doorType' ( (lv_doorType_4_0= ruleDoorType ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntranceAccess().getDoorTypeKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:1246:4: ( (lv_doorType_4_0= ruleDoorType ) )
                    // InternalHouseBuilder.g:1247:5: (lv_doorType_4_0= ruleDoorType )
                    {
                    // InternalHouseBuilder.g:1247:5: (lv_doorType_4_0= ruleDoorType )
                    // InternalHouseBuilder.g:1248:6: lv_doorType_4_0= ruleDoorType
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getDoorTypeDoorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_doorType_4_0=ruleDoorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						set(
                    							current,
                    							"doorType",
                    							lv_doorType_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.DoorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1266:3: (otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==30) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalHouseBuilder.g:1267:4: otherlv_5= 'doorsNumber' ( (lv_doorsNumber_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntranceAccess().getDoorsNumberKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:1271:4: ( (lv_doorsNumber_6_0= ruleEInt ) )
                    // InternalHouseBuilder.g:1272:5: (lv_doorsNumber_6_0= ruleEInt )
                    {
                    // InternalHouseBuilder.g:1272:5: (lv_doorsNumber_6_0= ruleEInt )
                    // InternalHouseBuilder.g:1273:6: lv_doorsNumber_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getDoorsNumberEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_doorsNumber_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						set(
                    							current,
                    							"doorsNumber",
                    							lv_doorsNumber_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1291:3: (otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalHouseBuilder.g:1292:4: otherlv_7= 'WxH:' ( (lv_height_8_0= ruleEFloat ) ) otherlv_9= 'x' ( (lv_width_10_0= ruleEFloat ) )
                    {
                    otherlv_7=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntranceAccess().getWxHKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:1296:4: ( (lv_height_8_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:1297:5: (lv_height_8_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:1297:5: (lv_height_8_0= ruleEFloat )
                    // InternalHouseBuilder.g:1298:6: lv_height_8_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getHeightEFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_height_8_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntranceAccess().getXKeyword_5_2());
                    			
                    // InternalHouseBuilder.g:1319:4: ( (lv_width_10_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:1320:5: (lv_width_10_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:1320:5: (lv_width_10_0= ruleEFloat )
                    // InternalHouseBuilder.g:1321:6: lv_width_10_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getWidthEFloatParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_width_10_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getEntranceAccess().getSpaceKeyword_6());
            		
            // InternalHouseBuilder.g:1343:3: ( ( ruleEString ) )
            // InternalHouseBuilder.g:1344:4: ( ruleEString )
            {
            // InternalHouseBuilder.g:1344:4: ( ruleEString )
            // InternalHouseBuilder.g:1345:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntranceRule());
            					}
            				

            					newCompositeNode(grammarAccess.getEntranceAccess().getSpaceSpaceCrossReference_7_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:1359:3: (otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalHouseBuilder.g:1360:4: otherlv_13= 'devices' otherlv_14= '{' ( (lv_devices_15_0= ruleDevice ) ) (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )* otherlv_18= '}'
                    {
                    otherlv_13=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getEntranceAccess().getDevicesKeyword_8_0());
                    			
                    otherlv_14=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_14, grammarAccess.getEntranceAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalHouseBuilder.g:1368:4: ( (lv_devices_15_0= ruleDevice ) )
                    // InternalHouseBuilder.g:1369:5: (lv_devices_15_0= ruleDevice )
                    {
                    // InternalHouseBuilder.g:1369:5: (lv_devices_15_0= ruleDevice )
                    // InternalHouseBuilder.g:1370:6: lv_devices_15_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_15_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntranceRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_15_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:1387:4: (otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==20) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:1388:5: otherlv_16= ',' ( (lv_devices_17_0= ruleDevice ) )
                    	    {
                    	    otherlv_16=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getEntranceAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:1392:5: ( (lv_devices_17_0= ruleDevice ) )
                    	    // InternalHouseBuilder.g:1393:6: (lv_devices_17_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilder.g:1393:6: (lv_devices_17_0= ruleDevice )
                    	    // InternalHouseBuilder.g:1394:7: lv_devices_17_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntranceAccess().getDevicesDeviceParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_17_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntranceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_17_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_18, grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getEntranceAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntrance"


    // $ANTLR start "entryRuleEInt"
    // InternalHouseBuilder.g:1425:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalHouseBuilder.g:1425:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalHouseBuilder.g:1426:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalHouseBuilder.g:1432:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:1438:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalHouseBuilder.g:1439:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalHouseBuilder.g:1439:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalHouseBuilder.g:1440:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalHouseBuilder.g:1440:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==44) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalHouseBuilder.g:1441:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_47); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEFloat"
    // InternalHouseBuilder.g:1458:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalHouseBuilder.g:1458:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalHouseBuilder.g:1459:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalHouseBuilder.g:1465:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:1471:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalHouseBuilder.g:1472:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalHouseBuilder.g:1472:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalHouseBuilder.g:1473:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalHouseBuilder.g:1473:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalHouseBuilder.g:1474:4: kw= '-'
                    {
                    kw=(Token)match(input,44,FOLLOW_48); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalHouseBuilder.g:1480:3: (this_INT_1= RULE_INT )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_INT) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalHouseBuilder.g:1481:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_49); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,45,FOLLOW_47); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_50); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalHouseBuilder.g:1501:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=46 && LA36_0<=47)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalHouseBuilder.g:1502:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalHouseBuilder.g:1502:4: (kw= 'E' | kw= 'e' )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==46) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==47) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalHouseBuilder.g:1503:5: kw= 'E'
                            {
                            kw=(Token)match(input,46,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalHouseBuilder.g:1509:5: kw= 'e'
                            {
                            kw=(Token)match(input,47,FOLLOW_23); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalHouseBuilder.g:1515:4: (kw= '-' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==44) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalHouseBuilder.g:1516:5: kw= '-'
                            {
                            kw=(Token)match(input,44,FOLLOW_47); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleDevice"
    // InternalHouseBuilder.g:1534:1: entryRuleDevice returns [EObject current=null] : iv_ruleDevice= ruleDevice EOF ;
    public final EObject entryRuleDevice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDevice = null;


        try {
            // InternalHouseBuilder.g:1534:47: (iv_ruleDevice= ruleDevice EOF )
            // InternalHouseBuilder.g:1535:2: iv_ruleDevice= ruleDevice EOF
            {
             newCompositeNode(grammarAccess.getDeviceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDevice=ruleDevice();

            state._fsp--;

             current =iv_ruleDevice; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDevice"


    // $ANTLR start "ruleDevice"
    // InternalHouseBuilder.g:1541:1: ruleDevice returns [EObject current=null] : ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleDevice() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_model_7_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:1547:2: ( ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalHouseBuilder.g:1548:2: ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalHouseBuilder.g:1548:2: ( () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? otherlv_8= '}' )
            // InternalHouseBuilder.g:1549:3: () otherlv_1= 'Device' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )? (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalHouseBuilder.g:1549:3: ()
            // InternalHouseBuilder.g:1550:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeviceAccess().getDeviceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeviceAccess().getDeviceKeyword_1());
            		
            // InternalHouseBuilder.g:1560:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHouseBuilder.g:1561:4: (lv_name_2_0= ruleEString )
            {
            // InternalHouseBuilder.g:1561:4: (lv_name_2_0= ruleEString )
            // InternalHouseBuilder.g:1562:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDeviceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeviceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_51); 

            			newLeafNode(otherlv_3, grammarAccess.getDeviceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHouseBuilder.g:1583:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalHouseBuilder.g:1584:4: otherlv_4= 'type' ( (lv_type_5_0= ruleDeviceType ) )
                    {
                    otherlv_4=(Token)match(input,49,FOLLOW_52); 

                    				newLeafNode(otherlv_4, grammarAccess.getDeviceAccess().getTypeKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:1588:4: ( (lv_type_5_0= ruleDeviceType ) )
                    // InternalHouseBuilder.g:1589:5: (lv_type_5_0= ruleDeviceType )
                    {
                    // InternalHouseBuilder.g:1589:5: (lv_type_5_0= ruleDeviceType )
                    // InternalHouseBuilder.g:1590:6: lv_type_5_0= ruleDeviceType
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getTypeDeviceTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_53);
                    lv_type_5_0=ruleDeviceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.DeviceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1608:3: (otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalHouseBuilder.g:1609:4: otherlv_6= 'model' ( (lv_model_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getDeviceAccess().getModelKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:1613:4: ( (lv_model_7_0= ruleEString ) )
                    // InternalHouseBuilder.g:1614:5: (lv_model_7_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:1614:5: (lv_model_7_0= ruleEString )
                    // InternalHouseBuilder.g:1615:6: lv_model_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getDeviceAccess().getModelEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_model_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeviceRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_7_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getDeviceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDevice"


    // $ANTLR start "entryRuleSensor"
    // InternalHouseBuilder.g:1641:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalHouseBuilder.g:1641:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalHouseBuilder.g:1642:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalHouseBuilder.g:1648:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )? (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_model_8_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:1654:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )? (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalHouseBuilder.g:1655:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )? (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalHouseBuilder.g:1655:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )? (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalHouseBuilder.g:1656:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )? (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )? (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )? otherlv_9= 'space' ( ( ruleEString ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalHouseBuilder.g:1660:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:1661:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:1661:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:1662:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_54); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:1683:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalHouseBuilder.g:1684:4: otherlv_3= 'type' ( (lv_type_4_0= ruleSensorType ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_55); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getTypeKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:1688:4: ( (lv_type_4_0= ruleSensorType ) )
                    // InternalHouseBuilder.g:1689:5: (lv_type_4_0= ruleSensorType )
                    {
                    // InternalHouseBuilder.g:1689:5: (lv_type_4_0= ruleSensorType )
                    // InternalHouseBuilder.g:1690:6: lv_type_4_0= ruleSensorType
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getTypeSensorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_56);
                    lv_type_4_0=ruleSensorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.SensorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1708:3: (otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalHouseBuilder.g:1709:4: otherlv_5= 'value' ( (lv_value_6_0= ruleEFloat ) )
                    {
                    otherlv_5=(Token)match(input,51,FOLLOW_30); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getValueKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:1713:4: ( (lv_value_6_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:1714:5: (lv_value_6_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:1714:5: (lv_value_6_0= ruleEFloat )
                    // InternalHouseBuilder.g:1715:6: lv_value_6_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getValueEFloatParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_57);
                    lv_value_6_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1733:3: (otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==37) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalHouseBuilder.g:1734:4: otherlv_7= 'model' ( (lv_model_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getModelKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:1738:4: ( (lv_model_8_0= ruleEString ) )
                    // InternalHouseBuilder.g:1739:5: (lv_model_8_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:1739:5: (lv_model_8_0= ruleEString )
                    // InternalHouseBuilder.g:1740:6: lv_model_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getModelEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_46);
                    lv_model_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getSpaceKeyword_6());
            		
            // InternalHouseBuilder.g:1762:3: ( ( ruleEString ) )
            // InternalHouseBuilder.g:1763:4: ( ruleEString )
            {
            // InternalHouseBuilder.g:1763:4: ( ruleEString )
            // InternalHouseBuilder.g:1764:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSensorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSensorAccess().getSpaceSpaceCrossReference_7_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRoom"
    // InternalHouseBuilder.g:1786:1: entryRuleRoom returns [EObject current=null] : iv_ruleRoom= ruleRoom EOF ;
    public final EObject entryRuleRoom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoom = null;


        try {
            // InternalHouseBuilder.g:1786:45: (iv_ruleRoom= ruleRoom EOF )
            // InternalHouseBuilder.g:1787:2: iv_ruleRoom= ruleRoom EOF
            {
             newCompositeNode(grammarAccess.getRoomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoom=ruleRoom();

            state._fsp--;

             current =iv_ruleRoom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoom"


    // $ANTLR start "ruleRoom"
    // InternalHouseBuilder.g:1793:1: ruleRoom returns [EObject current=null] : (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'LxHxW:' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'x' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )? (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleRoom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        AntlrDatatypeRuleToken lv_height_8_0 = null;

        Enumerator lv_roomType_10_0 = null;

        EObject lv_devices_13_0 = null;

        EObject lv_devices_15_0 = null;

        EObject lv_windows_19_0 = null;

        EObject lv_windows_21_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:1799:2: ( (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'LxHxW:' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'x' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )? (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalHouseBuilder.g:1800:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'LxHxW:' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'x' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )? (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalHouseBuilder.g:1800:2: (otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'LxHxW:' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'x' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )? (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalHouseBuilder.g:1801:3: otherlv_0= 'Room' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'LxHxW:' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'x' ( (lv_width_6_0= ruleEFloat ) ) (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )? (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRoomAccess().getRoomKeyword_0());
            		
            // InternalHouseBuilder.g:1805:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:1806:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:1806:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:1807:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_58); 

            			newLeafNode(otherlv_2, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,53,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getRoomAccess().getLxHxWKeyword_3());
            		
            // InternalHouseBuilder.g:1832:3: ( (lv_length_4_0= ruleEFloat ) )
            // InternalHouseBuilder.g:1833:4: (lv_length_4_0= ruleEFloat )
            {
            // InternalHouseBuilder.g:1833:4: (lv_length_4_0= ruleEFloat )
            // InternalHouseBuilder.g:1834:5: lv_length_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getLengthEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_length_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getRoomAccess().getXKeyword_5());
            		
            // InternalHouseBuilder.g:1855:3: ( (lv_width_6_0= ruleEFloat ) )
            // InternalHouseBuilder.g:1856:4: (lv_width_6_0= ruleEFloat )
            {
            // InternalHouseBuilder.g:1856:4: (lv_width_6_0= ruleEFloat )
            // InternalHouseBuilder.g:1857:5: lv_width_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getRoomAccess().getWidthEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_59);
            lv_width_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRoomRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:1874:3: (otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==32) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalHouseBuilder.g:1875:4: otherlv_7= 'x' ( (lv_height_8_0= ruleEFloat ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_7, grammarAccess.getRoomAccess().getXKeyword_7_0());
                    			
                    // InternalHouseBuilder.g:1879:4: ( (lv_height_8_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:1880:5: (lv_height_8_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:1880:5: (lv_height_8_0= ruleEFloat )
                    // InternalHouseBuilder.g:1881:6: lv_height_8_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getHeightEFloatParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_height_8_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_8_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1899:3: (otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==54) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalHouseBuilder.g:1900:4: otherlv_9= 'roomType' ( (lv_roomType_10_0= ruleRoomType ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_61); 

                    				newLeafNode(otherlv_9, grammarAccess.getRoomAccess().getRoomTypeKeyword_8_0());
                    			
                    // InternalHouseBuilder.g:1904:4: ( (lv_roomType_10_0= ruleRoomType ) )
                    // InternalHouseBuilder.g:1905:5: (lv_roomType_10_0= ruleRoomType )
                    {
                    // InternalHouseBuilder.g:1905:5: (lv_roomType_10_0= ruleRoomType )
                    // InternalHouseBuilder.g:1906:6: lv_roomType_10_0= ruleRoomType
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getRoomTypeRoomTypeEnumRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_62);
                    lv_roomType_10_0=ruleRoomType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						set(
                    							current,
                    							"roomType",
                    							lv_roomType_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.RoomType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:1924:3: (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==35) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalHouseBuilder.g:1925:4: otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getRoomAccess().getDevicesKeyword_9_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_12, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalHouseBuilder.g:1933:4: ( (lv_devices_13_0= ruleDevice ) )
                    // InternalHouseBuilder.g:1934:5: (lv_devices_13_0= ruleDevice )
                    {
                    // InternalHouseBuilder.g:1934:5: (lv_devices_13_0= ruleDevice )
                    // InternalHouseBuilder.g:1935:6: lv_devices_13_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_13_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_13_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:1952:4: (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:1953:5: otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getRoomAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:1957:5: ( (lv_devices_15_0= ruleDevice ) )
                    	    // InternalHouseBuilder.g:1958:6: (lv_devices_15_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilder.g:1958:6: (lv_devices_15_0= ruleDevice )
                    	    // InternalHouseBuilder.g:1959:7: lv_devices_15_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getDevicesDeviceParserRuleCall_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_15_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_15_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_63); 

                    				newLeafNode(otherlv_16, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalHouseBuilder.g:1982:3: (otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==55) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalHouseBuilder.g:1983:4: otherlv_17= 'windows' otherlv_18= '{' ( (lv_windows_19_0= ruleWindow ) ) (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,55,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getRoomAccess().getWindowsKeyword_10_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_64); 

                    				newLeafNode(otherlv_18, grammarAccess.getRoomAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalHouseBuilder.g:1991:4: ( (lv_windows_19_0= ruleWindow ) )
                    // InternalHouseBuilder.g:1992:5: (lv_windows_19_0= ruleWindow )
                    {
                    // InternalHouseBuilder.g:1992:5: (lv_windows_19_0= ruleWindow )
                    // InternalHouseBuilder.g:1993:6: lv_windows_19_0= ruleWindow
                    {

                    						newCompositeNode(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_windows_19_0=ruleWindow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRoomRule());
                    						}
                    						add(
                    							current,
                    							"windows",
                    							lv_windows_19_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Window");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:2010:4: (otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==20) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:2011:5: otherlv_20= ',' ( (lv_windows_21_0= ruleWindow ) )
                    	    {
                    	    otherlv_20=(Token)match(input,20,FOLLOW_64); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getRoomAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:2015:5: ( (lv_windows_21_0= ruleWindow ) )
                    	    // InternalHouseBuilder.g:2016:6: (lv_windows_21_0= ruleWindow )
                    	    {
                    	    // InternalHouseBuilder.g:2016:6: (lv_windows_21_0= ruleWindow )
                    	    // InternalHouseBuilder.g:2017:7: lv_windows_21_0= ruleWindow
                    	    {

                    	    							newCompositeNode(grammarAccess.getRoomAccess().getWindowsWindowParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_windows_21_0=ruleWindow();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRoomRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"windows",
                    	    								lv_windows_21_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Window");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_22, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getRoomAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoom"


    // $ANTLR start "entryRuleExternalSpace"
    // InternalHouseBuilder.g:2048:1: entryRuleExternalSpace returns [EObject current=null] : iv_ruleExternalSpace= ruleExternalSpace EOF ;
    public final EObject entryRuleExternalSpace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalSpace = null;


        try {
            // InternalHouseBuilder.g:2048:54: (iv_ruleExternalSpace= ruleExternalSpace EOF )
            // InternalHouseBuilder.g:2049:2: iv_ruleExternalSpace= ruleExternalSpace EOF
            {
             newCompositeNode(grammarAccess.getExternalSpaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalSpace=ruleExternalSpace();

            state._fsp--;

             current =iv_ruleExternalSpace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalSpace"


    // $ANTLR start "ruleExternalSpace"
    // InternalHouseBuilder.g:2055:1: ruleExternalSpace returns [EObject current=null] : (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleExternalSpaceType ) ) (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleExternalSpace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_length_4_0 = null;

        AntlrDatatypeRuleToken lv_width_6_0 = null;

        Enumerator lv_type_8_0 = null;

        Enumerator lv_ground_10_0 = null;

        EObject lv_devices_13_0 = null;

        EObject lv_devices_15_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:2061:2: ( (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleExternalSpaceType ) ) (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalHouseBuilder.g:2062:2: (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleExternalSpaceType ) ) (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalHouseBuilder.g:2062:2: (otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleExternalSpaceType ) ) (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalHouseBuilder.g:2063:3: otherlv_0= 'ExternalSpace' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'length' ( (lv_length_4_0= ruleEFloat ) ) otherlv_5= 'width' ( (lv_width_6_0= ruleEFloat ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleExternalSpaceType ) ) (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )? (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalSpaceAccess().getExternalSpaceKeyword_0());
            		
            // InternalHouseBuilder.g:2067:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:2068:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:2068:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:2069:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_65); 

            			newLeafNode(otherlv_2, grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,57,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getExternalSpaceAccess().getLengthKeyword_3());
            		
            // InternalHouseBuilder.g:2094:3: ( (lv_length_4_0= ruleEFloat ) )
            // InternalHouseBuilder.g:2095:4: (lv_length_4_0= ruleEFloat )
            {
            // InternalHouseBuilder.g:2095:4: (lv_length_4_0= ruleEFloat )
            // InternalHouseBuilder.g:2096:5: lv_length_4_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getLengthEFloatParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_66);
            lv_length_4_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"length",
            						lv_length_4_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,58,FOLLOW_30); 

            			newLeafNode(otherlv_5, grammarAccess.getExternalSpaceAccess().getWidthKeyword_5());
            		
            // InternalHouseBuilder.g:2117:3: ( (lv_width_6_0= ruleEFloat ) )
            // InternalHouseBuilder.g:2118:4: (lv_width_6_0= ruleEFloat )
            {
            // InternalHouseBuilder.g:2118:4: (lv_width_6_0= ruleEFloat )
            // InternalHouseBuilder.g:2119:5: lv_width_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getWidthEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_67);
            lv_width_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"width",
            						lv_width_6_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,49,FOLLOW_68); 

            			newLeafNode(otherlv_7, grammarAccess.getExternalSpaceAccess().getTypeKeyword_7());
            		
            // InternalHouseBuilder.g:2140:3: ( (lv_type_8_0= ruleExternalSpaceType ) )
            // InternalHouseBuilder.g:2141:4: (lv_type_8_0= ruleExternalSpaceType )
            {
            // InternalHouseBuilder.g:2141:4: (lv_type_8_0= ruleExternalSpaceType )
            // InternalHouseBuilder.g:2142:5: lv_type_8_0= ruleExternalSpaceType
            {

            					newCompositeNode(grammarAccess.getExternalSpaceAccess().getTypeExternalSpaceTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_69);
            lv_type_8_0=ruleExternalSpaceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.ExternalSpaceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalHouseBuilder.g:2159:3: (otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalHouseBuilder.g:2160:4: otherlv_9= 'ground' ( (lv_ground_10_0= ruleGroundType ) )
                    {
                    otherlv_9=(Token)match(input,59,FOLLOW_70); 

                    				newLeafNode(otherlv_9, grammarAccess.getExternalSpaceAccess().getGroundKeyword_9_0());
                    			
                    // InternalHouseBuilder.g:2164:4: ( (lv_ground_10_0= ruleGroundType ) )
                    // InternalHouseBuilder.g:2165:5: (lv_ground_10_0= ruleGroundType )
                    {
                    // InternalHouseBuilder.g:2165:5: (lv_ground_10_0= ruleGroundType )
                    // InternalHouseBuilder.g:2166:6: lv_ground_10_0= ruleGroundType
                    {

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getGroundGroundTypeEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_34);
                    lv_ground_10_0=ruleGroundType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    						}
                    						set(
                    							current,
                    							"ground",
                    							lv_ground_10_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.GroundType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:2184:3: (otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==35) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalHouseBuilder.g:2185:4: otherlv_11= 'devices' otherlv_12= '{' ( (lv_devices_13_0= ruleDevice ) ) (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getExternalSpaceAccess().getDevicesKeyword_10_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_35); 

                    				newLeafNode(otherlv_12, grammarAccess.getExternalSpaceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalHouseBuilder.g:2193:4: ( (lv_devices_13_0= ruleDevice ) )
                    // InternalHouseBuilder.g:2194:5: (lv_devices_13_0= ruleDevice )
                    {
                    // InternalHouseBuilder.g:2194:5: (lv_devices_13_0= ruleDevice )
                    // InternalHouseBuilder.g:2195:6: lv_devices_13_0= ruleDevice
                    {

                    						newCompositeNode(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_devices_13_0=ruleDevice();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    						}
                    						add(
                    							current,
                    							"devices",
                    							lv_devices_13_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalHouseBuilder.g:2212:4: (otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalHouseBuilder.g:2213:5: otherlv_14= ',' ( (lv_devices_15_0= ruleDevice ) )
                    	    {
                    	    otherlv_14=(Token)match(input,20,FOLLOW_35); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getExternalSpaceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalHouseBuilder.g:2217:5: ( (lv_devices_15_0= ruleDevice ) )
                    	    // InternalHouseBuilder.g:2218:6: (lv_devices_15_0= ruleDevice )
                    	    {
                    	    // InternalHouseBuilder.g:2218:6: (lv_devices_15_0= ruleDevice )
                    	    // InternalHouseBuilder.g:2219:7: lv_devices_15_0= ruleDevice
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalSpaceAccess().getDevicesDeviceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_devices_15_0=ruleDevice();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalSpaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"devices",
                    	    								lv_devices_15_0,
                    	    								"it.univaq.disim.housebuilder.xtext.HouseBuilder.Device");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,21,FOLLOW_21); 

                    				newLeafNode(otherlv_16, grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getExternalSpaceAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalSpace"


    // $ANTLR start "entryRuleActuator"
    // InternalHouseBuilder.g:2250:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalHouseBuilder.g:2250:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalHouseBuilder.g:2251:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalHouseBuilder.g:2257:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )? (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;

        AntlrDatatypeRuleToken lv_model_6_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:2263:2: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )? (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalHouseBuilder.g:2264:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )? (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalHouseBuilder.g:2264:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )? (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalHouseBuilder.g:2265:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )? (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )? otherlv_7= 'device' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalHouseBuilder.g:2269:3: ( (lv_name_1_0= ruleEString ) )
            // InternalHouseBuilder.g:2270:4: (lv_name_1_0= ruleEString )
            {
            // InternalHouseBuilder.g:2270:4: (lv_name_1_0= ruleEString )
            // InternalHouseBuilder.g:2271:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_71); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalHouseBuilder.g:2292:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==49) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalHouseBuilder.g:2293:4: otherlv_3= 'type' ( (lv_type_4_0= ruleActuatorType ) )
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_72); 

                    				newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getTypeKeyword_3_0());
                    			
                    // InternalHouseBuilder.g:2297:4: ( (lv_type_4_0= ruleActuatorType ) )
                    // InternalHouseBuilder.g:2298:5: (lv_type_4_0= ruleActuatorType )
                    {
                    // InternalHouseBuilder.g:2298:5: (lv_type_4_0= ruleActuatorType )
                    // InternalHouseBuilder.g:2299:6: lv_type_4_0= ruleActuatorType
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getTypeActuatorTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_73);
                    lv_type_4_0=ruleActuatorType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.ActuatorType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:2317:3: (otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalHouseBuilder.g:2318:4: otherlv_5= 'model' ( (lv_model_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getModelKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:2322:4: ( (lv_model_6_0= ruleEString ) )
                    // InternalHouseBuilder.g:2323:5: (lv_model_6_0= ruleEString )
                    {
                    // InternalHouseBuilder.g:2323:5: (lv_model_6_0= ruleEString )
                    // InternalHouseBuilder.g:2324:6: lv_model_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getModelEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_74);
                    lv_model_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"model",
                    							lv_model_6_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,61,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getActuatorAccess().getDeviceKeyword_5());
            		
            // InternalHouseBuilder.g:2346:3: ( ( ruleEString ) )
            // InternalHouseBuilder.g:2347:4: ( ruleEString )
            {
            // InternalHouseBuilder.g:2347:4: ( ruleEString )
            // InternalHouseBuilder.g:2348:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActuatorRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActuatorAccess().getDeviceDeviceCrossReference_6_0());
            				
            pushFollow(FOLLOW_21);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleWindow"
    // InternalHouseBuilder.g:2370:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalHouseBuilder.g:2370:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalHouseBuilder.g:2371:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalHouseBuilder.g:2377:1: ruleWindow returns [EObject current=null] : ( () otherlv_1= 'Window' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )? (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_doorsNumber_5_0 = null;

        AntlrDatatypeRuleToken lv_height_7_0 = null;

        AntlrDatatypeRuleToken lv_width_9_0 = null;



        	enterRule();

        try {
            // InternalHouseBuilder.g:2383:2: ( ( () otherlv_1= 'Window' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )? (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )? otherlv_10= '}' ) )
            // InternalHouseBuilder.g:2384:2: ( () otherlv_1= 'Window' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )? (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )? otherlv_10= '}' )
            {
            // InternalHouseBuilder.g:2384:2: ( () otherlv_1= 'Window' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )? (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )? otherlv_10= '}' )
            // InternalHouseBuilder.g:2385:3: () otherlv_1= 'Window' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )? (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )? otherlv_10= '}'
            {
            // InternalHouseBuilder.g:2385:3: ()
            // InternalHouseBuilder.g:2386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getWindowAccess().getWindowAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getWindowAccess().getWindowKeyword_1());
            		
            // InternalHouseBuilder.g:2396:3: ( (lv_name_2_0= ruleEString ) )
            // InternalHouseBuilder.g:2397:4: (lv_name_2_0= ruleEString )
            {
            // InternalHouseBuilder.g:2397:4: (lv_name_2_0= ruleEString )
            // InternalHouseBuilder.g:2398:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWindowRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"it.univaq.disim.housebuilder.xtext.HouseBuilder.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getWindowAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalHouseBuilder.g:2419:3: (otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalHouseBuilder.g:2420:4: otherlv_4= 'doorsNumber' ( (lv_doorsNumber_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getDoorsNumberKeyword_4_0());
                    			
                    // InternalHouseBuilder.g:2424:4: ( (lv_doorsNumber_5_0= ruleEInt ) )
                    // InternalHouseBuilder.g:2425:5: (lv_doorsNumber_5_0= ruleEInt )
                    {
                    // InternalHouseBuilder.g:2425:5: (lv_doorsNumber_5_0= ruleEInt )
                    // InternalHouseBuilder.g:2426:6: lv_doorsNumber_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getWindowAccess().getDoorsNumberEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_doorsNumber_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWindowRule());
                    						}
                    						set(
                    							current,
                    							"doorsNumber",
                    							lv_doorsNumber_5_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalHouseBuilder.g:2444:3: (otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==31) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalHouseBuilder.g:2445:4: otherlv_6= 'WxH:' ( (lv_height_7_0= ruleEFloat ) ) otherlv_8= 'x' ( (lv_width_9_0= ruleEFloat ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getWindowAccess().getWxHKeyword_5_0());
                    			
                    // InternalHouseBuilder.g:2449:4: ( (lv_height_7_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:2450:5: (lv_height_7_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:2450:5: (lv_height_7_0= ruleEFloat )
                    // InternalHouseBuilder.g:2451:6: lv_height_7_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getWindowAccess().getHeightEFloatParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_height_7_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWindowRule());
                    						}
                    						set(
                    							current,
                    							"height",
                    							lv_height_7_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,32,FOLLOW_30); 

                    				newLeafNode(otherlv_8, grammarAccess.getWindowAccess().getXKeyword_5_2());
                    			
                    // InternalHouseBuilder.g:2472:4: ( (lv_width_9_0= ruleEFloat ) )
                    // InternalHouseBuilder.g:2473:5: (lv_width_9_0= ruleEFloat )
                    {
                    // InternalHouseBuilder.g:2473:5: (lv_width_9_0= ruleEFloat )
                    // InternalHouseBuilder.g:2474:6: lv_width_9_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getWindowAccess().getWidthEFloatParserRuleCall_5_3_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_width_9_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWindowRule());
                    						}
                    						set(
                    							current,
                    							"width",
                    							lv_width_9_0,
                    							"it.univaq.disim.housebuilder.xtext.HouseBuilder.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getWindowAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "ruleDeviceType"
    // InternalHouseBuilder.g:2500:1: ruleDeviceType returns [Enumerator current=null] : ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) ) ;
    public final Enumerator ruleDeviceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2506:2: ( ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) ) )
            // InternalHouseBuilder.g:2507:2: ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) )
            {
            // InternalHouseBuilder.g:2507:2: ( (enumLiteral_0= 'THERMOSTAT' ) | (enumLiteral_1= 'APPLIANCE' ) | (enumLiteral_2= 'SOCKET' ) | (enumLiteral_3= 'ROLLER_SHUTTERS' ) | (enumLiteral_4= 'GATE' ) )
            int alt55=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt55=1;
                }
                break;
            case 64:
                {
                alt55=2;
                }
                break;
            case 65:
                {
                alt55=3;
                }
                break;
            case 66:
                {
                alt55=4;
                }
                break;
            case 67:
                {
                alt55=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // InternalHouseBuilder.g:2508:3: (enumLiteral_0= 'THERMOSTAT' )
                    {
                    // InternalHouseBuilder.g:2508:3: (enumLiteral_0= 'THERMOSTAT' )
                    // InternalHouseBuilder.g:2509:4: enumLiteral_0= 'THERMOSTAT'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDeviceTypeAccess().getTHERMOSTATEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2516:3: (enumLiteral_1= 'APPLIANCE' )
                    {
                    // InternalHouseBuilder.g:2516:3: (enumLiteral_1= 'APPLIANCE' )
                    // InternalHouseBuilder.g:2517:4: enumLiteral_1= 'APPLIANCE'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDeviceTypeAccess().getAPPLIANCEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2524:3: (enumLiteral_2= 'SOCKET' )
                    {
                    // InternalHouseBuilder.g:2524:3: (enumLiteral_2= 'SOCKET' )
                    // InternalHouseBuilder.g:2525:4: enumLiteral_2= 'SOCKET'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDeviceTypeAccess().getSOCKETEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:2532:3: (enumLiteral_3= 'ROLLER_SHUTTERS' )
                    {
                    // InternalHouseBuilder.g:2532:3: (enumLiteral_3= 'ROLLER_SHUTTERS' )
                    // InternalHouseBuilder.g:2533:4: enumLiteral_3= 'ROLLER_SHUTTERS'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDeviceTypeAccess().getROLLER_SHUTTERSEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:2540:3: (enumLiteral_4= 'GATE' )
                    {
                    // InternalHouseBuilder.g:2540:3: (enumLiteral_4= 'GATE' )
                    // InternalHouseBuilder.g:2541:4: enumLiteral_4= 'GATE'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDeviceTypeAccess().getGATEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeviceType"


    // $ANTLR start "ruleActuatorType"
    // InternalHouseBuilder.g:2551:1: ruleActuatorType returns [Enumerator current=null] : ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) ) ;
    public final Enumerator ruleActuatorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2557:2: ( ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) ) )
            // InternalHouseBuilder.g:2558:2: ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) )
            {
            // InternalHouseBuilder.g:2558:2: ( (enumLiteral_0= 'IDRAULIC' ) | (enumLiteral_1= 'PNEUMATIC' ) | (enumLiteral_2= 'ELECTRICAL' ) | (enumLiteral_3= 'THERMAL' ) | (enumLiteral_4= 'MECHANICAL' ) )
            int alt56=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt56=1;
                }
                break;
            case 69:
                {
                alt56=2;
                }
                break;
            case 70:
                {
                alt56=3;
                }
                break;
            case 71:
                {
                alt56=4;
                }
                break;
            case 72:
                {
                alt56=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalHouseBuilder.g:2559:3: (enumLiteral_0= 'IDRAULIC' )
                    {
                    // InternalHouseBuilder.g:2559:3: (enumLiteral_0= 'IDRAULIC' )
                    // InternalHouseBuilder.g:2560:4: enumLiteral_0= 'IDRAULIC'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActuatorTypeAccess().getIDRAULICEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2567:3: (enumLiteral_1= 'PNEUMATIC' )
                    {
                    // InternalHouseBuilder.g:2567:3: (enumLiteral_1= 'PNEUMATIC' )
                    // InternalHouseBuilder.g:2568:4: enumLiteral_1= 'PNEUMATIC'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActuatorTypeAccess().getPNEUMATICEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2575:3: (enumLiteral_2= 'ELECTRICAL' )
                    {
                    // InternalHouseBuilder.g:2575:3: (enumLiteral_2= 'ELECTRICAL' )
                    // InternalHouseBuilder.g:2576:4: enumLiteral_2= 'ELECTRICAL'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getActuatorTypeAccess().getELECTRICALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:2583:3: (enumLiteral_3= 'THERMAL' )
                    {
                    // InternalHouseBuilder.g:2583:3: (enumLiteral_3= 'THERMAL' )
                    // InternalHouseBuilder.g:2584:4: enumLiteral_3= 'THERMAL'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getActuatorTypeAccess().getTHERMALEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:2591:3: (enumLiteral_4= 'MECHANICAL' )
                    {
                    // InternalHouseBuilder.g:2591:3: (enumLiteral_4= 'MECHANICAL' )
                    // InternalHouseBuilder.g:2592:4: enumLiteral_4= 'MECHANICAL'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getActuatorTypeAccess().getMECHANICALEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuatorType"


    // $ANTLR start "ruleSensorType"
    // InternalHouseBuilder.g:2602:1: ruleSensorType returns [Enumerator current=null] : ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) ) ;
    public final Enumerator ruleSensorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2608:2: ( ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) ) )
            // InternalHouseBuilder.g:2609:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) )
            {
            // InternalHouseBuilder.g:2609:2: ( (enumLiteral_0= 'TEMPERATURE' ) | (enumLiteral_1= 'PRESSURE' ) | (enumLiteral_2= 'PROXIMITY' ) | (enumLiteral_3= 'ACCELEROMETER' ) | (enumLiteral_4= 'GAS' ) | (enumLiteral_5= 'SMOKE' ) | (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt57=1;
                }
                break;
            case 74:
                {
                alt57=2;
                }
                break;
            case 75:
                {
                alt57=3;
                }
                break;
            case 76:
                {
                alt57=4;
                }
                break;
            case 77:
                {
                alt57=5;
                }
                break;
            case 78:
                {
                alt57=6;
                }
                break;
            case 79:
                {
                alt57=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalHouseBuilder.g:2610:3: (enumLiteral_0= 'TEMPERATURE' )
                    {
                    // InternalHouseBuilder.g:2610:3: (enumLiteral_0= 'TEMPERATURE' )
                    // InternalHouseBuilder.g:2611:4: enumLiteral_0= 'TEMPERATURE'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSensorTypeAccess().getTEMPERATUREEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2618:3: (enumLiteral_1= 'PRESSURE' )
                    {
                    // InternalHouseBuilder.g:2618:3: (enumLiteral_1= 'PRESSURE' )
                    // InternalHouseBuilder.g:2619:4: enumLiteral_1= 'PRESSURE'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSensorTypeAccess().getPRESSUREEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2626:3: (enumLiteral_2= 'PROXIMITY' )
                    {
                    // InternalHouseBuilder.g:2626:3: (enumLiteral_2= 'PROXIMITY' )
                    // InternalHouseBuilder.g:2627:4: enumLiteral_2= 'PROXIMITY'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSensorTypeAccess().getPROXIMITYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:2634:3: (enumLiteral_3= 'ACCELEROMETER' )
                    {
                    // InternalHouseBuilder.g:2634:3: (enumLiteral_3= 'ACCELEROMETER' )
                    // InternalHouseBuilder.g:2635:4: enumLiteral_3= 'ACCELEROMETER'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getSensorTypeAccess().getACCELEROMETEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:2642:3: (enumLiteral_4= 'GAS' )
                    {
                    // InternalHouseBuilder.g:2642:3: (enumLiteral_4= 'GAS' )
                    // InternalHouseBuilder.g:2643:4: enumLiteral_4= 'GAS'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getSensorTypeAccess().getGASEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:2650:3: (enumLiteral_5= 'SMOKE' )
                    {
                    // InternalHouseBuilder.g:2650:3: (enumLiteral_5= 'SMOKE' )
                    // InternalHouseBuilder.g:2651:4: enumLiteral_5= 'SMOKE'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getSensorTypeAccess().getSMOKEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:2658:3: (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' )
                    {
                    // InternalHouseBuilder.g:2658:3: (enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA' )
                    // InternalHouseBuilder.g:2659:4: enumLiteral_6= 'VIDEO_SURVAILLANCE_CAMERA'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getSensorTypeAccess().getVIDEO_SURVAILLANCE_CAMERAEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorType"


    // $ANTLR start "ruleRoomType"
    // InternalHouseBuilder.g:2669:1: ruleRoomType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) ) ;
    public final Enumerator ruleRoomType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2675:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) ) )
            // InternalHouseBuilder.g:2676:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) )
            {
            // InternalHouseBuilder.g:2676:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'BATHROOM' ) | (enumLiteral_2= 'LIVING_ROOM' ) | (enumLiteral_3= 'BEDROOM' ) | (enumLiteral_4= 'HALLWAY' ) | (enumLiteral_5= 'STUDY' ) | (enumLiteral_6= 'ENTRANCE' ) | (enumLiteral_7= 'STORAGE_ROOM' ) | (enumLiteral_8= 'GARAGE' ) | (enumLiteral_9= 'LAUNDRY_ROOM' ) | (enumLiteral_10= 'HOBBY_ROOM' ) | (enumLiteral_11= 'CELLAR' ) | (enumLiteral_12= 'LUNCHROOM' ) | (enumLiteral_13= 'RUMPUS_ROOM' ) | (enumLiteral_14= 'STAIRS' ) | (enumLiteral_15= 'KITCHEN' ) )
            int alt58=16;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt58=1;
                }
                break;
            case 81:
                {
                alt58=2;
                }
                break;
            case 82:
                {
                alt58=3;
                }
                break;
            case 83:
                {
                alt58=4;
                }
                break;
            case 84:
                {
                alt58=5;
                }
                break;
            case 85:
                {
                alt58=6;
                }
                break;
            case 86:
                {
                alt58=7;
                }
                break;
            case 87:
                {
                alt58=8;
                }
                break;
            case 88:
                {
                alt58=9;
                }
                break;
            case 89:
                {
                alt58=10;
                }
                break;
            case 90:
                {
                alt58=11;
                }
                break;
            case 91:
                {
                alt58=12;
                }
                break;
            case 92:
                {
                alt58=13;
                }
                break;
            case 93:
                {
                alt58=14;
                }
                break;
            case 94:
                {
                alt58=15;
                }
                break;
            case 95:
                {
                alt58=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalHouseBuilder.g:2677:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalHouseBuilder.g:2677:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalHouseBuilder.g:2678:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRoomTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2685:3: (enumLiteral_1= 'BATHROOM' )
                    {
                    // InternalHouseBuilder.g:2685:3: (enumLiteral_1= 'BATHROOM' )
                    // InternalHouseBuilder.g:2686:4: enumLiteral_1= 'BATHROOM'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRoomTypeAccess().getBATHROOMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2693:3: (enumLiteral_2= 'LIVING_ROOM' )
                    {
                    // InternalHouseBuilder.g:2693:3: (enumLiteral_2= 'LIVING_ROOM' )
                    // InternalHouseBuilder.g:2694:4: enumLiteral_2= 'LIVING_ROOM'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRoomTypeAccess().getLIVING_ROOMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:2701:3: (enumLiteral_3= 'BEDROOM' )
                    {
                    // InternalHouseBuilder.g:2701:3: (enumLiteral_3= 'BEDROOM' )
                    // InternalHouseBuilder.g:2702:4: enumLiteral_3= 'BEDROOM'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRoomTypeAccess().getBEDROOMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:2709:3: (enumLiteral_4= 'HALLWAY' )
                    {
                    // InternalHouseBuilder.g:2709:3: (enumLiteral_4= 'HALLWAY' )
                    // InternalHouseBuilder.g:2710:4: enumLiteral_4= 'HALLWAY'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getRoomTypeAccess().getHALLWAYEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:2717:3: (enumLiteral_5= 'STUDY' )
                    {
                    // InternalHouseBuilder.g:2717:3: (enumLiteral_5= 'STUDY' )
                    // InternalHouseBuilder.g:2718:4: enumLiteral_5= 'STUDY'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getRoomTypeAccess().getSTUDYEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:2725:3: (enumLiteral_6= 'ENTRANCE' )
                    {
                    // InternalHouseBuilder.g:2725:3: (enumLiteral_6= 'ENTRANCE' )
                    // InternalHouseBuilder.g:2726:4: enumLiteral_6= 'ENTRANCE'
                    {
                    enumLiteral_6=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getRoomTypeAccess().getENTRANCEEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalHouseBuilder.g:2733:3: (enumLiteral_7= 'STORAGE_ROOM' )
                    {
                    // InternalHouseBuilder.g:2733:3: (enumLiteral_7= 'STORAGE_ROOM' )
                    // InternalHouseBuilder.g:2734:4: enumLiteral_7= 'STORAGE_ROOM'
                    {
                    enumLiteral_7=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getRoomTypeAccess().getSTORAGE_ROOMEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalHouseBuilder.g:2741:3: (enumLiteral_8= 'GARAGE' )
                    {
                    // InternalHouseBuilder.g:2741:3: (enumLiteral_8= 'GARAGE' )
                    // InternalHouseBuilder.g:2742:4: enumLiteral_8= 'GARAGE'
                    {
                    enumLiteral_8=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getRoomTypeAccess().getGARAGEEnumLiteralDeclaration_8());
                    			

                    }


                    }
                    break;
                case 10 :
                    // InternalHouseBuilder.g:2749:3: (enumLiteral_9= 'LAUNDRY_ROOM' )
                    {
                    // InternalHouseBuilder.g:2749:3: (enumLiteral_9= 'LAUNDRY_ROOM' )
                    // InternalHouseBuilder.g:2750:4: enumLiteral_9= 'LAUNDRY_ROOM'
                    {
                    enumLiteral_9=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_9, grammarAccess.getRoomTypeAccess().getLAUNDRY_ROOMEnumLiteralDeclaration_9());
                    			

                    }


                    }
                    break;
                case 11 :
                    // InternalHouseBuilder.g:2757:3: (enumLiteral_10= 'HOBBY_ROOM' )
                    {
                    // InternalHouseBuilder.g:2757:3: (enumLiteral_10= 'HOBBY_ROOM' )
                    // InternalHouseBuilder.g:2758:4: enumLiteral_10= 'HOBBY_ROOM'
                    {
                    enumLiteral_10=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_10, grammarAccess.getRoomTypeAccess().getHOBBY_ROOMEnumLiteralDeclaration_10());
                    			

                    }


                    }
                    break;
                case 12 :
                    // InternalHouseBuilder.g:2765:3: (enumLiteral_11= 'CELLAR' )
                    {
                    // InternalHouseBuilder.g:2765:3: (enumLiteral_11= 'CELLAR' )
                    // InternalHouseBuilder.g:2766:4: enumLiteral_11= 'CELLAR'
                    {
                    enumLiteral_11=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_11, grammarAccess.getRoomTypeAccess().getCELLAREnumLiteralDeclaration_11());
                    			

                    }


                    }
                    break;
                case 13 :
                    // InternalHouseBuilder.g:2773:3: (enumLiteral_12= 'LUNCHROOM' )
                    {
                    // InternalHouseBuilder.g:2773:3: (enumLiteral_12= 'LUNCHROOM' )
                    // InternalHouseBuilder.g:2774:4: enumLiteral_12= 'LUNCHROOM'
                    {
                    enumLiteral_12=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_12, grammarAccess.getRoomTypeAccess().getLUNCHROOMEnumLiteralDeclaration_12());
                    			

                    }


                    }
                    break;
                case 14 :
                    // InternalHouseBuilder.g:2781:3: (enumLiteral_13= 'RUMPUS_ROOM' )
                    {
                    // InternalHouseBuilder.g:2781:3: (enumLiteral_13= 'RUMPUS_ROOM' )
                    // InternalHouseBuilder.g:2782:4: enumLiteral_13= 'RUMPUS_ROOM'
                    {
                    enumLiteral_13=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_13, grammarAccess.getRoomTypeAccess().getRUMPUS_ROOMEnumLiteralDeclaration_13());
                    			

                    }


                    }
                    break;
                case 15 :
                    // InternalHouseBuilder.g:2789:3: (enumLiteral_14= 'STAIRS' )
                    {
                    // InternalHouseBuilder.g:2789:3: (enumLiteral_14= 'STAIRS' )
                    // InternalHouseBuilder.g:2790:4: enumLiteral_14= 'STAIRS'
                    {
                    enumLiteral_14=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_14, grammarAccess.getRoomTypeAccess().getSTAIRSEnumLiteralDeclaration_14());
                    			

                    }


                    }
                    break;
                case 16 :
                    // InternalHouseBuilder.g:2797:3: (enumLiteral_15= 'KITCHEN' )
                    {
                    // InternalHouseBuilder.g:2797:3: (enumLiteral_15= 'KITCHEN' )
                    // InternalHouseBuilder.g:2798:4: enumLiteral_15= 'KITCHEN'
                    {
                    enumLiteral_15=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_15, grammarAccess.getRoomTypeAccess().getKITCHENEnumLiteralDeclaration_15());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoomType"


    // $ANTLR start "ruleExternalSpaceType"
    // InternalHouseBuilder.g:2808:1: ruleExternalSpaceType returns [Enumerator current=null] : ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) ) ;
    public final Enumerator ruleExternalSpaceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2814:2: ( ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) ) )
            // InternalHouseBuilder.g:2815:2: ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) )
            {
            // InternalHouseBuilder.g:2815:2: ( (enumLiteral_0= 'BALCONY' ) | (enumLiteral_1= 'GARDEN' ) | (enumLiteral_2= 'TERRACE' ) )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt59=1;
                }
                break;
            case 97:
                {
                alt59=2;
                }
                break;
            case 98:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalHouseBuilder.g:2816:3: (enumLiteral_0= 'BALCONY' )
                    {
                    // InternalHouseBuilder.g:2816:3: (enumLiteral_0= 'BALCONY' )
                    // InternalHouseBuilder.g:2817:4: enumLiteral_0= 'BALCONY'
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getExternalSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExternalSpaceTypeAccess().getBALCONYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2824:3: (enumLiteral_1= 'GARDEN' )
                    {
                    // InternalHouseBuilder.g:2824:3: (enumLiteral_1= 'GARDEN' )
                    // InternalHouseBuilder.g:2825:4: enumLiteral_1= 'GARDEN'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getExternalSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExternalSpaceTypeAccess().getGARDENEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2832:3: (enumLiteral_2= 'TERRACE' )
                    {
                    // InternalHouseBuilder.g:2832:3: (enumLiteral_2= 'TERRACE' )
                    // InternalHouseBuilder.g:2833:4: enumLiteral_2= 'TERRACE'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getExternalSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExternalSpaceTypeAccess().getTERRACEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalSpaceType"


    // $ANTLR start "ruleGroundType"
    // InternalHouseBuilder.g:2843:1: ruleGroundType returns [Enumerator current=null] : ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) ) ;
    public final Enumerator ruleGroundType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2849:2: ( ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) ) )
            // InternalHouseBuilder.g:2850:2: ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) )
            {
            // InternalHouseBuilder.g:2850:2: ( (enumLiteral_0= 'ASPALTH' ) | (enumLiteral_1= 'TERRAIN' ) | (enumLiteral_2= 'PAVING' ) )
            int alt60=3;
            switch ( input.LA(1) ) {
            case 99:
                {
                alt60=1;
                }
                break;
            case 100:
                {
                alt60=2;
                }
                break;
            case 101:
                {
                alt60=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalHouseBuilder.g:2851:3: (enumLiteral_0= 'ASPALTH' )
                    {
                    // InternalHouseBuilder.g:2851:3: (enumLiteral_0= 'ASPALTH' )
                    // InternalHouseBuilder.g:2852:4: enumLiteral_0= 'ASPALTH'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getGroundTypeAccess().getASPALTHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2859:3: (enumLiteral_1= 'TERRAIN' )
                    {
                    // InternalHouseBuilder.g:2859:3: (enumLiteral_1= 'TERRAIN' )
                    // InternalHouseBuilder.g:2860:4: enumLiteral_1= 'TERRAIN'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getGroundTypeAccess().getTERRAINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2867:3: (enumLiteral_2= 'PAVING' )
                    {
                    // InternalHouseBuilder.g:2867:3: (enumLiteral_2= 'PAVING' )
                    // InternalHouseBuilder.g:2868:4: enumLiteral_2= 'PAVING'
                    {
                    enumLiteral_2=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getGroundTypeAccess().getPAVINGEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroundType"


    // $ANTLR start "ruleDoorType"
    // InternalHouseBuilder.g:2878:1: ruleDoorType returns [Enumerator current=null] : ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) ) ;
    public final Enumerator ruleDoorType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalHouseBuilder.g:2884:2: ( ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) ) )
            // InternalHouseBuilder.g:2885:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) )
            {
            // InternalHouseBuilder.g:2885:2: ( (enumLiteral_0= 'SIMPLE' ) | (enumLiteral_1= 'DOOR_WINDOW' ) | (enumLiteral_2= 'PANIC_DOOR' ) | (enumLiteral_3= 'ENTRANCE_DOOR' ) | (enumLiteral_4= 'SLIDING_DOOR' ) | (enumLiteral_5= 'GATE' ) | (enumLiteral_6= 'EMPTY' ) )
            int alt61=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt61=1;
                }
                break;
            case 102:
                {
                alt61=2;
                }
                break;
            case 103:
                {
                alt61=3;
                }
                break;
            case 104:
                {
                alt61=4;
                }
                break;
            case 105:
                {
                alt61=5;
                }
                break;
            case 67:
                {
                alt61=6;
                }
                break;
            case 106:
                {
                alt61=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalHouseBuilder.g:2886:3: (enumLiteral_0= 'SIMPLE' )
                    {
                    // InternalHouseBuilder.g:2886:3: (enumLiteral_0= 'SIMPLE' )
                    // InternalHouseBuilder.g:2887:4: enumLiteral_0= 'SIMPLE'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDoorTypeAccess().getSIMPLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalHouseBuilder.g:2894:3: (enumLiteral_1= 'DOOR_WINDOW' )
                    {
                    // InternalHouseBuilder.g:2894:3: (enumLiteral_1= 'DOOR_WINDOW' )
                    // InternalHouseBuilder.g:2895:4: enumLiteral_1= 'DOOR_WINDOW'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDoorTypeAccess().getDOOR_WINDOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalHouseBuilder.g:2902:3: (enumLiteral_2= 'PANIC_DOOR' )
                    {
                    // InternalHouseBuilder.g:2902:3: (enumLiteral_2= 'PANIC_DOOR' )
                    // InternalHouseBuilder.g:2903:4: enumLiteral_2= 'PANIC_DOOR'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDoorTypeAccess().getPANIC_DOOREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalHouseBuilder.g:2910:3: (enumLiteral_3= 'ENTRANCE_DOOR' )
                    {
                    // InternalHouseBuilder.g:2910:3: (enumLiteral_3= 'ENTRANCE_DOOR' )
                    // InternalHouseBuilder.g:2911:4: enumLiteral_3= 'ENTRANCE_DOOR'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDoorTypeAccess().getENTRANCE_DOOREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalHouseBuilder.g:2918:3: (enumLiteral_4= 'SLIDING_DOOR' )
                    {
                    // InternalHouseBuilder.g:2918:3: (enumLiteral_4= 'SLIDING_DOOR' )
                    // InternalHouseBuilder.g:2919:4: enumLiteral_4= 'SLIDING_DOOR'
                    {
                    enumLiteral_4=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getDoorTypeAccess().getSLIDING_DOOREnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalHouseBuilder.g:2926:3: (enumLiteral_5= 'GATE' )
                    {
                    // InternalHouseBuilder.g:2926:3: (enumLiteral_5= 'GATE' )
                    // InternalHouseBuilder.g:2927:4: enumLiteral_5= 'GATE'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getDoorTypeAccess().getGATEEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalHouseBuilder.g:2934:3: (enumLiteral_6= 'EMPTY' )
                    {
                    // InternalHouseBuilder.g:2934:3: (enumLiteral_6= 'EMPTY' )
                    // InternalHouseBuilder.g:2935:4: enumLiteral_6= 'EMPTY'
                    {
                    enumLiteral_6=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getDoorTypeAccess().getEMPTYEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoorType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000FC000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F8000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0110000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000002E0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000007C000010008L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000002C0000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000280000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000001E000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000800E0000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000800C0000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000080080000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0002002000200000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000002000200000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000A082000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FE00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0008082000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000082000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00C0000900200000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x00C0000800200000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x00000000FFFF0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0080000800200000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0080000000200000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000700000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0800000800200000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000003800000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x2002002000000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x2000002000000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000000C0200000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000080200000L});

}