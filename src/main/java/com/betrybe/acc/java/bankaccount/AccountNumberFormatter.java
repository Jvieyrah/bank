package com.betrybe.acc.java.bankaccount;

import org.apache.commons.lang3.StringUtils;


/**
 * AccountNumberFormatter.
 */
public class AccountNumberFormatter {

  /**
   * Formata o número da conta.
   *
   * @param literalAccountNumber número da conta
   */
  public String formatAccountNumber(int literalAccountNumber) {
    String stringAccount = Integer.toString(literalAccountNumber);
    if (stringAccount.length() > 6) {
      /*
       * O método right remove todos os caracteres à esquerda e mantém todos os que estiverem à
       * direita. O value corresponde à string que será processada, e o length corresponde à
       * quantidade de caracteres que devem permanecer intactos na direita.
       */
      return StringUtils.right(stringAccount, 6);
    } else if (stringAccount.length() < 6) {
      /*
       * O método leftPad adiciona um preenchimento de caracteres à esquerda de uma String. O value
       * corresponde à string que será processada, o length corresponde ao tamanho da string e o
       * prefix corresponde ao caractere que deverá preencher os espaços faltantes.
       */
      return StringUtils.leftPad(stringAccount, 6, "0");
    } else {
      return stringAccount;
    }
  }
}
