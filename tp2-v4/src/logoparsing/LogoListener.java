// Generated from grammar/Logo.g4 by ANTLR 4.2

  package logoparsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogoParser#supzero}.
	 * @param ctx the parse tree
	 */
	void enterSupzero(@NotNull LogoParser.SupzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#supzero}.
	 * @param ctx the parse tree
	 */
	void exitSupzero(@NotNull LogoParser.SupzeroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull LogoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull LogoParser.MultContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#hasard}.
	 * @param ctx the parse tree
	 */
	void enterHasard(@NotNull LogoParser.HasardContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#hasard}.
	 * @param ctx the parse tree
	 */
	void exitHasard(@NotNull LogoParser.HasardContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 */
	void enterTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#tg}.
	 * @param ctx the parse tree
	 */
	void exitTg(@NotNull LogoParser.TgContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#sum}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sum}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull LogoParser.SumContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#infzero}.
	 * @param ctx the parse tree
	 */
	void enterInfzero(@NotNull LogoParser.InfzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#infzero}.
	 * @param ctx the parse tree
	 */
	void exitInfzero(@NotNull LogoParser.InfzeroContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#proced}.
	 * @param ctx the parse tree
	 */
	void enterProced(@NotNull LogoParser.ProcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#proced}.
	 * @param ctx the parse tree
	 */
	void exitProced(@NotNull LogoParser.ProcedContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 */
	void enterTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#td}.
	 * @param ctx the parse tree
	 */
	void exitTd(@NotNull LogoParser.TdContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 */
	void enterSup(@NotNull LogoParser.SupContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#sup}.
	 * @param ctx the parse tree
	 */
	void exitSup(@NotNull LogoParser.SupContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 */
	void enterRe(@NotNull LogoParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#re}.
	 * @param ctx the parse tree
	 */
	void exitRe(@NotNull LogoParser.ReContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#fonc}.
	 * @param ctx the parse tree
	 */
	void enterFonc(@NotNull LogoParser.FoncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fonc}.
	 * @param ctx the parse tree
	 */
	void exitFonc(@NotNull LogoParser.FoncContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#exec_fonc}.
	 * @param ctx the parse tree
	 */
	void enterExec_fonc(@NotNull LogoParser.Exec_foncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#exec_fonc}.
	 * @param ctx the parse tree
	 */
	void exitExec_fonc(@NotNull LogoParser.Exec_foncContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#exec_proc}.
	 * @param ctx the parse tree
	 */
	void enterExec_proc(@NotNull LogoParser.Exec_procContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#exec_proc}.
	 * @param ctx the parse tree
	 */
	void exitExec_proc(@NotNull LogoParser.Exec_procContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#NotEgal}.
	 * @param ctx the parse tree
	 */
	void enterNotEgal(@NotNull LogoParser.NotEgalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#NotEgal}.
	 * @param ctx the parse tree
	 */
	void exitNotEgal(@NotNull LogoParser.NotEgalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull LogoParser.LoopContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 */
	void enterVe(@NotNull LogoParser.VeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#ve}.
	 * @param ctx the parse tree
	 */
	void exitVe(@NotNull LogoParser.VeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 */
	void enterBc(@NotNull LogoParser.BcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#bc}.
	 * @param ctx the parse tree
	 */
	void exitBc(@NotNull LogoParser.BcContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#resVar}.
	 * @param ctx the parse tree
	 */
	void enterResVar(@NotNull LogoParser.ResVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#resVar}.
	 * @param ctx the parse tree
	 */
	void exitResVar(@NotNull LogoParser.ResVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull LogoParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#int}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull LogoParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#egal}.
	 * @param ctx the parse tree
	 */
	void enterEgal(@NotNull LogoParser.EgalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#egal}.
	 * @param ctx the parse tree
	 */
	void exitEgal(@NotNull LogoParser.EgalContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 */
	void enterInf(@NotNull LogoParser.InfContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#inf}.
	 * @param ctx the parse tree
	 */
	void exitInf(@NotNull LogoParser.InfContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#parent}.
	 * @param ctx the parse tree
	 */
	void enterParent(@NotNull LogoParser.ParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#parent}.
	 * @param ctx the parse tree
	 */
	void exitParent(@NotNull LogoParser.ParentContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#tantque}.
	 * @param ctx the parse tree
	 */
	void enterTantque(@NotNull LogoParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#tantque}.
	 * @param ctx the parse tree
	 */
	void exitTantque(@NotNull LogoParser.TantqueContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#repete}.
	 * @param ctx the parse tree
	 */
	void enterRepete(@NotNull LogoParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#repete}.
	 * @param ctx the parse tree
	 */
	void exitRepete(@NotNull LogoParser.RepeteContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 */
	void enterAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#av}.
	 * @param ctx the parse tree
	 */
	void exitAv(@NotNull LogoParser.AvContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull LogoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull LogoParser.SiContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(@NotNull LogoParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(@NotNull LogoParser.ExpContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull LogoParser.ProgrammeContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#bloc}.
	 * @param ctx the parse tree
	 */
	void enterBloc(@NotNull LogoParser.BlocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#bloc}.
	 * @param ctx the parse tree
	 */
	void exitBloc(@NotNull LogoParser.BlocContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#execfonc}.
	 * @param ctx the parse tree
	 */
	void enterExecfonc(@NotNull LogoParser.ExecfoncContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#execfonc}.
	 * @param ctx the parse tree
	 */
	void exitExecfonc(@NotNull LogoParser.ExecfoncContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 */
	void enterFpos(@NotNull LogoParser.FposContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fpos}.
	 * @param ctx the parse tree
	 */
	void exitFpos(@NotNull LogoParser.FposContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 */
	void enterLc(@NotNull LogoParser.LcContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#lc}.
	 * @param ctx the parse tree
	 */
	void exitLc(@NotNull LogoParser.LcContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#nomVariable}.
	 * @param ctx the parse tree
	 */
	void enterNomVariable(@NotNull LogoParser.NomVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#nomVariable}.
	 * @param ctx the parse tree
	 */
	void exitNomVariable(@NotNull LogoParser.NomVariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 */
	void enterFcc(@NotNull LogoParser.FccContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#fcc}.
	 * @param ctx the parse tree
	 */
	void exitFcc(@NotNull LogoParser.FccContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#execProced}.
	 * @param ctx the parse tree
	 */
	void enterExecProced(@NotNull LogoParser.ExecProcedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#execProced}.
	 * @param ctx the parse tree
	 */
	void exitExecProced(@NotNull LogoParser.ExecProcedContext ctx);

	/**
	 * Enter a parse tree produced by {@link LogoParser#vari}.
	 * @param ctx the parse tree
	 */
	void enterVari(@NotNull LogoParser.VariContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#vari}.
	 * @param ctx the parse tree
	 */
	void exitVari(@NotNull LogoParser.VariContext ctx);
}