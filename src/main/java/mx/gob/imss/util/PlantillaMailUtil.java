package mx.gob.imss.util;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PlantillaMailUtil {

    public static String plantilla(String nombre){
String htmlPlantilla = "<!DOCTYPE html>" +
        "<html lang='en' xmlns='http://www.w3.org/1999/xhtml' xmlns:v='urn:schemas-microsoft-com:vml' xmlns:o='urn:schemas-microsoft-com:office:office'>" +
        "" +
        "<head>" +
        "    <title> Hola Esta es un template robado pero de prueba</title>" +
        "    <meta http-equiv='X-UA-Compatible' content='IE=edge' />" +
        "    <meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />" +
        "    <meta name='viewport' content='width=device-width, initial-scale=1' />" +
        "    <style type='text/css'>" +
        "        #outlook a {" +
        "            padding: 0;" +
        "        }" +
        "" +
        "        body {" +
        "            margin: 0;" +
        "            padding: 0;" +
        "            -webkit-text-size-adjust: 100%;" +
        "            -ms-text-size-adjust: 100%;" +
        "        }" +
        "" +
        "        table," +
        "        td {" +
        "            border-collapse: collapse;" +
        "            mso-table-lspace: 0pt;" +
        "            mso-table-rspace: 0pt;" +
        "        }" +
        "" +
        "        img {" +
        "            border: 0;" +
        "            height: auto;" +
        "            line-height: 100%;" +
        "            outline: none;" +
        "            text-decoration: none;" +
        "            -ms-interpolation-mode: bicubic;" +
        "        }" +
        "" +
        "        p {" +
        "            display: block;" +
        "            margin: 13px 0;" +
        "        }" +
        "    </style>" +
        "    <style type='text/css'>" +
        "        @media only screen and (min-width:480px) {" +
        "            .mj-column-per-100 {" +
        "                width: 100% !important;" +
        "                max-width: 100%;" +
        "            }" +
        "        }" +
        "    </style>" +
        "    <style type='text/css'>" +
        "        @media only screen and (max-width:480px) {" +
        "            table.mj-full-width-mobile {" +
        "                width: 100% !important;" +
        "            }" +
        "" +
        "            td.mj-full-width-mobile {" +
        "                width: auto !important;" +
        "            }" +
        "        }" +
        "    </style>" +
        "    <style type='text/css'>" +
        "        a," +
        "        span," +
        "        td," +
        "        th {" +
        "            -webkit-font-smoothing: antialiased !important;" +
        "            -moz-osx-font-smoothing: grayscale !important;" +
        "        }" +
        "    </style>" +
        "</head>" +
        "" +
        "<body style='background-color:#ffffff;'>" +
        "    <div style='display:none;font-size:1px;color:#ffffff;line-height:1px;max-height:0px;max-width:0px;opacity:0;overflow:hidden;'> Hola Esta es un template robado pero de prueba </div>" +
        "    <div style='background-color:#ffffff;'>" +
        "        <div style='margin:0px auto;max-width:600px;'>" +
        "            <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>" +
        "                <tbody>" +
        "                    <tr>" +
        "                        <td style='direction:ltr;font-size:0px;padding:20px 0;padding-bottom:0px;text-align:center;'>" +
        "                            <div class='mj-column-per-100 mj-outlook-group-fix' style='font-size:0px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>" +
        "                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>" +
        "                                    <tbody>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:collapse;border-spacing:0px;'>" +
        "                                                    <tbody>" +
        "                                                        <tr>" +
        "                                                            <td style='width:50px;'>" +
        "                                                                <img alt='image description' height='auto' src='https://codedmails.com/images/logo-circle.png' style='border:0;display:block;outline:none;text-decoration:none;height:auto;width:100%;font-size:14px;' width='50' />" +
        "                                                            </td>" +
        "                                                        </tr>" +
        "                                                    </tbody>" +
        "                                                </table>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <div style='font-family:Helvetica, Arial, sans-serif;font-size:18px;font-weight:400;line-height:24px;text-align:left;color:#434245;'>" +
        "                                                    <h1 style='margin: 0; font-size: 24px; line-height: normal; font-weight: bold;'> Ya no quiero <br /> seguir documentando <br /> :c </h1>" +
        "                                                </div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                    </tbody>" +
        "                                </table>" +
        "                            </div>" +
        "                        </td>" +
        "                    </tr>" +
        "                </tbody>" +
        "            </table>" +
        "        </div>" +
        "        <div style='margin:0px auto;max-width:600px;'>" +
        "            <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>" +
        "                <tbody>" +
        "                    <tr>" +
        "                        <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;'>" +
        "                            <div class='mj-column-per-100 mj-outlook-group-fix' style='font-size:0px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>" +
        "                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>" +
        "                                    <tbody>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <div style='font-family:Helvetica, Arial, sans-serif;font-size:18px;font-weight:400;line-height:24px;text-align:left;color:#434245;'>" +
        "                                                    <p style='margin: 5px 0;'>Hola " + nombre + " Esta es una plantilla robada de internet pero usada para fines de pruebas :) </p>" +
        "                                                </div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' vertical-align='middle' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-collapse:separate;line-height:100%;'>" +
        "                                                    <tbody>" +
        "                                                        <tr>" +
        "                                                            <td align='center' bgcolor='#2e58ff' role='presentation' style='border:none;border-radius:30px;cursor:auto;mso-padding-alt:10px 25px;background:#2e58ff;' valign='middle'>" +
        "                                                                <a href='https://www.google.com/search?q=ya+no+hay+galletas&rlz=1C1ONGR_esMX1036MX1036&oq=ya+no+hay+galletas&aqs=chrome..69i57j33i22i29i30i625l3j33i15i22i29i30j33i22i29i30i625l2j33i22i29i30.3394j0j15&sourceid=chrome&ie=UTF-8' style='display: inline-block; background: #2e58ff; color: #ffffff; font-family: Helvetica, Arial, sans-serif; font-size: 14px; font-weight: bold; line-height: 30px; margin: 0; text-decoration: none; text-transform: uppercase; padding: 10px 25px; mso-padding-alt: 0px; border-radius: 30px;' target='_blank'> Click aqui para una galleta </a>" +
        "                                                            </td>" +
        "                                                        </tr>" +
        "                                                    </tbody>" +
        "                                                </table>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <div style='font-family:Helvetica, Arial, sans-serif;font-size:18px;font-weight:400;line-height:24px;text-align:left;color:#434245;'>" +
        "                                                    <p style='margin: 5px 0;'>ya no se que escribir pero creo esta plantilla esta chida </p>" +
        "                                                </div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <div style='font-family:Helvetica, Arial, sans-serif;font-size:18px;font-weight:bold;line-height:24px;text-align:left;color:#434245;'>Ya es viernes, vamos a mimir temprano</div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "" +
        "                                                <table align='left' border='0' cellpadding='0' cellspacing='0' role='presentation' style='float:none;display:inline-table;'>" +
        "                                                    <tbody>" +
        "                                                        <tr>" +
        "                                                            <td style='padding:4px;'>" +
        "                                                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-radius:3px;width:18px;'>" +
        "                                                                    <tbody>" +
        "                                                                        <tr>" +
        "                                                                            <td style='font-size:0;height:18px;vertical-align:middle;width:18px;'>" +
        "                                                                                <a href='#' target='_blank' style='color: #2e58ff; text-decoration: none;'>" +
        "                                    <img alt='twitter-logo' height='18' src='https://codedmails.com/images/social/black/twitter-logo-transparent-black.png' style='border-radius:3px;display:block;' width='18' />" +
        "                                  </a>" +
        "                                                                            </td>" +
        "                                                                        </tr>" +
        "                                                                    </tbody>" +
        "                                                                </table>" +
        "                                                            </td>" +
        "                                                        </tr>" +
        "                                                    </tbody>" +
        "                                                </table>" +
        "                                                <table align='left' border='0' cellpadding='0' cellspacing='0' role='presentation' style='float:none;display:inline-table;'>" +
        "                                                    <tbody>" +
        "                                                        <tr>" +
        "                                                            <td style='padding:4px;'>" +
        "                                                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-radius:3px;width:18px;'>" +
        "                                                                    <tbody>" +
        "                                                                        <tr>" +
        "                                                                            <td style='font-size:0;height:18px;vertical-align:middle;width:18px;'>" +
        "                                                                                <a href='#' target='_blank' style='color: #2e58ff; text-decoration: none;'>" +
        "                                    <img alt='facebook-logo' height='18' src='https://codedmails.com/images/social/black/facebook-logo-transparent-black.png' style='border-radius:3px;display:block;' width='18' />" +
        "                                  </a>" +
        "                                                                            </td>" +
        "                                                                        </tr>" +
        "                                                                    </tbody>" +
        "                                                                </table>" +
        "                                                            </td>" +
        "                                                        </tr>" +
        "                                                    </tbody>" +
        "                                                </table>" +
        "                                                <table align='left' border='0' cellpadding='0' cellspacing='0' role='presentation' style='float:none;display:inline-table;'>" +
        "                                                    <tbody>" +
        "                                                        <tr>" +
        "                                                            <td style='padding:4px;'>" +
        "                                                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='border-radius:3px;width:18px;'>" +
        "                                                                    <tbody>" +
        "                                                                        <tr>" +
        "                                                                            <td style='font-size:0;height:18px;vertical-align:middle;width:18px;'>" +
        "                                                                                <a href='#' target='_blank' style='color: #2e58ff; text-decoration: none;'>" +
        "                                    <img alt='instagram-logo' height='18' src='https://codedmails.com/images/social/black/instagram-logo-transparent-black.png' style='border-radius:3px;display:block;' width='18' />" +
        "                                  </a>" +
        "                                                                            </td>" +
        "                                                                        </tr>" +
        "                                                                    </tbody>" +
        "                                                                </table>" +
        "                                                            </td>" +
        "                                                        </tr>" +
        "                                                    </tbody>" +
        "                                                </table>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                    </tbody>" +
        "                                </table>" +
        "                            </div>" +
        "                        </td>" +
        "                    </tr>" +
        "                </tbody>" +
        "            </table>" +
        "        </div>" +
        "        <div style='margin:0px auto;max-width:600px;'>" +
        "            <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>" +
        "                <tbody>" +
        "                    <tr>" +
        "                        <td style='direction:ltr;font-size:0px;padding:20px 0;padding-top:0;text-align:center;'>" +
        "                            <div class='mj-column-per-100 mj-outlook-group-fix' style='font-size:0px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>" +
        "                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>" +
        "                                    <tbody>" +
        "                                        <tr>" +
        "                                            <td style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <p style='border-top: dashed 1px lightgrey; font-size: 1px; margin: 0px auto; width: 100%;'>" +
        "                                                </p>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                                <div style='font-family:Helvetica, Arial, sans-serif;font-size:14px;font-weight:400;line-height:24px;text-align:left;color:#999999;'>Have questions or need help? Email us at <a href='#' style='color: #2e58ff; text-decoration: none;'> noHaySistema@hotmail.com </a></div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "                                            <td align='left' style='font-size:0px;padding:10px 25px;word-break:break-word;'>" +
        "                                        </tr>" +
        "                                        <tr>" +
        "" +
        "                                        </tr>" +
        "                                    </tbody>" +
        "                                </table>" +
        "                            </div>" +
        "                            </td>" +
        "                    </tr>" +
        "                </tbody>" +
        "            </table>" +
        "        </div>" +
        "        <div style='margin:0px auto;max-width:600px;'>" +
        "            <table align='center' border='0' cellpadding='0' cellspacing='0' role='presentation' style='width:100%;'>" +
        "                <tbody>" +
        "                    <tr>" +
        "                        <td style='direction:ltr;font-size:0px;padding:20px 0;text-align:center;'>" +
        "                            <div class='mj-column-per-100 mj-outlook-group-fix' style='font-size:0px;text-align:left;direction:ltr;display:inline-block;vertical-align:top;width:100%;'>" +
        "                                <table border='0' cellpadding='0' cellspacing='0' role='presentation' style='vertical-align:top;' width='100%'>" +
        "                                    <tbody>" +
        "                                        <tr>" +
        "                                            <td style='font-size:0px;word-break:break-word;'>" +
        "" +
        "                                                <div style='height:1px;'>   </div>" +
        "                                            </td>" +
        "                                        </tr>" +
        "                                    </tbody>" +
        "                                </table>" +
        "                            </div>" +
        "                        </td>" +
        "                    </tr>" +
        "                </tbody>" +
        "            </table>" +
        "        </div>" +
        "" +
        "    </div>" +
        "</body>" +
        "" +
        "</html>";
return htmlPlantilla;
    }
}
